package jp.ac.it_college.std.s22008.listviewreplacesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s22008.listviewreplacesample.databinding.ActivityMainBinding
import java.sql.Driver

class MainActivity(
    var layoutManeger: LinearLayoutManager,
    val savedInstanceState: Bundle?,
    var adapter: MenuListAdapter
) : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var menuList = mutableListOf(
            "から揚げ定食",
            "ハンバーグ定食",
            "生姜焼き定食",
            "ステーキ定食",
            "野菜炒め定食",
            "とんかつ定食",
            "ミンチかつ定食",
            "チキンカツ定食",
            "コロッケ定食",
            "回鍋肉定食",
            "麻婆豆腐定食",
            "青椒肉絲定食",
            "八宝菜定食",
            "酢豚定食",
            "豚の角煮定食",
            "焼き鳥定食",
            "焼き魚定食",
            "焼肉定食",
        )

        binding.rvMenu.apply {  }
        val  linearLayoutManager = LinearLayoutManager(this@MainActivity)
        layoutManeger = LinearLayoutManager(this@MainActivity)
        adapter = MenuListAdapter(menuList)
        addItemDecoration(
            DividerItemDecorationerItemDecoration(

            )
        ) (this@MainActivity,linerLayoutManeger.orientation)

    }
}


