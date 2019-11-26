package com.google.vr.cardboard;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import defpackage.bafh;
import defpackage.bafw;
import java.util.concurrent.TimeUnit;

public class DisplaySynchronizer implements FrameCallback {
    private static final long c = TimeUnit.SECONDS.toNanos(1);
    public volatile long a;
    public bafw b;
    private volatile Display d;
    private DisplayMetrics e;
    private volatile int f = -1;
    private long g = 0;

    public DisplaySynchronizer(Context context, Display display) {
        this.a = nativeCreate(getClass().getClassLoader(), context.getApplicationContext());
        if (this.a != 0) {
            a(display);
            this.b = new bafw(this);
            bafw bafw = this.b;
            bafw.a.start();
            bafw.b = new Handler(bafw.a.getLooper(), bafw);
            bafw.b.sendEmptyMessage(0);
            return;
        }
        throw new IllegalStateException("Native DisplaySynchronizer creation failed, implementation unavailable.");
    }

    public native long nativeCreate(ClassLoader classLoader, Context context);

    public native void nativeDestroy(long j);

    public native void nativeOnMetricsChanged(long j);

    public native void nativeReset(long j, long j2, long j3);

    public native void nativeUpdate(long j, long j2, int i);

    public final void a(Display display) {
        b();
        this.d = display;
        c();
        float refreshRate = display.getRefreshRate();
        long j = 0;
        long toNanos = refreshRate >= 30.0f ? (long) (((float) TimeUnit.SECONDS.toNanos(1)) / refreshRate) : 0;
        if (VERSION.SDK_INT >= 21) {
            j = display.getAppVsyncOffsetNanos();
        }
        nativeReset(this.a, toNanos, j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (this.a != 0) {
                Log.w("DisplaySynchronizer", "DisplaySynchronizer.shutdown() should be called to ensure resource cleanup");
                nativeDestroy(this.a);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void a() {
        bafw bafw = this.b;
        if (bafw != null) {
            bafw.a();
        }
    }

    public final void doFrame(long j) {
        b();
        if (this.f == -1 || j - this.g > c) {
            int rotation = this.d.getRotation();
            if (rotation == 0) {
                this.f = 0;
            } else if (rotation == 1) {
                this.f = 90;
            } else if (rotation == 2) {
                this.f = 180;
            } else if (rotation != 3) {
                Log.e("DisplaySynchronizer", "Unknown display rotation, defaulting to 0");
                this.f = 0;
            } else {
                this.f = 270;
            }
            this.g = j;
        }
        nativeUpdate(this.a, j, this.f);
    }

    public final void b() {
        if (this.a == 0) {
            throw new IllegalStateException("DisplaySynchronizer has already been shut down.");
        }
    }

    public final void c() {
        this.f = -1;
        DisplayMetrics a = bafh.a(this.d);
        if (!a.equals(this.e)) {
            if (this.e != null) {
                nativeOnMetricsChanged(this.a);
            }
            this.e = a;
        }
    }
}
