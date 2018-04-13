package br.com.vinipaulino.mobile.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by vinicius on 12/04/18.
 */
class Transacao (val valor : BigDecimal,
                 val categoria : String = "Indefinida",
                 val tipo: Tipo,
                 val data : Calendar = Calendar.getInstance()){

    constructor(valor: BigDecimal, tipo: Tipo) : this(valor, "Indefinida", tipo)
}



