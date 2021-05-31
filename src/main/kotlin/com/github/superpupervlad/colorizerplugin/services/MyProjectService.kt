package com.github.superpupervlad.colorizerplugin.services

import com.github.superpupervlad.colorizerplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
