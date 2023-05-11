package ma.enset.ebank.web;

import ma.enset.ebank.dto.BankAccountRequestDTO;
import ma.enset.ebank.dto.BankAccountResponseDTO;
import ma.enset.ebank.entities.BankAccount;
import ma.enset.ebank.reposetories.BankAccountReposetory;
import ma.enset.ebank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class BankAccountGraphQlController {
    @Autowired
    private BankAccountReposetory bankAccountReposetory;
    @Autowired
    private AccountService accountService;
    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountReposetory.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument String id){
        return bankAccountReposetory.findById(id)
                .orElseThrow(()-> new RuntimeException(String.format("Account %s not found", id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount (@Argument BankAccountRequestDTO bankAccount){
//        BankAccount account = BankAccount.builder()
//                .id(UUID.randomUUID().toString())
//                .balance(bankAccount.getBalance())
//                .createdAt(new Date())
//                .currency(bankAccount.getCurrency())
//                .type(bankAccount.getType())
//                .build();
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount (@Argument String id, @Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id, bankAccount);
    }

    @MutationMapping
    public void deleteAccount (@Argument String id){
        bankAccountReposetory.deleteById(id);
    }
}
