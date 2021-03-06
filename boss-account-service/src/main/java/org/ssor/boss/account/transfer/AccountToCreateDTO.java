package org.ssor.boss.account.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Data
public class AccountToCreateDTO
{
  @JsonProperty("account_type")
  @NotNull
  private Integer accountType;
  @JsonProperty("user_id")
  @NotNull
  private Integer userId;
  @JsonProperty("branch_id")
  @NotNull
  private Integer branchId;
  private String name;
  @NotNull
  private Float balance;
}
