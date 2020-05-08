package jp.ac.titech.itpro.sdl.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun greet(v: View) {
        val name = input_name.text.trim()
        if (name.isNotEmpty()) {
            output_view.text = "Hello $name!\nNice to see you!"
        }
    }
}
