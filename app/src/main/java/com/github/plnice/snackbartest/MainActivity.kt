package com.github.plnice.snackbartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById<ViewGroup>(R.id.root)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Snackbar.make(root, "Snackbar", Snackbar.LENGTH_LONG).show()
        }
    }
}
