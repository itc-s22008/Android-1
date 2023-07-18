package jp.ac.it_college.std.s22008.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22008.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //を使い画面作成
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Binding クラスインタンス生成
        binding = ActivityMainBinding.inflate(layoutInflater)

        //管理されたものを使う
        setContentView(R.layout.activity_main)
        setContentView(binding.root)


        //ボタン
        //val btClick = findViewById<Button>(R.id.btClick)

        //リスナクラスにインタンス
        val listener = HelloLIstner()

        //ボタンにリスナ
        binding.btClick.setOnClickListener(listener)
    }

    private inner class HelloLIstner: View.OnClickListener {
        override fun onClick(v: View?) {
            //名前記入欄
            //val input = findViewById<EditText>(R.id.etName)
            val input = binding.etName

            //メッセージのオブジェクト
            val output = binding.tvOutput

            //名前文字列
            //val inputStr = input.text.toString()
            val inputStr = binding.etName.text.toString()

            //メッセージ表示
            //output.text = inputStr + "さん、こんにちは!"
            binding.tvOutput.text = "${inputStr}さん、こんにちは"



        }

    }
}