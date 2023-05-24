package com.example.myblog

class Affichages(var id: Int? = null, var titre: String? = null, var description: String? = null) {
    constructor(id: Int, titre: String, description: String) : this() {
        this.id = id
        this.titre = titre
        this.description = description
    }
}
