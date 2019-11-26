package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: pxm */
final class pxm implements pwe {
    public final pvq a;
    public final pvq b;
    public Bundle c;
    public psa d = null;
    public psa e = null;
    public boolean f = false;
    public final Lock g;
    private final Context h;
    private final pvk i;
    private final Map j;
    private final Set k = Collections.newSetFromMap(new WeakHashMap());
    private final psw l;
    private int m = 0;

    public pxm(Context context, pvk pvk, Lock lock, Looper looper, psh psh, Map map, Map map2, pyp pyp, psq psq, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.h = context;
        this.i = pvk;
        this.g = lock;
        this.l = null;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        psh psh2 = psh;
        this.a = new pvq(context2, this.i, lock2, looper2, psh2, map2, null, map4, null, arrayList2, new pxp(this));
        this.b = new pvq(context2, this.i, lock2, looper2, psh2, map, pyp, map3, psq, arrayList, new pxo(this));
        zj zjVar = new zj();
        for (pss put : map2.keySet()) {
            zjVar.put(put, this.a);
        }
        for (pss put2 : map.keySet()) {
            zjVar.put(put2, this.b);
        }
        this.j = Collections.unmodifiableMap(zjVar);
    }

    private final PendingIntent i() {
        return null;
    }

    public final pts a(pts pts) {
        if (!c(pts)) {
            return this.a.a(pts);
        }
        if (!h()) {
            return this.b.a(pts);
        }
        pts.b(new Status(4, null, i()));
        return pts;
    }

    public final pts b(pts pts) {
        if (!c(pts)) {
            return this.a.b(pts);
        }
        if (!h()) {
            return this.b.b(pts);
        }
        pts.b(new Status(4, null, i()));
        return pts;
    }

    public final void a() {
        this.m = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final psa b() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.e = null;
        this.d = null;
        this.m = 0;
        this.a.c();
        this.b.c();
        g();
    }

    public final boolean d() {
        this.g.lock();
        try {
            boolean z = true;
            if (!(this.a.d() && (this.b.d() || h() || this.m == 1))) {
                z = false;
            }
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    public final boolean e() {
        this.g.lock();
        try {
            boolean z = this.m == 2;
            this.g.unlock();
            return z;
        } catch (Throwable th) {
            this.g.unlock();
        }
    }

    public final void f() {
        psa psa;
        if (pxm.b(this.d)) {
            if (pxm.b(this.e) || h()) {
                int i = this.m;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.m = 0;
                        return;
                    }
                    this.i.a(this.c);
                }
                g();
                this.m = 0;
                return;
            }
            psa = this.e;
            if (psa != null) {
                if (this.m == 1) {
                    g();
                    return;
                }
                a(psa);
                this.a.c();
            }
        } else if (this.d == null || !pxm.b(this.e)) {
            psa = this.d;
            if (psa != null) {
                psa psa2 = this.e;
                if (psa2 != null) {
                    if (this.b.l < this.a.l) {
                        psa = psa2;
                    }
                    a(psa);
                }
            }
        } else {
            this.b.c();
            a(this.d);
        }
    }

    private final void a(psa psa) {
        int i = this.m;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.m = 0;
            }
            this.i.a(psa);
        }
        g();
        this.m = 0;
    }

    private final void g() {
        for (puk a : this.k) {
            a.a();
        }
        this.k.clear();
    }

    public final void a(int i, boolean z) {
        this.i.a(i, false);
        this.e = null;
        this.d = null;
    }

    private final boolean h() {
        psa psa = this.e;
        return psa != null && psa.b == 4;
    }

    private final boolean c(pts pts) {
        pss pss = pts.b;
        pzr.b(this.j.containsKey(pss), "GoogleApiClient is not configured to use the API required for this call.");
        return ((pvq) this.j.get(pss)).equals(this.b);
    }

    private static boolean b(psa psa) {
        return psa != null && psa.b();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.b.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.a.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }
}
