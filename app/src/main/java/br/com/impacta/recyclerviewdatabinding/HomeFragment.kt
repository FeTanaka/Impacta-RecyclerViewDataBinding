package br.com.impacta.recyclerviewdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.impacta.recyclerviewdatabinding.adapters.Adaptador
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
            Conversa("Fernando", "Olá, Fernando", "22:51", R.drawable.imagem_01),
            Conversa("Raquel", "Olá, Raquel", "19:54", R.drawable.imagem_02),
            Conversa("Cainã", "Olá, Cainã", "19:53", R.drawable.imagem_03),
            Conversa("Alexandre", "Olá, Alexandre", "19:52", R.drawable.imagem_04),
            Conversa("Diego", "Olá, Diego", "19:51", R.drawable.imagem_05),
            Conversa("José Carlos", "Olá, José Carlos", "19:50", R.drawable.imagem_06),
            Conversa("Rubiane", "Olá, Rubiane", "19:49", R.drawable.imagem_07),
            Conversa("Vitor", "Olá, Vitor", "19:48", R.drawable.imagem_08),
            Conversa("Luana", "Olá, Luana", "19:47", R.drawable.imagem_09),
            Conversa("Impacta", "Olá, Impacta", "19:46", R.drawable.imagem_10),
        )

        binding.recyclerView.adapter = Adaptador(colecaoConversas)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
    }

}