package com.example.bottommenuapp.ui.events

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.bottommenuapp.R
//import kotlinx.android.synthetic.main.events_fragment.view.*

import com.example.bottommenuapp.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyEventRecyclerViewAdapter (
 //   private val eventList: List<Event>
) : RecyclerView.Adapter<MyEventRecyclerViewAdapter.ViewHolder>() {

    val eventList = mutableListOf<EventContent.Event>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.events_fragment, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = eventList[position]
        holder.name.text = item.eventName
        holder.date.text = item.eventDate
        holder.time.text = item.eventTime

    }

    override fun getItemCount(): Int = eventList.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//        fun bind (event: Event) {
//            with(itemView) {
//                event.run {
//                    eventName_in_list
//                }
//            }
//        }

        val name: TextView = view.findViewById(R.id.eventName_in_list)
        val date: TextView = view.findViewById(R.id.eventDate_in_list)
        val time: TextView = view.findViewById(R.id.eventTime_in_list)
        val category: ImageView = view.findViewById(R.id.eventDate_in_list)

        override fun toString(): String {
            return super.toString() + " '" + date.text + "'"
        }
    }

    fun refreshEvents () {
        notifyDataSetChanged()
    }
}