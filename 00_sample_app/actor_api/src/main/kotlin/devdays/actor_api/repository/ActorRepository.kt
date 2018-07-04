package devdays.actor_api.repository

import devdays.actor_api.model.Actor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ActorRepository: CrudRepository<Actor, UUID> {
    fun findAllByMovieId(movieId:UUID) : List<Actor>
}