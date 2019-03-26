package com.cts.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter   {
	
	@Autowired
	private BookAuthenticationSucessHandler successHandler;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	protected void  configure(AuthenticationManagerBuilder auth )  throws Exception{
		auth.inMemoryAuthentication()
		.passwordEncoder(passwordEncoder)
		.withUser("rajat").password(passwordEncoder.encode("rajat")).roles("USER")
		.and()
		.withUser("admin").password(passwordEncoder.encode("123456")).roles("USER","ADMIN");
	
		
	}
	
	@Bean
   public PasswordEncoder passwordEncoder()
   {
		return  new BCryptPasswordEncoder();
		
   }
   
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.antMatchers("/book").permitAll()
		.antMatchers("/book").permitAll()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/**").hasAnyRole("ADMIN","USER")
		.and().formLogin().successHandler(successHandler)
		.and().logout().logoutSuccessUrl("/login").permitAll().logoutUrl("/j_spring_security_logout")
		.and().csrf().disable();
		
		
		
		
		
	}
	
	
	

}
