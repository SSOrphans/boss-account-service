package org.ssor.boss.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "org.ssor.*",  exclude = { SecurityAutoConfiguration.class })
@EntityScan(basePackages = "org.ssor.boss.*")
@EnableJpaRepositories(basePackages = "org.ssor.boss.*")
public class BossAccountServiceApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(BossAccountServiceApplication.class, args);
  }

}