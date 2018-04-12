package br.com.vinipaulino.mobile.financask.model

import java.math.BigDecimal
import java.util.Calendar

/**
 * Created by vinicius on 12/04/18.
 */
class Transacao (valor : BigDecimal,
                 categoria : String,
                 data : Calendar

    ) {
    val valor: BigDecimal = valor
    val categoria: String = categoria
    val data: Calendar = data




}