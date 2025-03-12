package com.rusty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("MyAccount","MyBalance","myCards","myLoans").authenticated()
                .requestMatchers("contact","notices","/error").permitAll()
        );
        http.formLogin(withDefaults());
//        http.formLogin(AbstractHttpConfigurer::disable);
//        http.formLogin(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer.disable());
//        http.formLogin((httpSecurityFormLoginConfigurer) -> {
//            httpSecurityFormLoginConfigurer.disable();
//        });
        http.httpBasic(withDefaults());
//        http.httpBasic(httpSecurityHttpBasicConfigurer -> httpSecurityHttpBasicConfigurer.disable());
        return http.build();
    }

    // UsernamePasswordAuthenticationFilter
//    BasicAuthenticationFilter


}
