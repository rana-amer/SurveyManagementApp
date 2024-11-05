package giza.client.platform.user.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@EnableJpaRepositories(basePackages = "giza.client.platform.user.core.repository")
public class DataBaseConnection extends HikariConfig {
    @Bean
    @Primary
    public DataSource dataSource() {
        return new HikariDataSource(this);
    }
}