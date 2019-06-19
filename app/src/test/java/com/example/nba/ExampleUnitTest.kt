package com.example.nba

import com.google.gson.Gson
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val json = """
            {
                "name": "Busta",
                "rowSet": ["a",1]
            }
        """

        val jsonNBA = """
        {
            "resource":"homepageleaders",
            "parameters":{"LeagueID":"00","Season":"2018-19","SeasonType":"Regular Season","GameScope":"Season","PlayerScope":"All Players","PlayerOrTeam":"Team","StatCategory":"Points"},
            "resultSets":[
                {
                    "name":"HomePageLeaders",
                    "headers":["RANK","TEAM_ID","TEAM_NAME","TEAM_ABBREVIATION","PTS","FG_PCT","FG3_PCT","FT_PCT","EFG_PCT","TS_PCT","PTS_PER48"],
                    "rowSet":[
                        [1,1610612749,"Milwaukee Bucks","MIL",118.100000,0.476,0.353,0.773,0.55,0.583,117.5],
                        [2,1610612744,"Golden State Warriors","GSW",117.700000,0.491,0.385,0.801,0.565,0.596,116.9],
                        [3,1610612740,"New Orleans Pelicans","NOP",115.400000,0.473,0.344,0.761,0.529,0.563,115.0],
                        [4,1610612755,"Philadelphia 76ers","PHI",115.200000,0.471,0.359,0.771,0.532,0.574,114.5],
                        [5,1610612746,"LA Clippers","LAC",115.100000,0.471,0.388,0.792,0.529,0.575,114.3]
                    ]
                },
                {"name":"LeagueAverage","headers":["PTS","FG_PCT","FG3_PCT","FT_PCT","EFG_PCT","TS_PCT","PTS_PER48"],"rowSet":[[111.200000,0.46,0.356,0.767,0.524,0.56,110.5]]},{"name":"LeagueMax","headers":["PTS","FG_PCT","FG3_PCT","FT_PCT","EFG_PCT","TS_PCT","PTS_PER48"],"rowSet":[[118.100000,0.491,0.392,0.819,0.565,0.596,117.5]]}
            ]
        }
        """

        val nbaObj = Gson().fromJson(jsonNBA, NBAObject::class.java)
        //nbaObj.resultSets !! ""
        for(item in nbaObj.resultSets!![0].rowSet!!) {
            println(item)
        }
        //println("rowSet: ${nbaObj.resultSets!![0].rowSet!![0]}")
//        val appObj = Gson().fromJson(json, AppObject::class.java)
//        println("rowSet: ${appObj.rowSet}")
        assertEquals(4, 2 + 2)
    }
}

class NBAObject<T> {
    var resultSets: ArrayList<SubObject<T>>? = null
}

class SubObject<T> {
    var rowSet: ArrayList<T>? = null
}

class AppObject<T> {
    var name: String = ""
    var rowSet: ArrayList<T>? = null
}