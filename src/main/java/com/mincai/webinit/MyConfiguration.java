package com.mincai.webinit;

import com.mincai.webinit.config.Knife4jConfig;
import com.mincai.webinit.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author limincai
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class})
public class MyConfiguration {
}
