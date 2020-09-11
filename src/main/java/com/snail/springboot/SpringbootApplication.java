package com.snail.springboot;

import com.snail.springboot.gemfire.Person;
import com.snail.springboot.upload.StorageProperties;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableConfigurationProperties(StorageProperties.class)
@SpringBootApplication
@ClientCacheApplication(name = "AccessingDataGemFireApplication",logLevel = "error")
@EnableEntityDefinedRegions(basePackageClasses = Person.class,clientRegionShortcut = ClientRegionShortcut.LOCAL)
@EnableGemfireRepositories
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
