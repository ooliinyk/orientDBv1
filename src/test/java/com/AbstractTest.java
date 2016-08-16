package com;

import com.config.AppConfig;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 15.08.2016.
 */

@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration(classes = AppConfig.class)
public class AbstractTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
