package defpackage;

import android.app.Application;
import android.view.WindowManager;

/* renamed from: ucn */
public final class ucn {
    public static volatile int a;
    private static volatile int b;

    public static int a(Application application) {
        if (b == 0) {
            synchronized (ucn.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) application.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }
}
