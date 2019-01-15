package com.adhocmaster.roundtablediscussion.framework

interface StructuredActivity {

    fun processIntents()  // Write all the incoming intent processing logic here

    fun initUIComponents()  // bind class objects to UI elements here

    fun registerEvents()  //register events here

}