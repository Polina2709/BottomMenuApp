package com.example.bottommenuapp.ui.events

import com.example.bottommenuapp.dummy.DummyContent
import java.sql.Time
import java.util.*

object EventContent {
    data class Event(val eventId: String, val eventName: String, val eventDate: String, val eventTime: String, val eventCategory: String) {
    }

    val ITEMS: MutableList<Event> = ArrayList()
}