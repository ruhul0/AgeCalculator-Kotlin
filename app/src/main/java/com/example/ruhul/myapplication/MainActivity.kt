package com.example.ruhul.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    open override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a();
    }
    fun a(){
        try{
            button1.setOnClickListener(android.view.View.OnClickListener {
                var birthDate:String = age1.text.toString()
                var year:Int=Calendar.getInstance().get(Calendar.YEAR)
                var ageCalculator:Int=birthDate!!.toInt()
                //birthDate= birthDate!!.toInt()
                var age:Int=year-ageCalculator
                //button1.setText(age)
                text1.setText("Your age is $age")

            })
            button2.setOnClickListener(View.OnClickListener {
                setContentView(R.layout.layout1)
            })

//            age1.setOnClickListener(android.view.View.OnClickListener {
//                //actionEvent()
//                age1.setText("")
//            })
            /*onBackPressed(){
                setContentView(R.layout.activity_main)
            }*/
        } catch (ex:Exception){

        }
    }

/*    override fun onBackPressed() {
        super.onBackPressed()
        //setContentView(R.layout.layout1)
    }*/

/*    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
        onBackPressed()
            return true

    }*/

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode==KeyEvent.KEYCODE_BACK)
        {

            fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                a();
            }
            var activity:Intent= Intent.makeMainActivity(null)
            setContentView(R.layout.activity_main)
            return true
        }

        return super.onKeyDown(keyCode, event)
    }

/*    fun actionEvent(){
        age1.setText("")
        var birthDate:String = text1.text.toString()
        val year:Int=Calendar.getInstance().get(Calendar.YEAR)
        var age:Int=year-birthDate.toInt()
        text1.setText("Your age is"+age)
    }*/

}
