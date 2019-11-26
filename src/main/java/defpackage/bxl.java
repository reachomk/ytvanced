package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: bxl */
public final class bxl {
    private static final int i = (VERSION.SDK_INT < 26 ? 4 : 1);
    public final Context a;
    public final ActivityManager b;
    public final bxn c;
    public float d = 2.0f;
    public float e = ((float) i);
    public float f = 0.4f;
    public float g = 0.33f;
    public int h = 4194304;

    public bxl(Context context) {
        this.a = context;
        this.b = (ActivityManager) context.getSystemService("activity");
        this.c = new bxo(context.getResources().getDisplayMetrics());
        if (VERSION.SDK_INT >= 26 && this.b.isLowRamDevice()) {
            this.e = 0.0f;
        }
    }

    public final bxl a(float f) {
        chw.a(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
        this.d = f;
        return this;
    }

    public final bxm a() {
        return new bxm(this);
    }
}
