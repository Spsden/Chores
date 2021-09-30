package com.example.todo

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_pop_up_window.*
import kotlinx.android.synthetic.main.activity_pop_up_window.view.*


class PopUpWindow : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
              setStyle(DialogFragment.STYLE_NO_FRAME,R.style.BottomSheet);

        var view =inflater.inflate(R.layout.activity_pop_up_window,container,false)

        val newbutton = view.save_button
        val newnote = view.editText

        newbutton.setOnClickListener {

            if (newnote.text.trim().toString().isEmpty())
            {

                Toast.makeText(requireContext(),"Enter something", Toast.LENGTH_SHORT).show()

            }
            else
            {
                Intent(activity,MainActivity::class.java).also{

                    val tobesent = newnote.text.toString()

                    it.putExtra("EXTRA_NOTE",tobesent)
                    startActivity(it)

                }

            }
        }

        return view;




    }






}