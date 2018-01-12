package io.github.backpack.bpkawesome

import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber();
    }

    fun showRandomNumber(){
        val max: Int = intent.getIntExtra(TOTAL_COUNT, 0);
        var random = Random();
        var randomInt = 0;
        if(max > 0){
            randomInt = random.nextInt(max + 1);
        }
        textview_random.text = Integer.toString(randomInt);
        textview_label.text = getString(R.string.textview_label_content, max);

    }
}
