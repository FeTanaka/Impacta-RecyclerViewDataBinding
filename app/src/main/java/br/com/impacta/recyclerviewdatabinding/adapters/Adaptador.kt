package br.com.impacta.recyclerviewdatabinding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.impacta.recyclerviewdatabinding.data.Conversa
import br.com.impacta.recyclerviewdatabinding.databinding.ConversaItemBinding

class Adaptador(val conjuntoDados: MutableList<Conversa>) :
    RecyclerView.Adapter<Adaptador.ConversaViewHolder>() {

    inner class ConversaViewHolder(val binding: ConversaItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {
        var binding =
            ConversaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConversaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {
        holder.binding.conversa = conjuntoDados[position]
    }

    override fun getItemCount(): Int {
        return conjuntoDados.size
    }


}