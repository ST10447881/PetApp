package petapp.llc

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    //declarations
    private lateinit var Eatbutton: Button
    private lateinit var Cleanbutton : Button
    private lateinit var Playbutton : Button
    private lateinit var EatBar : ProgressBar
    private lateinit var CleanBar : ProgressBar
    private lateinit var PlayBar : ProgressBar
    private lateinit var imageView2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        //initialize
        imageView2 = findViewById(R.id.imageView2)
        PlayBar = findViewById(R.id.PlayBar)
        CleanBar = findViewById(R.id.CleanBar)
        EatBar = findViewById(R.id.EatBar)
        Playbutton = findViewById(R.id.Playbutton)
        Cleanbutton = findViewById(R.id.Cleanbutton)
        Eatbutton = findViewById(R.id.Eatbutton)


       //increment by 20
       //decrement by 10
        Eatbutton.setOnClickListener {
            EatBar.incrementProgressBy(20)
            CleanBar.incrementProgressBy(-10)
            imageView2.setImageResource(R.drawable.eating)
        }

        Cleanbutton.setOnClickListener {
            CleanBar.incrementProgressBy(20)
            EatBar.incrementProgressBy(-10)
            imageView2.setImageResource(R.drawable.clean)
        }

        Playbutton.setOnClickListener {
            PlayBar.incrementProgressBy(20)
            CleanBar.incrementProgressBy(-10)
            imageView2.setImageResource(R.drawable.playing)
        }














        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}