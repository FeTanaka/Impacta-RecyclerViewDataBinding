package br.com.impacta.recyclerviewdatabinding

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
        val conversa = conjuntoDados[position]
        holder.binding.contatoNome.text = conversa.nome
        holder.binding.contatoConversa.text = conversa.conversa
        holder.binding.contatoHorario.text = conversa.horario
        holder.binding.contatoImagem.setImageResource(conversa.imagem)
    }

    override fun getItemCount(): Int {
        return conjuntoDados.size
    }


}