package com.hyperForm.el;
    import com.act21.impaktapps.core.initializer.EnableSpringApplicationCondition;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
    import org.springframework.context.annotation.Conditional;

    @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
    @Conditional(EnableSpringApplicationCondition.class)
    public class Application {

        public static void main(String[] args) {

            SpringApplication.run(Application.class, args);
        }

    }