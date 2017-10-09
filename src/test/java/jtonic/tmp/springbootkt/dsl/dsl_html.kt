package jtonic.tmp.springbootkt.dsl

import kotlinx.html.a
import kotlinx.html.button
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.li
import kotlinx.html.role
import kotlinx.html.span
import kotlinx.html.ul

/**
 * Created by Antonel Ernest Pazargic on 09/10/2017.
 * @author Antonel Ernest Pazargic
 */

fun buildDropDown() = createHTMLDocument().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }
    ul(classes = "dropdown-menu") {
        li { a("#") {+ "Action"} }
        li { a("#") {+ "Another action"} }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" }}
    }
}

fun main(args: Array<String>) {
    val dropDown = buildDropDown()
    println(dropDown.serialize())
}