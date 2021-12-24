package com.example.bobs_pet_shopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.bobs_pet_shopping.R.id.button_produto
import com.example.bobs_pet_shopping.R.id.tag_accessibility_actions
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log.i as logI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      button_produto.setOnClickListener {
          val intent = Intent(this,Produtos::class.java)
          startActivity(intent)
      }
        button_contato.setOnClickListener {
          val intent = Intent(this,Contato::class.java)
          startActivity(intent)
      }
        button_entregas.setOnClickListener {
          val intent = Intent(this,Entregas::class.java)
          startActivity(intent)
      }
        button_suporte.setOnClickListener {
          val intent = Intent(this,Suporte::class.java)
          startActivity(intent)
      }
    }
}
