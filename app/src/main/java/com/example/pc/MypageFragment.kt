package com.example.pc


import android.app.Activity
import android.media.Image
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_mypage.*
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MypageFragment : Fragment(), View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_mypage)

        //cloth_before.setOnClickListener(this)
        //hair_before.setOnClickListener(this)
        //make_before.setOnClickListener(this)
        //aroma_before.setOnClickListener(this)

    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cloth_before.setOnClickListener(this)
        hair_before.setOnClickListener(this)
        make_before.setOnClickListener(this)
        aroma_before.setOnClickListener(this)
    }



//服とかメイクとか選ぶ時のボタン操作
    override fun onClick(view: View) {

        when (view.id){
            R.id.cloth_before-> {
                val clothb = view.findViewById(R.id.cloth_before)  as ImageButton
                clothb.setBackgroundResource(R.drawable.clotha)
            }

            R.id.hair_before -> {
                val hairb = view.findViewById(R.id.hair_before) as ImageButton
                hairb.setImageResource(R.drawable.haira)
            }

            R.id.make_before -> {
                val makeb = view.findViewById(R.id.make_before) as ImageButton
                makeb.setBackgroundResource(R.drawable.makea)
            }
            R.id.aroma_before -> {
                val aromab = view.findViewById(R.id.aroma_before) as ImageButton
                aromab.setImageResource(R.drawable.aromaa)
            }
        }
    }


}