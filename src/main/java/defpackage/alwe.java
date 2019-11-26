package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: alwe */
public final class alwe {
    public final Context a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public boolean j = true;
    public int k = 0;
    public int l;
    public int m;
    public boolean n;
    public int o = 1;
    public int p = 2;

    public alwe(Context context) {
        SystemClock.elapsedRealtime();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        SystemClock.elapsedRealtime();
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        SystemClock.elapsedRealtime();
        int i = VERSION.SDK_INT;
        String str = VERSION.INCREMENTAL;
        SystemClock.elapsedRealtime();
        String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.i = xul.c(context);
        SystemClock.elapsedRealtime();
        this.a = context;
        this.b = displayMetrics.densityDpi;
        this.c = displayMetrics.heightPixels;
        this.d = displayMetrics.widthPixels;
        this.e = j / 1024;
        this.f = i;
        this.g = str;
        this.h = property;
    }

    public final void a() {
        this.n = ucv.b(this.a);
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra != 5 && intExtra != 2) {
            this.o = 2;
        } else if (intExtra2 == 1) {
            this.o = 4;
        } else if (intExtra2 == 2) {
            this.o = 3;
        } else if (intExtra2 == 4) {
            this.o = 5;
        } else {
            this.o = 1;
        }
        int a = aycp.a(intent.getIntExtra("health", 1));
        this.p = a;
        if (a == 0) {
            this.p = 2;
        }
    }

    public final boolean b() {
        a();
        return this.n;
    }
}
