package com.example.mamadiyorov_lazizbek.quizappkotlin.domain

import android.util.Log
import com.example.mamadiyorov_lazizbek.quizappkotlin.R
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants

class AppRepository {
    private var questions: MutableList<QuestionData> = ArrayList()
    private var questionUserQuestionData: MutableList<UserQuestionData> = ArrayList(25)

    private var questionsMath: MutableList<QuestionData> = ArrayList()
    private var questionsOnaTili: MutableList<QuestionData> = ArrayList()
    private var questionsFizika: MutableList<QuestionData> = ArrayList()
    private var questionsBiologiya: MutableList<QuestionData> = ArrayList()
    private var questionsKimyo: MutableList<QuestionData> = ArrayList()
    private var questionsTarixUzb: MutableList<QuestionData> = ArrayList()
    private var questionsGeografiya: MutableList<QuestionData> = ArrayList()
    private var questionsRustili: MutableList<QuestionData> = ArrayList()
    private var questionsInglisTili: MutableList<QuestionData> = ArrayList()
    private var fanNomi: String? = null
    private var categoryList = ArrayList<CategoryData>()

    init {
        if (this.categoryList.isEmpty()) {
            initCategory()
        }

    }


    fun loadQuestionByCategory(categoryEnum: CategoryEnum): List<QuestionData> {
        when (categoryEnum) {
            CategoryEnum.MATEMATIKA -> {
                fanNomi = "Matematika"
                loadQuestionMath()
            }

            CategoryEnum.ONA_TILI -> {
                loadQuestionOnaTili()
                fanNomi = "Ona - tili"
            }

            CategoryEnum.FIZIKA ->{
                loadQestionsPhyisics()
                fanNomi = "Fizika"
            }
            CategoryEnum.BIOLOGY ->{
                loadQestionsBiology()
                fanNomi = "Biologiya"
            }
            CategoryEnum.TARIX_UZB ->{
                loadQestionsTarixUzb()
                fanNomi = "Tarix O'zb"
            }
            CategoryEnum.GEOGRAFIYA ->{
                loadQestionsGeografiya()
                fanNomi = "Geografiya"
            }
            CategoryEnum.RUS_TILI ->{
                loadQestionsRustili()
                fanNomi = "Rus tili"
            }
            CategoryEnum.ENG_TILI ->{
                loadQestionsEnglish()
                fanNomi = "Inglis tili"
            }
            CategoryEnum.KIMYO ->{
                loadQestionsKimyo()
                fanNomi = "Kimyo"
            }

        }

        return questions
    }

    private fun loadQuestionMath() {
        questions.clear()
        val selectedQuestions = questionsMath.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }

    private fun loadQuestionOnaTili() {
        questions.clear()

        val selectedQuestions = questionsOnaTili.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }

    private fun loadQestionsPhyisics() {
        questions.clear()

        val selectedQuestions = questionsFizika.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }

    private fun loadQestionsBiology() {
        questions.clear()

        val selectedQuestions = questionsBiologiya.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }


    private fun loadQestionsKimyo() {
        questions.clear()

        val selectedQuestions = questionsKimyo.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }

    private fun loadQestionsTarixUzb() {
        questions.clear()

        val selectedQuestions = questionsTarixUzb.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }
    private fun loadQestionsGeografiya() {
        questions.clear()

        val selectedQuestions = questionsGeografiya.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }

    private fun loadQestionsEnglish() {
        questions.clear()

        val selectedQuestions = questionsInglisTili.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }
    private fun loadQestionsRustili() {
        questions.clear()

        val selectedQuestions = questionsRustili.shuffled().take(25)
        questions.addAll(selectedQuestions)
    }






