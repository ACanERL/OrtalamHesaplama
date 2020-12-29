package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var  check1:CheckBox
    lateinit var check2:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         hesapla.setOnClickListener {
             if(checkBox.isChecked){
                 sonuc.text =
                         (((vize_1.text.toString().toFloat()) * 20) / 100 + ((vize_2.text.toString()
                                 .toFloat()) * 20) / 100 + (final_1.text.toString()
                                 .toFloat() * 60 / 100)).toString()
             }
             if(checkBox2.isChecked){
                 sonuc.text=((vize_1.text.toString().toFloat()*10/100)+(vize_2.text.toString().toFloat()*10/100)+(final_1.text.toString().toFloat()*80/100)).toString()
             }
         }

    }
}