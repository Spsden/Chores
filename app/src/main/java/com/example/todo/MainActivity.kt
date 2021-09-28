package com.example.todo

import TodoAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todolist = mutableListOf(
            Todolist(note = "Bhanu" , isTicked = false),
            Todolist(note = "dedhfutia" , isTicked = true),

            Todolist(note = "bitna" , isTicked = false),

            Todolist(note = "bauna" , isTicked = true),
            Todolist(note = "lolllll" , isTicked = false),

            Todolist(note = "lol ku h bhi main kaise maan lu" , isTicked = true),

            Todolist(note = "nahi karenge nahi karnegy" , isTicked = false),
            )

        val adapter = TodoAdapter(todolist)
        tasks.adapter = adapter
        tasks.layoutManager = LinearLayoutManager(this)
    }
}