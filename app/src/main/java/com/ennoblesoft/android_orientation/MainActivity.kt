package com.ennoblesoft.android_orientation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_enter.setOnClickListener {
            if (isValid())
                Toast.makeText(
                    this,
                    "Your entered data:\nusername: ${et_username.text}\npassword: ${et_password.text}",
                    Toast.LENGTH_LONG
                ).show()
        }
    }

    private fun isValid(): Boolean = hasText(et_username) && hasText(et_password)

    private fun hasText(editText: AppCompatEditText): Boolean =
        if (TextUtils.isEmpty(editText.text)) {
            editText.error = "Required"
            editText.requestFocus()
            false
        } else true
}
