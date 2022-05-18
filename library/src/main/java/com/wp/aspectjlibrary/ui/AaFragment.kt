//package com.wp.aspectjlibrary.ui
//
//import android.graphics.Color
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.LinearLayout
//import android.widget.TextView
//import android.widget.Toast
//import androidx.core.view.setPadding
//import androidx.fragment.app.Fragment
//import com.wp.aspectjlibrary.R
//
///**
// * @description
// * @author wp
// * @date   2022/5/18 11:58
// */
//class AaFragment: Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return LinearLayout(context)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val t = TextView(context).apply {
//            setPadding(20)
//            setBackgroundResource(R.color.design_default_color_primary)
//            setTextColor(Color.WHITE)
//            text = "click"
//            setOnClickListener {
//                Log.d("aa", "-----tvClick")
//                Toast.makeText(context, "tvClick", Toast.LENGTH_SHORT).show()
//            }
//        }
//        (view as? LinearLayout)?.addView(t)
//    }
//}