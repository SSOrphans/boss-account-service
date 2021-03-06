package org.ssor.boss.account.transfer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class ErrorMessage
{
  private final HttpStatus status;
  private final String message;
}
