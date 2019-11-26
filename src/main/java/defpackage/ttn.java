package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Process;
import java.util.List;

/* renamed from: ttn */
final class ttn implements tzu {
    private final /* synthetic */ ttk a;

    ttn(ttk ttk) {
        this.a = ttk;
    }

    public final /* synthetic */ Object a() {
        List<RunningAppProcessInfo> runningAppProcesses = ucv.a(this.a.a).getRunningAppProcesses();
        boolean z = false;
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    if (runningAppProcessInfo.importance == 100) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
