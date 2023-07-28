package com.example.simpleworkmanager.data

import android.content.Context
import android.util.Log
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.simpleworkmanager.data.DemoRepository
import com.example.simpleworkmanager.worker.DemoWorker

class DemoRepository_Impl(context: Context): DemoRepository {
    private val workManager = WorkManager.getInstance(context)
    // Workerを動かす処理
    override fun demoFunc() {
        val demoWorkerBuilder = OneTimeWorkRequestBuilder<DemoWorker>()
        workManager.enqueue(demoWorkerBuilder.build())
    }
}