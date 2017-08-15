package jtonic.tmp.springbootkt.progkt.miscs

import javax.swing.JButton

/**
 * Created by Antonel Ernest Pazargic on 28/07/2017.
 * @author Antonel Ernest Pazargic
 */

fun main(vararg args: String) {

    fun createButton1(): JButton {
        val button = JButton()
        button.text = "Press it"
        button.isVisible = true
        button.isSelected = true
        return button
    }

    fun createButton2() = JButton().apply {
        text = "PressIt"
        isVisible = true
        isSelected = true
    }

}