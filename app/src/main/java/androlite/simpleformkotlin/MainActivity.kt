package androlite.simpleformkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button_submit.setOnClickListener {
            var name = editText_enter_name.text.toString()
            var address = editText_enter_address.text.toString()
            var phone = editText_enter_phone.text.toString()
            Toast.makeText(this, name + " " + address + " " + phone, Toast.LENGTH_LONG).show()
        }

        button_reset.setOnClickListener {
            editText_enter_name.setText("")
            editText_enter_address.setText("")
            editText_enter_phone.setText("")
        }
    }

}
