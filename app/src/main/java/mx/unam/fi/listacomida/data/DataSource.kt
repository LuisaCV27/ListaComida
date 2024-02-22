package mx.unam.fi.listacomida.data

import mx.unam.fi.listacomida.R
import mx.unam.fi.listacomida.model.Platillo

class DataSource {
    fun LoadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno, R.string.precio_desayuno,R.string.oferta_desayuno),
            Platillo(R.string.hamburger, R.drawable.hamburger, R.string.precio_hamburger,R.string.oferta_hamburger),
            Platillo(R.string.pizza, R.drawable.pizza, R.string.precio_pizza,R.string.oferta_pizza),
            Platillo(R.string.postre, R.drawable.postre, R.string.precio_postre,R.string.oferta_postre),
            Platillo(R.string.pozole, R.drawable.pozole, R.string.precio_pozole,R.string.oferta_pozole),
            Platillo(R.string.tacos, R.drawable.tacos, R.string.precio_tacos,R.string.oferta_tacos)
        )
    }
}