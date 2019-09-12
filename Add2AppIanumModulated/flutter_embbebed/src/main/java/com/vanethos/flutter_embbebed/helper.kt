package com.vanethos.flutter_embbebed

import android.app.Activity
import android.widget.FrameLayout
import androidx.lifecycle.Lifecycle
import io.flutter.facade.Flutter

/**
 * Created by goncalopalma on 2019-09-11
 * TODO: Class header comment
 */

class FlutterHelper {
    fun openFlutterScreen(activity : Activity, lifecycle : Lifecycle) {
        val flutterView = Flutter.createView(
            activity,
            lifecycle,
            "route1"
        )
        val layout = FrameLayout.LayoutParams(600, 800)
        layout.leftMargin = 100
        layout.topMargin = 200
        activity.addContentView(flutterView, layout)
    }
}