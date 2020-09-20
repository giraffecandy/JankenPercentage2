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
        var countWin = 0.0


        gooButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number = (0..2).random()
            countAll += 1

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))

                }

                1 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#E91e63"))
                    countWin += 1.0
                }

                2 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }

            numberTextView.text = countAll.toString()
            val countCalcd:Double = countWin/countAll
            val countCalc = countCalcd * 100
            percentageTextView.text = countCalc.toLong().toString()

        }


        chokiButton.setOnClickListener {
            player.text = "あなたの手はチョキです"
            val number: Int = (0..2).random()

            countAll+=1

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#e91e63"))
                    countWin++
                }

                2 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }

            numberTextView.text = countAll.toString()
            val countCalcd:Double = countWin/countAll
            val countCalc = countCalcd * 100
            percentageTextView.text = countCalc.toLong().toString()

        }

        paaButton.setOnClickListener {
            player.text = "あなたの手はパーです"
            val number: Int = (0..2).random()

            countAll += 1

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.paa2)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1 -> {
                    cpu.setImageResource(R.drawable.goo2)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#E91e63"))
                    countWin++
                }

                2 -> {
                    cpu.setImageResource(R.drawable.choki2)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
            numberTextView.text = countAll.toString()
            val countCalcd: Double = countWin / countAll
            val countCalc = countCalcd * 100
            percentageTextView.text = countCalc.toLong().toString()

        }
        numberTextView.text = countAll.toString()

        fun calc(){

        }
        resetButton.setOnClickListener {
            countAll = 0
            countWin = 0.0
            numberTextView.text = "0"
            percentageTextView.text = "0"
        }
    }


}