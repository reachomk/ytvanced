package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: ege */
public final class ege implements egb {
    private final Context a;
    private final xsc b;

    public ege(Context context, xsc xsc) {
        this.a = context;
        this.b = xsc;
    }

    public final boolean a() {
        return VERSION.SDK_INT >= 21;
    }

    public final void a(acya acya) {
        if (a()) {
            acya.a(egd.class, "proc_tt");
        }
    }

    public final xbb b() {
        List appTasks = ((ActivityManager) this.a.getSystemService("activity")).getAppTasks();
        if (!(appTasks == null || appTasks.isEmpty())) {
            RecentTaskInfo taskInfo = ((AppTask) appTasks.get(0)).getTaskInfo();
            if (taskInfo != null) {
                try {
                    Field declaredField = taskInfo.getClass().getDeclaredField("firstActiveTime");
                    declaredField.setAccessible(true);
                    long longValue = ((Long) declaredField.get(taskInfo)).longValue();
                    if (longValue > 0 && longValue < this.b.a()) {
                        return new egd(this.b.b() + (longValue - this.b.a()));
                    }
                    StringBuilder stringBuilder = new StringBuilder(52);
                    stringBuilder.append("valueInCurrentMillis bad value: ");
                    stringBuilder.append(longValue);
                    throw new xbf(stringBuilder.toString());
                } catch (Exception e) {
                    afpc.a(2, afpf.initialization, "Failed to obtain process fork time using RecentTaskInfo", e);
                }
            }
        }
        return null;
    }
}
