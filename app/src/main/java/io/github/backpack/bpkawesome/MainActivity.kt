package io.github.backpack.bpkawesome

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.textView
import android.media.TimedText
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sohowToast(view: View){
        Toast.makeText(this, "Hello, World!", Toast.LENGTH_SHORT).show();

    }

    fun incrementCount (view: View){
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString();
    }

    fun getRandomNumber(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
