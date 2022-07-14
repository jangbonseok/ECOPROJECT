package com.cos.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cos.blog.config.auth.PrincipalDetailService;

//빈 등록: 스프링 컨테이너에서 객체를 관리할 수 있게 하는 것

@Configuration //IOC 관리
@EnableWebSecurity // 시큐리티 필터가 등록
@EnableGlobalMethodSecurity(prePostEnabled = true) //특정 주소로 접근을 하면 권한 및 인증을 미리 체크
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PrincipalDetailService principalDeatilService;
	
	@Bean //IOC 
	public BCryptPasswordEncoder encodePWD() {
		//String encPasswd = new BCryptPasswordEncoder().encode("");
		return new BCryptPasswordEncoder(); 
	}
	
	// 시큐리티가 대신 로그인해주는데 passwd를 가로채기를 하는데
	// 해당 passwd가 어떤 해쉬로 사용되어 회원가입이 되었는지를 알아야
	// 같은 해쉬로 암호화해서 DB에 있는 해쉬랑 비교를 할 수 있다.
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(principalDeatilService).passwordEncoder(encodePWD());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.csrf().disable() //csrf 토큰 비활성화. (테스트 시 걸어두어야 함)
			.authorizeRequests()
				.antMatchers("/","/auth/**","/js/**","/css/**","/img/**","/dummy/**")
				.permitAll()
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/auth/loginForm")
				.loginProcessingUrl("/auth/loginProc") //스프링 시큐리티가 해당 주소로 요청을 가로채서 대신 로그인 해줌
				.defaultSuccessUrl("/");
	}
}
