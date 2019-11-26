package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: xj */
final class xj extends wb {
    private final /* synthetic */ xe a;

    xj(xe xeVar) {
        this.a = xeVar;
    }

    public final boolean a() {
        return true;
    }

    public final CharSequence j() {
        return null;
    }

    public final boolean m() {
        return false;
    }

    public final int n() {
        return 0;
    }

    public final boolean o() {
        return false;
    }

    public final int p() {
        return 0;
    }

    public final Bundle q() {
        return null;
    }

    public final void z() {
    }

    public final void a(String str, Bundle bundle, xm xmVar) {
        if (xmVar != null) {
            ResultReceiver resultReceiver = xmVar.a;
        }
        a(1, new xg());
    }

    public final boolean a(KeyEvent keyEvent) {
        a(21, (Object) keyEvent);
        return true;
    }

    public final void a(vx vxVar) {
        if (this.a.g) {
            try {
                vxVar.a();
            } catch (Exception unused) {
            }
            return;
        }
        this.a.f.register(vxVar, new vk(this.a.b(xj.getCallingUid()), xj.getCallingPid(), xj.getCallingUid()));
    }

    public final void b(vx vxVar) {
        this.a.f.unregister(vxVar);
    }

    public final String b() {
        return this.a.a;
    }

    public final String c() {
        return this.a.b;
    }

    public final PendingIntent d() {
        PendingIntent pendingIntent;
        synchronized (this.a.e) {
            pendingIntent = this.a.l;
        }
        return pendingIntent;
    }

    public final long e() {
        long j;
        synchronized (this.a.e) {
            j = (long) this.a.i;
        }
        return j;
    }

    public final xq f() {
        int i;
        int i2;
        int i3;
        int streamMaxVolume;
        int streamVolume;
        synchronized (this.a.e) {
            xe xeVar = this.a;
            i = xeVar.n;
            i2 = xeVar.o;
            vq vqVar = xeVar.p;
            i3 = 2;
            if (i != 2) {
                streamMaxVolume = xeVar.c.getStreamMaxVolume(i2);
                streamVolume = this.a.c.getStreamVolume(i2);
            } else {
                int i4 = vqVar.a;
                i3 = vqVar.b;
                streamVolume = vqVar.c;
                streamMaxVolume = i3;
                i3 = i4;
            }
        }
        return new xq(i, i2, i3, streamMaxVolume, streamVolume);
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public final void b(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void r() {
        d(3);
    }

    public final void a(String str, Bundle bundle) {
        a(4, (Object) str, bundle);
    }

    public final void b(String str, Bundle bundle) {
        a(5, (Object) str, bundle);
    }

    public final void a(Uri uri, Bundle bundle) {
        a(6, (Object) uri, bundle);
    }

    public final void s() {
        d(7);
    }

    public final void c(String str, Bundle bundle) {
        a(8, (Object) str, bundle);
    }

    public final void d(String str, Bundle bundle) {
        a(9, (Object) str, bundle);
    }

    public final void b(Uri uri, Bundle bundle) {
        a(10, (Object) uri, bundle);
    }

    public final void a(long j) {
        a(11, Long.valueOf(j));
    }

    public final void t() {
        d(12);
    }

    public final void u() {
        d(13);
    }

    public final void v() {
        d(14);
    }

    public final void w() {
        d(15);
    }

    public final void x() {
        d(16);
    }

    public final void y() {
        d(17);
    }

    public final void b(long j) {
        a(18, Long.valueOf(j));
    }

    public final void a(vo voVar) {
        a(19, (Object) voVar);
    }

    public final void a(vo voVar, Bundle bundle) {
        a(31, (Object) voVar, bundle);
    }

    public final void a(float f) {
        a(32, Float.valueOf(f));
    }

    public final void a(boolean z) {
        a(29, Boolean.valueOf(z));
    }

    public final void b(int i) {
        c(23, i);
    }

    public final void c(int i) {
        c(30, i);
    }

    public final void e(String str, Bundle bundle) {
        a(20, (Object) str, bundle);
    }

    public final vj g() {
        return this.a.j;
    }

    public final xs h() {
        xs xsVar;
        vj vjVar;
        synchronized (this.a.e) {
            xe xeVar = this.a;
            xsVar = xeVar.k;
            vjVar = xeVar.j;
        }
        return wq.a(xsVar, vjVar);
    }

    public final List i() {
        synchronized (this.a.e) {
        }
        return null;
    }

    public final void a(ve veVar) {
        a(25, (Object) veVar);
    }

    public final void a(ve veVar, int i) {
        this.a.a(26, i, 0, veVar, null);
    }

    public final void b(ve veVar) {
        a(27, (Object) veVar);
    }

    public final void a(int i) {
        c(28, i);
    }

    public final Bundle k() {
        synchronized (this.a.e) {
        }
        return null;
    }

    public final int l() {
        return this.a.m;
    }

    private final void d(int i) {
        this.a.a(i, 0, 0, null, null);
    }

    private final void c(int i, int i2) {
        this.a.a(i, i2, 0, null, null);
    }

    private final void a(int i, Object obj) {
        this.a.a(i, 0, 0, obj, null);
    }

    private final void a(int i, Object obj, Bundle bundle) {
        this.a.a(i, 0, 0, obj, bundle);
    }
}
