package com.catfacts

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import org.json.JSONException
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

    private var mTextViewResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextViewResult = findViewById(R.id.catFactText)

        val client = OkHttpClient()
        val url = "https://catfact.ninja/fact?max_length=140"

        val request = Request.Builder()
            .url(url)
            .build()

        catFactButton.setOnClickListener {
            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: java.io.IOException) {
                    e.printStackTrace()
                }

                @Throws(java.io.IOException::class)

                override fun onResponse(
                    call: Call,
                    response: Response
                ) {
                    if (response.isSuccessful) {
                        val responseData = response.body!!.string()
                        runOnUiThread {
                            try {
                                val json = JSONObject(responseData)
                                println("Request Successful!!")
                                println(json)
                                val responseObject = json.getString("fact")
                                catFactText.text = responseObject
                            } catch (e: JSONException) {
                                e.printStackTrace()
                            }
                        }
                    }
                }
            })
        }


    }
}