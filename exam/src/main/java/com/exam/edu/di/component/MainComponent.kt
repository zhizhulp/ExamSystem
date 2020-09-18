package com.exam.edu.di.component

import dagger.Component
import com.jess.arms.di.component.AppComponent

import com.exam.edu.di.module.MainModule

import com.jess.arms.di.scope.ActivityScope
import com.exam.edu.mvp.ui.activity.MainActivity


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 09/18/2020 17:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(AppComponent::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}
