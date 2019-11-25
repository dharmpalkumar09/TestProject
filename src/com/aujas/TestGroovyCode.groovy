package com.aujas

class TestGroovyCode {

      static void checknullList(def emptylists){

        emptylists?.each{emptylist ->

            println emptylist
        }
    }
    public static void main(String[] args) {
        checknullList([])
    }




}
