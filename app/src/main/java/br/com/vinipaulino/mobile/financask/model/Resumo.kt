package br.com.vinipaulino.mobile.financask.model

import java.math.BigDecimal

/**
 * Created by vinicius on 07/05/18.
 */
class Resumo (private val transacoes: List<Transacao>){
    fun receita() : BigDecimal{
        var totalReceita = BigDecimal.ZERO
        for (transacao in transacoes) {
            if (transacao.tipo == Tipo.RECEITA) {
                totalReceita = totalReceita.plus(transacao.valor)
            }
        }
        return totalReceita
    }

    fun despesa() : BigDecimal {
        var totalDespesa = BigDecimal.ZERO
        for (transacao in transacoes){
            if (transacao.tipo == Tipo.DESPESA)
                totalDespesa = totalDespesa.plus(transacao.valor)
        }
        return totalDespesa
    }

    fun total() : BigDecimal{
        return receita().subtract(despesa())
    }
}