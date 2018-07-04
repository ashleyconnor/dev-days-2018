package devdays.movie_api.domain

import devdays.movie_api.model.Movie

data class Premier(
        var actors: Array<Actor>?,
        var movie: Movie?
)
