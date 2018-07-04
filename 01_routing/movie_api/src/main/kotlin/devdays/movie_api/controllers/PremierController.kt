package devdays.movie_api.controllers

import devdays.movie_api.domain.Premier
import devdays.movie_api.model.Movie
import devdays.movie_api.services.ActorService
import devdays.movie_api.services.MovieService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(value="v1/premiers")
class PremierController {

    @Autowired
    lateinit var movieService: MovieService

    @Autowired
    lateinit var actorService: ActorService

    private val logger = LoggerFactory.getLogger(PremierController::class.java)

    @GetMapping(value="/{movieId}")
    fun getMovieWithActors(@PathVariable("movieId") movieId: UUID): Premier {
        logger.debug("Entering the getMovieWithActors() method for id: {}", movieId)
        val actors = actorService.getActorsByMovieId(movieId)
        val movie = movieService.getMovie(movieId).get()
        return Premier(actors, movie)
    }
}