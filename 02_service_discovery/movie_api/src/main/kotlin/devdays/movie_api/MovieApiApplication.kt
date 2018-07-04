package devdays.movie_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class MovieApiApplication

    fun main(args: Array<String>) {
        runApplication<MovieApiApplication>(*args)

//    @Bean
//    fun propertyConfigurer() = PropertySourcesPlaceholderConfigurer().apply {
//        setPlaceholderPrefix("%{")
//    }
}
