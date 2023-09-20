package org.freedu.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.freedu.checkboxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var msg:String = ""
            if (binding.checkBox.isChecked){
                msg = "Playing is selected"
            }
            if (binding.checkBox2.isChecked){
                msg = "Reading is selected"
            }
            if (binding.checkBox3.isChecked){
                msg = "Sleeping is selected"
            }
            if (binding.checkBox4.isChecked){
                msg = "Coding is selected"
            }

            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }


    }
}