package com.example.moviezone.model

data class AnimeMovieData(
    val id: String,
    val title: String,
    val type: String,
    val year: String,
    val maturityRating: String,
    val time: String,
    val genre: List<String>,
    val firstDescription: String,
    val secondDescription: String,
    val director: String,
    val starring: String,
    val poster: String,
    val image: String
)

fun getAnimeMovieData(): List<AnimeMovieData> {
    return listOf(
        AnimeMovieData(
            id = "1",
            title = "Jujutsu Kaisen",
            type = "Series",
            year = "2020",
            maturityRating = "16+",
            time = "23m",
            genre = listOf<String>(
                "Anime", "Action", "Sci-Fi"
            ),
            firstDescription = "With his days numbered, high schooler Yuji decides to hunt down and consume the remaining 19 fingers of a deadly curse so it can die with him.",
            secondDescription = "With his days numbered, high schooler Yuji decides to hunt down and consume the remaining 19 fingers of a deadly curse so it can die with him.",
            director = "Sunghoo Park",
            starring = "Junya Enoki, Yuma Uchida, Asami Seto",
            poster = "https://i.pinimg.com/originals/ac/43/52/ac4352f877cd4265d69538bd7532b7b3.jpg",
            image = "https://preview.redd.it/hopgl6xv09r51.jpg?width=1920&format=pjpg&auto=webp&s=97abd070aac68cfef13085b92876e1b67fc13c64"
        ),

        AnimeMovieData(
            id = "2",
            title = "Blue Lock",
            type = "Series",
            year = "2022",
            maturityRating = "13+",
            time = "25m",
            genre = listOf<String>(
                "Anime", "Sports", "Drama"
            ),
            firstDescription = "High school soccer players from across Japan gather for a controversial project designed to create the best — and most egoistic — striker in the world.",
            secondDescription = "High school soccer players from across Japan gather for a controversial project designed to create the best — and most egoistic — striker in the world.",
            director = "Tetsuaki Watanabe & Shunsuke Ishikawa",
            starring = "Kazuki Ura,Tasuku Kaito,Yuki Ono",
            poster = "https://images.justwatch.com/poster/301084028/s718/bluelock.%7Bformat%7D",
            image = "https://themarketactivity.com/wp-content/uploads/2022/07/blue-lock.png"
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),

        AnimeMovieData(
            id = "",
            title = "",
            type = "",
            year = "",
            maturityRating = "",
            time = "",
            genre = listOf<String>(
                "", "", ""
            ),
            firstDescription = "",
            secondDescription = "",
            director = "",
            starring = "",
            poster = "",
            image = ""
        ),
    )
}
