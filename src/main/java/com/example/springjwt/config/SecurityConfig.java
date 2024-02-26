package com.example.springjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 이 클래스가 springboot한테 configuration class로 관리되기 위함
@EnableWebSecurity // 이 configuration class 자체는 security를 위한 config라서

public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //csrf disable : 세션 방식의 경우, 세션이 계속 고정되기 때문에 csrf 공격을 필수적으로 방어해줘야함. but jwt는 세션을 stateless 방식으로 관리하기 때문에 딱히 필요하지 않아 disable
        http
                .csrf((auth) -> auth.disable()); // Intellij는 .csrf(AbstractHttpConfigurer::disable); 라고 쓰도록 하더라. 람다식을 method reference로 교체할 수 있다는 건데 차이점이 있는지가 궁금하다.


        return http.build();
    }
}
