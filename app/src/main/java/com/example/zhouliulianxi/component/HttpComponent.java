package com.example.zhouliulianxi.component;




import com.example.zhouliulianxi.MainActivity;
import com.example.zhouliulianxi.module.HttpModule;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(MainActivity mainActivity);


}
