package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    }
    fun displayContact(){
        val contact1=TweetData("Angela","0789564352","angela@gmail.com")
        val contact2=TweetData("Peter","0789554352","peter@gmail.com")
        val contact3=TweetData("Alice","0782364352","alice@gmail.com")
        val contact4=TweetData("Joyce","0756364352","joyce@gmail.com")
        val contact5=TweetData("Paul","0782365352","paul@gmail.com")
        val contactList= mutableListOf<TweetData>( contact1,contact2,contact3,contact4,contact5)
        val tweetData=TweetData(contactList)
        binding.rvtweets.layoutManager=LinearLayoutManager(this)
        binding.rvtweets.adapter=TweetData
    }
}