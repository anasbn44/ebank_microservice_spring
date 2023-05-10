package ma.enset.ebank;

import ma.enset.ebank.entities.BankAccount;
import ma.enset.ebank.enums.AccountType;
import ma.enset.ebank.reposetories.BankAccountReposetory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EbankApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountReposetory bankAccountReposetory){
        return args -> {
            for (int i = 0; i < 5 ; i++){
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT: AccountType.SAVING_ACCOUNT)
                        .balance(Math.random() * 5000)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                 bankAccountReposetory.save(bankAccount);
            }
        };
    }
}
