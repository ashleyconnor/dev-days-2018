package devdays.movie_api.controllers

import devdays.movie_api.model.Movie
import devdays.movie_api.services.ActorService
import devdays.movie_api.services.MovieService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(value="v1/movies")
class MovieController {

    @Autowired
    lateinit var movieService: MovieService

    private val logger = LoggerFactory.getLogger(MovieController::class.java)

    @GetMapping(value="/{movieId}")
    fun getMovie(@PathVariable("movieId") movieId:UUID): Movie {
        logger.debug("Entering the getMovie() method for id: {}", movieId)
        return movieService.getMovie(movieId).get()
    }

    @PutMapping(value="/{movieId}")
    fun updateMovie(@PathVariable("movieId") movieId:UUID, @RequestBody movie: Movie) {
        logger.debug("Entering the getMovie() method for id: {}", movieId)
        movieService.updateMovie(movie)
    }

    @PostMapping(value="/{movieId}")
    fun saveMovie(@RequestBody movie:Movie) {
        logger.debug("Entering the saveMovie() method with movie name: {}", movie.name)
        movieService.saveMovie(movie)
    }

    @DeleteMapping(value="/{movieId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteMovie(@PathVariable("movieId") movieId:UUID) {
        logger.debug("Entering the deleteMovie() method for id: {}", movieId)
        movieService.deleteMovie(movieId)
    }
}