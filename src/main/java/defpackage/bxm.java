package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: bxm */
public final class bxm {
    public final int a;
    public final int b;
    public final int c;

    bxm(bxl bxl) {
        Context context = bxl.a;
        this.c = !bxl.b.isLowRamDevice() ? bxl.h : bxl.h / 2;
        ActivityManager activityManager = bxl.b;
        float f = bxl.f;
        float f2 = bxl.g;
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (activityManager.isLowRamDevice()) {
            f = f2;
        }
        int round = Math.round(memoryClass * f);
        f = (float) ((bxl.c.a() * bxl.c.b()) << 2);
        int round2 = Math.round(bxl.e * f);
        int round3 = Math.round(f * bxl.d);
        round -= this.c;
        if (round3 + round2 <= round) {
            this.b = round3;
            this.a = round2;
            return;
        }
        f = bxl.e;
        f2 = bxl.d;
        float f3 = ((float) round) / (f + f2);
        this.b = Math.round(f2 * f3);
        this.a = Math.round(f3 * bxl.e);
    }
}
