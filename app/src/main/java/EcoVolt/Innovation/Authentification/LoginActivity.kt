package EcoVolt.Innovation.Authentification

import EcoVolt.Innovation.R
import EcoVolt.Innovation.databinding.ActivityLoginBinding
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

            //init animation
            var fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        var bottom_down = AnimationUtils.loadAnimation(this, R.anim.bottom_down)

        //setting rhe bottom down animationon top layout
        binding.topLinearLayout.animation = bottom_down

        //let's create hqndler for other layouts
        var handler = Handler()
        var runnable = Runnable {
            binding.cardView2.animation = fade_in
            binding.cardView3.animation = fade_in
            binding.cardView4.animation = fade_in
            binding.cardView5.animation = fade_in
            binding.textView2.animation = fade_in
            binding.SignupPage.animation = fade_in
            binding.cardView1.animation = fade_in
        }
        handler.postDelayed(runnable, 1000)

        binding.SignupPage.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }




    }
    }
