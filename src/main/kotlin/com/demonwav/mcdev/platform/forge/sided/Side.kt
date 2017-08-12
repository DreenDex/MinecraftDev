/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2017 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.platform.forge.sided

import com.intellij.openapi.util.Key

enum class Side(val annotation: String) {

    CLIENT("SideOnly.CLIENT"),
    SERVER("SideOnly.SERVER"),
    NONE("NONE"),
    INVALID("INVALID");

    companion object {
        val KEY = Key<Side>("MC_DEV_SIDE")
    }
}