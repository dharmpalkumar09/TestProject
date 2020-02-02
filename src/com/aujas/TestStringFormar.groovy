package com.aujas

class TestStringFormar {
    public static void main(String[] args) {
        def stri = "((objectClass=person)(objectClass=organizationalPerson)(cn=%s))"
        stri = sprintf(stri,"exide1")
        println stri
    }
}
