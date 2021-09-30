package com.example.todo

import TodoAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todopop = PopUpWindow()

        more.setOnClickListener {
            todopop.show(supportFragmentManager, "todopop")
        }

        val comingnote = intent.getStringExtra("EXTRA_NOTE")



        var todolist = mutableListOf(
            Todolist(note = "Bhanu", isTicked = false),
            Todolist(note = "dedhfutia", isTicked = true),
        )

        val adapter = TodoAdapter(todolist)
        tasks.adapter = adapter
        tasks.layoutManager = LinearLayoutManager(this)

        val latesttodo = Todolist(note = comingnote, isTicked = false)
        todolist.add(latesttodo)
        adapter.notifyItemInserted(todolist.size - 1)


    }
}