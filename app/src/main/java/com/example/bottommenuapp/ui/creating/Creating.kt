package com.example.bottommenuapp.ui.creating

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Switch
import com.example.bottommenuapp.R
import com.google.android.material.textfield.TextInputLayout

class Creating : Fragment() {

    companion object {
        fun newInstance() = Creating()
    }

    private lateinit var viewModel: CreatingViewModel

    // Отображает creating_fragment.xml
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.creating_fragment, container, false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreatingViewModel::class.java)
        // TODO: Use the ViewModel


        // возможно, нужно очищать поле или при мапинге в бд смотреть на состояние свитч
        view?.findViewById<Switch>(R.id.switchEventParticipantsCount)?.setOnCheckedChangeListener { _, isChecked ->
            view?.findViewById<TextInputLayout>(R.id.textInputLayoutEventParticipantsCount)?.visibility = if (isChecked) View.VISIBLE
            else
                View.INVISIBLE
    }

//    fun switchParticipantsCountVisibility (view: View) {
//        val switchParticipantCount = view.findViewById<Switch>(R.id.switchEventParticipantsCount)
//        switchParticipantCount.setOnCheckedChangeListener { _, isChecked ->
//            view.findViewById<TextInputLayout>(R.id.textInputLayoutEventParticipantsCount).visibility = if (isChecked) View.VISIBLE
//            else View.GONE
//        }
    }

}