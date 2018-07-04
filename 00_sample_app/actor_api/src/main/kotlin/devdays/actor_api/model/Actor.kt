package devdays.actor_api.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "actors")
data class Actor(
        @Id
        @Column(name = "id", nullable = false)
        var id: UUID = UUID.randomUUID(),

        @Column(name = "movie_id", nullable = false)
        var movieId: UUID = UUID.randomUUID(),

        @Column(name = "name", nullable = false)
        var name:String = ""
)