package devdays.actor_api.controllers

import devdays.actor_api.model.Actor
import devdays.actor_api.services.ActorService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping(value = "{movieId}/actors")
class ActorController {

    @Autowired
    lateinit var actorService: ActorService

    private val logger = LoggerFactory.getLogger(ActorController::class.java)

    @RequestMapping(value="/", method= [RequestMethod.GET])
    fun getActors(@PathVariable("movieId") movieId: UUID): List<Actor> {
        logger.debug("Entering the getActors() method for movieId: {}", movieId)
        return actorService.getActors(movieId)
    }
}