package com.example.moviezone.model

data class MovieData(
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

fun getMovieData(): List<MovieData> {
    return listOf(

        MovieData(
            id = "1",
            title = "One Piece Red Film",
            type = "Movie",
            year = "2022",
            maturityRating = "13+",
            time = "23m",
            genre = listOf<String>(
                "Anime", "Action", "Adventure", "New Release"
            ),
            firstDescription = "For the first time ever, Uta - the most beloved singer in the world - will reveal herself to the world at a live concert. The voice that the whole world has been waiting for is about to resound.",
            secondDescription = "Uta is the most beloved singer in the world. Her voice, which she sings with while concealing her true identity, has been described as \"otherworldly.\" She will appear in public for the first time at a live concert. As the venue fills with all kinds of Uta fans - excited pirates, the Navy watching closely, and the Straw Hats led by Luffy who simply came to enjoy her sonorous performance - the voice that the whole world has been waiting for is about to resound. The story begins with the shocking fact that she is \"Shanks' daughter.\"",
            director = "Gorô Taniguchi",
            starring = "Mayumi Tanka, Kazuya Nakai, Akemi Okamura",
            poster = "https://m.media-amazon.com/images/M/MV5BZjY1MzBmNTgtMTYwZS00ODE0LWE1NDItNmJjNzYxNDEyY2YwXkEyXkFqcGdeQXVyNjM0MTI4Mw@@._V1_.jpg",
            image = "https://preview.redd.it/lnlnzbjvsju81.jpg?auto=webp&s=89748b20899fa03a40c765d1bd1420482ce71a7a"
        ),

        MovieData(
            id = "2",
            title = "My Hero Academia: Heroes Rising",
            type = "Movie",
            year = "2019",
            maturityRating = "13+",
            time = "1h 44m",
            genre = listOf<String>(
                "Anime", "Action", "Adventure"
            ),
            firstDescription = "A group of youths aspiring to become professional superheroes, fight in a world full of people with abilities, also known as quirks. Deku and his fellow classmates from Hero Academy face Nine, the strongest villain yet.",
            secondDescription = "Mankind has developed superpowers known as \"Quirks\"; this is the power the vast majority possesses, those who do not, are being discriminated against and looked down on. Indeed, villains have the superpower, too and want to rebuild the world for it to look the way they see it. However, a prestigious school known as the The Hero Academy trains its students for them to become heroes and to help those who have less powerful Quirks, or those who do not have them at all, as well as to stand against the plans of the villains. The series focuses on a middle school student Izuku Midoriya, who has no superpowers. Will he be able to become a hero and somehow to contribute to the peace and stability in the world, where the weak is the minority that needs to be defended.",
            director = "Kenji Nagasaki",
            starring = "Daiki Yamashita, Nobuhiko Okamoto, Yuka Terasaki",
            poster = "https://m.media-amazon.com/images/M/MV5BYjViOWY3YTQtNTliOC00NzkwLTllMGMtMjNiZTU0MmZjZTgzXkEyXkFqcGdeQXVyODgzNTQ1NTU@._V1_.jpg",
            image = "https://static01.nyt.com/images/2020/02/26/arts/myhero1/merlin_169506627_71abc974-c769-45bf-aa1c-e712aa08c074-superJumbo.jpg"
        ),

        MovieData(
            id = "3",
            title = "Kuroko's Basketball: Last Game",
            type = "Movie",
            year = "2017",
            maturityRating = "13+",
            time = "1h 30m",
            genre = listOf<String>(
                "Anime", "Sports", "School Anime"
            ),
            firstDescription = "The Generation of Miracles, including Kagami and Kuroko, form Team Vorpal Swords to challenge Team Jabberwock to a revenge match after the latter disparaged all Japanese basketballers as monkeys.",
            secondDescription = "An American street basketball team called Jabberwock comes to Japan and plays a friendly match with a Japanese team, but after the Japanese team suffers a crushing defeat, the team members of Jabberwock start mocking Japanese basketball. Their comments enrage Riko's father, and so he gathers a team made up of the five members of the Generation of Miracles plus Kuroko and Kagami, called Vorpal Swords, to have a revenge match against Jabberwock.",
            director = "Shunsuke Tada",
            starring = "Kensho Ono, Yuki Ono, Hiroshi Kamiya",
            poster = "https://preview.redd.it/y89mouefn8i11.jpg?auto=webp&s=e284a1f816f11ed6de6628362650f4ecd01a39db",
            image = "https://wallpaperaccess.com/full/6812989.png"
        ),

        MovieData(
            id = "4",
            title = "Weathering with you",
            type = "Movie",
            year = "2019",
            maturityRating = "13+",
            time = "1h 52m",
            genre = listOf<String>(
                "Anime", "Teen", "Romance"
            ),
            firstDescription = "The summer of his freshman year, Hodaka runs away to bustling, ever-raining Tokyo and falls for Hina, a girl who seems able to manipulate the weather.",
            secondDescription = "",
            director = "Makoto Shinkai",
            starring = "Kotaro Daigo, Nana Mori, Tsubasa Honda",
            poster = "https://i.pinimg.com/564x/2e/ea/19/2eea19e98c50ad31cfbdf006b5923b7e.jpg",
            image = "https://tldrmoviereviewsblog.files.wordpress.com/2019/08/weathering-with-you-1.jpg"
        ),

        MovieData(
            id = "5",
            title = "A Silent Voice",
            type = "Movie",
            year = "2016",
            maturityRating = "13+",
            time = "2h 9m",
            genre = listOf<String>(
                "Anime", "School Anime", "Teen"
            ),
            firstDescription = "A former class bully reaches out to the Deaf girl he'd tormented in grade school. He feels unworthy of redemption but tries to make things right.",
            secondDescription = "Shouya Ishida starts bullying the new girl in class, Shouko Nishimiya, because she is deaf. But as the teasing continues, the rest of the class starts to turn on Shouya for his lack of compassion. When they leave elementary school, Shouko and Shouya do not speak to each other again - until an older, wiser Shouya, tormented by his past behaviour, decides he must see Shouko once more. He wants to atone for his sins, but is it already too late?",
            director = "Naoko Yamada, Yoshitoki Oima",
            starring = "Miyu Irino,Saori Hayami,Aoi Yuki",
            poster = "https://m.media-amazon.com/images/M/MV5BZGRkOGMxYTUtZTBhYS00NzI3LWEzMDQtOWRhMmNjNjJjMzM4XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
            image = "https://cdn.player.one/sites/player.one/files/2017/11/10/silent-voice-2.png"
        ),

        MovieData(
            id = "6",
            title = "A Whisker Away",
            type = "Movie",
            year = "2020",
            maturityRating = "7+",
            time = "1h 45m",
            genre = listOf<String>(
                "Anime", "Sci-Fi", "Romance"
            ),
            firstDescription = "Miyo Sasaki is in love with her classmate Kento Hinode and tries repeatedly to get Kento's attention by transforming into a cat, but at some point, the boundary between herself and the cat becomes ambiguous.",
            secondDescription = "Miyo Sasaki is a weird second-year junior high student, who falls in love with her classmate Kento Hinode. Muge tries to make Kento notice her every day, but all in vain. Nevertheless, while carrying a secret she can tell no one, Muge continues to pursue Kento. Muge discovers a magic mask that allows her to transform into a cat, however, there is also a probability that she might never become human again, if she continues using the mask.",
            director = "Junichi Sato & Tomotaka Shibayama",
            starring = "Mirai Shida, Natsuki Hanae, Hiroaki Ogi",
            poster = "https://m.media-amazon.com/images/M/MV5BNmY5YzYyYzktNmRhNi00ZWI3LWE2YzgtNjBkYjc2MjhhYzNmXkEyXkFqcGdeQXVyMTA3MTI2ODc5._V1_.jpg",
            image = "https://storage.googleapis.com/stateless-thedailyfandom-org/2020/06/827a53f9-maxresdefault-2.jpg"
        ),

        MovieData(
            id = "7",
            title = "Your Name",
            type = "Movie",
            year = "2016",
            maturityRating = "7+",
            time = "",
            genre = listOf<String>(
                "Anime", "Fantasy", "Romance"
            ),
            firstDescription = "A bored girl in the countryside starts sporadically waking up in the body of a city boy who's living the exciting life she'd always dreamed of.",
            secondDescription = "Mitsuha is the daughter of the mayor of a small mountain town. She's a straightforward high school girl who lives with her sister and her grandmother and has no qualms about letting it be known that she's uninterested in Shinto rituals or helping her father's electoral campaign. Instead she dreams of leaving the boring town and trying her luck in Tokyo. Taki is a high school boy in Tokyo who works part-time in an Italian restaurant and aspires to become an architect or an artist. Every night he has a strange dream where he becomes...a high school girl in a small mountain town.",
            director = "Makoto Shinkai",
            starring = "Ryunosuke Kamiki, Mone Kamishiraishi, Ryo Narita",
            poster = "https://m.media-amazon.com/images/M/MV5BNGYyNmI3M2YtNzYzZS00OTViLTkxYjAtZDIyZmE1Y2U1ZmQ2XkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg",
            image = "https://cdn.vox-cdn.com/thumbor/ab7GeC585ehvC-Y4zEkqUcwOa9c=/0x0:2067x1377/1200x800/filters:focal(869x524:1199x854)/cdn.vox-cdn.com/uploads/chorus_image/image/54120135/your_name_oped.0.jpg"
        ),

        MovieData(
            id = "8",
            title = "Hunter x Hunter: The Last Mission",
            type = "Movie",
            year = "2013",
            maturityRating = "14+",
            time = "1h 37m",
            genre = listOf<String>(
                "Anime", "Action", "Adventure"
            ),
            firstDescription = "The strongest Hunters that once existed in the Hunter Association were split into \"light\" and \"dark\", and each walked down their respective paths. The \"dark\" side begins moving in order to massacre all Hunters!",
            secondDescription = "After a brutal attack from the \"dark\" side Hunters, Killua is injured and Kurapika is almost dead. What is the real goal behind the attack on all the Hunters? Now that the crimes of Netero & the Association are announced publicly. Will Gon take the dark side's path to find the necessary strength to save his friends? What actions will Gon take when the many crimes of Netero and the Hunter Association are unveiled...!?",
            director = "Keiichiro Kawaguchi",
            starring = "Tommy Arciniega, Laila Berzins, Kira Buckland",
            poster = "https://m.media-amazon.com/images/M/MV5BNDkzMTBiM2YtM2ZkZi00NzM1LTg0ZWYtMTE1YmFiNzg5MjNmXkEyXkFqcGdeQXVyMjQ3NTQ4MjQ@._V1_FMjpg_UX1000_.jpg",
            image = "https://static.wikia.nocookie.net/hunterxhunter/images/d/d1/Last_Mission_SS3.png/revision/latest?cb=20210401220458"
        ),

        MovieData(
            id = "9",
            title = "Toy Story 4",
            type = "Movie",
            year = "2019",
            maturityRating = "G",
            time = "1h 40m",
            genre = listOf<String>(
                "Anime", "Comedy", "Adventure"
            ),
            firstDescription = "When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
            secondDescription = "Woody, Buzz Lightyear and the rest of the gang embark on a road trip with Bonnie and a new toy named Forky. The adventurous journey turns into an unexpected reunion as Woody's slight detour leads him to his long-lost friend Bo Peep. As Woody and Bo discuss the old days, they soon start to realize that they're two worlds apart when it comes to what they want from life as a toy.",
            director = "Josh Cooley",
            starring = "Tom Hanks, Tim Allen, Annie Potts",
            poster = "https://amc-theatres-res.cloudinary.com/v1579119454/amc-cdn/production/2/movies/43000/43026/Poster/p_800x1200_AMC_ToyStory4_27092019.jpg",
            image = "https://s3.amazonaws.com/static.rogerebert.com/uploads/review/primary_image/reviews/toy-story-4-2019/story-4-image.jpg"
        ),

        MovieData(
            id = "10",
            title = "Sing 2",
            type = "Movie",
            year = "2021",
            maturityRating = "PG",
            time = "1h 50m",
            genre = listOf<String>(
                "Anime", "Adventure", "Comedy"
            ),
            firstDescription = "With his theatrical company a local success, Buster Moon is dreaming of bigger things. Unfortunately, when a talent scout dismisses their work as inadequate for the big time, Buster is driven to prove her wrong. With that goal in mind, Buster inspires his players to gamble everything to sneak into a talent audition in Redshore City for the demanding entertainment mogul Jimmy Crystal.",
            secondDescription = "Against the odds, they catch his interest with some frantic creative improvisation and even more desperate lies like personally knowing the reclusive rock star, Clay Calloway, who has not been seen in 15 years. Now faced with a tight production window with only a vague story idea and dire consequences for failure, Buster and his friends must all stretch their talents put on a show against all odds. In that struggle, the gang's challenges seem insurmountable, but each of them finds new inspirations and friends where they least expect them to pursue an artistic dream worthy of them.",
            director = "Garth Jennings, Christophe Lourdelet",
            starring = "Matthew McConaughey, Reese Witherspoon, Scarlett Johansson",
            poster = "https://www.themoviedb.org/t/p/original/eIT8lxiyk1vYryawOt0dGBKwVJm.jpg",
            image = "https://m.media-amazon.com/images/M/MV5BMGI0YWM0M2YtYzg5ZC00ZTFiLWExNWUtNjAzZjg5ZmMxZTE1XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_.jpg"
        ),

        MovieData(
            id = "11",
            title = "Morbius",
            type = "Movie",
            year = "2022",
            maturityRating = "13+",
            time = "1hr 44m",
            genre = listOf<String>(
                "Sci-Fi", "Action", "Thriller", "New Release"
            ),
            firstDescription = "Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead. Dangerously ill with a rare blood disorder, and determined to save others suffering his same fate, Dr. Morbius attempts a desperate gamble. What at first appears to be a radical success soon reveals itself to be a remedy potentially worse than the disease.",
            secondDescription = "Suffering from a rare genetic blood disorder, Nobel Prize-winning scientist Dr Michael Morbius knows he is living on borrowed time. And after years of fruitless attempts to find a cure, Morbius is now running out of options. But this fatal condition has been plaguing him since childhood, and he can't afford to stop now. As desperate Morbius decides to risk his life to achieve results, an unstable and highly experimental serum offers a solution to the problem. However, what happens if the cure is worse than the disease?",
            director = "Daniel Espinosa",
            starring = "Jared Leto, Matt Smith, Adria Arjona",
            poster = "https://i0.wp.com/wikifamouspeople.com/wp-content/uploads/2022/02/Morbious-poster.jpg?fit=1080%2C1350&ssl=1",
            image = "https://static01.nyt.com/images/2022/03/31/arts/31morbius1/31morbius1-videoSixteenByNine3000.jpg"
        ),

        MovieData(
            id = "12",
            title = "The Wonder",
            type = "Movie",
            year = "2022",
            maturityRating = "16+",
            time = "1h 49m",
            genre = listOf<String>(
                "Drama", "Mystery", "Thriller", "New Release"
            ),
            firstDescription = "Haunted by her past, a nurse travels from England to a remote Irish village in 1862 to investigate a young girl's supposedly miraculous fast.",
            secondDescription = "Set in The Irish Midlands in 1862, the story follows a young girl who stops eating but remains miraculously alive and well. English nurse Lib Wright is brought to a tiny village to observe eleven-year old Anna O'Donnell. Tourists and pilgrims mass to witness the girl who is said to have survived without food for months. Is the village harbouring a saint 'surviving on manna from heaven' or are there more ominous motives at work?",
            director = "Sebastián Lelio",
            starring = "Florence Pugh, Tom Burke, Kíla Lord Cassidy",
            poster = "https://m.media-amazon.com/images/M/MV5BNDBmNzIwY2QtMjZhOC00YzlhLWIwNjMtZDdkZjY3OWUzZDI4XkEyXkFqcGdeQXVyMTAyMjQ3NzQ1._V1_.jpg",
            image = "https://m.media-amazon.com/images/M/MV5BNWY3ZGJmMTAtMzY1Mi00YmM2LWEzMDAtMDkwY2MzZjA3Y2Q5XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg"
        ),

        MovieData(
            id = "13",
            title = "Take Point",
            type = "Movie",
            year = "2018",
            maturityRating = "16+",
            time = "2h 5m",
            genre = listOf<String>(
                "Action", "Thriller", "Adventure"
            ),
            firstDescription = "A mercenary captain leads his black-ops team to a bunker beneath the Korean DMZ on a secret CIA mission that brings the world to the brink of war.",
            secondDescription = "On the day of the U.S. presidential election in 2024, Ahab (HA) and his team of elite mercenaries embark on a secret CIA mission to abduct North Korea's Armed Forces Minister in an underground bunker below the Korean Demilitarized Zone (DMZ). However, they get caught in the crossfire which causes tensions to escalate to the brink of World War III.",
            director = "Byung-woo Kim",
            starring = "Ha Jung-woo, Lee Sun-kyun, Jennifer Ehle",
            poster = "https://m.media-amazon.com/images/M/MV5BNTQyMGUyNWYtNTBlMi00MWM5LWExMjUtZjFhN2NmODhhNjcyXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg",
            image = "https://d17389e216ygm.cloudfront.net/wp-content/uploads/CE_TakePoint1.jpg"
        ),

        MovieData(
            id = "14",
            title = "Interceptor",
            type = "Movie",
            year = "2022",
            maturityRating = "16+",
            time = "1h 38m",
            genre = listOf<String>(
                "Action", "Adventure", "Drama", "New Release"
            ),
            firstDescription = "One Army captain must use her years of tactical training and military expertise when a simultaneous coordinated attack threatens the remote missile interceptor station she is in command of.",
            secondDescription = "The tough and reality-bruised Captain JJ Collins (Elsa Pataky) finds herself in charge of a lone nuclear missile interceptor base in the middle of the Pacific Ocean after she is wrongfully drummed out of her dream job at the Pentagon. When a simultaneous coordinated attack then threatens the base itself, Collins comes face-to-face with the charismatic yet crooked Alexander Kessel (Luke Bracey), a former US military intelligence officer intent on carrying out an unthinkable plan. With only minutes on the clock, Collins must utilize her years of tactical training and military expertise to determine who she can trust and stop Kessel and his covert mercenaries from completing their twisted and terrible mission.",
            director = "Matthew Reilly",
            starring = "Elsa Pataky, Luke Bracey, Aaron Glenane",
            poster = "https://www.themoviedb.org/t/p/original/nSI3RslMvXz8My6sK2dPWpyOsDG.jpg",
            image = "https://www.avforums.com/styles/avf/editorial/block//be75fc485f0e42ff24d340afb66b433a_3x3.jpg"
        ),

        MovieData(
            id = "15",
            title = "Texas Chainsaw Massacre",
            type = "Horror Movie",
            year = "2022",
            maturityRating = "18+",
            time = "1h 23m",
            genre = listOf<String>(
                "Action", "Thriller", "Mystery", "New Release"
            ),
            firstDescription = "After 48 years of hiding, Leatherface returns to terrorize a group of idealistic young friends who accidentally disrupt his carefully shielded world in a remote Texas town.",
            secondDescription = "In this sequel, influencers looking to breathe new life into a Texas ghost town encounter Leatherface, an infamous killer who wears a mask of human skin.",
            director = "David Blue Garcia",
            starring = "Sarah Yarkin, Elsie Fisher, Mark Burnham",
            poster = "https://m.media-amazon.com/images/M/MV5BNjVhZTkxMzgtM2M1NS00NjJkLTllYjUtMzQ5Y2IxNmE4OTFlXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_.jpg",
            image = "https://images.hindustantimes.com/img/2022/02/19/1600x900/texas_chainsaw_massacre_1645268366873_1645268367096.jpg"
        ),

        MovieData(
            id = "16",
            title = "Day Shift",
            type = "Horror Movie",
            year = "2022",
            maturityRating = "16+",
            time = "1h 53m",
            genre = listOf<String>(
                "Action", "Comedy", "Fantasy", "New Release"
            ),
            firstDescription = "An LA vampire hunter has a week to come up with the cash to pay for his kid's tuition and braces. Trying to make a living these days just might kill him.",
            secondDescription = "A hard-working, blue-collar dad just wants to provide a good life for his quick-witted 10-year-old daughter. His mundane San Fernando Valley pool cleaning job is a front for his real source of income: hunting and killing vampires.",
            director = "J.J. Perry",
            starring = "Jamie Foxx, Dave Franco, Natasha Liu Bordizzo",
            poster = "https://images.justwatch.com/poster/291389812/s718/day-shift.%7Bformat%7D",
            image = "https://static01.nyt.com/images/2022/08/12/arts/dayshift1/dayshift1-videoSixteenByNine3000.jpg"
        ),

        MovieData(
            id = "17",
            title = "The Adam Project",
            type = "Family Movie",
            year = "2022",
            maturityRating = "13+",
            time = "1h 46m",
            genre = listOf<String>(
                "Action", "Adventure", "Comedy", "New Release"
            ),
            firstDescription = "After accidentally crash-landing in 2022, time-traveling fighter pilot Adam Reed teams up with his 12-year-old self on a mission to save the future.",
            secondDescription = "Adam Reed, age 12 and still grieving his father's sudden death the year before, walks into his garage one night to find a wounded pilot hiding there. This mysterious pilot turns out to be the older version of himself from the future, where time travel is in its infancy. He has risked everything to come back in time on a secret mission. Together they must embark on an adventure into the past to find their father, set things right, and save the world. As the three work together, both young and grown Adam come to terms with the loss of their father and have a chance to heal the wounds that have shaped them. Adding to the challenge of the mission, the two Adams discover that they really don't like each other much, and if they are to save the world, first they need to figure out how to get along.",
            director = "Shawn Levy",
            starring = "Ryan Reynolds, Mark Ruffalo, Jennifer Garner",
            poster = "https://m.media-amazon.com/images/M/MV5BOWM0YWMwMDQtMjE5NS00ZTIwLWE1NWEtODViMWZjMWI2OTU3XkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_FMjpg_UX1000_.jpg",
            image = "https://www.ungeek.ph/wp-content/uploads/2022/03/The-Adam-Project-Poster.jpg"
        ),

        MovieData(
            id = "18",
            title = "Miracle in Cell No. 7",
            type = "Drama Movie",
            year = "2013",
            maturityRating = "14+",
            time = "2h 12m",
            genre = listOf<String>(
                "Drama", "Family", "Comedy"
            ),
            firstDescription = "Separated from his daughter, a father with an intellectual disability must prove his innocence when he is jailed for the death of a commander's child.",
            secondDescription = "A story about the love between a mentally-ill father and his lovingly adorable daughter. Wrongfully accused of murder and rape, Yong-Goo is imprisoned for murder, and builds friendships with the hardened criminals in his cell, who in return help him see his daughter again by smuggling her into the prison.",
            director = "Hwan-kyung Lee",
            starring = "Hwan-kyung Lee, Yoo Yeong-ah, Hwang-seong Kim",
            poster = "https://i.pinimg.com/564x/92/fc/c1/92fcc1816d75f99e8ea38cab3fb56bd3.jpg",
            image = "https://image.tmdb.org/t/p/original/amRW8YRNaBCpU5MfJalq4lhBk3P.jpg"
        ),

        MovieData(
            id = "19",
            title = "Little Man",
            type = "Movie",
            year = "2006",
            maturityRating = "13+",
            time = "1hr 37m",
            genre = listOf<String>(
                "Comedy", "Family", "Action"
            ),
            firstDescription = "A wannabe-dad mistakes a vertically-challenged criminal on the lam for his newly-adopted son.",
            secondDescription = "A short, tiny criminal named Calvin has just committed a robbery with his dimwitted partner Percy involving stealing a precious diamond from a jewelry store. However, the snatch goes awry and Calvin ditches the diamond by stashing it in the purse of a woman named Vanessa, who's married to a wannabe-dad named Daryl. Now Calvin must pose as an infant to get the diamond back, but a simple cash-and-grab turns into a friendly relationship between Calvin and Darryl.",
            director = "Daniel Espinosa",
            starring = "Jared Leto, Matt Smith, Adria Arjona",
            poster = "https://m.media-amazon.com/images/M/MV5BMTI0NTA3MjI3NV5BMl5BanBnXkFtZTcwNTI1ODYzMQ@@._V1_FMjpg_UX1000_.jpg",
            image = "https://www.slantmagazine.com/wp-content/uploads/2006/07/littleman.jpg"
        ),

        MovieData(
            id = "20",
            title = "Like Stars on Earth",
            type = "Bolywood Movie",
            year = "2007",
            maturityRating = "13+",
            time = "2hr 42m",
            genre = listOf<String>(
                "Comedy", "Family", "Drama"
            ),
            firstDescription = "Taare zameen par is a story about a child played by Darsheel Safari who suffers from dyslexia. As a result of which he is unable to cope with daily life, during his early childhood. Improvement in his life is made by teacher played by aamir khan, who explains the problem to darsheel's parents and gradually puts in efforts himself to improve life of that poor child.",
            secondDescription = "An art teacher, Ram Shankar Nikumbh teaches at a local boarding school and thinks that every child is special and must have his chance of enjoying his/her school days, so he breaks all the rules of 'how things are done' in the school to let his motives became successful, all the children respond to him with joy, all except a small boy named Ishaan Awasthi, of eight years old who seem to be in a different world all the time. Nikumbh soon finds out that Ishaan is unhappy about something. He attempts to help him. The questions remain will he be successful or will the errant prove dangerous for him.",
            director = "Aamir Khan, Amole Gupte",
            starring = "Aamir Khan, Darsheel Safary, Tanay Chheda",
            poster = "https://m.media-amazon.com/images/M/MV5BMDhjZWViN2MtNzgxOS00NmI4LThiZDQtZDI3MzM4MDE4NTc0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
            image = "https://www.articles.incluvie.com/wp-content/uploads/2022/05/Like-Stars-on-Earth-1.jpeg"
        )


    )
}
