package devdays.movie_api.services

import devdays.movie_api.domain.Actor
import java.util.*

interface ActorService {

    fun getActorsByMovieId(movieId:UUID) : Array<Actor>?

}