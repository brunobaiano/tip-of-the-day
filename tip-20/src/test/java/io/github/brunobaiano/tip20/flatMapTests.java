package io.github.brunobaiano.tip20;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapTests {

    @Test
    void testFlatMap() {
        Card master = new Card(UUID.randomUUID(), "Master");
        Card master1 = new Card(UUID.randomUUID(), "Master");
        Card visa = new Card(UUID.randomUUID(), "Visa");
        Card visa1 = new Card(UUID.randomUUID(), "Visa");
        Card visa2 = new Card(UUID.randomUUID(), "Visa");

        List<Account> accountList = List.of(new Account(UUID.randomUUID(), master),
                new Account(UUID.randomUUID(), master1),
                new Account(UUID.randomUUID(), visa),
                new Account(UUID.randomUUID(), visa1),
                new Account(UUID.randomUUID(), visa2));

        //here is the problem
        Collection<List<Account>> accounts = accountList
                .stream()
                .collect(Collectors.groupingBy(account -> account.card().flag()))
                .values();

        List<Account> accounts1 = accountList
                .stream()
                .collect(Collectors.groupingBy(account -> account.card().flag()))
                //Collection<List<Account>>
                .values()
                //Stream<List<Account>>
                .stream()
                //Stream<Account>
                .flatMap(Collection::parallelStream)
                .toList();

        System.out.println(accounts1);

        //Try with String

        String[][] array = new String[][]{{master.id.toString(), master.flag()}, {visa.id.toString(), visa.flag()}};



        var arrayResult = Arrays.stream(array)
                .flatMap(Stream::of)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arrayResult));

        String result = Arrays.stream(array)
                .flatMap(Stream::of)
                .collect(Collectors.joining(" -> "));
        System.out.println(result);


    }

    record Card(UUID id, String flag) {
    }

    record Account(UUID id, Card card) {
    }
}
