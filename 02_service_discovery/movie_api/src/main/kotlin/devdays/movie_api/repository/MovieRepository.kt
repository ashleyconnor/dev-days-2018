package devdays.movie_api.repository

import devdays.movie_api.model.Movie
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository
import java.util.*

@Repository
interface MovieRepository: CrudRepository<Movie, UUID> {
    override fun findById (movieId:UUID):Optional<Movie>
}