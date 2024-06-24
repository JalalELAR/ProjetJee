package ma.badr.projetangular.dtos;

import lombok.Data;
import ma.badr.projetangular.enums.OperationType;

import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}