/*
 * Copyright (c) 2020 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.raywenderlich.android.securepass

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.Executor

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    setTheme(R.style.AppTheme)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val executor = ContextCompat.getMainExecutor(this)
    val biometricManager = BiometricManager.from(this)

      /** 생체 인증 가능 여부확인*/
    when (biometricManager.canAuthenticate()) {
      BiometricManager.BIOMETRIC_SUCCESS -> authUser(executor) // //  생체 인증 가능
      BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE -> Toast.makeText(this, getString(R.string.error_msg_no_biometric_hardware), Toast.LENGTH_LONG).show() // 기기에서 생체 인증을 지원하지 않는 경우
      BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE -> Toast.makeText(this, getString(R.string.error_msg_biometric_hw_unavailable), Toast.LENGTH_LONG).show()
      BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED -> Toast.makeText(this, getString(R.string.error_msg_biometric_not_setup), Toast.LENGTH_LONG).show() // 생체 인식 정보가 등록되지 않은 경우
    }


//    val sharedPreferences: SharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
//    btnSave.setOnClickListener {
//      //1
//      val editor = sharedPreferences.edit()
//      //2
//      editor.putString("Name", etName.text.toString())
//      editor.putString("Email", etEmail.text.toString())
//      editor.putString("Phone", etPhone.text.toString())
//      //3
//      editor.apply()
//      //4
//      etName.setText("")
//      etEmail.setText("")
//      etPhone.setText("")
//    }
//    etName.setText(sharedPreferences.getString("Name", ""))
//    etEmail.setText(sharedPreferences.getString("Email", ""))
//    etPhone.setText(sharedPreferences.getString("Phone", ""))


}

  // TODO: define authUser
  private fun authUser(executor: Executor) {

      /** 생체 인증 등록*/

    val promptInfo = BiometricPrompt.PromptInfo.Builder() // 1
        .setTitle(getString(R.string.auth_title)) // 2
        .setSubtitle(getString(R.string.auth_subtitle)) // 3
        .setDescription(getString(R.string.auth_description)) // 4
        .setDeviceCredentialAllowed(true) // 5
        .build() // 6

      /** 생체 인식 Callback */ // 1
    val biometricPrompt = BiometricPrompt(this, executor, object : BiometricPrompt.AuthenticationCallback() {
          // 2
          override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
            super.onAuthenticationSucceeded(result)
            main_layout.visibility = View.VISIBLE
          }
          // 3
          override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
            super.onAuthenticationError(errorCode, errString)
            Toast.makeText(applicationContext, getString(R.string.error_msg_auth_error, errString), Toast.LENGTH_SHORT).show()
          }
          // 4
          override fun onAuthenticationFailed() {
            super.onAuthenticationFailed()
            Toast.makeText(applicationContext, getString(R.string.error_msg_auth_failed), Toast.LENGTH_SHORT).show()
          }
        })

      /** 생체 인증 실행*/
    biometricPrompt.authenticate(promptInfo)
  }
}
