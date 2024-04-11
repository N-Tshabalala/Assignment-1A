package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflateId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 30..32 -> {
                        "Alexander The Great"
                    }

                    in 60..67 -> {
                        "Leonardo Da Vinci"
                    }

                    in 50..51 -> {
                        "Napoleon Bonaparte"
                    }

                    in 70..76 -> {
                        "Albert Einstein"
                    }

                    in 50..52 -> {
                        "William Shakespeare"
                    }

                    in 61..65 -> {
                        "Genghis Khan"
                    }

                    in 80..84 -> {
                        "Issac Newton"
                    }

                    in 50..56 -> {
                        "Julius Caesar"
                    }

                    in 70..71 -> {
                        "Socrates"
                    }

                    in 65..68 -> {
                        "Akira Toriyamama"
                    }

                    else -> {}
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Alexander The Great" -> {
                            "Alexander the Great became king at the age of 20 and died at age 32.His conquest resulted in one of the largest empires in human history"
                        }

                        "Leonardo Da Vinci" -> {
                            "Leonardo Da Vinci died at age 67.However he is immortalised through his contributions such as painting the Mona Lisa"
                        }

                        "Napoleon Bonapart" -> {
                            "Crowned Himself Emperor of France in 1802 after a successful coup d'etat. He died at age 51"
                        }

                        "Albert Einstein" -> {
                            "Developer of the Theory of Relativity , he died at age 76"
                        }

                        "William Shakespeare" -> {
                            "Large contributer to the development of the modern english language, he died at age 52"
                        }

                        "Genghis Khan" -> {
                            "First Khan of Mongola and he ruled the largest empire in human history.He died at age 65"
                        }

                        "Issac Newton" -> {
                            "Founder of Newtons laws that govern all of physics ,he died at age 84"
                        }

                        "Julius Caesar" -> {
                            "First Emperor of Rome and he was assassinated at age 56 by his own counsel"
                        }

                        "Socrates" -> {
                            "Founder of Socrates method of questioning that many philosophers use even today, he died at age 71"
                        }

                        "Akira Toriyama" -> {
                            " Creator of the popular anime Dragonball Z , he died at age 68"
                        }

                        else -> {}
                    }
                }"

                txtResult.text = "Please enter a valid age"
            }
        }
        btnCancel?.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}
