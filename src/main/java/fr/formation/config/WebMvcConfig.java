package fr.formation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The type Web mvc config.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


	/**
	 * Cors configuration source cors configuration source.
	 *
	 * @return the cors configuration source
	 */
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
		config.addExposedHeader("Authorization");
		source.registerCorsConfiguration("/**", config);
		return (CorsConfigurationSource) source;
	}
}
