package com.hdyl.pushbox.base;

import android.app.Application;

public class App extends Application {

	public static App instance;

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}

	public static App getContext() {
		return instance;
	}

}
