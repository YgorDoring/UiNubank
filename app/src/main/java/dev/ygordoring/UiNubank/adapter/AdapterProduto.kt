package dev.ygordoring.UiNubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.ygordoring.UiNubank.databinding.ProdutoItemBinding
import dev.ygordoring.UiNubank.model.Produto

class AdapterProduto(
    private val context: Context,
    private val listaProdutos: MutableList<Produto>
) :
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtTextoInformartivo.text = listaProdutos[position].texto
    }

    override fun getItemCount() = listaProdutos.size

    inner class ProdutoViewHolder(binding: ProdutoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val txtTextoInformartivo = binding.txtTextoInformativo
    }
}
