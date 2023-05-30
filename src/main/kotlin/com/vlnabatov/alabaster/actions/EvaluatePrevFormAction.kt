package com.vlnabatov.alabaster.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.diagnostic.Logger
import cursive.repl.actions.ReplAction

@Suppress("UnstableApiUsage", "unused")
class EvaluatePrevFormAction : EvaluateInlineBaseAction(ReplAction.findPrevForm) {
    private val log = Logger.getInstance(AnAction::class.java)
}
