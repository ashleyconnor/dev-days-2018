package devdays.movie_api.services

import org.springframework.stereotype.Service
import devdays.movie_api.model.Movie
import devdays.movie_api.repository.MovieRepository
import java.util.*

@Service
class MovieService(val movieRepository: MovieRepository) {

    fun getMovie(movieId: UUID): Optional<Movie> {
        return movieRepository.findById(movieId)
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