package net.simplifiedcoding.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import net.simplifiedcoding.MyApplication
import net.simplifiedcoding.R
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    @Inject lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

}