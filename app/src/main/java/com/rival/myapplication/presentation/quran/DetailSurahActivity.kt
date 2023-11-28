package com.rival.myapplication.presentation.quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rival.myapplication.R
import com.rival.myapplication.databinding.ActivityDetailSurahBinding

class DetailSurahActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailSurahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSurahBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object{
        const val EXTRA_DATA = "extra_data"
    }
}