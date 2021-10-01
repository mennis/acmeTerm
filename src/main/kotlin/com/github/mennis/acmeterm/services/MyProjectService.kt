package com.github.mennis.acmeterm.services

import com.intellij.openapi.project.Project
import com.github.mennis.acmeterm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
