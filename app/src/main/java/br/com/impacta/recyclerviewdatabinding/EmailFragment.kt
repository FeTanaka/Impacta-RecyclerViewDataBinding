package br.com.impacta.recyclerviewdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.impacta.recyclerviewdatabinding.adapters.EmailAdapter
import br.com.impacta.recyclerviewdatabinding.data.Email
import br.com.impacta.recyclerviewdatabinding.databinding.FragmentEmailBinding


class EmailFragment : Fragment() {

    private var _binding: FragmentEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val emailList = mutableListOf<Email>(
            Email(
                sender = "Fernando",
                subject = "Praticando Recycler View",
                message = "Estamos praticando recycler View com data Binding",
                time = "20:56"
            ),
            Email(
                sender = "José Carlos",
                subject = "Praticando Recycler View",
                message = "Estamos praticando recycler View com data Binding",
                time = "20:55"
            )
        )

        binding.recyclerView.adapter = EmailAdapter(emailList)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
    }


}