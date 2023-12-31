package jp.ac.it_college.std.s22008.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import jp.ac.it_college.std.s22008.listviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lvMenu.onItemClickListener = ListItemClickListener()
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val item = parent?.getItemAtPosition(position) as String
            val show = "あなたが選んだ定食: $item"
            val lvMenu = findViewById<ListView>(R.id.lvMenu)
            lvMenu.onItemClickListener = ListItemClickListener()
            Toast.makeText(this@MainActivity, show, Toast.LENGTH_LONG).show()

        }
    }
}