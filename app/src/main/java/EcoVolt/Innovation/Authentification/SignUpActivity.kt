package EcoVolt.Innovation.Authentification

import EcoVolt.Innovation.R
import EcoVolt.Innovation.databinding.ActivitySignupBinding
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize animations
        val fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val bottom_down = AnimationUtils.loadAnimation(this, R.anim.bottom_down)

        // Apply animation to the top layout
        binding.topLinearLayout.animation = bottom_down

        // Use handler for other layouts
        val handler = Handler()
        val runnable = Runnable {
            binding.cardView1.animation = fade_in
            binding.cardView2.animation = fade_in
            binding.textView2.animation = fade_in
            binding.loginPage.animation = fade_in
        }
        handler.postDelayed(runnable, 1000)

        binding.loginPage.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
        }


