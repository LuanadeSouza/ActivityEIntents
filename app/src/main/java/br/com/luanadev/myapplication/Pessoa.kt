package br.com.luanadev.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Pessoa(var nome: String, var idade: Int): Parcelable