package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import defpackage.bchn;
import defpackage.bchu;
import defpackage.bckm;
import defpackage.bclq;
import defpackage.bclw;
import defpackage.bcoq;
import org.chromium.net.NetworkChangeNotifier;

public class CronetLibraryLoader {
    private static final Object a = new Object();
    private static final String b = "cronet.76.0.3786.0";
    private static final String c = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread d = new HandlerThread("CronetInit");
    private static volatile boolean e = false;
    private static volatile boolean f;
    private static final ConditionVariable g = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    public static void a(Context context, bclq bclq) {
        synchronized (a) {
            if (!f) {
                bchn.a = context;
                if (!d.isAlive()) {
                    d.start();
                }
                a(new bclw());
            }
            if (!e) {
                if (bclq.c() != null) {
                    bclq.c().a(b);
                } else {
                    System.loadLibrary(b);
                }
                if ("76.0.3786.0".equals(nativeGetCronetVersion())) {
                    bchu.a(c, "Cronet version: %s, arch: %s", "76.0.3786.0", System.getProperty("os.arch"));
                    e = true;
                    g.open();
                } else {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[]{"76.0.3786.0", nativeGetCronetVersion()}));
                }
            }
        }
    }

    public static void a() {
        if (!f) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.a.a(true, new bckm());
            g.block();
            nativeCronetInitOnInitThread();
            f = true;
        }
    }

    public static void a(Runnable runnable) {
        if (d.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(d.getLooper()).post(runnable);
        }
    }

    private static String getDefaultUserAgent() {
        return bcoq.a(bchn.a);
    }

    private static void ensureInitializedFromNative() {
        synchronized (a) {
            e = true;
            g.open();
        }
        a(bchn.a, null);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