    private fun loadChallengingMathQuestions() {
        questionsMath.clear()
        questionsMath.add(
            QuestionData(
                "5! (5 faktorial) qiymati qancha?",
                "120",
                "24",
                "60",
                "150",
                "120"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kvadratning perimetri 36 sm bo‘lsa, uning tomon uzunligi qancha?",
                "6 sm",
                "9 sm",
                "12 sm",
                "18 sm",
                "9 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "Pifagor teoremasiga ko‘ra to‘g‘ri burchakli uchburchakning katetlari 3 va 4 ga teng bo‘lsa, gipotenuza uzunligi qancha?",
                "5",
                "6",
                "7",
                "8",
                "5"
            )
        )
        questionsMath.add(
            QuestionData(
                "Biror sonning 0-darajasi qancha?",
                "0",
                "1",
                "O‘zi",
                "Cheksiz",
                "1"
            )
        )
        questionsMath.add(QuestionData("√81 ning qiymati qancha?", "7", "8", "9", "10", "9"))
        questionsMath.add(
            QuestionData(
                "10 ning kvadrati nechaga teng?",
                "50",
                "100",
                "25",
                "200",
                "100"
            )
        )
        questionsMath.add(
            QuestionData(
                "2^10 qiymati qancha?",
                "512",
                "1024",
                "2048",
                "4096",
                "1024"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir doiraning diametri 14 sm bo‘lsa, radiusi qancha?",
                "7 sm",
                "14 sm",
                "10 sm",
                "28 sm",
                "7 sm"
            )
        )
        questionsMath.add(QuestionData("3*4 + 5*2 - 6 natija nima?", "16", "20", "18", "22", "16"))
        questionsMath.add(
            QuestionData(
                "45° burchakning tangensi qancha?",
                "1",
                "0.5",
                "√3",
                "√2",
                "1"
            )
        )
        questionsMath.add(QuestionData("8 ning kub ildizi nechiga teng?", "2", "4", "3", "√2", "2"))
        questionsMath.add(
            QuestionData(
                "4 va 9 sonlarining eng katta umumiy bo‘luvchisi (EKUB) qancha?",
                "1",
                "2",
                "4",
                "3",
                "1"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning uch burchagi yig‘indisi nechaga teng?",
                "90°",
                "120°",
                "180°",
                "360°",
                "180°"
            )
        )
        questionsMath.add(
            QuestionData(
                "6 va 8 sonlarining eng kichik umumiy karralisi (EKUK) qancha?",
                "12",
                "18",
                "24",
                "48",
                "24"
            )
        )
        questionsMath.add(QuestionData("√225 ning qiymati qancha?", "12", "15", "20", "25", "15"))
        questionsMath.add(QuestionData("4 ning kvadrat ildizi qancha?", "16", "8", "4", "2", "2"))
        questionsMath.add(
            QuestionData(
                "1 dan 10 gacha bo‘lgan sonlar yig‘indisi qancha?",
                "45",
                "50",
                "55",
                "60",
                "55"
            )
        )
        questionsMath.add(
            QuestionData(
                "1000 ning 10 foizi qancha?",
                "100",
                "10",
                "1",
                "1000",
                "100"
            )
        )
        questionsMath.add(QuestionData("9*3 - 6 + 12 natija nima?", "21", "33", "27", "30", "27"))
        questionsMath.add(
            QuestionData(
                "Bir to‘g‘ri chiziqning eng kamida nechta nuqtasi bor?",
                "1",
                "2",
                "3",
                "0",
                "2"
            )
        )
        questionsMath.add(
            QuestionData(
                "“Parallelogramma” qanday geometrik shakl?",
                "Uchburchak",
                "To‘rtburchak",
                "Aylana",
                "Doira",
                "To‘rtburchak"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kubning barcha qirralari yig‘indisi 48 sm. Har bir qirrasi uzunligi qancha?",
                "4 sm",
                "6 sm",
                "8 sm",
                "12 sm",
                "8 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 100 foizi o‘zi bilan tengmi?",
                "Ha",
                "Yo‘q",
                "Ayrim holatda",
                "Aniq emas",
                "Ha"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir to‘g‘ri chiziqda eng kamida nechta nuqta yotadi?",
                "1",
                "2",
                "3",
                "Cheksiz",
                "2"
            )
        )
        questionsMath.add(
            QuestionData(
                "“Yarim doira” radiusga ko‘ra nima bilan belgilanadi?",
                "R",
                "2R",
                "½ R",
                "R²",
                "½ R"
            )
        )
        questionsMath.add(QuestionData("Qaysi son manfiy emas?", "-2", "-10", "0", "-100", "0"))
        questionsMath.add(
            QuestionData(
                "Biror natural sonning eng kichik bo‘luvchisi nima?",
                "1",
                "0",
                "2",
                "O‘zi",
                "1"
            )
        )
        questionsMath.add(QuestionData("20 dan 5 foiz qancha?", "1", "5", "10", "1.5", "1"))
        questionsMath.add(
            QuestionData(
                "Bir sonning 100 foizi qancha?",
                "O‘zi",
                "0",
                "10",
                "100",
                "O‘zi"
            )
        )
        questionsMath.add(QuestionData("45 ning 20 foizi qancha?", "5", "9", "15", "18", "9"))
        questionsMath.add(QuestionData("3^4 qiymati qancha?", "9", "27", "81", "64", "81"))
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning ikki burchagi 45° va 90° ga teng. Uchinchisi qancha?",
                "45°",
                "90°",
                "180°",
                "60°",
                "45°"
            )
        )
        questionsMath.add(
            QuestionData(
                "1, 4, 9, 16, ... ketma-ketligidagi keyingi son nima?",
                "20",
                "22",
                "25",
                "30",
                "25"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning o‘ziga 2 qo‘shib, 5 ga ko‘paytirilsa, natija 35 ga teng bo‘lsa, bu son qancha?",
                "3",
                "5",
                "7",
                "6",
                "5"
            )
        )
        questionsMath.add(
            QuestionData(
                "360° burchak necha kvadrantga bo‘linadi?",
                "1",
                "2",
                "3",
                "4",
                "4"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kvadratning yuzi 49 kvadrat sm bo‘lsa, uning tomoni qancha?",
                "5 sm",
                "7 sm",
                "9 sm",
                "10 sm",
                "7 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 50 foizi 25 ga teng bo‘lsa, o‘sha son qancha?",
                "30",
                "40",
                "50",
                "60",
                "50"
            )
        )
        questionsMath.add(QuestionData("8 ning 3-darajasi qancha?", "24", "64", "32", "48", "64"))
        questionsMath.add(
            QuestionData(
                "Bir doiraning radiusi 10 sm bo‘lsa, uning diametri qancha?",
                "5 sm",
                "10 sm",
                "15 sm",
                "20 sm",
                "20 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "1 dan 15 gacha bo‘lgan sonlar yig‘indisi qancha?",
                "90",
                "100",
                "120",
                "105",
                "120"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kvadratning yuzi 16 kvadrat sm bo‘lsa, perimetri qancha?",
                "12 sm",
                "16 sm",
                "20 sm",
                "24 sm",
                "16 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir doira uzunligi 2πr formula bilan topilsa, r nimani anglatadi?",
                "Doiraning yuzi",
                "Doiraning radiusi",
                "Doiraning diametri",
                "Doiraning perimetri",
                "Doiraning radiusi"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning kvadrat ildizi o‘ziga teng bo‘lsa, o‘sha son qancha?",
                "0",
                "1",
                "4",
                "Hech qaysi",
                "1"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning ikkita burchagi 60° va 90° ga teng bo‘lsa, uchinchi burchak qancha?",
                "60°",
                "30°",
                "15°",
                "45°",
                "30°"
            )
        )
        questionsMath.add(
            QuestionData(
                "Yig‘indisi 180° ga teng bo‘lgan burchaklar qanday burchaklar deyiladi?",
                "Qarshi burchaklar",
                "To‘g‘ri burchaklar",
                "O‘tkir burchaklar",
                "Tayanch burchaklar",
                "Tayanch burchaklar"
            )
        )
        questionsMath.add(
            QuestionData(
                "12 va 16 sonlarining eng katta umumiy bo‘luvchisi qancha?",
                "2",
                "4",
                "8",
                "16",
                "4"
            )
        )
        questionsMath.add(
            QuestionData(
                "15 sonining kvadrati qancha?",
                "125",
                "150",
                "225",
                "200",
                "225"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir doira yuzasi πr² formula bilan topilsa, r nimani bildiradi?",
                "Doiraning yuzi",
                "Doiraning radiusi",
                "Doiraning diametri",
                "Doiraning perimetri",
                "Doiraning radiusi"
            )
        )
        questionsMath.add(
            QuestionData(
                "Har qanday natural sonning 1 ga bo‘linishi natijasi qancha?",
                "0",
                "1",
                "O‘zi",
                "2",
                "O‘zi"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 200 foizi o‘sha sonning nechiga teng?",
                "0.5 ga",
                "1 ga",
                "2 ga",
                "10 ga",
                "2 ga"
            )
        )
        questionsMath.add(QuestionData("√144 ning qiymati qancha?", "10", "11", "12", "13", "12"))
        questionsMath.add(QuestionData("3*5 - 4 + 10 natija nima?", "10", "12", "15", "21", "21"))
        questionsMath.add(
            QuestionData(
                "6 va 15 sonlarining eng kichik umumiy karralisi (EKUK) qancha?",
                "15",
                "30",
                "60",
                "120",
                "30"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir to‘g‘ri chiziqda nechta nuqta yotadi?",
                "1",
                "2",
                "Cheksiz",
                "10",
                "Cheksiz"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kvadratning yuzasi tomonining kvadrati bilan ifodalanadi. To‘g‘rimi?",
                "Ha",
                "Yo‘q",
                "Faqat ayrim hollarda",
                "Aniq emas",
                "Ha"
            )
        )
        questionsMath.add(
            QuestionData(
                "7 va 14 sonlarining eng katta umumiy bo‘luvchisi qancha?",
                "1",
                "7",
                "14",
                "7 yoki 14",
                "7"
            )
        )
        questionsMath.add(QuestionData("5 ning 3-darajasi qancha?", "10", "15", "25", "125", "125"))
        questionsMath.add(QuestionData("20 dan 15 foiz qancha?", "1", "2", "3", "3", "3"))
        questionsMath.add(
            QuestionData(
                "Bir sonning kvadrati 1 ga teng bo‘lsa, o‘sha son qancha?",
                "1",
                "0",
                "-1",
                "1 yoki -1",
                "1 yoki -1"
            )
        )
        questionsMath.add(
            QuestionData(
                "2 va 3 sonlarining eng kichik umumiy karralisi qancha?",
                "3",
                "5",
                "6",
                "9",
                "6"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning kvadrat ildizi 49 ga teng bo'lsa, o'sha son qancha?",
                "7",
                "49",
                "2401",
                "14",
                "49"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning burchaklari yig'indisi qancha?",
                "90°",
                "120°",
                "180°",
                "360°",
                "180°"
            )
        )
        questionsMath.add(
            QuestionData(
                "4 va 6 sonlarining eng katta umumiy bo'luvchisi qancha?",
                "2",
                "4",
                "6",
                "12",
                "2"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 75 foizi 150 ga teng bo'lsa, o'sha son qancha?",
                "100",
                "150",
                "200",
                "250",
                "200"
            )
        )
        questionsMath.add(
            QuestionData(
                "To‘g‘ri burchakli uchburchakning eng uzun tomoni nima deb ataladi?",
                "Gipotenuza",
                "Perpendikulyar",
                "Asos",
                "Burchak",
                "Gipotenuza"
            )
        )
        questionsMath.add(QuestionData("4^3 qiymati qancha?", "16", "64", "256", "48", "64"))
        questionsMath.add(
            QuestionData(
                "Agar bitta shokolad narxi 3 dollar bo'lsa, 15 ta shokolad necha dollarga tushadi?",
                "30",
                "45",
                "50",
                "60",
                "45"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir kvadratning perimetri 40 sm bo'lsa, tomonining uzunligi qancha?",
                "5 sm",
                "8 sm",
                "10 sm",
                "12 sm",
                "10 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "1000 ning kvadrat ildizi qancha?",
                "10",
                "30",
                "100",
                "50",
                "30"
            )
        )
        questionsMath.add(
            QuestionData(
                "Kvadratning yuzi 49 kvadrat sm bo'lsa, perimetri qancha?",
                "14 sm",
                "28 sm",
                "35 sm",
                "42 sm",
                "28 sm"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning kub ildizi 27 ga teng bo'lsa, o'sha son qancha?",
                "3",
                "9",
                "27",
                "81",
                "3"
            )
        )
        questionsMath.add(
            QuestionData(
                "0 ga bo'lish mumkinmi?",
                "Ha",
                "Yo'q",
                "Ba'zi hollarda",
                "Foydalanishga qarab",
                "Yo'q"
            )
        )
        questionsMath.add(
            QuestionData(
                "100 va 200 sonlarining eng katta umumiy bo'luvchisi qancha?",
                "10",
                "20",
                "50",
                "100",
                "100"
            )
        )
        questionsMath.add(
            QuestionData(
                "10 dan 100 gacha bo'lgan sonlar orasida nechta juft son mavjud?",
                "45",
                "46",
                "47",
                "48",
                "46"
            )
        )
        questionsMath.add(
            QuestionData(
                "Doiraning yuzasi radiusining kvadrati orqali hisoblanadi, bu to‘g‘rimi?",
                "Ha",
                "Yo‘q",
                "Faqat ba'zi hollarda",
                "Aniq emas",
                "Ha"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning ikkita teng yon tomoni mavjud. Bu qanday uchburchak?",
                "Teng tomonli",
                "Teng yonli",
                "To'g'ri burchakli",
                "Teng burchakli",
                "Teng yonli"
            )
        )
        questionsMath.add(QuestionData("36 ning kvadrat ildizi qancha?", "5", "6", "12", "18", "6"))
        questionsMath.add(
            QuestionData(
                "Agar 3x = 12 bo'lsa, x ning qiymati qancha?",
                "2",
                "3",
                "4",
                "6",
                "4"
            )
        )
        questionsMath.add(
            QuestionData(
                "1 dan 50 gacha bo'lgan sonlar yig'indisi qancha?",
                "1050",
                "1275",
                "1225",
                "1300",
                "1275"
            )
        )
        questionsMath.add(QuestionData("9 ning kubi qancha?", "27", "54", "81", "729", "729"))
        questionsMath.add(
            QuestionData(
                "7 va 8 ning ko'paytmasi qancha?",
                "48",
                "54",
                "56",
                "64",
                "56"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning kvadrati va uning kubi o'rtasidagi farq eng kamida nechta bo'lishi mumkin?",
                "0",
                "1",
                "2",
                "3",
                "2"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 25 foizi 75 ga teng bo'lsa, o'sha son qancha?",
                "200",
                "250",
                "300",
                "400",
                "300"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 10 foizi 50 ga teng bo'lsa, o'sha son qancha?",
                "500",
                "1000",
                "1500",
                "2000",
                "500"
            )
        )
        questionsMath.add(
            QuestionData(
                "4 ning kvadrati bilan uning kubining o'rtasidagi farq qancha?",
                "16",
                "32",
                "48",
                "60",
                "48"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir to‘g‘ri chiziqqa nechta to‘g‘ri chiziq perpendikulyar bo‘lishi mumkin?",
                "Bitta",
                "Ikki",
                "Cheksiz",
                "Hech biri",
                "Cheksiz"
            )
        )
        questionsMath.add(QuestionData("5 * 0 ning qiymati qancha?", "5", "0", "1", "-5", "0"))
        questionsMath.add(
            QuestionData(
                "Agar a = 5 va b = 3 bo'lsa, a + b - b * a ning qiymati qancha?",
                "-10",
                "2",
                "8",
                "-5",
                "-10"
            )
        )
        questionsMath.add(
            QuestionData(
                "Agar uchburchakning ikkita burchagi 45° va 90° bo'lsa, uchinchi burchak qancha bo'lishi kerak?",
                "30°",
                "45°",
                "60°",
                "90°",
                "45°"
            )
        )
        questionsMath.add(
            QuestionData(
                "50 soni 10 foizga kamaytirilsa, yangi qiymat qancha bo'ladi?",
                "5",
                "40",
                "45",
                "55",
                "45"
            )
        )
        questionsMath.add(
            QuestionData(
                "6 ning 4-darajasi qancha?",
                "36",
                "256",
                "1296",
                "4096",
                "1296"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning 80 foizi 160 ga teng bo'lsa, o'sha son qancha?",
                "180",
                "200",
                "250",
                "300",
                "200"
            )
        )
        questionsMath.add(
            QuestionData(
                "Agar to'rtburchakning eni 4 sm va uzunligi 8 sm bo'lsa, yuzi qancha bo'ladi?",
                "12 sm²",
                "16 sm²",
                "24 sm²",
                "32 sm²",
                "32 sm²"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir son 15 ga teng va undan 30 foiz olib tashlansa, qolgan qismi qancha bo'ladi?",
                "10.5",
                "11",
                "12",
                "13.5",
                "10.5"
            )
        )
        questionsMath.add(
            QuestionData(
                "1/4 ni 3 ga ko'paytirsa, natija qanday bo'ladi?",
                "1/2",
                "3/4",
                "1",
                "3",
                "3/4"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir uchburchakning barcha tomonlari teng. Bu qanday uchburchak?",
                "Teng tomonli",
                "Teng yonli",
                "To'g'ri burchakli",
                "Teng burchakli",
                "Teng tomonli"
            )
        )
        questionsMath.add(
            QuestionData(
                "Agar ikki sonning yig'indisi 12 ga teng bo'lsa va biri ikkinchisidan 4 ta katta bo'lsa, kichik son qancha?",
                "2",
                "4",
                "6",
                "8",
                "4"
            )
        )
        questionsMath.add(
            QuestionData(
                "Bir sonning ikki baravari 50 ga teng bo'lsa, o'sha son qancha?",
                "20",
                "25",
                "30",
                "40",
                "25"
            )
        )
        questionsMath.add(
            QuestionData(
                "Kvadratning tomoni 7 ga teng bo'lsa, uning yuzasi qancha bo'ladi?",
                "14",
                "28",
                "49",
                "64",
                "49"
            )
        )
        questionsMath.add(
            QuestionData(
                "To'g'ri to'rtburchakning diagonallari teng bo'lsa, u qanday shakl bo'lishi mumkin?",
                "Uchburchak",
                "Romb",
                "Kvadrat",
                "Doira",
                "Kvadrat"
            )
        )

    }

    private fun loadChallengingOnaTiliQuestions() {
        questionsOnaTili.add(
            QuestionData(
                "Sifatlarning darajalari nechta bo'ladi?",
                "1",
                "2",
                "3",
                "4",
                "3"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kuchaytiruvchi yuklamani aniqlang: “Juda yaxshi”",
                "yaxshi",
                "juda",
                "mukammal",
                "yomon",
                "juda"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gap oddiy gapga misol bo'ladi?",
                "Men kitob o'qidim.",
                "Men kitob o'qidim va yozdim.",
                "Kitob o'qishga kirishdim.",
                "O'qib chiqish kerak.",
                "Men kitob o'qidim."
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z shaxsni ko'rsatmaydi?",
                "men",
                "biz",
                "u",
                "kitob",
                "kitob"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "“Shoshmasdan” so'zining sinonimini toping.",
                "tez",
                "astoydil",
                "muloyim",
                "erkin",
                "muloyim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z juftlikka misol bo'ladi?",
                "aka-uka",
                "yosh-qari",
                "oy-kun",
                "u-bu",
                "aka-uka"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gap teskari otga ega emas?",
                "Yaxshi-yomon",
                "Katta-kichik",
                "To'rt-besh",
                "Bor-yo'q",
                "To'rt-besh"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'tgan zamon fe’lning nechta turi mavjud?",
                "1",
                "2",
                "3",
                "4",
                "3"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z “butunlay” so'zining sinonimi hisoblanadi?",
                "yarim",
                "birinchi",
                "to'liq",
                "qisman",
                "to'liq"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "“To’plam so’z” qanday bo’ladi?",
                "ota",
                "farzand",
                "mebel",
                "bola",
                "mebel"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ko’plik qo’shimchasini aniqlang: “Kitoblar”",
                "-lar",
                "-imiz",
                "-chi",
                "-in",
                "-lar"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z ismlar turkumiga kiradi?",
                "chiroyli",
                "uy",
                "tez",
                "o'qish",
                "uy"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "So’zning dastlabki qismi qanday ataladi?",
                "ildiz",
                "qo'shimcha",
                "tub",
                "asos",
                "ildiz"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so’z fe’l turkumiga kiradi?",
                "ish",
                "tez",
                "keldi",
                "qiziqarli",
                "keldi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Maqolni toping: “Bir odam qila olmas, ammo...”.",
                "Bir kishi hech narsa qila olmaydi.",
                "Ikki odam ko'p narsa qiladi.",
                "Bir qo'ldan ovoz chiqmaydi.",
                "Ko'p ishda baraka bor.",
                "Bir qo'ldan ovoz chiqmaydi."
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi bir so’z sifatlar turkumiga kiradi?",
                "bolalar",
                "katta",
                "kichiklar",
                "insonlar",
                "katta"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi birikma payt birikmasi hisoblanadi?",
                "kechqurun",
                "har doim",
                "tez-tez",
                "bugun ertalab",
                "bugun ertalab"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gap xabar gapga misol bo’la oladi?",
                "Sen bu yerga keldingmi?",
                "Men uyda kitob o'qidim.",
                "Buni nega aytding?",
                "Qani ko’raylikchi.",
                "Men uyda kitob o'qidim."
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so’zda orttirma daraja mavjud?",
                "katta",
                "juda katta",
                "katta-kichik",
                "kichraydi",
                "juda katta"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Otlarning turlari nechta bo'ladi?",
                "2",
                "3",
                "4",
                "5",
                "4"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'tgan zamon fe'lining qoidasi qanday?",
                "Kelishiklar",
                "Yaqinlashish",
                "Tushunish",
                "Ish-hayot",
                "Kelishiklar"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Sifatni ko'rsatuvchi so'zni toping.",
                "U juda chiroyli.",
                "O'tgan yili.",
                "Bu yerda turgan",
                "Men har doim o'qiman.",
                "U juda chiroyli."
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z bog'lovchi so'z sifatida ishlatiladi?",
                "va",
                "lekin",
                "yoki",
                "hammasi",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ulgurji savdo so'zining ma'nosi nima?",
                "Kichik savdo",
                "Katta savdo",
                "Kirish uchun",
                "Ish uchun",
                "Katta savdo"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z o'ziga xos sifatga ega?",
                "katta",
                "chiroyli",
                "oddiy",
                "mukammal",
                "mukammal"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kichik fe'lni aniqlang: ‘qochmoq’",
                "qoch",
                "qochmoqda",
                "qochish",
                "qochib",
                "qoch"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z bog'lovchi gap hisoblanadi?",
                "Men kelaman, agar sen borasan.",
                "Sen qanaqa?",
                "Men o'qidim.",
                "Yana o'qimadim.",
                "Men kelaman, agar sen borasan."
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z fe'lning hozirgi zamoni?",
                "o'qimoq",
                "o'qidi",
                "o'qiyapti",
                "o'qish",
                "o'qiyapti"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z bog'lovchi so'zlardan biridir?",
                "lekin",
                "va",
                "bo'lmas",
                "boshqa",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Tugma uchun burchakni aniqlang: 'to'g'ri burchak'",
                "90°",
                "180°",
                "45°",
                "360°",
                "90°"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Matnda so'zning o'rnini aniqlang: 'Ota-onalar' uchun 'ona' qaysi so'z bo'ladi?",
                "ona",
                "ota",
                "bolalar",
                "masala",
                "ona"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Yana bir o'zgaruvchini aniqlang: 'Bilasizmi?' savoliga javob bering.",
                "ha",
                "yo'q",
                "bilmadim",
                "aniq",
                "ha"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi savol gapiga misol bo'la oladi?",
                "Nima bo'ladi?",
                "Men o'qiyman.",
                "U keldi.",
                "Buni qilish kerak.",
                "Nima bo'ladi?"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Birinchi kelishikda qaysi so'zlar qo'llaniladi?",
                "men",
                "biz",
                "o'sha",
                "kelib",
                "men"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilidagi maqolni toping: ‘Eshik ochilsa, kirish kerak.’",
                "bu yerda",
                "eshingizni bilmayman",
                "bu hozir",
                "yuragim xafa",
                "bu yerda"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Uchta qismga bo'lingan gap qaysi?",
                "Boshqa",
                "Katta",
                "O'ziga xos",
                "Oddiy",
                "Oddiy"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z muayyan ta'rifni beruvchi so'z?",
                "mukammal",
                "kattaroq",
                "mukammal",
                "tugallangan",
                "mukammal"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi bog'lovchi so'z bilan bog'lanadi?",
                "va",
                "yoki",
                "boshqa",
                "ish",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ulgurji savdoni aniqlang: 'Yana bir marta' qaysi so'z bo'ladi?",
                "foydalanish",
                "savdo",
                "hamma",
                "kelgan",
                "savdo"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Har qanday so'zning shartli narsasi nima?",
                "kashfiyot",
                "xushxabar",
                "musobaqa",
                "talab",
                "kashfiyot"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Uchinchi shaxs zamonini aniqlang: 'U o'qiydi'.",
                "kelishik",
                "fe'l",
                "zamon",
                "shaxs",
                "zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z ko'rsatma gapga misol bo'ladi?",
                "kel",
                "kelmas",
                "kelayotgan",
                "kelaylik",
                "kel"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Bu gap qaysi turga kiradi: 'Men ko'p o'qidim'.",
                "oddiy",
                "qarama-qarshi",
                "ko'plik",
                "umumiy",
                "oddiy"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z ustida tuzilgan birikma?",
                "oddiydan murakkab",
                "kuchli",
                "katta",
                "yurak",
                "yurak"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zning o'rni o'zgarish bilan belgilanadi?",
                "kuchli",
                "yengil",
                "katta",
                "yosh",
                "katta"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilida qaysi zamon mavjud?",
                "kelishik",
                "o'tgan zamon",
                "yashash",
                "kelajak zamon",
                "o'tgan zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gapda birinchi shaxs zamoni mavjud?",
                "Men keldim",
                "U keldi",
                "Sen kel",
                "Buni qiling",
                "Men keldim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z suverboshlashni ko'rsatadi?",
                "o'qi",
                "kel",
                "so'z",
                "ikki",
                "so'z"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z birinchi shaxs zamoniga kiradi?",
                "kelmoq",
                "keladi",
                "keladi",
                "kelaman",
                "kelaman"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ona tilining qoidasi qanday?",
                "bu bir xil",
                "bu qarama-qarshi",
                "bu o'zaro",
                "bu maqola",
                "bu maqola"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z kelishiklarda qo'llanilmaydi?",
                "o'sha",
                "bu",
                "shaxs",
                "hozir",
                "shaxs"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gap tuzilgan: 'U buni qilmas'? ",
                "tashqi",
                "ichki",
                "foydali",
                "kuchli",
                "tashqi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda qaysi qo'shimcha mavjud?",
                "ham",
                "kishi",
                "kim",
                "qanaqa",
                "kim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi o'zgaruvchilarni tushuntirishga muhtoj?",
                "tuqqan",
                "ko'rilgan",
                "suzilmagan",
                "saqlanmagan",
                "saqlanmagan"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Maqolda qaysi bog'lovchilar qo'llaniladi?",
                "va",
                "lekin",
                "amal",
                "boshqa",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z keltirishga misol bo'ladi?",
                "keladi",
                "kelmaydi",
                "kel",
                "kelayotganda",
                "kelayotganda"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gapda noaniqlik mavjud?",
                "U kelmaydi",
                "Men kelaman",
                "Sen kelmoqdasiz",
                "Biz ham kelamiz",
                "U kelmaydi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "So'z turkumlarini ko'rsating: 'kattalar', 'yoshlar'.",
                "yosh",
                "katta",
                "tosh",
                "osh",
                "katta"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda qo'shimcha mavjud?",
                "kattalik",
                "o'rta",
                "yuz",
                "besh",
                "kattalik"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Tugallangan gap nima?",
                "Bo'sh",
                "O'sha",
                "Qanaqa",
                "Kim",
                "Bo'sh"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilida ishlatiladigan zamonlardan biri nima?",
                "kelishik",
                "so'z",
                "zamon",
                "ot",
                "zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tili qaysi shaxslar bilan birga ishlatiladi?",
                "men",
                "sen",
                "u",
                "biz",
                "men"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Fe'lni aniqlang: 'Men har kuni o'qiyman'.",
                "keladi",
                "bo'ladi",
                "o'qiydi",
                "o'qiyapti",
                "o'qiyapti"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gapda o'zgaruvchan shart mavjud?",
                "U o'qimaydi",
                "Men o'qiyapman",
                "Sen o'qiyapsan",
                "U o'qiydi",
                "U o'qimaydi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi bog'lovchi so'zlar mavjud?",
                "lekin",
                "bu",
                "va",
                "hamma",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda shaklni ko'rsatadi?",
                "katta",
                "ko'rish",
                "yozish",
                "yetarli",
                "katta"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gap qaysi turga kiradi: 'Men har doim kelaman'.",
                "oddiy",
                "murakkab",
                "bo'sh",
                "yuzaki",
                "oddiy"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z noaniq qismga kiradi?",
                "kim",
                "bu",
                "nima",
                "qanaqa",
                "kim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kelishiklarni aniqlang: 'Men va sen' qaysi kelishik?",
                "boshqa",
                "birinchi",
                "ikkinchi",
                "uchinchi",
                "birinchi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi bog'lovchilar qabul qilinadi?",
                "va",
                "yoki",
                "boshqa",
                "boshqalar",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda bitta fe'l mavjud?",
                "u",
                "u kelmoqda",
                "bu",
                "u keladi",
                "u keladi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Yana bir maqolni toping: 'Bir odam o'zida...'",
                "u",
                "men",
                "o'ziga",
                "yoshga",
                "o'ziga"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ota va ona qaysi jamiyatga kiradi?",
                "ota-ona",
                "katta",
                "qochmas",
                "keladigan",
                "ota-ona"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ona tili qoidalari qaysi narxlar?",
                "narx",
                "mukammal",
                "yosh",
                "qosh",
                "narx"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Fe'lning hozirgi zamoniga misol bering.",
                "kelaman",
                "keladi",
                "keladi",
                "kelib",
                "keladi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z qiyin ko'rinadi?",
                "qiyinchilik",
                "katta",
                "ko'rinmas",
                "mukammal",
                "qiyinchilik"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z xarakterni ko'rsatadi?",
                "yosh",
                "katta",
                "o'rtacha",
                "o'zgarish",
                "o'zgarish"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z odamning qiyofasini ko'rsatadi?",
                "hamma",
                "bu",
                "kim",
                "o'ziga",
                "kim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Fe'llarning zamonini aytib bering: 'U o'qiydi'.",
                "o'tgan zamon",
                "hozirgi zamon",
                "kelajak zamon",
                "o'ziga",
                "hozirgi zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ota-onaning birgalikdagi fe'lini aytib bering.",
                "keladi",
                "keladi",
                "keladigan",
                "kelgan",
                "keladi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kelishiklarni aniqlang: 'Sen va men'.",
                "boshqa",
                "birinchi",
                "ikkinchi",
                "uchinchi",
                "birinchi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ota va ona qanday birikma hisoblanadi?",
                "qiz",
                "yosh",
                "o'rta",
                "boshqa",
                "qiz"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tili qaysi otlarni o'z ichiga oladi?",
                "men",
                "sen",
                "u",
                "boshqalar",
                "men"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda so'z ko'rsatma mavjud?",
                "har bir",
                "keladi",
                "har qanday",
                "ushbu",
                "ushbu"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda shaxsni ko'rsatmaydi?",
                "men",
                "u",
                "sen",
                "kimdir",
                "kimdir"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi fe'l zamon bilan keladi: 'U keladi'.",
                "kelishik",
                "keladigan",
                "keladigan",
                "kelishik",
                "kelishik"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'z mustaqil fe'l sifatida ishlatiladi?",
                "yur",
                "yurish",
                "yuradigan",
                "yurmoq",
                "yur"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kelishikdagi fe'lni aniqlang: 'U ketmoqda'.",
                "hozirgi zamon",
                "kelajak zamon",
                "o'tgan zamon",
                "yuradi",
                "hozirgi zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Maqolda qaysi bog'lovchilar ishlatiladi?",
                "va",
                "lekin",
                "yoki",
                "barcha",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilidagi fe'llarning qaysi turini toping.",
                "ustki",
                "ustida",
                "u bilan",
                "har doim",
                "har doim"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilida qaysi zamon xuddi shunday mavjud?",
                "kelishik",
                "o'tgan zamon",
                "kelajak zamon",
                "birinchi shaxs",
                "o'tgan zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda kelishik mavjud?",
                "kel",
                "kelish",
                "keluvchi",
                "kelayotgan",
                "keluvchi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "So'zning to'liq shaklini aniqlang: 'men'.",
                "kim",
                "u",
                "sen",
                "boshqa",
                "boshqa"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gapda birinchi shaxs zamon mavjud?",
                "U keldi",
                "Men kelaman",
                "Sen keladi",
                "Biz kelamiz",
                "Men kelaman"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Yana qaysi so'zda bog'lovchi mavjud?",
                "va",
                "balki",
                "hamma",
                "boshqalar",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zning zamonini aniqlang: 'U ko'radi'.",
                "kelishik",
                "keladi",
                "kelayotgan",
                "ko'rmoqda",
                "kelmoqda"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Ona tilida qaysi shaxslar borki, ular qoidalar bilan birga ishlatiladi?",
                "men",
                "sen",
                "u",
                "ham",
                "ham"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilida fe'l qaysi turga kiradi?",
                "ko'rsatma",
                "qiyin",
                "o'ziga",
                "keladi",
                "keladi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilidagi 'men' so'zining o'zgarishi qanday?",
                "men",
                "menga",
                "mendan",
                "menda",
                "menda"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Kelishiklarni aniqlang: 'Sen va men' qaysi kelishik?",
                "boshqa",
                "birinchi",
                "ikkinchi",
                "uchinchi",
                "birinchi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda qo'shimcha mavjud?",
                "kattaroq",
                "katta",
                "yosh",
                "qosh",
                "kattaroq"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi gapda shaxs va zamon mavjud?",
                "U keladi",
                "Men o'qiyapman",
                "Sen kelding",
                "Biz kelamiz",
                "Men o'qiyapman"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "O'zbek tilida qaysi zamon ishlatiladi?",
                "kelishik",
                "o'tgan zamon",
                "kelajak zamon",
                "hozirgi zamon",
                "hozirgi zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda kelishik mavjud?",
                "kel",
                "kelish",
                "keluvchidan",
                "keladi",
                "keluvchidan"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Tugallangan gap nima?",
                "U keldi",
                "Men kelaman",
                "Sen keladi",
                "Bu gap",
                "U keldi"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Fe'lning zamonini aniqlang: 'U keldi'.",
                "kelishik",
                "o'tgan zamon",
                "kelajak zamon",
                "hozirgi zamon",
                "o'tgan zamon"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Maqolda qaysi bog'lovchilar qo'llaniladi?",
                "va",
                "lekin",
                "boshqa",
                "xuddi",
                "va"
            )
        )
        questionsOnaTili.add(
            QuestionData(
                "Qaysi so'zda shaxs va zamon mavjud?",
                "U keladi",
                "Men o'qiyapman",
                "Sen kelding",
                "Biz kelamiz",
                "U keladi"
            )
        )
    }

    private fun loadChallengingPhysicsQuestions() {
        questionsFizika.add(
            QuestionData(
                "Yengil tanani suvga tashlasangiz, nima uchun suvda suzadi?",
                "Og'irligi kamligi sababli",
                "Suv ko'tarish kuchi borligi sababli",
                "Havo bilan to'lganligi sababli",
                "Harorat o'zgarishi sababli",
                "Suv ko'tarish kuchi borligi sababli"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Ovoz bo'sh joyda (vakuumda) nega tarqalmaydi?",
                "Chunki u yorug'likdan tez emas",
                "Vakuumda zarrachalar yo'qligi sababli",
                "Ovoz juda kuchli bo'lmagani sababli",
                "U faqat suyuqlikda tarqaladi",
                "Vakuumda zarrachalar yo'qligi sababli"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Nyutonning birinchi qonuni nima deb ataladi?",
                "Og'irlik qonuni",
                "Inersiya qonuni",
                "Ertish qonuni",
                "Harakatlanish qonuni",
                "Inersiya qonuni"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Energiya saqlanish qonuniga ko'ra, energiya qanday xususiyatga ega?",
                "Energiya kamayadi",
                "Energiya saqlanmaydi",
                "Energiya yo'qolmaydi va yaratilmaydi",
                "Energiya ortadi",
                "Energiya yo'qolmaydi va yaratilmaydi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Issiqlik o'tkazuvchanlikning eng yuqori darajada bo'lgan metall qaysi?",
                "Mis",
                "Kumush",
                "Temir",
                "Oltin",
                "Kumush"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Agar biror narsa o'z holatini o'zgartirmasa, unga qanday ta'rif beriladi?",
                "Uyushqoqlik",
                "Harakat",
                "Tinchlik holati",
                "Muvozanat holati",
                "Tinchlik holati"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Elektr tokini o'tkazmaydigan material qanday nomlanadi?",
                "Dielektrik",
                "Metall",
                "Yarim o'tkazgich",
                "Suprayotkazgich",
                "Dielektrik"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Qaysi sayyora Quyosh sistemasidagi eng zich sayyoradir?",
                "Yer",
                "Mars",
                "Yupiter",
                "Venera",
                "Yer"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Chiroq yonishi uchun qanday energiya turi kerak?",
                "Issiqlik energiyasi",
                "Kimyoviy energiya",
                "Yadro energiyasi",
                "Elektr energiyasi",
                "Elektr energiyasi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Agar tortishish kuchi 0 bo'lsa, nima sodir bo'ladi?",
                "Narsalar tortilmaydi",
                "Narsalar juda tez harakatlanadi",
                "Narsalar yorug'lik tezligiga erishadi",
                "Narsalar portlab ketadi",
                "Narsalar tortilmaydi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Quyosh nurlari Yerga qancha vaqtda yetib keladi?",
                "8 soniya",
                "8 daqiqa",
                "80 daqiqa",
                "8 soat",
                "8 daqiqa"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Yorug'likning tezligi vakuumda qancha?",
                "300 000 km/soat",
                "3 000 km/soat",
                "300 000 km/sekund",
                "3 000 km/sekund",
                "300 000 km/sekund"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Eshitish chegarasi odamlarda necha Gts gacha?",
                "10-10,000 Gts",
                "20-20,000 Gts",
                "100-50,000 Gts",
                "100-10,000 Gts",
                "20-20,000 Gts"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Elektromagnit to‘lqinlarning energiya manbai nima?",
                "Elektr kuchi",
                "Magnit maydon",
                "Kinetik energiya",
                "Tovush to‘lqinlari",
                "Elektr kuchi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Qanday kuchlar jismlarning tortilishiga olib keladi?",
                "Elektromagnit",
                "Gravitatsiya",
                "Yadro",
                "Qutb kuchlari",
                "Gravitatsiya"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Yerning qaysi qismi eng ko‘p zichlikka ega?",
                "Qobiq",
                "Mantiya",
                "Yadro",
                "Tog‘ jinslari",
                "Yadro"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Chiroqning yorqinligi nimalarga bog'liq?",
                "Faqat zaryadga",
                "Ishlanganda kuchlanishga",
                "Tok va kuchlanishga",
                "Faqat tokka",
                "Tok va kuchlanishga"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Nyutonning uchinchi qonuni qanday?",
                "Kuchlanish qonuni",
                "Harakatning saqlanish qonuni",
                "Ta'sir va qarshi ta'sir qonuni",
                "Kinetik qonun",
                "Ta'sir va qarshi ta'sir qonuni"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Zerikarli hamda suyuqliklarni ham bir xil joylashtirgan energiya nima?",
                "Elektromagnit energiya",
                "Gravitatsion energiya",
                "Kinetik energiya",
                "Mexanik energiya",
                "Gravitatsion energiya"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Qanday material elektr toki o‘tkazmaydi?",
                "Metall",
                "Dielektrik",
                "Elektrolit",
                "Yarim o‘tkazgich",
                "Dielektrik"
            )
        )

        questionsFizika.add(
            QuestionData(
                "Atom energiyasi nimadan olinadi?",
                "Suvdan",
                "Elektrdan",
                "Yadrodan",
                "Kinetik energiyadan",
                "Yadrodan"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Kuchlanish va qarshilik nimalarni aniqlashga yordam beradi?",
                "Ish",
                "Quvvat",
                "Tok",
                "Temperatura",
                "Tok"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Jismning o‘z holatini saqlashga intilishi nimani anglatadi?",
                "Inersiya",
                "Kuch",
                "Og‘irlik",
                "Kinetika",
                "Inersiya"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Elektr energiyasini quvvatga aylantiruvchi asbob nima?",
                "Generator",
                "Transistor",
                "Transformator",
                "Induktor",
                "Generator"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Jismning og‘irligi qaerga yo‘naltirilgan?",
                "Gorizontalga",
                "Vertikalga",
                "Yer markaziga",
                "Atrofga",
                "Yer markaziga"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Suyuqlikning bug‘lanish jarayoni nimaga bog‘liq?",
                "Harorat va bosimga",
                "Hajm va zichlikka",
                "Kuchlanish va tokka",
                "Og‘irlikka",
                "Harorat va bosimga"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Quyoshning markazidagi issiqlik manbasi nima?",
                "Yadro sintezi",
                "Yadro parchalanishi",
                "Gravitatsion siqilish",
                "Kimyoviy reaksiyalar",
                "Yadro sintezi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Insonning suzish imkoniyatini nima ta’minlaydi?",
                "Og‘irlikning ko‘payishi",
                "Suvning ko‘tarish kuchi",
                "Gravitatsiya",
                "Yengil vazn",
                "Suvning ko‘tarish kuchi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Yashin qachon paydo bo‘ladi?",
                "Havo qiziganda",
                "Zaryadlar ajralganda",
                "Suv bug‘langanda",
                "Yengil shamolda",
                "Zaryadlar ajralganda"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Foton nima?",
                "Eng kichik zarracha",
                "Atom yadrosi",
                "Yorug‘likning zarracha yoki to‘lqini",
                "Elektr zarracha",
                "Yorug‘likning zarracha yoki to‘lqini"
            )
        )

        questionsFizika.add(
            QuestionData(
                "Tovush qanday to‘lqinlar orqali tarqaladi?",
                "Yorug‘lik to‘lqinlari",
                "Yuqori chastotali to‘lqinlar",
                "Uzun to‘lqinlar",
                "Bo‘shliq to‘lqinlari",
                "Uzun to‘lqinlar"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Optik zichlik ortganda nimalar o‘zgaradi?",
                "Yorug‘likning tezligi",
                "Chastota",
                "Energiya",
                "Amplituda",
                "Yorug‘likning tezligi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "O‘yin avtomatlarini kuchlantiruvchi manba nima?",
                "Mexanik kuch",
                "Elektr energiya",
                "Issiqlik energiya",
                "Quvvat",
                "Elektr energiya"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Magnit maydon qanday zarrachalarni o‘ziga tortadi?",
                "Dielektriklarni",
                "O‘tkazgichlarni",
                "Yarim o‘tkazgichlarni",
                "Elektronlarni",
                "Elektronlarni"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Agar maydon kuchliroq bo‘lsa, elektr zaryad nimaga ko‘p bo‘ladi?",
                "Yuqori energiyaga",
                "Kam energiyaga",
                "Zaryad miqdoriga",
                "Zichlikka",
                "Yuqori energiyaga"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Gazning harorati ortsa, nima sodir bo‘ladi?",
                "Kuchayadi",
                "Zichligi oshadi",
                "Kinetik energiyasi oshadi",
                "Kamayadi",
                "Kinetik energiyasi oshadi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Moddaning qaysi holati eng katta energiyaga ega?",
                "Qattiq",
                "Suyuq",
                "Gaz",
                "Plazma",
                "Plazma"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Bosim qaysi birlikda o‘lchanadi?",
                "Vatt",
                "Paskal",
                "Nyuton",
                "Joul",
                "Paskal"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Atomning manfiy zaryadlangan zarrachasi nima?",
                "Neutron",
                "Elektron",
                "Proton",
                "Foton",
                "Elektron"
            )
        )

        questionsFizika.add(
            QuestionData(
                "Elektr toki yo‘nalishi qanday belgilanadi?",
                "Elektr zaryadi yo‘nalishi",
                "Magnit kuch yo‘nalishi",
                "Oqim yo‘nalishi",
                "Kuchlanish yo‘nalishi",
                "Elektr zaryadi yo‘nalishi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Chiroqning quvvati qaysi o‘lchov birligida ifodalanadi?",
                "Vatt",
                "Nyuton",
                "Joul",
                "Amper",
                "Vatt"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Quyoshdan Yerga qanchalik energiya yetib keladi?",
                "Yadro energiyasi",
                "Yorug‘lik energiyasi",
                "Elektr energiyasi",
                "Tovush energiyasi",
                "Yorug‘lik energiyasi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Agar suyuqlikning harorati ortsa, nima sodir bo‘ladi?",
                "Qotadi",
                "Bug‘lanadi",
                "Kinetik energiyasi kamayadi",
                "Bosim ortadi",
                "Bug‘lanadi"
            )
        )
        questionsFizika.add(
            QuestionData(
                "Chiroq to‘liq chiroqdan nima farq qiladi?",
                "Kuchlanish",
                "Kuchsiz elektr toki",
                "Yoritish kuchi",
                "Kam energiya sarfi",
                "Yoritish kuchi"
            )
        )

    }

    private fun loadChallengingBiologyQuestions() {
        questionsBiologiya.add(
            QuestionData(
                "Odamda nechta suyak mavjud?",
                "106",
                "206",
                "306",
                "406",
                "206"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qonning asosiy tarkibi nima?",
                "Oksigen",
                "Suv",
                "Gemoglobin",
                "Kaltsiy",
                "Gemoglobin"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "DNKda nechta asosiy nukleotid mavjud?",
                "2",
                "4",
                "6",
                "8",
                "4"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hujayralar kislorod tashiydi?",
                "Leykotsitlar",
                "Gemoglobinlar",
                "Eritrotsitlar",
                "Trombositlar",
                "Eritrotsitlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ insonda eng katta hisoblanadi?",
                "Bosh miya",
                "Yurak",
                "Jigar",
                "O'pka",
                "Jigar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Organizmning genetik materialini kim kashf etgan?",
                "Mendel",
                "Darvin",
                "Franklin",
                "Uotson va Krik",
                "Uotson va Krik"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ energiya ishlab chiqarish uchun mas'ul?",
                "Yurak",
                "Miya",
                "Mitoxondriya",
                "Jigar",
                "Mitoxondriya"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "O‘simliklarda fotosintez qayerda sodir bo‘ladi?",
                "Stoma",
                "Xloroplast",
                "Oqilma",
                "Tana",
                "Xloroplast"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Eng katta odam muskuli qaysi?",
                "Biceps",
                "Quadriceps",
                "Gluteus maximus",
                "Triceps",
                "Gluteus maximus"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hujayra bo‘linishi jinsiy hujayralarni hosil qiladi?",
                "Mitoz",
                "Me yoz",
                "Mitoxondriya",
                "Oksidlanish",
                "Me yoz"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "Tirnoq qanday modda?",
                "Keratin",
                "Kollagen",
                "Gemoglobin",
                "Fibrinogen",
                "Keratin"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Yurak qaysi mushak turi bilan qoplangan?",
                "Skelet mushagi",
                "Yassi mushak",
                "Yurak mushagi",
                "Silliq mushak",
                "Yurak mushagi"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Hayvonlar qanday energiya manbaini ishlatadi?",
                "Yorug‘lik",
                "Kimyoviy",
                "Elektr",
                "Magnetik",
                "Kimyoviy"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "DNKda qaysi birikmalar uchraydi?",
                "Guanin va urasil",
                "Guanin va sitozin",
                "Adenin va timin",
                "Adenin va sitozin",
                "Adenin va timin"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odam tanasining necha foizi suvdan iborat?",
                "20-30%",
                "30-40%",
                "50-60%",
                "70-80%",
                "50-60%"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Inson qoni qanday rangda?",
                "Qizil",
                "Ko‘k",
                "Sariq",
                "Yashil",
                "Qizil"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi suyak eng katta?",
                "Barmoq",
                "Son suyak",
                "Kalta suyak",
                "Tirsak",
                "Son suyak"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Asab tizimining markazi qaysi?",
                "Yurak",
                "O‘pka",
                "Bosh miya",
                "Qorin",
                "Bosh miya"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Jinsiy xromosomalar qanday belgilangan?",
                "XX va XY",
                "AA va BB",
                "MM va NN",
                "XX va YY",
                "XX va XY"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hayvonning yuragi bir qancha kameraga ega?",
                "Baliq",
                "Qush",
                "Inson",
                "Chayon",
                "Qush"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "O‘simliklar qanday jarayon orqali ozuqa oladi?",
                "Nafas olish",
                "Hazm qilish",
                "Fotosintez",
                "Suv bilan",
                "Fotosintez"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamning eng katta organi nima?",
                "Bosh miya",
                "Jigar",
                "O‘pka",
                "Teri",
                "Teri"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qon qanday rangda ko‘rinadi venada?",
                "Qizil",
                "Ko‘k",
                "Sariq",
                "Yashil",
                "Ko‘k"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi moddalar energiya beradi?",
                "Vitaminlar",
                "Protein",
                "Uglevodlar",
                "Minerallar",
                "Uglevodlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Suvdagi kislorod qayerdan keladi?",
                "Tuproqdan",
                "Suvdan",
                "Fotosintezdan",
                "Havo",
                "Fotosintezdan"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi o‘simlikni genetik o‘rganish uchun ishlatilgan?",
                "Sholgom",
                "Gulkaram",
                "Lola",
                "Makkajo‘xori",
                "Makkajo‘xori"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi gormon stressga qarshi javob beradi?",
                "Melatonin",
                "Kortizol",
                "Testosteron",
                "Insulin",
                "Kortizol"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi qism organizmning darajasini muvofiqlashtiradi?",
                "Nafas olish tizimi",
                "Hormonlar",
                "Nervlar",
                "Tana qismi",
                "Hormonlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odam organizmi har kuni qancha miqdorda ter to‘kadi?",
                "0.5 litr",
                "1 litr",
                "1.5 litr",
                "2 litr",
                "0.5 litr"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi tizim tanaga ozuqa moddalari yetkazadi?",
                "Suv tizimi",
                "Hazm qilish tizimi",
                "Nafas olish tizimi",
                "Asab tizimi",
                "Hazm qilish tizimi"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "Qaysi hayvonning son suyagi eng kuchli?",
                "Fil",
                "Sher",
                "Odam",
                "O‘rdak",
                "Fil"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamda necha juft qovurg‘a bor?",
                "10",
                "12",
                "14",
                "16",
                "12"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi qism organizmni infektsiyalardan himoya qiladi?",
                "Qon",
                "Ter",
                "Oq qon hujayralari",
                "Tirsak",
                "Oq qon hujayralari"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hayvonning yuragi 3 ta kamera mavjud?",
                "Chayon",
                "Qush",
                "Inson",
                "Baliq",
                "Qush"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi suyak odam tanasidagi eng qisqa?",
                "Barmoq",
                "Quloq",
                "Dumg‘aza",
                "Tirsak",
                "Quloq"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Asosiy energiya manbai nima?",
                "Ozuqa moddalar",
                "Suv",
                "Vitaminlar",
                "Tuzlar",
                "Ozuqa moddalar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi element tirik organizmlar uchun zarur?",
                "Nitrat",
                "Vodorod",
                "Yod",
                "Brom",
                "Yod"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hayvon suvda nafas oladi?",
                "Odam",
                "Qush",
                "Baliq",
                "Fil",
                "Baliq"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ ko‘rish uchun mas’ul?",
                "Burun",
                "O‘pka",
                "Ko‘z",
                "Og‘iz",
                "Ko‘z"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamda nechta asab tizimi turi bor?",
                "1",
                "2",
                "3",
                "4",
                "2"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "Qaysi hujayra turida genetik axborot mavjud?",
                "Plazma",
                "DNK",
                "Sitoplazma",
                "Mitoxondriya",
                "DNK"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamning o‘pka hajmi qancha?",
                "2 litr",
                "4 litr",
                "6 litr",
                "8 litr",
                "6 litr"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi qism ovqatni hazm qilishni boshlaydi?",
                "Og‘iz",
                "Qizilo'ngach",
                "O‘n ikki barmoq ichak",
                "Qorin",
                "Og‘iz"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Inson tanasida eng kichik suyak qaysi?",
                "Son",
                "Barmoq",
                "Quloqning zanjiri",
                "Bilak",
                "Quloqning zanjiri"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ qon ishlab chiqarishga mas'ul?",
                "Yurak",
                "Jigar",
                "Suyak iligi",
                "Bosh miya",
                "Suyak iligi"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Hayvonlarning qaysi turi tuxum qo‘yadi?",
                "Sutemizuvchilar",
                "Sudraluvchilar",
                "Odamlar",
                "Qushlar",
                "Qushlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "O‘simliklarda qaysi pigment yashil rang beradi?",
                "Melanin",
                "Xlorofil",
                "Klorofill",
                "Keratin",
                "Klorofill"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi qism suvsizlanishga olib keladi?",
                "Tashnalik",
                "Ko‘proq ovqat yeyish",
                "Ko‘p ishlash",
                "Kam uxlash",
                "Tashnalik"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qon aylanishi qaysi hujayralar orqali sodir bo‘ladi?",
                "Leykotsitlar",
                "Eritrotsitlar",
                "Qon plazmasi",
                "Gemoglobin",
                "Eritrotsitlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Hayvonlarning qaysi turi o‘zining rangini o‘zgartira oladi?",
                "Qushlar",
                "Baliqlar",
                "Qisqichbaqasimonlar",
                "Suduqonlar",
                "Suduqonlar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamning me'yordagi tana harorati qancha?",
                "36.5°C",
                "37°C",
                "37.5°C",
                "38°C",
                "37°C"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ dori moddalarni parchalashga yordam beradi?",
                "Yurak",
                "Bosh miya",
                "Jigar",
                "O‘pka",
                "Jigar"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "O‘simliklarning ildizi nima uchun zarur?",
                "Ozuqa olish",
                "Suv olish",
                "Ildizsiz o‘sish",
                "Nam olish",
                "Suv olish"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Skelet tizimining funksiyasi nima?",
                "Tana harakatini boshqarish",
                "Himoya qilish",
                "Ovqat hazm qilish",
                "Nafas olish",
                "Himoya qilish"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organizmlar energiyani quyoshdan oladi?",
                "Hayvonlar",
                "Odamlar",
                "Qushlar",
                "O‘simliklar",
                "O‘simliklar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odam tanasidagi qaysi tizim suyaklar va mushaklardan iborat?",
                "Hazm qilish tizimi",
                "Asab tizimi",
                "Skelet-mushak tizimi",
                "Qon aylanish tizimi",
                "Skelet-mushak tizimi"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ oziq-ovqatni hazm qilish uchun fermentlar ishlab chiqaradi?",
                "Qizilo‘ngach",
                "Jigar",
                "O‘n ikki barmoq ichak",
                "Me’da",
                "Me’da"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamlar nechta asosiy qondan iborat?",
                "A, B",
                "A, B, AB, O",
                "AA, BB",
                "O+ va O-",
                "A, B, AB, O"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi moddalar hujayra devorini tashkil qiladi?",
                "Proteinlar",
                "Lipidlar",
                "Sellyuloza",
                "Nuklein kislotalar",
                "Sellyuloza"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Insonning qon bosimi o‘lchami qanday birlik bilan ifodalanadi?",
                "Litr",
                "MmHg",
                "Detsimetr",
                "Newton",
                "MmHg"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi modda tanaga kislorod olib kelishga yordam beradi?",
                "Suv",
                "Gemoglobin",
                "Leykotsitlar",
                "Kalsiy",
                "Gemoglobin"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ tanani tozalash va filtratsiya qilish vazifasini bajaradi?",
                "Bosh miya",
                "Buyrak",
                "Jigar",
                "O‘pka",
                "Buyrak"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "Fotosintez jarayonida qanday gaz hosil bo‘ladi?",
                "Karbon dioksid",
                "Oksigen",
                "Azot",
                "Kükürt",
                "Oksigen"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Yurakda nechta bo‘linma bor?",
                "1",
                "2",
                "3",
                "4",
                "4"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ biriktiruvchi to‘qimalardan tashkil topgan?",
                "Qizilo‘ngach",
                "Tirsak",
                "Kalta suyak",
                "Suyak",
                "Suyak"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Organizmning birinchi darajali ozuqa zanjiri kimdan boshlanadi?",
                "Yirtqichlar",
                "O‘simliklar",
                "Hayvonlar",
                "Qushlar",
                "O‘simliklar"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "O‘simliklar qanday qilib kislorod chiqaradi?",
                "Oziqlanish orqali",
                "Fotosintez orqali",
                "Yomg‘ir bilan",
                "Ildiz bilan",
                "Fotosintez orqali"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organizm parazit sifatida hayot kechiradi?",
                "Baliq",
                "Qush",
                "Zamburug‘",
                "O‘simlik",
                "Zamburug‘"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamlarda ovqat hazm qilish qayerda tugaydi?",
                "Og‘iz",
                "Ichak",
                "Me’da",
                "Qizilo‘ngach",
                "Ichak"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "O‘pkaning asosiy vazifasi nima?",
                "Energiya ishlab chiqarish",
                "Ovqat hazm qilish",
                "Nafas olish",
                "Hazm qilish",
                "Nafas olish"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Mikroskop orqali ko‘riladigan eng kichik organizm nima?",
                "Virus",
                "Bakteriya",
                "Xlorofill",
                "DNK",
                "Virus"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Asab tizimi qanday xabarlarni uzatadi?",
                "Elektr impulslarini",
                "Nafas",
                "Kimyoviy",
                "Issiqlik",
                "Elektr impulslarini"
            )
        )

        questionsBiologiya.add(
            QuestionData(
                "Mushaklar nima yordamida qisqaradi?",
                "ATP",
                "Glikogen",
                "Oqsil",
                "Fibrin",
                "ATP"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odamning bosh miyasi qancha massaga ega?",
                "1 kg",
                "1.2 kg",
                "1.5 kg",
                "2 kg",
                "1.5 kg"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Hujayra devorida qaysi modda mavjud?",
                "Lipidlar",
                "Sellyuloza",
                "Oqsillar",
                "Vitaminlar",
                "Sellyuloza"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi organ organizmga kislorod yetkazadi?",
                "Jigar",
                "O‘pka",
                "Buyrak",
                "Tana",
                "O‘pka"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi tuzilma DNKni tashiydi?",
                "Lipid",
                "Xromosoma",
                "Nukleotid",
                "Xlorofill",
                "Xromosoma"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Odam tanasidagi eng katta organ?",
                "Bosh miya",
                "Jigar",
                "Teri",
                "O‘pka",
                "Teri"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hujayra harakatga yordam beradi?",
                "Gemoglobin",
                "Suyuqlik",
                "Eritrotsit",
                "Mushak hujayralari",
                "Mushak hujayralari"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Qaysi hayvonning yurak urish tezligi eng past?",
                "Sher",
                "Fil",
                "Baliq",
                "Kaplumbağa",
                "Fil"
            )
        )
        questionsBiologiya.add(
            QuestionData(
                "Hayvonlarning qaysi turida qanotlar mavjud?",
                "Baliqlar",
                "Sudraluvchilar",
                "Qushlar",
                "Sutemizuvchilar",
                "Qushlar"
            )
        )

    }

    private fun loadChallengingKimyoQuestions() {
        questionsKimyo.add(
            QuestionData(
                "Atomning markaziy yadrosi nimadan iborat?",
                "Proton va neytron",
                "Elektron va proton",
                "Foton va neytron",
                "Elektron va foton",
                "Proton va neytron"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi elementning kimyoviy belgisi O?",
                "Oksid",
                "Olov",
                "Oksigen",
                "Osmiy",
                "Oksigen"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Suvning kimyoviy formulasi qanday?",
                "H₂O",
                "CO₂",
                "O₂",
                "NaCl",
                "H₂O"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Hujayra devorini tashkil qiluvchi moddalar qaysi?",
                "Karbon va suv",
                "Suv va tuz",
                "Lipid va sellyuloza",
                "Protein va DNK",
                "Lipid va sellyuloza"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Eng ko‘p tarqalgan element qaysi?",
                "Azot",
                "Kislorod",
                "Vodorod",
                "Uglerod",
                "Vodorod"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Ion nima?",
                "Elektronga ega zarra",
                "Musbat va manfiy zaryadga ega zarra",
                "Ijobiy zaryadli zarra",
                "Zaryadsiz zarra",
                "Musbat va manfiy zaryadga ega zarra"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kislotaning pH qiymati qaysi oraliqda bo‘ladi?",
                "7 dan katta",
                "7",
                "5-7",
                "7 dan kichik",
                "7 dan kichik"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi metallar oksidlanishdan o‘zini himoya qila oladi?",
                "Temir",
                "Oltin",
                "Mis",
                "Natriy",
                "Oltin"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyo qancha asosiy guruhga bo'linadi?",
                "3",
                "4",
                "5",
                "2",
                "5"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Karbonat kislotaning formulasi qanday?",
                "H₂CO₃",
                "H₂O",
                "CO₂",
                "NaOH",
                "H₂CO₃"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Qaysi gaz havoda eng ko'p uchraydi?",
                "Oksigen",
                "Azot",
                "Karbon dioksid",
                "Argon",
                "Azot"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Elektrolitlar nima?",
                "Suvda eriydigan moddalar",
                "Suvda eritilib elektr o‘tkazuvchi moddalar",
                "Qattiq moddalar",
                "Suyuqlik",
                "Suvda eritilib elektr o‘tkazuvchi moddalar"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Fosforning kimyoviy belgisi nima?",
                "P",
                "F",
                "O",
                "S",
                "P"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Organik kimyo nima?",
                "Hayvonlarni o‘rganuvchi fan",
                "Nafas olish fan",
                "Uglerod birikmalarini o‘rganuvchi fan",
                "O‘simliklarni o‘rganuvchi fan",
                "Uglerod birikmalarini o‘rganuvchi fan"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kislota va asos o‘rtasidagi reaksiya nima deb ataladi?",
                "Oksidlanish",
                "Neytrallanish",
                "Ionlanish",
                "Suvlanish",
                "Neytrallanish"
            )
        )
        questionsKimyo.add(QuestionData("Vodorodning atom soni qancha?", "1", "2", "3", "4", "1"))
        questionsKimyo.add(
            QuestionData(
                "Ammiakning formulasi nima?",
                "H₂O",
                "CH₄",
                "NH₃",
                "CO₂",
                "NH₃"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Zaryadlangan zarrachalar nima deyiladi?",
                "Ions",
                "Elektrons",
                "Atomlar",
                "Protons",
                "Ions"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Zichligi eng katta bo‘lgan metall qaysi?",
                "Oltin",
                "Temir",
                "Osmiy",
                "Mis",
                "Osmiy"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Metallar va metallmaslar birikmalarining umumiy nomi nima?",
                "Ion",
                "Birlamchi",
                "Metallid",
                "Birinchi",
                "Metallid"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Laboratoriyalarda keng qo‘llaniladigan indiktor qaysi?",
                "Lakmus",
                "Fenolftalein",
                "Metil apelsin",
                "Kislota",
                "Fenolftalein"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Dastlabki metallar qaysi asrda ochilgan?",
                "O'rta asrlar",
                "Qadimgi asrlar",
                "Yangi asr",
                "O'tmishdagi",
                "Qadimgi asrlar"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyo tarixidagi eng katta kashfiyotlardan biri qaysi?",
                "Issiqotish nazariyasi",
                "Atom nazariyasi",
                "Kislorodning kashf etilishi",
                "Polimerlash",
                "Kislorodning kashf etilishi"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Atomning neytronlari zaryadga ega emas. Ular nima deyiladi?",
                "Kation",
                "Elektron",
                "Neytral",
                "Anion",
                "Neytral"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Elektron qanday zaryadga ega?",
                "Musbat",
                "Manfiy",
                "Neytral",
                "Ijobiy",
                "Manfiy"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Uglerodning allotropik shakllaridan biri nima?",
                "Grafit",
                "Temir",
                "Mis",
                "Kumush",
                "Grafit"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi metall eng yuqori o‘tkazuvchanlikka ega?",
                "Temir",
                "Mis",
                "Oltin",
                "Kumush",
                "Kumush"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Oksidlanish jarayoni qanday sodir bo‘ladi?",
                "Proton olish orqali",
                "Proton yo‘qotish orqali",
                "Elektron olish orqali",
                "Elektron yo‘qotish orqali",
                "Elektron yo‘qotish orqali"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Eng ko‘p tarqalgan metall nima?",
                "Oltin",
                "Temir",
                "Mis",
                "Alyuminiy",
                "Alyuminiy"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyo elementi Li qanday ataladi?",
                "Litiy",
                "Oltin",
                "Qo‘rg‘oshin",
                "Kumush",
                "Litiy"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Qaysi element Yer po‘stlog‘ida eng ko‘p uchraydi?",
                "Oksigen",
                "Uglerod",
                "Vodorod",
                "Azot",
                "Oksigen"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Eng engil metall qaysi?",
                "Litiy",
                "Oltin",
                "Temir",
                "Qo'rg'oshin",
                "Litiy"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Ko‘mirning asosiy kimyoviy tarkibi nima?",
                "Uglerod",
                "Temir",
                "Vodapor",
                "Azot",
                "Uglerod"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qanday elementlar gaz holatida bo‘ladi?",
                "Metallar",
                "Inert gazlar",
                "Oksidlar",
                "Kislotalar",
                "Inert gazlar"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Temir qanday oksidlanish darajasiga ega?",
                "Fe²⁺ va Fe³⁺",
                "Fe",
                "Fe⁺",
                "Fe²⁺",
                "Fe²⁺ va Fe³⁺"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Ionlash energiyasi qanday jarayonda ishlatiladi?",
                "Elektron berishda",
                "Proton olishda",
                "Elektron olishda",
                "Ijobiy zaryad olishda",
                "Elektron berishda"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kislotaning kimyoviy formulasi qaysi?",
                "CO₂",
                "HCl",
                "NaCl",
                "C₆H₁₂O₆",
                "HCl"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kovalent bog‘lanishda elektronlar qanday bo‘linadi?",
                "Bir-biriga teng",
                "Bir tomonlama",
                "Tengsizlik",
                "Muvozanatli",
                "Bir-biriga teng"
            )
        )
        questionsKimyo.add(QuestionData("Kislorodning atom soni qaysi?", "8", "6", "7", "10", "8"))
        questionsKimyo.add(
            QuestionData(
                "Qaysi reaksiya turi issiqlik chiqaradi?",
                "Endotermik",
                "Ekzotermik",
                "Birlashtiruvchi",
                "Buzilish",
                "Ekzotermik"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Natriy va xlor qanday bog‘lanadi?",
                "Kovalent",
                "Ion",
                "Metallik",
                "Vodapor",
                "Ion"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Atom massasi qaysi birlikda o‘lchanadi?",
                "Kilogramm",
                "Amu",
                "Gramm",
                "Metr",
                "Amu"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Eng yumshoq metall qaysi?",
                "Oltin",
                "Temir",
                "Kumush",
                "Natriy",
                "Natriy"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi moddalar kislota va asoslarni neytrallaydi?",
                "Tuzlar",
                "Gazlar",
                "Metallar",
                "Oksidlar",
                "Tuzlar"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Reaktsiyada massa o‘zgarmasligini kim isbotlagan?",
                "Avogadro",
                "Dalton",
                "Lavua",
                "Boyl",
                "Lavua"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Ion bog‘lanishda qanday zarralar paydo bo‘ladi?",
                "Elektron",
                "Proton",
                "Ions",
                "Molekula",
                "Ions"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kislota eritmasidagi asosiy zarralar qanday?",
                "H⁺",
                "OH⁻",
                "Na⁺",
                "Cl⁻",
                "H⁺"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Temir qanday rangda oksidlanadi?",
                "Kulrang",
                "Qizil",
                "Yashil",
                "Qora",
                "Qizil"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Metallar va metallmaslar qaysi bog‘ orqali bog‘lanadi?",
                "Kovalent",
                "Ion",
                "Metallik",
                "Vodapor",
                "Metallik"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qanday reaksiya ikkita birikmaning almashinuvi orqali sodir bo‘ladi?",
                "Birlashtirish",
                "Ajralish",
                "Almashtirish",
                "Neytrallash",
                "Almashtirish"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Atomning tashqi qatlamidagi elektronlar nima deb ataladi?",
                "Yadro elektronlari",
                "Kovalent elektronlar",
                "Valent elektronlari",
                "Ion elektronlari",
                "Valent elektronlari"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi metall havo ta’sirida tez oksidlanadi?",
                "Oltin",
                "Temir",
                "Mis",
                "Kumush",
                "Temir"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qanday moddalar organik birikmalar deb ataladi?",
                "Vodorodsiz",
                "Uglerodli",
                "Azotsiz",
                "Kislorodsiz",
                "Uglerodli"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Oksidlanish va qaytarilish reaksiyalari qanday ataladi?",
                "Oksid reaksiya",
                "Metall reaktsiya",
                "Qaytarilish reaksiya",
                "Redoks reaksiya",
                "Redoks reaksiya"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyoning asosiy qonunlaridan biri nima?",
                "O‘zgarmas massa qonuni",
                "Atom massasi qonuni",
                "Elektron qonuni",
                "Neytron qonuni",
                "O‘zgarmas massa qonuni"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Uglerodning sof shakllaridan biri qaysi?",
                "Almaz",
                "Temir",
                "Vodorod",
                "Kislota",
                "Almaz"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyo fanida halokatli gaz qaysi?",
                "Azot",
                "Oksigen",
                "Kislotali",
                "Karbon monoksid",
                "Karbon monoksid"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Aspirin qanday maqsadda ishlatiladi?",
                "Og'riqni kamaytirish",
                "Isitma tushirish",
                "Yaralar",
                "Barcha javoblar to'g'ri",
                "Barcha javoblar to'g'ri"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi metall eng yuqori erish nuqtasiga ega?",
                "Temir",
                "Mis",
                "Oltin",
                "Volfram",
                "Volfram"
            )
        )

        questionsKimyo.add(
            QuestionData(
                "Hujayrada energiya ishlab chiqaruvchi organoid qaysi?",
                "Lizosoma",
                "Ribosoma",
                "Mitoxondriya",
                "Yadro",
                "Mitoxondriya"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Metallarni ajratish jarayoniga nima deb ataladi?",
                "Polimerlash",
                "Elektroliz",
                "Neytrallash",
                "Kovalent bog‘lanish",
                "Elektroliz"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Laboratoriyalarda ishlatiladigan asosiy idish?",
                "Erlenmeyer kolbasi",
                "Kubok",
                "Shisha",
                "Kapsula",
                "Erlenmeyer kolbasi"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Atomning markazida nima joylashgan?",
                "Elektronlar",
                "Yadro",
                "Protonlar",
                "Neutronlar",
                "Yadro"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Qaysi element kislorod bilan birikib suv hosil qiladi?",
                "Vodorod",
                "Azot",
                "Uglerod",
                "Temir",
                "Vodorod"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Zarralarning energiyasi o‘zgarganda qanday jarayon sodir bo‘ladi?",
                "Endotermik",
                "Ekzotermik",
                "Birinchi",
                "Qayta tiklanish",
                "Ekzotermik"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Polimerlar nima?",
                "Uglerod zanjirlari",
                "Proton zanjirlari",
                "Oqsillar",
                "Kislotali",
                "Uglerod zanjirlari"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Erish nuqtasi eng yuqori bo‘lgan moddalar qaysi?",
                "Metallar",
                "Gazlar",
                "Polimerlar",
                "Suyuq moddalar",
                "Metallar"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Kimyoda birikmaning tuzilishi nima deb ataladi?",
                "Formulasi",
                "Kimyoviy ismi",
                "Zichligi",
                "Bog‘lanish",
                "Formulasi"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Elementlarni tartiblash tizimini kim yaratgan?",
                "Avogadro",
                "Mendeleyev",
                "Dalton",
                "Lavua",
                "Mendeleyev"
            )
        )
        questionsKimyo.add(
            QuestionData(
                "Ionlashtiruvchi modda qanday?",
                "Tuzlar",
                "Kislotalar",
                "Gazlar",
                "Metallar",
                "Gazlar"
            )
        )
    }

    private fun loadChallengingHistoryUzbQuestions() {
        questionsTarixUzb.add(
            QuestionData(
                "Qaysi shaharda Amir Temur tug‘ilgan?",
                "Shahrisabz",
                "Buxoro",
                "Samarqand",
                "Xiva",
                "Shahrisabz"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur davlatining poytaxti qayer edi?",
                "Toshkent",
                "Xiva",
                "Buxoro",
                "Samarqand",
                "Samarqand"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiy qaysi asari bilan mashhur?",
                "Hamsa",
                "Devoni hikmat",
                "Boburnoma",
                "Avesto",
                "Hamsa"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur qaysi yilda tug'ilgan?",
                "1336",
                "1380",
                "1398",
                "1405",
                "1336"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur haqida qaysi asar yozilgan?",
                "Temurnoma",
                "Boburnoma",
                "Hamsa",
                "Avesto",
                "Temurnoma"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Avesto qaysi davrga tegishli?",
                "Qadimgi Baqtriya",
                "Qo‘qon xonligi",
                "Buxoro xonligi",
                "Temuriylar davri",
                "Qadimgi Baqtriya"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Ulug‘bek qaysi fan sohasida mashhur?",
                "Astronomiya",
                "Tibbiyot",
                "Arxeologiya",
                "Falsafa",
                "Astronomiya"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Ulug‘bek rasadxonasi qaysi shaharda joylashgan?",
                "Xiva",
                "Buxoro",
                "Samarqand",
                "Toshkent",
                "Samarqand"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston qaysi yili mustaqillikka erishgan?",
                "1991",
                "1990",
                "1989",
                "1987",
                "1991"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Buyuk ipak yo‘li qaysi hududlardan o‘tgan?",
                "Markaziy Osiyo",
                "Yevropa",
                "Afrika",
                "Avstraliya",
                "Markaziy Osiyo"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiy qaysi adabiy janrni rivojlantirgan?",
                "G‘azal",
                "Tragediya",
                "Epik",
                "Elegiya",
                "G‘azal"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Bobur qaysi davlatni tashkil qilgan?",
                "Boburiylar",
                "Temuriylar",
                "Qo‘qon xonligi",
                "Buxoro xonligi",
                "Boburiylar"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alpomish qahramoni qaysi dostonning qahramoni?",
                "Alpomish",
                "Rustamnoma",
                "Guliston",
                "Tahir va Zuhra",
                "Alpomish"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasining davlat tili qaysi?",
                "O‘zbek",
                "Rus",
                "Tojik",
                "Qozoq",
                "O‘zbek"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiyning haqiqiy ismi nima?",
                "Nizomiddin Mir Alisher",
                "Abu Rayhon Beruniy",
                "Mirzo Ulug‘bek",
                "Mirzo Bobur",
                "Nizomiddin Mir Alisher"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur qaysi yilda vafot etgan?",
                "1405",
                "1398",
                "1449",
                "1428",
                "1405"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qo‘qon xonligi poytaxti qaysi shahar?",
                "Qo‘qon",
                "Toshkent",
                "Urganch",
                "Xiva",
                "Qo‘qon"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Buxoro amirligi qachon tashkil topgan?",
                "18-asr",
                "15-asr",
                "19-asr",
                "16-asr",
                "18-asr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Temuriylar davrida ilm-fan qaysi shaharda rivojlangan?",
                "Samarqand",
                "Xiva",
                "Toshkent",
                "Buxoro",
                "Samarqand"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Shayboniylar davlati qaysi hududda tashkil topgan?",
                "Movarounnahr",
                "Qo‘qon",
                "Turkiston",
                "Baqtriya",
                "Movarounnahr"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Buyuk Ipak Yo‘li qaysi ikki qit'ani bog‘lagan?",
                "Osiyo va Yevropa",
                "Osiyo va Afrika",
                "Yevropa va Amerika",
                "Afrika va Avstraliya",
                "Osiyo va Yevropa"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Beruniy qaysi fanlar bilan shug‘ullangan?",
                "Astronomiya va matematika",
                "Geometriya va etnografiya",
                "Biologiya va tibbiyot",
                "Psixologiya",
                "Astronomiya va matematika"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Mirzo Ulug‘bek kimning nabirasi?",
                "Amir Temur",
                "Shayboniyxon",
                "Alisher Navoiy",
                "Bobur",
                "Amir Temur"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur davrida qaysi davlatlar bilan aloqalar o‘rnatilgan?",
                "Misr va Hindiston",
                "Italiya va Ispaniya",
                "Fransiya va Angliya",
                "Barchasi",
                "Barchasi"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Movarounnahr deb ataluvchi hudud qaysi hududni anglatadi?",
                "Amudaryo va Sirdaryo oralig‘i",
                "Kaspiy dengizi",
                "Buxoro va Xorazm",
                "Farg‘ona vodiysi",
                "Amudaryo va Sirdaryo oralig‘i"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekistonda qaysi yil Amir Temur yili deb e'lon qilingan?",
                "1996",
                "1995",
                "1994",
                "1997",
                "1996"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qaysi xon Qo‘qon xonligini tashkil qilgan?",
                "Shohrux",
                "Muhammad Rahimxon",
                "Alimqul",
                "Amir Temur",
                "Shohrux"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasi Konstitutsiyasi qachon qabul qilingan?",
                "1992",
                "1991",
                "1995",
                "2000",
                "1992"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur davlatini boshqarish markazi qaysi shahar edi?",
                "Samarqand",
                "Buxoro",
                "Toshkent",
                "Xiva",
                "Samarqand"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qaysi asar Shayboniyxon tomonidan yozilgan?",
                "Bahr ul-asror",
                "Devoni hikmat",
                "Boburnoma",
                "Shayboniylar tarixi",
                "Shayboniylar tarixi"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiyning mashhur falsafiy asari qaysi?",
                "Lison ut-tayr",
                "Boburnoma",
                "Avesto",
                "Hamsa",
                "Lison ut-tayr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Xiva xonligi qachon tashkil topgan?",
                "16-asr",
                "17-asr",
                "18-asr",
                "19-asr",
                "16-asr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiy qaysi podshohning saroyida xizmat qilgan?",
                "Sulton Husayn Boyqaro",
                "Shayboniyxon",
                "Bobur",
                "Amir Temur",
                "Sulton Husayn Boyqaro"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Buxoro xonligi asoschisi kim?",
                "Abdullaxon",
                "Abulfayzxon",
                "Shohrux",
                "Sulton Husayn",
                "Abdullaxon"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur va Toktamish o‘rtasidagi urush qaysi hududda bo‘lgan?",
                "To‘qmoq",
                "Buxoro",
                "Samarqand",
                "Toshkent",
                "To‘qmoq"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qo‘qon xonligi qachon tugatilgan?",
                "1876",
                "1860",
                "1880",
                "1890",
                "1876"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Abu Rayhon Beruniy qaysi shaharda tug‘ilgan?",
                "Qiyot",
                "Buxoro",
                "Samarqand",
                "Xiva",
                "Qiyot"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qaysi asar Ibn Sinoga tegishli?",
                "Tib qonunlari",
                "Boburnoma",
                "Al-Qanun",
                "Tarixi Rashidiy",
                "Al-Qanun"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur o‘z davlatini qaysi asosga qurishga intilgan?",
                "Adolat",
                "Zo‘ravonlik",
                "Uslubiylik",
                "Diplomatiya",
                "Adolat"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasining birinchi prezidenti kim?",
                "Islom Karimov",
                "Shavkat Mirziyoyev",
                "To‘lqin Usmonov",
                "Saidmurod Xoliqov",
                "Islom Karimov"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Toshkent shahri qaysi daryoning bo‘yida joylashgan?",
                "Chirchiq",
                "Amudaryo",
                "Sirdaryo",
                "Zarafshon",
                "Chirchiq"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Shayboniylar sulolasining asoschisi kim?",
                "Muhammad Shayboniy",
                "Alisher Navoiy",
                "Amir Temur",
                "Abu Sayid",
                "Muhammad Shayboniy"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Mirzo Ulug‘bek qaysi davrda yashagan?",
                "15-asr",
                "16-asr",
                "17-asr",
                "14-asr",
                "15-asr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur o‘zining poytaxti Samarqandda qaysi inshootni qurgan?",
                "Go‘ri Amir maqbarasi",
                "Sherdor Madrasa",
                "Xalqlar uyushmasi",
                "Xiva Ark qal’asi",
                "Go‘ri Amir maqbarasi"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Chingizxon qaysi davlatni zabt etishda qatnashmagan?",
                "Misr",
                "Xitoy",
                "Markaziy Osiyo",
                "Rossiya",
                "Misr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Bobur Hindistonda qaysi davlatni tashkil qilgan?",
                "Boburiylar imperiyasi",
                "Sultonlik",
                "Qo‘qon xonligi",
                "Tojikiston",
                "Boburiylar imperiyasi"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Ulug‘bek madrasasi qaysi shahar markazida joylashgan?",
                "Samarqand",
                "Buxoro",
                "Xiva",
                "Qo‘qon",
                "Samarqand"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur o‘zining “Temur tuzuklari” asarini qaysi tilda yozgan?",
                "Fors tili",
                "O‘zbek tili",
                "Arab tili",
                "Rus tili",
                "Fors tili"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Boburning asarlaridan biri qaysi?",
                "Boburnoma",
                "Hamsa",
                "Temurnoma",
                "Qutadg‘u bilig",
                "Boburnoma"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qo‘qon xonligi qachon tashkil topgan?",
                "18-asrda",
                "17-asrda",
                "19-asrda",
                "16-asrda",
                "18-asrda"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "“Xamsa” asari qaysi adibga tegishli?",
                "Alisher Navoiy",
                "Mirzo Ulug‘bek",
                "Amir Temur",
                "Shohrux Mirzo",
                "Alisher Navoiy"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Chingizxonning haqiqiy ismi nima edi?",
                "Temuchin",
                "Amir",
                "Abu-l Xayr",
                "Shohrux",
                "Temuchin"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Ulug‘bek o‘qitish tizimini qaysi fanlar asosida qurgan?",
                "Matematika va astronomiya",
                "Geografiya va falsafa",
                "Biologiya va kimyo",
                "Tarix va lingvistika",
                "Matematika va astronomiya"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alpomish dostonida Alpomishning asosiy dushmani kim edi?",
                "Boyburi",
                "To‘ramurod",
                "Xo‘ja Nasriddin",
                "Qoravoy",
                "Qoravoy"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Sayyid Ajall shaxsiyati qanday mashhur?",
                "Qashqadaryoda hokim bo‘lishi",
                "Xitoyda islomni tarqatgan",
                "Misrda hukmdor bo‘lishi",
                "Arab olimlaridan biri",
                "Xitoyda islomni tarqatgan"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Toshkent qaysi vaqtda Rossiya tomonidan bosib olingan?",
                "1865-yil",
                "1847-yil",
                "1905-yil",
                "1870-yil",
                "1865-yil"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Buxoro xonligi asoschisi kim?",
                "Abdullaxon",
                "Muhammad Shayboniy",
                "Iskandarbek",
                "To‘lqinxon",
                "Abdullaxon"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasi mustaqillikni qaysi davlatdan olgan?",
                "SSSR",
                "AQSh",
                "Rossiya",
                "Qozog‘iston",
                "SSSR"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qaysi hukmdor Toshkentda Sultoniy madrasa qurdirgan?",
                "Abu Said",
                "Abulqosim Tursun",
                "Shohruh Mirzo",
                "Alisher Navoiy",
                "Abulqosim Tursun"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Amir Temur jangovar hayotiga bag‘ishlangan asar qaysi?",
                "Temurnoma",
                "Shayboniylar tarixi",
                "Hamsa",
                "Devoni hikmat",
                "Temurnoma"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Ulug‘bek qaysi davlatning astronomiya sohasida taniqli olimi edi?",
                "Temuriylar",
                "Qo‘qon xonligi",
                "Buxoro amirligi",
                "Xiva xonligi",
                "Temuriylar"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Ibn Sino qaysi fanlarda asar yozgan?",
                "Tibbiyot va falsafa",
                "Matematika va astronomiya",
                "Biologiya va arxeologiya",
                "Tillar va etnologiya",
                "Tibbiyot va falsafa"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston davlat mustaqilligini qaysi sana nishonlaydi?",
                "1-sentabr",
                "8-dekabr",
                "9-may",
                "21-mart",
                "1-sentabr"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Qo‘qon xonligi qachon tugatildi?",
                "1876-yil",
                "1865-yil",
                "1890-yil",
                "1905-yil",
                "1876-yil"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasining poytaxti qaysi shahar?",
                "Toshkent",
                "Samarqand",
                "Buxoro",
                "Xiva",
                "Toshkent"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Alisher Navoiy asarlari orasidagi “Xamsa” qaysi janrga tegishli?",
                "Doston",
                "Tragediya",
                "She’riy",
                "Nasriy",
                "Doston"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Mirzo Ulug‘bek o‘zining ilmiy ishlari uchun qaysi hududni tanlagan?",
                "Samarqand",
                "Buxoro",
                "Xiva",
                "Qo‘qon",
                "Samarqand"
            )
        )

        questionsTarixUzb.add(
            QuestionData(
                "Abu Rayhon Beruniyning asarlari qaysi fanlar bilan bog‘liq?",
                "Astronomiya va matematika",
                "Falsafa va psixologiya",
                "Tibbiyot va etnologiya",
                "Geologiya va geomatika",
                "Astronomiya va matematika"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "O‘zbekiston Respublikasi bayrog‘idagi 12 yulduz nimani anglatadi?",
                "Hududiy birliklar",
                "Qadimgi davlatlar",
                "Diniy bayramlar",
                "Madaniy meros",
                "Hududiy birliklar"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Sayyid Ajall qaysi mamlakatda islomni yoyishda katta hissa qo‘shgan?",
                "Xitoy",
                "Hindiston",
                "Rossiya",
                "Turkiya",
                "Xitoy"
            )
        )
        questionsTarixUzb.add(
            QuestionData(
                "Temur tuzuklari asarida qaysi masalalar yoritilgan?",
                "Davlat boshqaruvi",
                "Tibbiyot",
                "Tabiatshunoslik",
                "Geometriya",
                "Davlat boshqaruvi"
            )
        )
    }

    private fun loadChallengingGeografiyaQuestions() {
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng katta cho‘l qaysi?",
                "Sahara",
                "Gobi",
                "Kalahari",
                "Arabiston",
                "Sahara"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng uzun daryo qaysi?",
                "Nil",
                "Amazonka",
                "Mississippi",
                "Yangtzi",
                "Nil"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng chuqur ko‘l qaysi?",
                "Baykal",
                "Tanganyika",
                "O‘lik dengiz",
                "Viktoriya",
                "Baykal"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Everest tog‘i qayerda joylashgan?",
                "Nepal",
                "Xitoy",
                "Butan",
                "Hindiston",
                "Nepal"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yerning umumiy maydonining qancha qismi suv bilan qoplangan?",
                "71%",
                "50%",
                "85%",
                "60%",
                "71%"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng katta okean qaysi?",
                "Tinch okeani",
                "Atlantika okeani",
                "Hind okeani",
                "Shimoliy Muz okeani",
                "Tinch okeani"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘zbekistonning poytaxti qaysi shahar?",
                "Toshkent",
                "Buxoro",
                "Samarqand",
                "Andijon",
                "Toshkent"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng katta orol qaysi?",
                "Grenlandiya",
                "Madagaskar",
                "Avstraliya",
                "Baffin oroli",
                "Grenlandiya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Amazonka o‘rmonlari qaysi qit'ada joylashgan?",
                "Janubiy Amerika",
                "Shimoliy Amerika",
                "Afrika",
                "Osiyo",
                "Janubiy Amerika"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘rta Yer dengizi qaysi qit'alar orasida joylashgan?",
                "Yevropa va Afrika",
                "Yevropa va Osiyo",
                "Afrika va Osiyo",
                "Amerika va Osiyo",
                "Yevropa va Afrika"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "Qaysi qit'ada hech bir davlat yo‘q?",
                "Antarktida",
                "Avstraliya",
                "Shimoliy Amerika",
                "Afrika",
                "Antarktida"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng baland sharshara qaysi?",
                "Anxel",
                "Niagara",
                "Iguazu",
                "Viktoriya",
                "Anxel"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Afrika qit'asining eng katta daryosi qaysi?",
                "Nil",
                "Kongo",
                "Zambezi",
                "Limpopo",
                "Nil"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yevropaning eng katta tog‘ tizmasi qaysi?",
                "Alp tog‘lari",
                "Ural tog‘lari",
                "Piriney tog‘lari",
                "Karpat tog‘lari",
                "Alp tog‘lari"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng issiq joy qayer?",
                "O‘lik vodiy, AQSh",
                "Sahara cho‘li",
                "Gobbi cho‘li",
                "Atakama cho‘li",
                "O‘lik vodiy, AQSh"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Arktikada eng yirik muzlik qaysi?",
                "Qrenlandiya muzligi",
                "Ross muzligi",
                "Shimoliy Qutb muzligi",
                "Larsen muzligi",
                "Qrenlandiya muzligi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘zbekistonning eng katta daryosi qaysi?",
                "Amudaryo",
                "Sirdaryo",
                "Zarafshon",
                "Chirchiq",
                "Amudaryo"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yaponiyaning poytaxti qayerda joylashgan?",
                "Tokio",
                "Kyoto",
                "Osaka",
                "Hiroshima",
                "Tokio"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Afrika qit'asining eng katta ko‘li qaysi?",
                "Viktoriya",
                "Tanganika",
                "Malavi",
                "Chad",
                "Viktoriya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyo okeanidagi eng chuqur joy qaysi?",
                "Mariana xiyoboni",
                "Tonga xiyoboni",
                "Java xiyoboni",
                "Filippin xiyoboni",
                "Mariana xiyoboni"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "Fransiyaning eng yirik daryosi qaysi?",
                "Loira",
                "Seine",
                "Rona",
                "Garona",
                "Loira"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi mamlakatning ikki rasmiy poytaxti bor?",
                "Janubiy Afrika",
                "Yaponiya",
                "Xitoy",
                "Braziliya",
                "Janubiy Afrika"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yevropadagi eng uzun daryo qaysi?",
                "Volga",
                "Dunay",
                "Rhein",
                "Seine",
                "Volga"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi mamlakat dunyodagi eng ko‘p orolga ega?",
                "Shvetsiya",
                "Filippin",
                "Malayziya",
                "Indoneziya",
                "Shvetsiya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘zbekiston bilan eng uzun chegaraga ega davlat qaysi?",
                "Qozog‘iston",
                "Tojikiston",
                "Qirg‘iziston",
                "Afg‘oniston",
                "Qozog‘iston"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Hindiston okeanidagi eng katta orol qaysi?",
                "Madagaskar",
                "Shri-Lanka",
                "Maldiv orollari",
                "Komor orollari",
                "Madagaskar"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘zbekistonning eng baland nuqtasi qaysi?",
                "Hazrat Sulton",
                "Aydar",
                "Chimgan",
                "Zarafshon tizmasi",
                "Hazrat Sulton"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Samarqand shahri qaysi daryoning yonida joylashgan?",
                "Zarafshon",
                "Amudaryo",
                "Sirdaryo",
                "Chirchiq",
                "Zarafshon"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Avstraliya materikidagi eng katta cho‘l qaysi?",
                "Buyuk Viktoriya cho‘li",
                "Simpson cho‘li",
                "Tanami cho‘li",
                "Gibson cho‘li",
                "Buyuk Viktoriya cho‘li"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Eng kichik qit'a qaysi?",
                "Avstraliya",
                "Yevropa",
                "Janubiy Amerika",
                "Afrika",
                "Avstraliya"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "O‘zbekiston qaysi materikda joylashgan?",
                "Osiyo",
                "Afrika",
                "Yevropa",
                "Janubiy Amerika",
                "Osiyo"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Orol dengizi qaysi ikki davlat orasida joylashgan?",
                "O‘zbekiston va Qozog‘iston",
                "Qozog‘iston va Tojikiston",
                "Turkmaniston va Qirg‘iziston",
                "Qirg‘iziston va Tojikiston",
                "O‘zbekiston va Qozog‘iston"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi mamlakatda dunyoning eng katta shaharlaridan biri – Mexiko joylashgan?",
                "Meksika",
                "AQSh",
                "Kanada",
                "Kolumbiya",
                "Meksika"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi mamlakat eng ko‘p qo‘shni davlat bilan chegaradosh?",
                "Xitoy",
                "Rossiya",
                "AQSh",
                "Braziliya",
                "Xitoy"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yerdagi eng sovuq joy qaysi?",
                "Vostok stansiyasi",
                "O‘lik vodiy",
                "Sahara cho‘li",
                "Cherskiy cho‘qqisi",
                "Vostok stansiyasi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi daryo Shimoliy Amerika orqali oqib o‘tadi?",
                "Mississippi",
                "Amazonka",
                "Nil",
                "Volga",
                "Mississippi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng baland tog‘ tizmasi qaysi?",
                "Gimalay",
                "And tog‘lari",
                "Rocky tog‘lari",
                "Ural tog‘lari",
                "Gimalay"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng katta ichki dengiz qaysi?",
                "Kaspiy dengizi",
                "O‘lik dengiz",
                "Qora dengiz",
                "Qizil dengiz",
                "Kaspiy dengizi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Janubiy Amerikaning eng uzun tog‘ tizmasi qaysi?",
                "And tog‘lari",
                "Alp tog‘lari",
                "Himalay",
                "Atlas tog‘lari",
                "And tog‘lari"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng quruq cho‘l qaysi?",
                "Atakama cho‘li",
                "Sahara",
                "Kalahari",
                "Gobi",
                "Atakama cho‘li"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Shimoliy Amerikadagi eng katta ko‘l qaysi?",
                "Yuqori ko‘l",
                "Michigan ko‘li",
                "Eri ko‘li",
                "Huron ko‘li",
                "Yuqori ko‘l"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yer kurrasining eng baland nuqtasi qaysi?",
                "Everest",
                "K2",
                "Makalu",
                "Kangchenjunga",
                "Everest"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Qaysi daryo dunyodagi eng keng daryo hisoblanadi?",
                "Amazonka",
                "Nil",
                "Mississippi",
                "Volga",
                "Amazonka"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Afrikaning eng shimoliy davlat qaysi?",
                "Tunis",
                "Marokash",
                "Liviya",
                "Misr",
                "Tunis"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Italiyadagi mashhur vulqon qaysi?",
                "Vezuviy",
                "Etna",
                "Stromboli",
                "Krakatau",
                "Vezuviy"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yer yuzida jami necha qit'a mavjud?",
                "7",
                "5",
                "6",
                "8",
                "7"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Afrikadagi eng katta davlat maydoni bo‘yicha qaysi?",
                "Cezayir",
                "Misr",
                "Sudan",
                "Liviya",
                "Cezayir"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Hindistondagi eng katta shahar qaysi?",
                "Mumbay",
                "Deli",
                "Kalkutta",
                "Chennai",
                "Mumbay"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "Xitoydagi eng uzun daryo qaysi?",
                "Yangtzi",
                "Xuangxe",
                "Mekong",
                "Ganges",
                "Yangtzi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Avstraliyaning poytaxti qaysi shahar?",
                "Kanberra",
                "Sidney",
                "Melburn",
                "Perth",
                "Kanberra"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Amerika Qo‘shma Shtatlarining eng g‘arbiy shtati qaysi?",
                "Alyaska",
                "Gavaii",
                "Kaliforniya",
                "Oregon",
                "Alyaska"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yer yuzining eng past nuqtasi qaysi?",
                "O‘lik dengiz",
                "Mariana xiyoboni",
                "Kaspiy dengizi",
                "Chiko kuyi",
                "O‘lik dengiz"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘rta Osiyodagi eng uzun daryo qaysi?",
                "Amudaryo",
                "Sirdaryo",
                "Zarafshon",
                "Murg‘ob",
                "Amudaryo"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Fransiyaning eng baland tog‘i qaysi?",
                "Mont Blan",
                "Voge tog‘lari",
                "Jura tog‘lari",
                "Sever tog‘lari",
                "Mont Blan"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Tinch okeanidagi eng katta orol qaysi?",
                "Yangi Gvineya",
                "Tasmaniya",
                "Filippin",
                "Fiji",
                "Yangi Gvineya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Ispaniyadagi eng uzun daryo qaysi?",
                "Ebro",
                "Tajo",
                "Duero",
                "Guadalquivir",
                "Ebro"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng katta ko‘rfaz qaysi?",
                "Bengal ko‘rfazi",
                "Meksika ko‘rfazi",
                "Pers ko‘rfazi",
                "Hudson ko‘rfazi",
                "Bengal ko‘rfazi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Dunyodagi eng sovuq mamlakat qaysi?",
                "Rossiya",
                "Kanada",
                "Norvegiya",
                "AQSh",
                "Rossiya"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "Afrikaning eng janubiy nuqtasi qaysi?",
                "Yaxshi umid burni",
                "Orange daryosi",
                "Namib cho‘li",
                "Madagaskar oroli",
                "Yaxshi umid burni"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Osiyodagi eng uzun daryo qaysi?",
                "Yangtzi",
                "Indus",
                "Brahmaputra",
                "Ganges",
                "Yangtzi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yaponiyadagi eng baland tog‘ qaysi?",
                "Fuji",
                "Kamikochi",
                "Asama",
                "Mitake",
                "Fuji"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Moskva qaysi daryo bo‘yida joylashgan?",
                "Moskva daryosi",
                "Volga",
                "Don",
                "Ladoga",
                "Moskva daryosi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "AQShning eng ko‘p aholi yashaydigan shahri qaysi?",
                "Nyu-York",
                "Los-Anjeles",
                "Chicago",
                "Dallas",
                "Nyu-York"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yer yuzidagi eng kichik davlat qaysi?",
                "Vatikan",
                "San Marino",
                "Lixtenshteyn",
                "Malta",
                "Vatikan"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Eng baland suv ostonasi qaysi mamlakatda joylashgan?",
                "Venezuela",
                "Braziliya",
                "Kanada",
                "Norvegiya",
                "Venezuela"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Sibirning eng katta ko‘li qaysi?",
                "Baykal",
                "O‘rt ko‘li",
                "Ladoga",
                "Onega",
                "Baykal"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Afrika qit'asidagi eng uzun tog‘ tizmasi qaysi?",
                "Atlas tog‘lari",
                "Simen tog‘lari",
                "Drakensberg",
                "Kamerun tog‘lari",
                "Atlas tog‘lari"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Janubiy Amerikaning eng katta ko‘li qaysi?",
                "Marakaybo",
                "Titikaka",
                "Poopo",
                "Junin",
                "Marakaybo"
            )
        )

        questionsGeografiya.add(
            QuestionData(
                "Osiyodagi eng katta davlat maydoni bo‘yicha qaysi?",
                "Rossiya",
                "Xitoy",
                "Hindiston",
                "Qozog‘iston",
                "Rossiya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Eng katta quruqlikdagi suv ombori qaysi?",
                "Kaspiy dengizi",
                "Orol dengizi",
                "O‘lik dengiz",
                "Baykal",
                "Kaspiy dengizi"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Aralash qit'a qanday ataladi?",
                "Euraziya",
                "Amerika",
                "Afrika",
                "Avstraliya",
                "Euraziya"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "O‘zbekistondagi eng katta cho‘l qaysi?",
                "Qizilqum",
                "Qo‘ng‘irot",
                "Mujunkum",
                "Barsakelmes",
                "Qizilqum"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Janubiy Amerika qit'asidagi eng baland tog‘ cho‘qqisi qaysi?",
                "Akonkagua",
                "Orizaba",
                "Illimani",
                "Kilimanjaro",
                "Akonkagua"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yerdagi eng baland sho‘rlangan ko‘l qaysi?",
                "O‘lik dengiz",
                "Baykal",
                "Tanganika",
                "Marakaybo",
                "O‘lik dengiz"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yaponiyadagi eng uzun daryo qaysi?",
                "Shinano",
                "Tone",
                "Yodo",
                "Kiso",
                "Shinano"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Eng yirik qum sahrosi bo‘lgan qit'a qaysi?",
                "Afrika",
                "Osiyo",
                "Avstraliya",
                "Janubiy Amerika",
                "Afrika"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Hindiston yarimoroli qanday tog‘ tizmasi bilan ajralib turadi?",
                "Gimalay",
                "Piriney",
                "And",
                "Appalachian",
                "Gimalay"
            )
        )
        questionsGeografiya.add(
            QuestionData(
                "Yer yuzida nechta vaqt zonasi mavjud?",
                "24",
                "12",
                "36",
                "18",
                "24"
            )
        )

    }

    private fun loadChallengingRussianQuestions() {
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Salom' so‘zi qanday aytiladi?",
                "Привет",
                "Здравствуйте",
                "Пока",
                "До свидания",
                "Привет"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Rahmat' qanday aytiladi?",
                "Спасибо",
                "Пожалуйста",
                "Здравствуйте",
                "Извините",
                "Спасибо"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilidagi eng ommabop so‘zlardan biri qanday?",
                "Да",
                "Нет",
                "Кто",
                "Что",
                "Да"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Xayr' qanday aytiladi?",
                "Пока",
                "Здравствуйте",
                "До свидания",
                "Привет",
                "До свидания"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Menimcha' qanday aytiladi?",
                "Я думаю",
                "Я знаю",
                "Мне кажется",
                "Я уверен",
                "Я думаю"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'U' so‘zi qanday aytiladi?",
                "Он",
                "Она",
                "Оно",
                "Вы",
                "Он"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yoz' so‘zi qanday aytiladi?",
                "Лето",
                "Осень",
                "Зима",
                "Весна",
                "Лето"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yurak' qanday aytiladi?",
                "Сердце",
                "Душа",
                "Жизнь",
                "Мир",
                "Сердце"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Uchrashuv' qanday aytiladi?",
                "Встреча",
                "Собрание",
                "Переговоры",
                "Беседа",
                "Встреча"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Bilmadim' qanday aytiladi?",
                "Я не знаю",
                "Я думаю",
                "Я не уверен",
                "Мне кажется",
                "Я не знаю"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ota' qanday aytiladi?",
                "Отец",
                "Папа",
                "Дедушка",
                "Сын",
                "Отец"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ona' qanday aytiladi?",
                "Мать",
                "Мама",
                "Бабушка",
                "Сестра",
                "Мама"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kitob' qanday aytiladi?",
                "Книга",
                "Тетрадь",
                "Журнал",
                "Блокнот",
                "Книга"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Suv' qanday aytiladi?",
                "Вода",
                "Чай",
                "Кофе",
                "Сок",
                "Вода"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yozuvchi' qanday aytiladi?",
                "Писатель",
                "Автор",
                "Редактор",
                "Поэт",
                "Писатель"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Pochta' qanday aytiladi?",
                "Почта",
                "Телефон",
                "Факс",
                "Электронная почта",
                "Почта"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Gul' qanday aytiladi?",
                "Цветок",
                "Растение",
                "Дерево",
                "Трава",
                "Цветок"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Eshik' qanday aytiladi?",
                "Дверь",
                "Окно",
                "Стенка",
                "Пол",
                "Дверь"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yoz' qanday aytiladi?",
                "Писать",
                "Читать",
                "Слушать",
                "Говорить",
                "Писать"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Boshqa' qanday aytiladi?",
                "Другой",
                "Новый",
                "Старый",
                "Первый",
                "Другой"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ajoyib' qanday aytiladi?",
                "Замечательный",
                "Хороший",
                "Плохой",
                "Красивый",
                "Замечательный"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ona yer' qanday aytiladi?",
                "Матушка-земля",
                "Отец",
                "Мать",
                "Сын",
                "Матушка-земля"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ertalab' qanday aytiladi?",
                "Утро",
                "Вечер",
                "Ночь",
                "День",
                "Утро"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Tug‘ilgan kun' qanday aytiladi?",
                "День рождения",
                "Праздник",
                "Свадьба",
                "Торжество",
                "День рождения"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Chiroyli' qanday aytiladi?",
                "Красивый",
                "Умный",
                "Смешной",
                "Добрый",
                "Красивый"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kichik' qanday aytiladi?",
                "Маленький",
                "Большой",
                "Средний",
                "Длинный",
                "Маленький"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yosh' qanday aytiladi?",
                "Возраст",
                "Молодость",
                "Старость",
                "Детство",
                "Возраст"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yurish' qanday aytiladi?",
                "Идти",
                "Бежать",
                "Сидеть",
                "Лететь",
                "Идти"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Odam' qanday aytiladi?",
                "Человек",
                "Люди",
                "Дети",
                "Друзья",
                "Человек"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Hayvon' qanday aytiladi?",
                "Животное",
                "Человек",
                "Птица",
                "Рыба",
                "Животное"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Nima?' qanday aytiladi?",
                "Что?",
                "Кто?",
                "Когда?",
                "Почему?",
                "Что?"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qayerda?' qanday aytiladi?",
                "Где?",
                "Когда?",
                "Как?",
                "Почему?",
                "Где?"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qachon?' qanday aytiladi?",
                "Когда?",
                "Где?",
                "Как?",
                "Почему?",
                "Когда?"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qanday?' qanday aytiladi?",
                "Какой?",
                "Как?",
                "Когда?",
                "Почему?",
                "Какой?"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O‘qish' qanday aytiladi?",
                "Учеба",
                "Работа",
                "Жизнь",
                "Отдых",
                "Учеба"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yozmoq' qanday aytiladi?",
                "Писать",
                "Читать",
                "Слушать",
                "Говорить",
                "Писать"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O‘ynash' qanday aytiladi?",
                "Играть",
                "Работать",
                "Смотреть",
                "Слушать",
                "Играть"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Chiqmoq' qanday aytiladi?",
                "Выходить",
                "Входить",
                "Бежать",
                "Лететь",
                "Выходить"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ko‘rmoq' qanday aytiladi?",
                "Смотреть",
                "Слышать",
                "Читать",
                "Говорить",
                "Смотреть"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O‘ta' qanday aytiladi?",
                "Слишком",
                "Мало",
                "Много",
                "Чуть",
                "Слишком"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yana' qanday aytiladi?",
                "Снова",
                "Опять",
                "Еще",
                "Вновь",
                "Снова"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Dars' qanday aytiladi?",
                "Урок",
                "Занятие",
                "Курс",
                "Лекция",
                "Урок"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Tushunmoq' qanday aytiladi?",
                "Понимать",
                "Знать",
                "Уметь",
                "Хотеть",
                "Понимать"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kurs' qanday aytiladi?",
                "Курс",
                "Занятие",
                "Урок",
                "Класс",
                "Курс"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yosh' qanday aytiladi?",
                "Возраст",
                "Год",
                "Месяц",
                "Неделя",
                "Возраст"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Maktab' qanday aytiladi?",
                "Школа",
                "Университет",
                "Курс",
                "Гимназия",
                "Школа"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qiz' qanday aytiladi?",
                "Девушка",
                "Женщина",
                "Мать",
                "Сестра",
                "Девушка"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yigit' qanday aytiladi?",
                "Парень",
                "Мужчина",
                "Брат",
                "Сын",
                "Парень"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O‘qituvchi' qanday aytiladi?",
                "Учитель",
                "Преподаватель",
                "Студент",
                "Школьник",
                "Учитель"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Talaba' qanday aytiladi?",
                "Студент",
                "Ученик",
                "Учитель",
                "Курсант",
                "Студент"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kelib chiqmoq' qanday aytiladi?",
                "Происходить",
                "Приходить",
                "Уходить",
                "Возвращаться",
                "Происходить"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Uy' qanday aytiladi?",
                "Дом",
                "Квартира",
                "Студия",
                "Офис",
                "Дом"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qor' qanday aytiladi?",
                "Снег",
                "Дождь",
                "Солнечно",
                "Ветер",
                "Снег"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kechki ovqat' qanday aytiladi?",
                "Ужин",
                "Завтрак",
                "Обед",
                "Полдник",
                "Ужин"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Oziq-ovqat' qanday aytiladi?",
                "Еда",
                "Продукты",
                "Вкус",
                "Блюдо",
                "Еда"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kuz' qanday aytiladi?",
                "Осень",
                "Зима",
                "Лето",
                "Весна",
                "Осень"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yoz' qanday aytiladi?",
                "Лето",
                "Весна",
                "Осень",
                "Зима",
                "Лето"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Bahor' qanday aytiladi?",
                "Весна",
                "Лето",
                "Осень",
                "Зима",
                "Весна"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yil' qanday aytiladi?",
                "Год",
                "Месяц",
                "Неделя",
                "День",
                "Год"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Boshqa' qanday aytiladi?",
                "Другой",
                "Первый",
                "Последний",
                "Третий",
                "Другой"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Oq' qanday aytiladi?",
                "Белый",
                "Черный",
                "Красный",
                "Синий",
                "Белый"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qora' qanday aytiladi?",
                "Черный",
                "Белый",
                "Красный",
                "Зеленый",
                "Черный"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yashil' qanday aytiladi?",
                "Зеленый",
                "Синий",
                "Красный",
                "Белый",
                "Зеленый"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qizil' qanday aytiladi?",
                "Красный",
                "Синий",
                "Зеленый",
                "Белый",
                "Красный"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Juda' qanday aytiladi?",
                "Очень",
                "Много",
                "Мало",
                "Немного",
                "Очень"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Har qanday' qanday aytiladi?",
                "Любой",
                "Некоторые",
                "Никто",
                "Все",
                "Любой"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ma'lumot' qanday aytiladi?",
                "Информация",
                "Данные",
                "Знания",
                "Факты",
                "Информация"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yana' qanday aytiladi?",
                "Снова",
                "Еще",
                "Опять",
                "Вновь",
                "Снова"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kichkina' qanday aytiladi?",
                "Маленький",
                "Большой",
                "Средний",
                "Старый",
                "Маленький"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Katta' qanday aytiladi?",
                "Большой",
                "Маленький",
                "Старый",
                "Новый",
                "Большой"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Aql' qanday aytiladi?",
                "Ум",
                "Мудрость",
                "Интеллект",
                "Знание",
                "Ум"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Diyora' qanday aytiladi?",
                "Страна",
                "Город",
                "Село",
                "Регион",
                "Страна"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yoz' qanday aytiladi?",
                "Писать",
                "Читать",
                "Говорить",
                "Слушать",
                "Писать"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Havoning' qanday aytiladi?",
                "Погода",
                "Климат",
                "Солнце",
                "Дождь",
                "Погода"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Tafsilotlar' qanday aytiladi?",
                "Детали",
                "Информация",
                "Факты",
                "Данные",
                "Детали"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Raqam' qanday aytiladi?",
                "Число",
                "Количество",
                "Счет",
                "Данные",
                "Число"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Mavzu' qanday aytiladi?",
                "Тема",
                "Вопрос",
                "Тема",
                "Идея",
                "Тема"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Savol' qanday aytiladi?",
                "Вопрос",
                "Ответ",
                "Задание",
                "Тема",
                "Вопрос"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Bajarmoq' qanday aytiladi?",
                "Выполнять",
                "Делать",
                "Работать",
                "Слушать",
                "Выполнять"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Uzoq' qanday aytiladi?",
                "Далеко",
                "Близко",
                "Недалеко",
                "Скоро",
                "Далеко"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Qo'shimcha' qanday aytiladi?",
                "Дополнительный",
                "Основной",
                "Главный",
                "Новый",
                "Дополнительный"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Tugadi' qanday aytiladi?",
                "Закончено",
                "Начато",
                "Продолжается",
                "Ничего",
                "Закончено"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Kelajak' qanday aytiladi?",
                "Будущее",
                "Прошлое",
                "Настоящее",
                "Время",
                "Будущее"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O'zgartirmoq' qanday aytiladi?",
                "Изменять",
                "Создавать",
                "Проверять",
                "Участвовать",
                "Изменять"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Xabar' qanday aytiladi?",
                "Сообщение",
                "Письмо",
                "Доклад",
                "Заметка",
                "Сообщение"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'O'yin' qanday aytiladi?",
                "Игра",
                "Спорт",
                "Досуг",
                "Развлечение",
                "Игра"
            )
        )

        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Tug‘ilgan kun' qanday aytiladi?",
                "День рождения",
                "Праздник",
                "Свадьба",
                "Торжество",
                "День рождения"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Shahar' qanday aytiladi?",
                "Город",
                "Село",
                "Деревня",
                "Страна",
                "Город"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Yurt' qanday aytiladi?",
                "Родина",
                "Страна",
                "Село",
                "Город",
                "Родина"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Dunyo' qanday aytiladi?",
                "Мир",
                "Страна",
                "Глобус",
                "Земля",
                "Мир"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Ish' qanday aytiladi?",
                "Работа",
                "Урок",
                "Занятие",
                "Курс",
                "Работа"
            )
        )
        questionsRustili.add(
            QuestionData(
                "Rus tilida 'Quyosh' qanday aytiladi?",
                "Солнце",
                "Луна",
                "Звезда",
                "Планета",
                "Солнце"
            )
        )


    }

    private fun loadChallengingEnglishQuestions() {
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kitap' so'zining tarjimasi nima?",
                "Book",
                "Pen",
                "Paper",
                "Table",
                "Book"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'maktab' so'zining tarjimasi nima?",
                "School",
                "University",
                "College",
                "Library",
                "School"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'o'qituvchi' so'zining tarjimasi nima?",
                "Teacher",
                "Student",
                "Principal",
                "Classmate",
                "Teacher"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'talaba' so'zining tarjimasi nima?",
                "Student",
                "Teacher",
                "Class",
                "Lesson",
                "Student"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yurt' so'zining tarjimasi nima?",
                "Homeland",
                "Country",
                "City",
                "Village",
                "Homeland"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'dunyo' so'zining tarjimasi nima?",
                "World",
                "Country",
                "Universe",
                "Earth",
                "World"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qiz' so'zining tarjimasi nima?",
                "Girl",
                "Woman",
                "Mother",
                "Sister",
                "Girl"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yigit' so'zining tarjimasi nima?",
                "Boy",
                "Man",
                "Brother",
                "Son",
                "Boy"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'ovqat' so'zining tarjimasi nima?",
                "Food",
                "Drink",
                "Meal",
                "Snack",
                "Food"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'boshqa' so'zining tarjimasi nima?",
                "Other",
                "Another",
                "Some",
                "All",
                "Other"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qora' so'zining tarjimasi nima?",
                "Black",
                "White",
                "Red",
                "Green",
                "Black"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'oq' so'zining tarjimasi nima?",
                "White",
                "Black",
                "Red",
                "Green",
                "White"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yashil' so'zining tarjimasi nima?",
                "Green",
                "Blue",
                "Red",
                "White",
                "Green"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qizil' so'zining tarjimasi nima?",
                "Red",
                "Blue",
                "Green",
                "Yellow",
                "Red"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kattalik' so'zining tarjimasi nima?",
                "Size",
                "Dimension",
                "Measurement",
                "Proportion",
                "Size"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kichkina' so'zining tarjimasi nima?",
                "Small",
                "Big",
                "Medium",
                "Old",
                "Small"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'ma'lumot' so'zining tarjimasi nima?",
                "Information",
                "Data",
                "Knowledge",
                "Fact",
                "Information"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'keling' so'zining tarjimasi nima?",
                "Come",
                "Go",
                "Stay",
                "Leave",
                "Come"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'sayt' so'zining tarjimasi nima?",
                "Website",
                "Site",
                "Page",
                "Blog",
                "Website"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'tugadi' so'zining tarjimasi nima?",
                "Finished",
                "Started",
                "Continuing",
                "Nothing",
                "Finished"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yil' so'zining tarjimasi nima?",
                "Year",
                "Month",
                "Week",
                "Day",
                "Year"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kuz' so'zining tarjimasi nima?",
                "Autumn",
                "Winter",
                "Summer",
                "Spring",
                "Autumn"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'bahor' so'zining tarjimasi nima?",
                "Spring",
                "Summer",
                "Autumn",
                "Winter",
                "Spring"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yoz' so'zining tarjimasi nima?",
                "Summer",
                "Winter",
                "Autumn",
                "Spring",
                "Summer"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'har qanday' so'zining tarjimasi nima?",
                "Any",
                "Some",
                "None",
                "All",
                "Any"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'diyora' so'zining tarjimasi nima?",
                "Region",
                "Country",
                "City",
                "Village",
                "Region"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'shahar' so'zining tarjimasi nima?",
                "City",
                "Town",
                "Village",
                "Country",
                "City"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kelajak' so'zining tarjimasi nima?",
                "Future",
                "Past",
                "Present",
                "Time",
                "Future"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'ko'rmoq' so'zining tarjimasi nima?",
                "To see",
                "To watch",
                "To look",
                "To observe",
                "To see"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'tekin' so'zining tarjimasi nima?",
                "Free",
                "Cheap",
                "Expensive",
                "Costly",
                "Free"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qo'shimcha' so'zining tarjimasi nima?",
                "Additional",
                "Main",
                "Primary",
                "New",
                "Additional"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'o'yin' so'zining tarjimasi nima?",
                "Game",
                "Sport",
                "Activity",
                "Play",
                "Game"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'xabar' so'zining tarjimasi nima?",
                "Message",
                "Letter",
                "Report",
                "Note",
                "Message"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'ko'k' so'zining tarjimasi nima?",
                "Blue",
                "Green",
                "Red",
                "Yellow",
                "Blue"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qiz' so'zining tarjimasi nima?",
                "Girl",
                "Lady",
                "Mother",
                "Sister",
                "Girl"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'salom' so'zining tarjimasi nima?",
                "Hello",
                "Goodbye",
                "Thank you",
                "Please",
                "Hello"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'dost' so'zining tarjimasi nima?",
                "Friend",
                "Enemy",
                "Stranger",
                "Acquaintance",
                "Friend"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qor' so'zining tarjimasi nima?",
                "Snow",
                "Rain",
                "Sun",
                "Wind",
                "Snow"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'shamol' so'zining tarjimasi nima?",
                "Wind",
                "Storm",
                "Breeze",
                "Air",
                "Wind"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'quyosh' so'zining tarjimasi nima?",
                "Sun",
                "Moon",
                "Star",
                "Planet",
                "Sun"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kechki ovqat' so'zining tarjimasi nima?",
                "Dinner",
                "Breakfast",
                "Lunch",
                "Snack",
                "Dinner"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'tezlik' so'zining tarjimasi nima?",
                "Speed",
                "Velocity",
                "Pace",
                "Quickness",
                "Speed"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qanday' so'zining tarjimasi nima?",
                "How",
                "What",
                "Where",
                "When",
                "How"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'nima' so'zining tarjimasi nima?",
                "What",
                "Which",
                "Who",
                "When",
                "What"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'bilmadim' so'zining tarjimasi nima?",
                "I didn't know",
                "I don't know",
                "I know",
                "I will know",
                "I didn't know"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'bilish' so'zining tarjimasi nima?",
                "To know",
                "To understand",
                "To see",
                "To hear",
                "To know"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'o'zgartirmoq' so'zining tarjimasi nima?",
                "To change",
                "To create",
                "To check",
                "To participate",
                "To change"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'bilan' so'zining tarjimasi nima?",
                "With",
                "And",
                "By",
                "For",
                "With"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'va' so'zining tarjimasi nima?",
                "And",
                "Or",
                "But",
                "So",
                "And"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'birinchi' so'zining tarjimasi nima?",
                "First",
                "Second",
                "Third",
                "Last",
                "First"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'oxirgi' so'zining tarjimasi nima?",
                "Last",
                "First",
                "Next",
                "Previous",
                "Last"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'barcha' so'zining tarjimasi nima?",
                "All",
                "Some",
                "Many",
                "Few",
                "All"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yol' so'zining tarjimasi nima?",
                "Road",
                "Path",
                "Way",
                "Street",
                "Road"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yo'l' so'zining tarjimasi nima?",
                "Path",
                "Route",
                "Way",
                "Trail",
                "Path"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'ko'rsatmoq' so'zining tarjimasi nima?",
                "To show",
                "To tell",
                "To teach",
                "To explain",
                "To show"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'chiroyli' so'zining tarjimasi nima?",
                "Beautiful",
                "Pretty",
                "Lovely",
                "Cute",
                "Beautiful"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'quyosh' so'zining tarjimasi nima?",
                "Sun",
                "Star",
                "Planet",
                "Moon",
                "Sun"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'oy' so'zining tarjimasi nima?",
                "Moon",
                "Sun",
                "Star",
                "Planet",
                "Moon"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'piyoda' so'zining tarjimasi nima?",
                "On foot",
                "By car",
                "By bus",
                "By train",
                "On foot"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'masala' so'zining tarjimasi nima?",
                "Problem",
                "Solution",
                "Task",
                "Question",
                "Problem"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'rahmat' so'zining tarjimasi nima?",
                "Thank you",
                "Welcome",
                "Please",
                "Sorry",
                "Thank you"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'xat' so'zining tarjimasi nima?",
                "Letter",
                "Message",
                "Note",
                "Document",
                "Letter"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qog'oz' so'zining tarjimasi nima?",
                "Paper",
                "Card",
                "Sheet",
                "Document",
                "Paper"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'stol' so'zining tarjimasi nima?",
                "Table",
                "Chair",
                "Desk",
                "Shelf",
                "Table"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kursi' so'zining tarjimasi nima?",
                "Chair",
                "Table",
                "Desk",
                "Sofa",
                "Chair"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'kompyuter' so'zining tarjimasi nima?",
                "Computer",
                "Laptop",
                "Tablet",
                "Phone",
                "Computer"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yig' so'zining tarjimasi nima?",
                "To cry",
                "To laugh",
                "To shout",
                "To whisper",
                "To cry"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yuqorida' so'zining tarjimasi nima?",
                "Above",
                "Below",
                "On",
                "Under",
                "Above"
            )
        )

        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qizg'in' so'zining tarjimasi nima?",
                "Hot",
                "Cold",
                "Warm",
                "Cool",
                "Hot"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'salqin' so'zining tarjimasi nima?",
                "Cool",
                "Warm",
                "Hot",
                "Freezing",
                "Cool"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yomg'ir' so'zining tarjimasi nima?",
                "Rain",
                "Snow",
                "Sunshine",
                "Storm",
                "Rain"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'sovuq' so'zining tarjimasi nima?",
                "Cold",
                "Hot",
                "Warm",
                "Cool",
                "Cold"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'oq' so'zining tarjimasi nima?",
                "White",
                "Black",
                "Red",
                "Green",
                "White"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'yo'l' so'zining tarjimasi nima?",
                "Way",
                "Path",
                "Route",
                "Track",
                "Way"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qalam' so'zining tarjimasi nima?",
                "Pen",
                "Pencil",
                "Marker",
                "Crayon",
                "Pen"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'sport' so'zining tarjimasi nima?",
                "Sport",
                "Game",
                "Activity",
                "Exercise",
                "Sport"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'qora' so'zining tarjimasi nima?",
                "Black",
                "White",
                "Red",
                "Yellow",
                "Black"
            )
        )
        questionsInglisTili.add(
            QuestionData(
                "Ingliz tilida 'tug'ilgan kun' so'zining tarjimasi nima?",
                "Birthday",
                "Anniversary",
                "Celebration",
                "Event",
                "Birthday"
            )
        )


    }


    private fun initCategory() {
        categoryList.add(CategoryData("Matematika", R.drawable.ic_math))
        categoryList.add(CategoryData("Ona - tili", R.drawable.ic_ona_tili))
        categoryList.add(CategoryData("Fizika", R.drawable.ic_fizika))
        categoryList.add(CategoryData("Bilogiya", R.drawable.ic_biology2))
        categoryList.add(CategoryData("Kimyo", R.drawable.ic_kimyo))
        categoryList.add(CategoryData("Tarix Uzb", R.drawable.ic_history))
        categoryList.add(CategoryData("Geografiya", R.drawable.ic_geography))
        categoryList.add(CategoryData("Rus - tili", R.drawable.ic_language))
        categoryList.add(CategoryData("Inglis tili", R.drawable.ic_language))
        loadChallengingMathQuestions()
        loadChallengingOnaTiliQuestions()
        loadChallengingPhysicsQuestions()
        loadChallengingBiologyQuestions()
        loadChallengingKimyoQuestions()
        loadChallengingHistoryUzbQuestions()
        loadChallengingGeografiyaQuestions()
        loadChallengingRussianQuestions()
        loadChallengingEnglishQuestions()
    }


    private fun initUserData() {
        clearUserList()
        for (i in 0 until questions.size) {
            insertUser(
                UserQuestionData(
                    questions[i].question,
                    questions[i].variant1,
                    questions[i].variant2,
                    questions[i].variant3,
                    questions[i].variant4,
                    questions[i].answer,
                    -1,
                    i
                )
            )
        }

        Log.d("JJJJJJ", "insertUser List:   $questionUserQuestionData")
    }

    fun getAllCategoryList(): List<CategoryData> {
        if (questions.isEmpty()) {
            initCategory()
        }
        return categoryList
    }

    private fun insertUser(userQuestionData: UserQuestionData) {
        questionUserQuestionData.add(userQuestionData)
    }

    fun clearUserList() {
        questionUserQuestionData = arrayListOf()
    }

    fun insertUserByIndex(userQuestionData: UserQuestionData, index: Int) {
        questionUserQuestionData[index] = userQuestionData
    }

    fun fanNomi(): String {
        return fanNomi!!
    }

    fun getAllUserQuestion(): List<UserQuestionData> {
        if (questionUserQuestionData.isEmpty()) {
            initUserData()
        }
        return questionUserQuestionData
    }

    fun getUserQuestion(index: Int): UserQuestionData {
        if (getAllUserQuestion().isEmpty()) {
            initUserData()
        }
        return questionUserQuestionData[index]
    }

    fun getConsQuestionList(): List<QuestionData> = Constants.questionsListConstants
    fun setConsQuestionList(list: List<QuestionData>) {
        Constants.questionsListConstants.clear()
        Constants.questionsListConstants.addAll(list)
    }

    fun getUserConsQuestionList(): List<UserQuestionData> = Constants.userQuestionsUserListConstants
    fun setUserConsQuestionList(list: List<UserQuestionData>) {
        Constants.userQuestionsUserListConstants.clear()
        Constants.userQuestionsUserListConstants.addAll(list)
    }
}