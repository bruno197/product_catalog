package com.brunofr.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = {"com.brunofr"})
@RefreshScope
public class CassandraConfiguration {
//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public CassandraClusterFactoryBean cluster() {
//        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
//        cluster.setContactPoints(environment.getProperty("cassandra.contactpoints"));
//        cluster.setPort(Integer.parseInt(environment.getProperty("cassandra.port")));
//        return cluster;
//    }
//    @Bean
//    public CassandraMappingContext mappingContext() {
//        return new BasicCassandraMappingContext();
//    }
//    @Bean
//    public CassandraConverter converter() {
//        return new MappingCassandraConverter(mappingContext());
//    }
//    @Bean
//    public CassandraSessionFactoryBean session() throws Exception {
//        CassandraSessionFactoryBean session = new CassandraSessionFactoryBean();
//        session.setCluster(cluster().getObject());
//        session.setKeyspaceName(environment.getProperty("cassandra.keyspace"));
//        session.setConverter(converter());
//        session.setSchemaAction(SchemaAction.NONE);
//        return session;
//    }
//    @Bean
//    public CassandraOperations cassandraTemplate() throws Exception {
//        return new CassandraTemplate(session().getObject());
//    }
}
