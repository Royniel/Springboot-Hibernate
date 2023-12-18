package edu.neu.cyse0.pathfinder2.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.Dashboard;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;
import edu.neu.cyse0.pathfinder2.model.LoginForm;
import edu.neu.cyse0.pathfinder2.model.Profile;
import edu.neu.cyse0.pathfinder2.model.Registration;

import javax.sql.DataSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
public class HibernateConfig {
	
	 public static SessionFactory buildSessionFactory(){
	        Map<String, Object> settings = new HashMap<>();
	        settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
	        settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/Pathfinderdb");
	        settings.put("hibernate.connection.username", "root");
	        settings.put("hibernate.connection.password","811niel");

	        settings.put("hibernate.hbm2ddl.auto", "update");
	        settings.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	        settings.put("hibernate.dialect.storage_engine", "innodb");
	        settings.put("hibernate.show-sql", "true");

	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(settings).build();

	        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
	        metadataSources.addPackage("edu.neu.cyse0.pathfinder2.model");
	        metadataSources.addAnnotatedClasses(CourseRegistration.class, Dashboard.class, ExistingCourse.class, LoginForm.class, Profile.class, Registration.class);

	        Metadata metadata = metadataSources.buildMetadata();

	        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

	        return sessionFactory;
	    }


//    @Autowired
//    private Environment env;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setPackagesToScan(new String[] { "edu.neu.cyse0.pathfinder2.model" });
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }
//
//    private Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
//        properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
//        properties.put("hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
//        // Additional properties can be set here
//        return properties;
//    }
//
//    @Bean
//    @Autowired
//    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(sessionFactory);
//        return transactionManager;
//    }
    
}
