package com.example.firestoretut

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.DocumentReference

class YearWizeQuizList {
    @DocumentId var id:String?=null

    var Test1:ArrayList<DocumentReference>?=null

    constructor(){


    }

    constructor(id: String?, Test1: ArrayList<DocumentReference>?) {
        this.id = id
        this.Test1 = Test1
    }


}