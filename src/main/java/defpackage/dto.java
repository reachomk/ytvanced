package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.apps.youtube.app.application.Shell$HomeActivity;
import com.google.android.apps.youtube.app.application.Shell$UrlActivity;
import java.util.List;

/* renamed from: dto */
final class dto implements Runnable {
    private final /* synthetic */ dtl a;

    dto(dtl dtl) {
        this.a = dtl;
    }

    public final void run() {
        if (this.a.a().i) {
            dsf dsf = (dsf) this.a.f.get();
            if (dsf.d == 0) {
                synchronized (dsf.b) {
                    if (dsf.d == 0) {
                        int i = 1;
                        if (VERSION.SDK_INT >= 21) {
                            ActivityManager activityManager = (ActivityManager) dsf.a.getSystemService("activity");
                            List appTasks = activityManager != null ? activityManager.getAppTasks() : null;
                            if (appTasks != null) {
                                if (appTasks.isEmpty()) {
                                    i = 4;
                                } else {
                                    AppTask appTask = (AppTask) appTasks.get(0);
                                    if (appTask != null) {
                                        RecentTaskInfo taskInfo = appTask.getTaskInfo();
                                        if (!(taskInfo == null || taskInfo.baseIntent == null)) {
                                            Intent intent = taskInfo.baseIntent;
                                            if (intent != null) {
                                                ComponentName component = intent.getComponent();
                                                if (component != null) {
                                                    String className = component.getClassName();
                                                    if (className != null) {
                                                        i = !dsf.a(intent, className, Shell$HomeActivity.class) ? !dsf.a(intent, className, Shell$UrlActivity.class) ? 5 : 3 : 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        dsf.d = i;
                        dsf.c.open();
                        dsf.b();
                    }
                }
            }
        }
    }
}
