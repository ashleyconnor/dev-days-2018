package devdays.movie_api.domain

import java.util.*

data class Actor(
    var id: UUID = UUID.randomUUID(),
    var movieId: UUID = UUID.randomUUID(),
    var name: String = ""
)