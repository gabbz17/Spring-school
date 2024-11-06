//package com.example.API_School.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfiguration {
//
//    private final UserAuthenticationFilter userAuthenticationFilter;
//
//    public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
//        return security.csrf(csrf -> csrf.disable())
//                .sessionManagement(man -> man.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(HttpMethod.POST, "api/v1/student").permitAll())
//                .addFilterBefore(userA);
//    }
//}
