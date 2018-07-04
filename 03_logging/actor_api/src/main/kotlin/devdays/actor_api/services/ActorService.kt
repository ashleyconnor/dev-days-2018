package devdays.actor_api.services

import brave.Tracer
import devdays.actor_api.model.Actor
import devdays.actor_api.repository.ActorRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class ActorService(val actorRepository: ActorRepository, val tracer: Tracer) {

    private val logger = LoggerFactory.getLogger(ActorService::class.java)

    fun getActors(movieId: UUID): List<Actor> {
        var newSpan = tracer.nextSpan().name("findAllByMovieId").start()
        logger.debug("In the actorService.getActors() call")
        try {
            return actorRepository.findAllByMovieId(movieId)
        } finally {
            newSpan.tag("peer.service", "postgres")
            newSpan.finish()
        }
    }
}