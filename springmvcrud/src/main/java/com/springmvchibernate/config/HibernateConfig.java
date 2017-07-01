package com.springmvchibernate.config;

import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement

@ComponentScan(basePackages = "com.springmvc.config")
@PropertySource(value = {"classpath:config.properties"})
public class HibernateConfig {
	
	
	@Autowired
	private Environment enviornment;
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] {"com.springmvc.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
		
		
	}
	
	
		

	@Bean
	public DataSource dataSource()
	{
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName(enviornment.getRequiredProperty("jdbc.driverClassName"));
      dataSource.setUrl(enviornment.getRequiredProperty("jdbc.url"));
      dataSource.setUsername(enviornment.getRequiredProperty("jdbc.username"));
      dataSource.setUsername(enviornment.getRequiredProperty("jdbc.password"));
      return dataSource;
      
	}
	
	@Bean
	public Properties hibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.dialect",enviornment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",enviornment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",enviornment.getRequiredProperty("hibernate.format_sql"));
		return properties;
		
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s)
	{
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
				}
	
}
