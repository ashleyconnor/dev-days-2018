package devdays.actor_api.services

import devdays.actor_api.model.Actor
import devdays.actor_api.repository.ActorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ActorService(val actorRepository: ActorRepository) {

    fun getActors(movieId: UUID): List<Actor> {
        return actorRepository.findAllByMovieId(movieId)
    }
}