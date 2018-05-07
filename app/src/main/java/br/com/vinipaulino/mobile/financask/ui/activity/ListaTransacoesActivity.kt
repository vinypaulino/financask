package br.com.vinipaulino.mobile.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.vinipaulino.mobile.financask.R
import br.com.vinipaulino.mobile.financask.model.Tipo
import br.com.vinipaulino.mobile.financask.model.Transacao
import br.com.vinipaulino.mobile.financask.ui.ResumoView
import br.com.vinipaulino.mobile.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

/**
 * Created by vinyp on 09/04/2018.
 */
class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = transacoesDeExemplo()

        configuraResumo(transacoes)

        configuraLista(transacoes)
    }

    private fun configuraResumo(transacoes: List<Transacao>) {
        val view = window.decorView
        val resumoView = ResumoView(view, transacoes)
        resumoView.adicionaReceita()
        resumoView.adicionaDespesa()
        resumoView.adicionaTotal()
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    private fun transacoesDeExemplo(): List<Transacao> {
        return listOf(Transacao(valor = BigDecimal(20.5),
                data = Calendar.getInstance(), tipo = Tipo.DESPESA),
                Transacao(valor = BigDecimal(100.0), categoria = "Economia",
                        tipo = Tipo.RECEITA, data = Calendar.getInstance()))
    }
}