package com.example.moviezone.model

data class MovieData(
    val id: String,
    val title: String,
    val type: String,
    val year: String,
    val maturityRating: String,
    val time: String,
    val genre: List<String>,
    val description: String,
    val director: String,
    val starring: String,
    val poster: String,
    val image: String
)

fun getMovieData(): List<MovieData> {
    return listOf(
        MovieData(
            id = "1",
            title = "Jujutsu Kaisen",
            type = "Series",
            year = "2020",
            maturityRating = "16+",
            time = "23m/Episode",
            genre = listOf<String>(
                "Anime", "Anime Action", "Based on Manga", "Sci-Fi", "Fantasy"
            ),
            description = "With his days numbered, high schooler Yuji decides to hunt down and consume the remaining 19 fingers of a deadly curse so it can die with him.",
            director = "Sunghoo Park",
            starring = "Junya Enoki, Yuma Uchida, Asami Seto",
            poster = "https://i.pinimg.com/originals/ac/43/52/ac4352f877cd4265d69538bd7532b7b3.jpg",
            image = "https://preview.redd.it/hopgl6xv09r51.jpg?width=1920&format=pjpg&auto=webp&s=97abd070aac68cfef13085b92876e1b67fc13c64"
        )
    )
}
