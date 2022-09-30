package dev.ygordoring.UiNubank.model.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ygordoring.UiNubank.R
import dev.ygordoring.UiNubank.adapter.AdapterPagamento
import dev.ygordoring.UiNubank.adapter.AdapterProduto
import dev.ygordoring.UiNubank.databinding.ActivityMainBinding
import dev.ygordoring.UiNubank.model.Pagamentos
import dev.ygordoring.UiNubank.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaPagamento: MutableList<Pagamentos> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listaIconesPagamentos()
        supportActionBar!!.hide()
        setupRecyclerview()
        setupRecyclerProduto()
    }

    private fun setupRecyclerProduto() {
        val recyclerProduto = binding.recyclerProdutos
        recyclerProduto.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProduto.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProduto.adapter = adapterProduto
    }

    private fun setupRecyclerview() {
        val recyclerIconesPagamentos = binding.recyclerIconesPagamentos
        recyclerIconesPagamentos.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconesPagamentos.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconesPagamentos.adapter = adapterPagamento
        listaTextoInformativo()
    }

    private fun listaIconesPagamentos() {
        val icone1 = Pagamentos(R.drawable.ic_pix, "Aréa Pix")
        listaPagamento.add(icone1)
        val icone2 = Pagamentos(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)
        val icone3 = Pagamentos(R.drawable.emprestimo, "Empréstimo")
        listaPagamento.add(icone3)
        val icone4 = Pagamentos(R.drawable.transferencia, "Trasnsferir")
        listaPagamento.add(icone4)
        val icone5 = Pagamentos(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)
        val icone6 = Pagamentos(R.drawable.ic_recarga_celular, "Recarga de Celular")
        listaPagamento.add(icone6)
        val icone7 = Pagamentos(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)
        val icone8 = Pagamentos(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)
    }

    private fun listaTextoInformativo() {
        val textiInformativo = Produto("Participe da Promoção Tudo no Roxinho e concorra a ...")
        listaProduto.add(textiInformativo)

        val textiInformativo2 = Produto("Chegou o débito automático da fatura do cartão ...")
        listaProduto.add(textiInformativo2)

        val textiInformativo3 =
            Produto("Conheça a conta PJ: prática e livre de burocracia para se ...")
        listaProduto.add(textiInformativo3)

        val textiInformativo4 = Produto("Salve seus amigos da burocracia: Faça um convite ...")
        listaProduto.add(textiInformativo4)
    }
}
