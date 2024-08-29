package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton : Button

    private lateinit var falseButton : Button

    //lateinit allows initializing a not-null property outside of a constructor



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        ////https://developer.android.com/develop/ui/views/notifications/snackbar/action

        val coordinatorLayout : CoordinatorLayout = findViewById(R.id.main)
        //https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout

        trueButton.setOnClickListener {
            Snackbar.make(
                coordinatorLayout,
                "Correct",
                BaseTransientBottomBar.LENGTH_SHORT
            ).show()

            //https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar

        }
        falseButton.setOnClickListener {
            Snackbar.make(
                coordinatorLayout,
                "Incorrect",
                BaseTransientBottomBar.LENGTH_SHORT
            ).show()

            //https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar

        }

    }
}