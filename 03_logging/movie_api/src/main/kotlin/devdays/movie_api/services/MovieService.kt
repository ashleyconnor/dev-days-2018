package devdays.movie_api.services

import brave.Tracer
import org.springframework.stereotype.Service
import devdays.movie_api.model.Movie
import devdays.movie_api.repository.MovieRepository
import org.slf4j.LoggerFactory
import java.util.*

@Service
class MovieService(val movieRepository: MovieRepository, val tracer: Tracer) {

    private val logger = LoggerFactory.getLogger(MovieService::class.java)

    fun getMovie(movieId: UUID): Optional<Movie> {
        var newSpan = tracer.nextSpan().name("getMovieDBCall").start()
        logger.debug("In the movieService.getMovie() call")

        try {
            return movieRepository.findById(movieId)
        } finally {
            newSpan.tag("peer.service", "postgres")
            newSpan.finish()
        }
    }

    fun saveMovie(movie: Movie) {
        movie.id = UUID.randomUUID()
        movieRepository.save(movie)
    }

    fun updateMovie(movie:Movie) {
        movieRepository.save(movie)
    }

    fun deleteMovie(movieId:UUID) {
        movieRepository.deleteById(movieId)
    }
}