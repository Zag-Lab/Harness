package com.zaglab.harness.processor

import com.google.auto.service.AutoService
import com.zaglab.harness.api.Harness
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.Element
import javax.lang.model.element.TypeElement

@AutoService(Processor::class)
class HarnessProcessor: AbstractProcessor() {
    override fun process(elements: MutableSet<out TypeElement>, env: RoundEnvironment): Boolean {
        findAndParseTargets(env)

        return true
    }

    private fun findAndParseTargets(env: RoundEnvironment) {
        env.getElementsAnnotatedWith(Harness::class.java)
                .forEach { parse(it) }

    }

    private fun parse(element: Element) {
        TODO("1. perform verifications on the annotated function;" +
                "2. prepare an kotlinpoet object to build and write at the end")
    }

    override fun getSupportedSourceVersion(): SourceVersion {
        return super.getSupportedSourceVersion()
    }

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        return super.getSupportedAnnotationTypes()
    }

    override fun init(env: ProcessingEnvironment?) {
        super.init(env)
    }
}