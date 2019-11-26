package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.Window;

/* renamed from: dsy */
public final class dsy {
    public boolean a;
    public boolean b;

    public dsy(Context context, zyw zyw) {
        if (VERSION.SDK_INT >= 24 && ((PowerManager) context.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            auya auya = zyw.a().i;
            if (auya == null) {
                auya = auya.J;
            }
            aosh aosh = auya.r;
            if (aosh == null) {
                aosh = aosh.n;
            }
            this.a = aosh.l;
            this.b = aosh.m;
        }
    }

    public final void a(Window window) {
        if (this.a) {
            window.setSustainedPerformanceMode(true);
        }
    }
}
