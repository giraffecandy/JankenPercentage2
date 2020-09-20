package app.babachan.jankenpercentage2

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countAll = 0
        var countWin = 0

        gooButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number = (0..2).random()

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    countAll +=1

                }

                1 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                    countAll += 1
                    countWin += 1
                }

                2 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    countAll += 1
                }
            }

            numberTextView.text = countAll.toString()

            if(countWin == 0 ) {
                percentageTextView.text = "0"
            }else{
                var countCalc = countWin / countAll
                percentageTextView.text = countCalc.toLong().toString()
            }
        }

        chokiButton.setOnClickListener {
            player.text = "あなたの手はチョキです"
            val number: Int = (0..2).random()

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    countAll++
                }

                1 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                    countWin++
                }

                2 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    countAll++
                }
            }

        }

        paaButton.setOnClickListener {
            player.text = "あなたの手はパーです"
            val number: Int = (0..2).random()

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    countAll++
                }

                1 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.RED)
                    countAll++
                    countWin++
                }

                2 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    countAll++
                }
            }


        }
//        if (countWin!= 0){
//        numberTextView.text = countAll.toString()
//        var countCalc = countWin / countAll * 100
//        percentageTextView.text = countCalc.toString()
//    }else{
//            percentageTextView.text = "0"
//        }
    }

}