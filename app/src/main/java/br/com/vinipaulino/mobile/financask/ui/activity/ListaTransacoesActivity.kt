package br.com.vinipaulino.mobile.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.vinipaulino.mobile.financask.R
import br.com.vinipaulino.mobile.financask.model.Tipo
import br.com.vinipaulino.mobile.financask.model.Transacao
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

        val transacoes = listOf(Transacao(valor = BigDecimal(20.5),
                data = Calendar.getInstance(),tipo = Tipo.DESPESA),
                Transacao(valor = BigDecimal(100.0), categoria =  "Economia",
                        tipo = Tipo.RECEITA, data =  Calendar.getInstance()))

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}