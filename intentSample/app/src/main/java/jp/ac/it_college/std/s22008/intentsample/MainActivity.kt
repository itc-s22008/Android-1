package jp.ac.it_college.std.s22008.intentsample

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s22008.intentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var biding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}