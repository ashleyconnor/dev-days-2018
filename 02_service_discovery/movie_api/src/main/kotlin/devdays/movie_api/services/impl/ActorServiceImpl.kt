package devdays.movie_api.services.impl

import devdays.movie_api.domain.Actor
import devdays.movie_api.services.ActorService
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.*


@Service
class ActorServiceImpl(
        restTemplateBuilder: RestTemplateBuilder,
        @Value("\${actorsServiceUrl}") val actorsServiceUrl: String): ActorService {

    val restTemplate: RestTemplate = restTemplateBuilder.rootUri("$actorsServiceUrl").build()

    override fun getActorsByMovieId(movieId: UUID): Array<Actor>? {
        return restTemplate.getForObject("/{movieId}/actors/", Array<Actor>::class.java, movieId)
    }

}