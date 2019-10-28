package com.example.pc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_notification.*


class NotificationFragment : Fragment(){


    /*
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_notification, container, false)
        return view
    }
    */


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val list = ArrayList<String>()

        list.add("first text")
        val adapter = ArrayAdapter<String>(this.requireContext(), android.R.layout.simple_list_item_1, list)
        list_notify.adapter = adapter

        button.setOnClickListener {
            list.add("add text")
            setListViewHeightBasedOnChildren(list_notify)
        }
    }
}

private fun setListViewHeightBasedOnChildren(list: ListView) {
    val adapter = list.adapter

    var totalHeight = 0
    var desiredWidth = View.MeasureSpec.makeMeasureSpec(list.width, View.MeasureSpec.AT_MOST)

    for (item in 0 until adapter.count) {
        val listItem = adapter.getView(item, null, list)
        listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED)
        totalHeight += listItem.measuredHeight
    }

    val params = list.layoutParams
    params.height = totalHeight + (list.dividerHeight * (adapter.count - 1))
    list.layoutParams = params
    list.requestLayout()
}



