package com.example.realmdatabase

@RealmClass
open class Contact : RealmModel {
    @PrimaryKey
    var id: String = ""

    @Required
    var name: String = ""

    @Required
    var surname: String = ""

    @Required
    var number: String = ""
}