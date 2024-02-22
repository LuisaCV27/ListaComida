package mx.unam.fi.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    @StringRes val stringResourceIdPrecios: Int,
    @StringRes val stringResourceIdOfertas: Int,
)

