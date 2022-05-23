package ru.vitasoft.ProjectJDBC.database2021.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @Qualifier("adm2021DataSource")
    @ConfigurationProperties(prefix = "spring.datasource-adm2021")
    public DataSource adm2021DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Qualifier("adm2021JdbcTemplate")
    JdbcTemplate adm2021JdbcTemplate(@Qualifier("adm2021DataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
