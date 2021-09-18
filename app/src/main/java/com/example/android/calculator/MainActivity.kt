package com.example.android.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var oneEdit: EditText
    lateinit var twoEdit: EditText

    lateinit var btOne: Button
    lateinit var btTwo: Button
    lateinit var btThree: Button
    lateinit var btFour: Button

    lateinit var tvtResult: TextView


    var First: String? = null
    var Second: String? = null
    var tResult: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        oneEdit = findViewById(R.id.edtOne)
        twoEdit = findViewById(R.id.edtTwo)

        btOne = findViewById(R.id.btnOne)

//        btnOne is from the xml layout id

        btTwo = findViewById(R.id.btnTwo)
        btThree = findViewById(R.id.btnThree)
        btFour = findViewById(R.id.btnFour)

        tvtResult = findViewById(R.id.tvResult)


        btOne.setOnClickListener(this)
        btTwo.setOnClickListener(this)
        btThree.setOnClickListener(this)
        btFour.setOnClickListener(this)
    }



    override fun onClick(v: View?) {

        First = oneEdit.text.toString()
        Second = twoEdit.text.toString()

        when (v?.id) {


            R.id.btnOne -> {
                if (First!!.isEmpty()) {
                    Toast.makeText(applicationContext, "Enter First Number", Toast.LENGTH_SHORT)
                        .show()
                } else if (Second!!.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Enter Second Number",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    tResult = First?.toInt()?.plus(Second?.toInt()!!)

                    tvtResult.text = tResult.toString()
                }
            }

            R.id.btnTwo -> {
                if (First!!.isEmpty()) {
                    Toast.makeText(applicationContext, "Enter First Number", Toast.LENGTH_SHORT)
                        .show()
                } else if (Second!!.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Enter Second Number",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    tResult = First?.toInt()?.plus(Second?.toInt()!!)

                    tvtResult.text = tResult.toString()
                }
            }

            R.id.btnThree -> {
                if (First!!.isEmpty()) {
                    Toast.makeText(applicationContext, "Enter First Number", Toast.LENGTH_SHORT)
                        .show()
                } else if (Second!!.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Enter Second Number",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    tResult = First?.toInt()?.plus(Second?.toInt()!!)

                    tvtResult.text = tResult.toString()
                }
            }

            R.id.btnFour -> {
                if (First!!.isEmpty()) {
                    Toast.makeText(applicationContext, "Enter First Number", Toast.LENGTH_SHORT)
                        .show()
                } else if (Second!!.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Enter Second Number",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    tResult = First?.toInt()?.plus(Second?.toInt()!!)

                    tvtResult.text = tResult.toString()
                }
            }


        }
    }
}