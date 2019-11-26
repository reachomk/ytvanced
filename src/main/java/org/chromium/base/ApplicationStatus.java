package org.chromium.base;

import defpackage.bchi;
import defpackage.bchj;
import defpackage.bchv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ApplicationStatus {
    public static bchj a;
    public static final bchv b = new bchv();
    private static final Map c = Collections.synchronizedMap(new HashMap());

    private ApplicationStatus() {
    }

    private static native void nativeOnApplicationStateChange(int i);

    public static int getStateForApplication() {
        synchronized (c) {
        }
        return 0;
    }

    public static void a(bchj bchj) {
        b.a((Object) bchj);
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        bchi bchi = new bchi();
        if (ThreadUtils.b()) {
            bchi.run();
        } else {
            ThreadUtils.a().post(bchi);
        }
    }

    static {
        bchv bchv = new bchv();
        bchv = new bchv();
    }
}
