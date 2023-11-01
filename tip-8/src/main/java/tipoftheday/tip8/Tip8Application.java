package tipoftheday.tip8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tipoftheday.tip8.account.Account;

@SpringBootApplication
public class Tip8Application {

	public static void main(String[] args) {
		SpringApplication.run(Tip8Application.class, args);


		Account a1 = new Account("John Doe", "123456", 1000);

		Account a2 = new Account("John Doe", "123456", "ITAUBRSP", 1000);

		Account a3 = new Account("John Doe", "123456", "BANBRSP", 1000);


		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a1.equals(a2));  //true
		System.out.println(a1.hashCode() == a2.hashCode());  //true

		System.out.println(a1.equals(a3));  //false
		System.out.println(a1.hashCode() == a3.hashCode());  //false
	}

}
