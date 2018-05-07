package br.com.vinipaulino.mobile.financask.ui

import android.view.View
import br.com.vinipaulino.mobile.financask.extension.formataParaBrasileiro
import br.com.vinipaulino.mobile.financask.model.Resumo
import br.com.vinipaulino.mobile.financask.model.Tipo
import br.com.vinipaulino.mobile.financask.model.Transacao
import kotlinx.android.synthetic.main.resumo_card.view.*
import java.math.BigDecimal

/**
 * Created by vinicius on 07/05/18.
 */
class ResumoView(private val view: View,
                 private val transacoes: List<Transacao>){

    private val resumo: Resumo = Resumo(transacoes)
    fun adicionaReceita() {
        val totalReceita = resumo.receita()

        view.resumo_card_receita.text = totalReceita
                .formataParaBrasileiro()
    }

    fun adicionaDespesa(){
       val totalDespesa = resumo.despesa()
        view.resumo_card_despesa.text = totalDespesa
                .formataParaBrasileiro()
    }

    fun adicionaTotal(){
        val total = resumo.total()
        view.resumo_card_total.text = total
                .formataParaBrasileiro()
    }
}