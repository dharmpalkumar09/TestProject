package com.aujas.test

class Checknull {
    public static void main(String[] args) {
        def datastoreNmes = ["risk"]
       // datastoreNmes = null
        def datastorename = "risk"
        //datastorename = null
        if(!datastoreNmes?.contains(datastorename?.toLowerCase())) println "datastore names is not present "
        else
            println "datastore is present"
    }
}
