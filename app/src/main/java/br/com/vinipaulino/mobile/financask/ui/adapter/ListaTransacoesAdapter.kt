package br.com.vinipaulino.mobile.financask.ui.adapter

/**
 * Created by vinyp on 11/04/2018.
 */
import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.vinipaulino.mobile.financask.R
import br.com.vinipaulino.mobile.financask.extension.formataParaBrasileiro
import br.com.vinipaulino.mobile.financask.model.Tipo
import br.com.vinipaulino.mobile.financask.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.DecimalFormat
import java.util.*


class ListaTransacoesAdapter(transacoes: List<Transacao>,
                             context: Context) : BaseAdapter() {
    private val transacoes = transacoes
    private val context = context

    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.transacao_item, parent, false)

        val transacao = transacoes[posicao]

        if (transacao.tipo == Tipo.RECEITA) {
            viewCriada.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.receita))
            viewCriada.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_receita)
        } else {
            viewCriada.transacao_valor.setTextColor(ContextCompat.getColor(context, R.color.despesa))
            viewCriada.transacao_icone.setBackgroundResource(R.drawable.icone_transacao_item_despesa)
        }


        viewCriada.transacao_valor.text = transacao.valor.formataParaBrasileiro()
        viewCriada.transacao_categoria.text = transacao.categoria
        viewCriada.transacao_data.text = transacao.data.formataParaBrasileiro()

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

