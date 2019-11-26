package org.chromium.base.task;

import defpackage.bcii;
import defpackage.bcim;
import defpackage.bcin;
import defpackage.bcio;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class PostTask {
    private static final Object a = new Object();
    private static Set b = Collections.newSetFromMap(new WeakHashMap());
    private static final Executor c = new bcii();
    private static final bcio[] d;

    public static native void nativePostDelayedTask(boolean z, int i, boolean z2, byte b, byte[] bArr, Runnable runnable, long j);

    private static void onNativeSchedulerReady() {
        synchronized (a) {
            for (bcin a : b) {
                a.a();
            }
            b = null;
        }
    }

    private static void onNativeSchedulerShutdown() {
        synchronized (a) {
            b = Collections.newSetFromMap(new WeakHashMap());
        }
    }

    static {
        bcio[] bcioArr = new bcio[5];
        bcioArr[0] = new bcim();
        d = bcioArr;
    }
}
