package jp.ac.it_college.std.s22008.menusample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class menu (
    val name: String,
    val price: Int,
    val desk: String
        )

val teishokuList = listOf<>(
    Menu("から揚げ定食", 800)
            Menu("ハンバーグ定食", 850)
            Menu("生姜焼き定食", 850)
            Menu("ステーキ定食", 1000)
            Menu("野菜炒め定食", 750)
            Menu("とんかつ定食", 900)
            Menu("ミンチカツ定食", 850)
            Menu("チキンカツ定食", 900)
            Menu("コロッケ定食", 850)
            Menu("回鍋肉食", 750)
            Menu("麻婆豆腐定食", 800)
            Menu("青椒肉絲定食", 900)
            Menu("焼き魚定食", 850)
            Menu("焼き肉定食", 950)
)






)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}