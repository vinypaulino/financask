package br.com.vinipaulino.mobile.financask.ui.adapter

/**
 * Created by vinyp on 11/04/2018.
 */
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.vinipaulino.mobile.financask.R
import br.com.vinipaulino.mobile.financask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*

class ListaTransacoesAdapter(transacoes: List<Transacao>,
                             context: Context) : BaseAdapter() {
    private val transacoes = transacoes
    private val context = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.transacao_item, parent, false)

        val transacao = transacoes[posicao]

        viewCriada.transacao_valor.text = transacao.valor.toString()
        viewCriada.transacao_categoria.text = transacao.categoria
        viewCriada.transacao_data.text = transacao.data.toString()


        return viewCriada
    }

    override fun getItem(posicao: Int): Transacao {
        return transacoes[posicao]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }


}