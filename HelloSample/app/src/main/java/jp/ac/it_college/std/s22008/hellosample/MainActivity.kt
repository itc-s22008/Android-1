package jp.ac.it_college.std.s22008.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタン
        val btClick = findViewById<Button>(R.id.btClick)

        //リスナクラスにインタンス
        val listener = HelloLIstner()

        //ボタンにリスナ
        btClick.setOnClickListener(listener)
    }

    private inner class HelloLIstner: View.OnClickListener {
        override fun onClick(v: View?) {
            //名前記入欄
            val input = findViewById<EditText>(R.id.etName)

            //メッセージのオブジェクト
            val output = findViewById<TextView>(R.id.tvOutput)

            //名前文字列
            val inputStr = input.text.toString()

            //メッセージ表示
            output.text = inputStr + "さん、こんにちは!"



        }

    }
}