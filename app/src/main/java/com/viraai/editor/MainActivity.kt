package com.viraai.editor

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    private val purple = Color.rgb(130, 80, 220)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(20, 18, 35)
        window.navigationBarColor = Color.rgb(20, 18, 35)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(Color.rgb(20, 18, 35))
        }

        val title = TextView(this).apply {
            text = "ViraAI"
            textSize = 36f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "ویرایش هوشمند ویدیو با هوش مصنوعی"
            textSize = 17f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 12, 0, 32)
        }

        root.addView(title)
        root.addView(subtitle)

        addActionButton(root, "🎬  انتخاب ویدیو") {
            // انتخاب ویدیو را در مرحله بعد اضافه می‌کنیم.
        }

        addActionButton(root, "✨  زیرنویس خودکار") {
            showMessage("ساخت زیرنویس را در مرحله بعد اضافه می‌کنیم.")
        }

        addActionButton(root, "🤖  ادیت هوشمند") {
            showMessage("موتور ادیت هوشمند را در مرحله بعد اضافه می‌کنیم.")
        }

        addActionButton(root, "📁  پروژه‌های من") {
            showMessage("مدیریت پروژه‌ها را در مرحله بعد اضافه می‌کنیم.")
        }

        setContentView(root)
    }

    private fun addActionButton(
        root: LinearLayout,
        label: String,
        action: () -> Unit
    ) {
        val button = Button(this).apply {
            text = label
            textSize = 16f
            setTextColor(Color.WHITE)
            setBackgroundColor(purple)
            isAllCaps = false
            setOnClickListener { action() }
        }

        val params = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply {
            bottomMargin = 14
        }

        root.addView(button, params)
    }

    private fun showMessage(message: String) {
        android.widget.Toast.makeText(
            this,
            message,
            android.widget.Toast.LENGTH_SHORT
        ).show()
    }
}
