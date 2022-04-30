package dev.droidchef.samples.languageselector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import dev.droidchef.samples.languageselector.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val localeList =  listOf("hi", "nl", "ja", "en", "es", "it", "fr")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.spLanguagePicker.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    println("Selected locale = ${localeList[p2]}")
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }

    }

}