package br.com.impacta.recyclerviewdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.impacta.recyclerviewdatabinding.data.Conversa
import br.com.impacta.recyclerviewdatabinding.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val colecaoConversas = mutableListOf<Conversa>(
            Conversa("Fernando", "Olá, Fernando", "22:51", R.drawable.imagem_01)
        )

        binding.recyclerView.adapter = Adaptador(colecaoConversas)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)


    }

}