package com.hydro.test.factory.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.hydro.test.factory.config.DataSourceTestConfiguration;
import com.hydro.test.factory.resolver.ActiveProfileDaoTestResolver;

/**
 * Annotation id for test that deal with dao classes.
 * 
 * @author Sam Butler
 * @since July 31, 2021
 */
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { DataSourceTestConfiguration.class })
@ActiveProfiles(resolver = ActiveProfileDaoTestResolver.class)
public @interface HydroDaoTest {}