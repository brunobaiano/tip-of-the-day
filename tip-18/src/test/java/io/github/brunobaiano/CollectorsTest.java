package io.github.brunobaiano;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;


@QuarkusTest
public class CollectorsTest {

    @Test
    void testGroupingBy() {
        Card master = new Card(UUID.randomUUID(), "Master");
        Card master1 = new Card(UUID.randomUUID(), "Master");
        Card visa = new Card(UUID.randomUUID(), "Visa");
        Card visa1 = new Card(UUID.randomUUID(), "Visa");

        List<Account> accountList = List.of(new Account(UUID.randomUUID(), master),
                new Account(UUID.randomUUID(), master1),
                new Account(UUID.randomUUID(), visa),
                new Account(UUID.randomUUID(), visa1));

        Map<String, List<Account>> accountMap =
                accountList.stream().collect(Collectors.groupingBy(account -> account.card().flag()));

        assertThat(accountMap).containsKeys("Visa", "Master");
        assertThat(accountMap.get("Visa")).hasSize(2);
        assertThat(accountMap.get("Master")).hasSize(2);

    }

    record Card(UUID id, String flag) {
    }

    record Account(UUID id, Card card) {
    }
}