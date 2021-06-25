package br.com.digitalhouse.layouts01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.digitalhouse.layouts01.databinding.FragmentAboutBinding
import br.com.digitalhouse.layouts01.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {

    private var binding: FragmentAboutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}