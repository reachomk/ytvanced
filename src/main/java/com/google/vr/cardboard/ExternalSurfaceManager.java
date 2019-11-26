package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.bafj;
import defpackage.bafk;
import defpackage.bafl;
import defpackage.bafm;
import defpackage.bafn;
import defpackage.bafp;
import defpackage.bafq;
import defpackage.bafr;
import defpackage.bafs;
import defpackage.baft;
import defpackage.bafu;
import defpackage.bafx;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExternalSurfaceManager {
    private static final String b = ExternalSurfaceManager.class.getSimpleName();
    public final bafx a;
    private final bafu c;
    private final Object d = new Object();
    private volatile baft e = new baft();
    private int f = 1;
    private boolean g;

    public ExternalSurfaceManager(long j) {
        bafk bafk = new bafk(j);
        bafn bafn = new bafn();
        this.a = bafk;
        this.c = bafn;
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void shutdown() {
        synchronized (this.d) {
            baft baft = this.e;
            this.e = new baft();
            if (!baft.a.isEmpty()) {
                for (Entry value : baft.a.entrySet()) {
                    ((bafp) value.getValue()).a(this.a);
                }
            }
            if (!baft.b.isEmpty()) {
                for (Entry value2 : baft.b.entrySet()) {
                    ((bafp) value2.getValue()).a(this.a);
                }
            }
        }
    }

    public int createExternalSurface() {
        return a(-1, -1, null);
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable != null && handler != null) {
            return a(i, i2, new bafm(runnable, runnable2, handler));
        }
        throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2) {
        return a(i, i2, new bafs(j, j2));
    }

    private final int a(int i, int i2, bafr bafr) {
        int i3;
        synchronized (this.d) {
            baft baft = new baft(this.e);
            i3 = this.f;
            this.f = i3 + 1;
            baft.a.put(Integer.valueOf(i3), new bafp(i3, i, i2, bafr, this.c));
            this.e = baft;
        }
        return i3;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.d) {
            baft baft = new baft(this.e);
            HashMap hashMap = baft.a;
            Integer valueOf = Integer.valueOf(i);
            bafp bafp = (bafp) hashMap.remove(valueOf);
            if (bafp != null) {
                baft.b.put(valueOf, bafp);
                this.e = baft;
            } else {
                String str = b;
                StringBuilder stringBuilder = new StringBuilder(48);
                stringBuilder.append("Not releasing nonexistent surface ID ");
                stringBuilder.append(i);
                Log.e(str, stringBuilder.toString());
            }
        }
    }

    public Surface getSurface(int i) {
        baft baft = this.e;
        HashMap hashMap = baft.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            bafp bafp = (bafp) baft.a.get(valueOf);
            if (bafp.i) {
                return bafp.h;
            }
            return null;
        }
        String str = b;
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("Surface with ID ");
        stringBuilder.append(i);
        stringBuilder.append(" does not exist, returning null");
        Log.e(str, stringBuilder.toString());
        return null;
    }

    public void consumerAttachToCurrentGLContext() {
        this.g = true;
        baft baft = this.e;
        if (!baft.a.isEmpty()) {
            for (bafp a : baft.a.values()) {
                a.a();
            }
        }
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.g = true;
        baft baft = this.e;
        if (!this.e.a.isEmpty()) {
            for (Integer containsKey : this.e.a.keySet()) {
                if (!map.containsKey(containsKey)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", new Object[]{containsKey}));
                    return;
                }
            }
        }
        if (!map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                if (baft.a.containsKey(entry.getKey())) {
                    ((bafp) baft.a.get(entry.getKey())).a(((Integer) entry.getValue()).intValue());
                } else {
                    Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", new Object[]{entry.getKey()}));
                }
            }
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.g = false;
        baft baft = this.e;
        if (!baft.a.isEmpty()) {
            for (bafp bafp : baft.a.values()) {
                if (bafp.i) {
                    bafr bafr = bafp.b;
                    if (bafr != null) {
                        bafr.c();
                    }
                    bafp.g.detachFromGLContext();
                    bafp.i = false;
                }
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        a(new bafj(this));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        a(new bafl(this));
    }

    private final void a(bafq bafq) {
        baft baft = this.e;
        if (this.g && !baft.a.isEmpty()) {
            for (bafp bafp : baft.a.values()) {
                bafp.a();
                bafq.a(bafp);
            }
        }
        if (!baft.b.isEmpty()) {
            for (bafp a : baft.b.values()) {
                a.a(this.a);
            }
        }
    }
}
