package com.geolanches.Tapiocas

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**") // Habilita CORS para todos os endpoints
            .allowedOrigins("http://127.0.0.1:5500") // URL do frontend
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
            .allowedHeaders("*") // Permite todos os cabeçalhos
            .allowCredentials(true) // Permite credenciais, se necessário
    }
}
