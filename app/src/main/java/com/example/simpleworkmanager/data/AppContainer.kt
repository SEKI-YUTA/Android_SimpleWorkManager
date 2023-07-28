package com.example.simpleworkmanager.data

import android.content.Context

interface AppContainer {
    val demoRepository: DemoRepository
}

class DefaultAppContainer(context: Context): AppContainer {
    override val demoRepository: DemoRepository = DemoRepository_Impl(context)
}