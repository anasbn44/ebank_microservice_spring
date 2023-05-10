package ma.enset.ebank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.ebank.enums.AccountType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType type;
}
