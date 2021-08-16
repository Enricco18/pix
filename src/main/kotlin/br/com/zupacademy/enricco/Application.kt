package br.com.zupacademy.enricco

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zupacademy.enricco")
		.start()
}

