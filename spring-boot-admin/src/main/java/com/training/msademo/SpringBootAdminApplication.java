package com.training.msademo;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableAdminServer
@Configuration
@SpringBootApplication
//@EnableDiscoveryClient
public class SpringBootAdminApplication {
//    private final String adminContextPath;

//    public SpringBootAdminApplication(AdminServerProperties adminServerProperties) {
//        this.adminContextPath = adminServerProperties.getContextPath();
//    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }

    /*@Bean
    public SecurityWebFilterChain securityWebFilterChainSecure(ServerHttpSecurity http) {
        SavedRequestAwareAuthenticationSuccessHandler successHandler =
                new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        successHandler.setDefaultTargetUrl(this.adminContextPath + "/");

        return http.authorizeExchange()
                .pathMatchers(adminContextPath + "/assets/**").permitAll()
                .pathMatchers(adminContextPath + "/login").permitAll()
                .anyExchange().authenticated()
                .and().formLogin().loginPage(adminContextPath + "/login")
                .and().logout().logoutUrl(adminContextPath + "/logout")
                .and().httpBasic()
                .and().csrf().disable().build();

    }*/

//    @Configuration
//    public static class SecurityConfig extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            // Page with login form is served as /login.html and does a POST on /login
//            http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll
//            // The UI does a POST on /logout on logout
//            http.logout().logoutUrl("/logout");
//            // The ui currently doesn't support csrf
//            http.csrf().disable();
//
//            // Requests for the login page and the static assets are allowed
//            http.authorizeRequests()
//                    .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
//                    .permitAll();
//            // ... and any other request needs to be authorized
//            http.authorizeRequests().antMatchers("/**").authenticated();
//
//            // Enable so that the clients can authenticate via HTTP basic for registering
//            http.httpBasic();
//        }
//    }
//     end::configuration-spring-security[]

}