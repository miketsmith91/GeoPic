package com.googleinsta.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ericjohn1 on 8/4/2016.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.astontech.hr.com.googleinsta.domain"})
@EnableJpaRepositories(basePackages = "com.astontech.hr.com.googleinsta.repositories")
@EnableTransactionManagement //

public class RepositoryConfiguration {
}
