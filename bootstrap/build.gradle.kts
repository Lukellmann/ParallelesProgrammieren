@file:Suppress("SpellCheckingInspection")

plugins {
    `paralleles-programmieren`
    application
    id("io.freefair.lombok") version "6.2.0"
}

application {
    mainClass.set("de.dhbw.parprog.HelloWorld")
}
