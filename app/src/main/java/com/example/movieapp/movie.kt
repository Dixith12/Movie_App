package com.example.movieapp

import com.example.movieapp.movie as movie

data class movie(val Id:String,
                 val Title:String,
                 val Year:String,
                 val Genre:String,
                 val Director:String,
                 val Actor:String,
                 val Plot:String,
                 val Poster:String,
                 val Images:List<String>,
                 val Ratings:String)
fun getmovie() : List<movie>{
    return listOf(
        movie(
            Id = "tt0499549",
            Title =  "Avatar",
        Year = "2009",
        Genre="Action, Adventure, Fantasy",
    Director="James Cameron",
    Actor="Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
    Plot="A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
    Poster="http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
    Ratings ="7.9",
    Images = listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTYxMDg1Nzk1MV5BMl5BanBnXkFtZTcwMDk0MTUzNA@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
        )),
        movie(
            Id = "tt0416449",
            Title = "300",
            Year = "2006",
            Genre = "Action, Drama, Fantasy",
            Director = "Zack Snyder",
            Actor = "Gerard Butler, Lena Headey, David Wenham, Dominic West",
            Plot = "King Leonidas of Sparta and a force of 300 men fight the Persians at Thermopylae in 480 B.C.",
            Poster = "http://ia.media-imdb.com/images/M/MV5BMTkzMDM0MzMyN15BMl5BanBnXkFtZTcwODI5OTMzMw@@._V1_SX300.jpg",
            Ratings = "7.7",
            Images = listOf(
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2MTk3MDA2MF5BMl5BanBnXkFtZTcwNjIxMzY0MQ@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxNDQxNjY3OF5BMl5BanBnXkFtZTcwNDEwMzY0MQ@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNDE5MDEzMTQ1MF5BMl5BanBnXkFtZTcwMzEwMzY0MQ@@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
            )
        ),
            movie(
                Id="tt0480249",
            Title= "I Am Legend",
        Year="2007",
    Genre="Drama, Horror, Sci-Fi",
    Director="Francis Lawrence",
    Actor="Will Smith, Alice Braga, Charlie Tahan, Salli Richardson-Whitfield",
    Plot="Years after a plague kills most of humanity and transforms the rest into monsters, the sole survivor in New York City struggles valiantly to find a cure.",
    Poster= "http://ia.media-imdb.com/images/M/MV5BMTU4NzMyNDk1OV5BMl5BanBnXkFtZTcwOTEwMzU1MQ@@._V1_SX300.jpg",
    Ratings= "7.2",
    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTI0NTI4NjE3NV5BMl5BanBnXkFtZTYwMDA0Nzc4._V1_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMDg2MDU4M15BMl5BanBnXkFtZTYwMTA0Nzc4._V1_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc5MDM1OTU5OV5BMl5BanBnXkFtZTYwMjA0Nzc4._V1_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTA0MTI2NjMzMzFeQTJeQWpwZ15BbWU2MDMwNDc3OA@@._V1_.jpg",
    )),

           movie(
                    Id="tt0848228",
                    Title="The Avengers",
        Year="2012",
    Genre="Action, Sci-Fi, Thriller",
    Director="Joss Whedon",
    Actor="Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
    Plot="Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous Loki and his alien army from enslaving humanity.",
    Poster="http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg",
    Ratings="8.1",

    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTA0NjY0NzE4OTReQTJeQWpwZ15BbWU3MDczODg2Nzc@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjE1MzEzMjcyM15BMl5BanBnXkFtZTcwNDM4ODY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjMwMzM2MTg1M15BMl5BanBnXkFtZTcwNjM4ODY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ4NzM2Mjc5MV5BMl5BanBnXkFtZTcwMTkwOTY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc3MzQ3NjA5N15BMl5BanBnXkFtZTcwMzY5OTY3Nw@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    )),
        movie(
            Id = "tt1375666",
            Title = "Inception",
            Year = "2010",
            Genre = "Action, Adventure, Sci-Fi",
            Director = "Christopher Nolan",
            Actor = "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page, Tom Hardy",
            Plot = "A thief, who steals corporate secrets through use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO.",
            Poster = "http://ia.media-imdb.com/images/M/MV5BMTM2MTQ1NTY0MF5BMl5BanBnXkFtZTcwOTU3MTU0Mw@@._V1_SX300.jpg",
            Ratings = "8.8",
            Images = listOf(
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ0MTMxOTI0NF5BMl5BanBnXkFtZTcwMDU3MTU0Mw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTU2MTQ1NTY0NF5BMl5BanBnXkFtZTcwODU3MTU0Mw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTU1MTQ1NTY0MF5BMl5BanBnXkFtZTcwNzU3MTU0Mw@@._V1_SX1500_CR0,0,1500,999_AL_.jpg"
            )
        ),
            movie(
                Id="tt0993846",
    Title="The Wolf of Wall Street",
    Year="2013",
    Genre="Biography, Comedy, Crime",
    Director="Martin Scorsese",
    Actor="Leonardo DiCaprio, Jonah Hill, Margot Robbie, Matthew McConaughey",
    Plot="Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
    Poster="http://ia.media-imdb.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_SX300.jpg",
                Ratings="8.1",
    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNDIwMDIxNzk3Ml5BMl5BanBnXkFtZTgwMTg0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTc0NzAxODAyMl5BMl5BanBnXkFtZTgwMDg0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTExMDk1MDE4NzVeQTJeQWpwZ15BbWU4MDM4NDM0ODAx._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg3MTY4NDk4Nl5BMl5BanBnXkFtZTgwNjc0MzQ4MDE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTgzMTg4MDI0Ml5BMl5BanBnXkFtZTgwOTY0MzQ4MDE@._V1_SY1000_CR0,0,1553,1000_AL_.jpg",
    )),

        movie(
            Title="Interstellar",
        Year="2014",
    Genre="Adventure, Drama, Sci-Fi",
    Director="Christopher Nolan",
    Actor="Ellen Burstyn, Matthew McConaughey, Mackenzie Foy, John Lithgow",
    Plot="A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            Poster="http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SX300.jpg",
    Ratings="8.6",
    Id= "tt0816692",
    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjA3NTEwOTMxMV5BMl5BanBnXkFtZTgwMjMyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMzQ5ODE2MzEwM15BMl5BanBnXkFtZTgwMTMyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg4Njk4MzY0Nl5BMl5BanBnXkFtZTgwMzIyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMzE3MTM0MTc3Ml5BMl5BanBnXkFtZTgwMDIyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNjYzNjE2NDk3N15BMl5BanBnXkFtZTgwNzEyODgxMzE@._V1_SX1500_CR0,0,1500,999_AL_.jpg",

    )),
           movie( Title="Game of Thrones",
        Year="2011–",
            Genre="Adventure, Drama, Fantasy",
    Director="N/A",
    Actor="Peter Dinklage, Lena Headey, Emilia Clarke, Kit Harington",
    Plot="While a civil war brews between several noble families in Westeros, the children of the former rulers of the land attempt to rise up to power. Meanwhile a forgotten race, bent on destruction, plans to return after thousands of years in the North.",
    Poster="http://ia.media-imdb.com/images/M/MV5BMjM5OTQ1MTY5Nl5BMl5BanBnXkFtZTgwMjM3NzMxODE@._V1_SX300.jpg",
    Ratings="9.5",

    Id="tt0944947",
    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNDc1MGUyNzItNWRkOC00MjM1LWJjNjMtZTZlYWIxMGRmYzVlXkEyXkFqcGdeQXVyMzU3MDEyNjk@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BZjZkN2M5ODgtMjQ2OC00ZjAxLWE1MjMtZDE0OTNmNGM0NWEwXkEyXkFqcGdeQXVyNjUxNzgwNTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMDk4Y2Y1MDAtNGVmMC00ZTlhLTlmMmQtYjcyN2VkNzUzZjg2XkEyXkFqcGdeQXVyNjUxNzgwNTE@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNjZjNWIzMzQtZWZjYy00ZTkwLWJiMTYtOWRkZDBhNWJhY2JmXkEyXkFqcGdeQXVyMjk3NTUyOTc@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNTMyMTRjZWEtM2UxMS00ZjU5LWIxMTYtZDA5YmJhZmRjYTc4XkEyXkFqcGdeQXVyMjk3NTUyOTc@._V1_SX1777_CR0,0,1777,999_AL_.jpg"
    ,)),

        movie(
    Title="Vikings",
    Year="2013–",
    Genre="Action, Drama, History",
    Director="N/A",
    Actor="Travis Fimmel, Clive Standen, Gustaf Skarsgård, Katheryn Winnick",
    Plot="The world of the Vikings is brought to life through the journey of Ragnar Lothbrok, the first Viking to emerge from Norse legend and onto the pages of history - a man on the edge of myth.",
    Poster="http://ia.media-imdb.com/images/M/MV5BOTEzNzI3MDc0N15BMl5BanBnXkFtZTgwMzk1MzA5NzE@._V1_SX300.jpg",
    Ratings="8.6",
    Id="tt2306299",
    Images= listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjM5MTM1ODUxNV5BMl5BanBnXkFtZTgwNTAzOTI2ODE@._V1_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNzU2NDcxODMyOF5BMl5BanBnXkFtZTgwNDAzOTI2ODE@._V1_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjMzMzIzOTU2M15BMl5BanBnXkFtZTgwODMzMTkyODE@._V1_SY1000_SX1500_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQ2NTQ2MDA3NF5BMl5BanBnXkFtZTgwODkxMDUxODE@._V1_SY1000_SX1500_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTcxOTQ3NTA5N15BMl5BanBnXkFtZTgwMzExMDUxODE@._V1_SY1000_SX1500_AL_.jpg"
    ,)),
        movie(

    Title="Gotham",
    Year="2014–",
    Genre="Action, Crime, Drama",
    Director="N/A",
    Actor="Ben McKenzie, Donal Logue, David Mazouz, Sean Pertwee",
    Plot="The story behind Detective James Gordon's rise to prominence in Gotham City in the years before Batman's arrival.",
    Poster="http://ia.media-imdb.com/images/M/MV5BMTY2MjMwNDE4OV5BMl5BanBnXkFtZTgwNjI1NjU0OTE@._V1_SX300.jpg",
    Ratings="8.0",
    Id="tt3749900",
    Images=listOf(
    "https://images-na.ssl-images-amazon.com/images/M/MV5BNDI3ODYyODY4OV5BMl5BanBnXkFtZTgwNjE5NDMwMDI@._V1_SY1000_SX1500_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjA5OTExMTIwNF5BMl5BanBnXkFtZTgwMjI5NDMwMDI@._V1_SY1000_SX1500_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMTA3MDY2NjA3MzBeQTJeQWpwZ15BbWU4MDU0MDkzODgx._V1_SX1499_CR0,0,1499,999_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjM3MzYzNDgzOV5BMl5BanBnXkFtZTgwMjQwOTM4ODE@._V1_SY1000_CR0,0,1498,1000_AL_.jpg",
    "https://images-na.ssl-images-amazon.com/images/M/MV5BMjQwODAyNjk0NF5BMl5BanBnXkFtZTgwODU4MzMyODE@._V1_SY1000_CR0,0,1500,1000_AL_.jpg",



            )),



            )
}