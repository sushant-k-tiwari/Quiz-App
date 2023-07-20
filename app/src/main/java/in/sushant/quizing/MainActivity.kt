package `in`.sushant.quizing

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout : LinearLayout = findViewById(R.id.mainLayout)
        val animationDrawable : AnimationDrawable = linearLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2500)
        animationDrawable.setExitFadeDuration(2500)
        animationDrawable.start()


        val btnStart : Button = findViewById(R.id.btnStart)
        val editText : EditText = findViewById(R.id.editText)
        btnStart.setOnClickListener{
            if (editText.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, Quiz_Questions::class.java)
                intent.putExtra(Constants.USER_NAME, editText.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}