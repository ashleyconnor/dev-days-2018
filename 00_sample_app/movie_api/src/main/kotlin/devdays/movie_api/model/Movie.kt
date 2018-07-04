package devdays.movie_api.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "movies")
data class Movie (

    @Id
    @Column(name = "id", nullable = false)
    var id:UUID = UUID.randomUUID(),

    @Column(name = "name", nullable = false)
    var name:String = "",

    @Column(name = "director", nullable = false)
    var director:String = "",

    @Column(name = "release_year", nullable = false)
    var releaseYear:Int = 1
)