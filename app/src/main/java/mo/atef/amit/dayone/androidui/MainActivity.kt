package mo.atef.amit.dayone.androidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*
    Views and ViewGroup
    ViewGroup:
    ancient
    1. LinearLayout
    2. RelativeLayout
    3. FrameLayout
    4. ConstraintLayout
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}