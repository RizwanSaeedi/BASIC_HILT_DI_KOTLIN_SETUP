package soft.saeedi.com.hilt1;

import android.app.Application;
import android.app.SearchManager;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
