package `in`.sushant.quizing

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val q1 = Questions(
            1, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
        1
        )
        questionList.add(q1)

        val q2 = Questions(
            2, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Belgium", "Germany", "Kuwait",
        2
        )
        questionList.add(q2)

        val q3 = Questions(
            3, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_fiji,
            "Kuwait", "Germany", "Denmark", "Fiji",
        4
        )
        questionList.add(q3)

        val q4 = Questions(
            4, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_india,
            "Brazil", "India", "Argentina", "Denmark",
        2
        )
        questionList.add(q4)

val q5 = Questions(
            5, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_kuwait,
            "India", "Austria", "Kuwait", "New Zealand",
        3
        )
        questionList.add(q5)

val q6 = Questions(
            6, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Austria", "Australia", "Brazil",
        1
        )
        questionList.add(q6)

val q7 = Questions(
            7, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_brazil,
            "New Zealand", "Fiji", "Belgium", "Brazil",
        4
        )
        questionList.add(q7)

val q8 = Questions(
            8, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_australia,
            "Australia", "India", "New Zealand", "Denmark",
        1
        )
        questionList.add(q8)

val q9 = Questions(
            9, "Which country does this flag belongs to ? ",
            R.drawable.ic_flag_of_denmark,
            "Fiji", "Denmark", "Belgium", "Argentina",
        2
        )
        questionList.add(q9)

//val q10 = Questions(
//            10, "Which country does this flag belongs to ? ",
//            R.drawable.ic_flag_of_germany,
//            "India", "Austria", "Kuwait", "Germany",
//        4
//        )
//        questionList.add(q10)



        return questionList
    }
}