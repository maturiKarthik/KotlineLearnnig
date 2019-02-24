package com.kotline.meghanasol.koltinelearn.databindingtuts

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotline.meghanasol.koltinelearn.BR
import com.kotline.meghanasol.koltinelearn.R
import com.kotline.meghanasol.koltinelearn.databinding.BindingactivityBinding
import com.kotline.meghanasol.koltinelearn.databindingtuts.viewbindingclass.User
import com.kotline.meghanasol.koltinelearn.databindingtuts.viewbindingclass.UserDetails

class MainBindingActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      val bindingActivity : BindingactivityBinding = DataBindingUtil.setContentView(this,
          R.layout.bindingactivity)
        val userObj = User(
            "MaturiKarthik",
            "m312Java@gmail.com"
        )
        val userDetails = UserDetails(Int.MAX_VALUE,"Xyz}D","14 Jan 2018")
        bindingActivity.setVariable(BR.user,userObj)

   }
}