package com.example.progressbardots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import androidx.core.content.ContextCompat
import com.agrawalsuneet.dotsloader.loaders.LazyLoader
import com.agrawalsuneet.dotsloader.loaders.TashieLoader
import com.agrawalsuneet.dotsloader.loaders.TrailingCircularDotsLoader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code Lazy Loader
//        val loader: LazyLoader = LazyLoader(this, 15, 5,
//                ContextCompat.getColor(this, R.color.loader_selected),
//                ContextCompat.getColor(this, R.color.loader_selected),
//                ContextCompat.getColor(this, R.color.loader_selected))
//                .apply {
//                    animDuration = 500
//                    firstDelayDuration = 100
//                    secondDelayDuration = 200
//                    interpolator = DecelerateInterpolator()
//                }
//        myLazyLoader.addView(loader)

        //Code TashieLoader
//        var tashie = TashieLoader(
//                this, 5,
//                30, 10,
//                ContextCompat.getColor(this, R.color.colorPurple))
//                .apply {
//                    animDuration = 500
//                    animDelay = 100
//                    interpolator = LinearInterpolator()
//                }
//        myTashieLoader.addView(tashie)

        //Code TrailingCircularDotsLoader
//        var trailingCircularDotsLoader = TrailingCircularDotsLoader(
//            this,
//            24,
//            ContextCompat.getColor(this, android.R.color.holo_green_light),
//            100,
//            5)
//            .apply {
//                animDuration = 1200
//                animDelay = 200
//            }

//        myTrailingCircularDotsLoader.addView(trailingCircularDotsLoader)

        //Code AllianceLoader
//        private fun initAllianceLoader() {
//            val allianceLoader = AllianceLoader(
//                this,
//                40,
//                6,
//                true,
//                10,
//                ContextCompat.getColor(this, R.color.red),
//                ContextCompat.getColor(this, R.color.amber),
//                ContextCompat.getColor(this, R.color.green)
//            ).apply {
//                animDuration = 5000
//            }
//
//            containerLL.addView(allianceLoader)

        //Code PullInLoader
//        val pullInLoader = PullInLoader(this,
//            20, 100, ContextCompat.getColor(this, R.color.red))
//            .apply {
//                animDuration = 2000
//            }
//
//        containerLL.addView(pullInLoader)
//
//        val pullInLoader2 = PullInLoader(this,
//            30, 160, resources.getIntArray(R.array.vibgyorg))
//            .apply {
//                animDuration = 2000
//            }
//
//        containerLL.addView(pullInLoader2)

        //Code LinearDotsLoader
//        var loader = LinearDotsLoader(this)
//        loader.defaultColor = ContextCompat.getColor(this, R.color.loader_defalut)
//        loader.selectedColor = ContextCompat.getColor(this, R.color.loader_selected)
//        loader.isSingleDir = false
//        loader.noOfDots = 5
//        loader.selRadius = 60
//        loader.expandOnSelect = false
//        loader.radius = 40
//        loader.dotsDistance = 20
//        loader.animDur = 1000
//        loader.firstShadowColor = ContextCompat.getColor(this, R.color.pink_selected)
//        loader.secondShadowColor = ContextCompat.getColor(this, R.color.purple_selected)
//        loader.showRunningShadow = true
//        containerLL.addView(loader)

        //Code CircularDotsLoader
//        var cirLoader = CircularDotsLoader(this)
//        cirLoader.defaultColor = ContextCompat.getColor(this, R.color.blue_delfault)
//        cirLoader.selectedColor = ContextCompat.getColor(this, R.color.blue_selected)
//        cirLoader.bigCircleRadius = 120
//        cirLoader.radius = 40
//        cirLoader.animDur = 100
//        cirLoader.firstShadowColor = ContextCompat.getColor(this, R.color.pink_selected)
//        cirLoader.secondShadowColor = ContextCompat.getColor(this, R.color.purple_selected)
//        cirLoader.showRunningShadow = true
//
//        containerLL.addView(cirLoader)

        //Code
//        val loader = RotatingCircularDotsLoader(this,
//            20, 60, ContextCompat.getColor(this, R.color.red))
//            .apply {
//                animDuration = 3000
//            }
//
//        containerLL.addView(loader)

    }
}