package com.example.demo.config;

import com.example.demo.examplebeans.FakeDataSource;
import com.example.demo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${com.jms.user}")
    String jmsUser;

    @Value("${com.jms.password}")
    String jmsPassword;

    @Value("${com.jms.url}")
    String jmsUrl;

    @Value("${com.user}")
    String user;

    @Value("${com.password}")
    String password;

    @Value("${com.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("COM_USER"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setJmsUser(jmsUser);
        fakeJmsBroker.setJmsPassword(jmsPassword);
        fakeJmsBroker.setJmsUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properies() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
