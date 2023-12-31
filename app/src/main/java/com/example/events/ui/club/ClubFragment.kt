package com.example.events.ui.club

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.events.databinding.FragmentClubBinding


class ClubFragment : Fragment() {

    private var _binding: FragmentClubBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val clubViewModelViewModel =
            ViewModelProvider(this)[ClubViewModel::class.java]

        _binding = FragmentClubBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textClub
        clubViewModelViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}