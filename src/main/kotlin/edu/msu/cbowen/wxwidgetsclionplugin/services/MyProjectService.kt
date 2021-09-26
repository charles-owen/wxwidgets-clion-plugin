package edu.msu.cbowen.wxwidgetsclionplugin.services

import com.intellij.openapi.project.Project
import edu.msu.cbowen.wxwidgetsclionplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
