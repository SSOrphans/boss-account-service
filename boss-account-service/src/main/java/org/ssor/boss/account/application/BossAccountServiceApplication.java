package org.ssor.boss.account.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication (scanBasePackages = "org.ssor.*",  exclude = { SecurityAutoConfiguration.class })
@EntityScan(basePackages = "org.ssor.boss.*")
@EnableJpaRepositories(basePackages = "org.ssor.boss.*")
@EnableSwagger2
@CrossOrigin
public class BossAccountServiceApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(BossAccountServiceApplication.class, args);
  }

}
