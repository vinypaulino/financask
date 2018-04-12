package br.com.vinipaulino.mobile.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.vinipaulino.mobile.financask.R
import br.com.vinipaulino.mobile.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

/**
 * Created by vinyp on 09/04/2018.
 */
class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf("Comida - R$ 20,00","Gasolina R$ 170,00")

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}