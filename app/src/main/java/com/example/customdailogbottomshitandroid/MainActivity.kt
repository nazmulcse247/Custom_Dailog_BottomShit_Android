package com.example.customdailogbottomshitandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customdailogbottomshitandroid.databinding.ActivityMainBinding
import com.example.customdailogbottomshitandroid.utils.DialogUtils

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            DialogUtils.customDialog(this)
        }




    }
}