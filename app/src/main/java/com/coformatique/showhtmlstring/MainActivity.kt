package com.coformatique.showhtmlstring

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text =
            ("<html><style type='text/css'>@font-face { font-family: spqr; src: url('ranchers_regular.ttf'); } body p {font-family: spqr;}</style>"
                    + "<body >" + "<p align=\"justify\" style=\"font-size: 22px; font-family: spqr;font-style:italic;\">" + "any string" + "</p> " + "</body></html>")

        html_string.loadDataWithBaseURL("file:///android_res/font/",text,"text/html","utf-8",null)
    }
}