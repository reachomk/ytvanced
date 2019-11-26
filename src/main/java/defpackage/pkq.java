package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pkq */
public final class pkq extends pla {
    public static final pon a = new pon("CastSession");
    public final Set b = new HashSet();
    public final pnw c;
    public final pjg d;
    public final qod e;
    public ptd f;
    public plw g;
    public pjd h;
    private final Context k;
    private final pko l;
    private CastDevice m;

    public pkq(Context context, String str, String str2, pko pko, pjg pjg, qod qod) {
        pnw a;
        super(context, str, str2);
        this.k = context.getApplicationContext();
        this.l = pko;
        this.d = pjg;
        this.e = qod;
        try {
            a = qnh.a(context).a(pko, e(), new pks(this));
        } catch (RemoteException unused) {
            qnh.a.b("Unable to call %s on %s.", "newCastSessionImpl", qnm.class.getSimpleName());
            a = null;
        }
        this.c = a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Bundle bundle) {
        this.m = CastDevice.a(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Bundle bundle) {
        this.m = CastDevice.a(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(Bundle bundle) {
        e(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(Bundle bundle) {
        e(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        try {
            this.c.a(z);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "disconnectFromDevice", pnw.class.getSimpleName());
        }
        b(0);
    }

    public final plw a() {
        pzr.b("Must be called from the main thread.");
        return this.g;
    }

    public final CastDevice b() {
        pzr.b("Must be called from the main thread.");
        return this.m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    private final void e(android.os.Bundle r10) {
        /*
        r9 = this;
        r0 = "Unable to call %s on %s.";
        r10 = com.google.android.gms.cast.CastDevice.a(r10);
        r9.m = r10;
        r10 = r9.m;
        r1 = 1;
        r2 = 0;
        if (r10 == 0) goto L_0x0085;
    L_0x000e:
        r10 = r9.f;
        if (r10 == 0) goto L_0x0018;
    L_0x0012:
        r10.e();
        r10 = 0;
        r9.f = r10;
    L_0x0018:
        r10 = a;
        r0 = new java.lang.Object[r1];
        r3 = r9.m;
        r0[r2] = r3;
        r3 = "Acquiring a connection to Google Play Services for %s";
        r10.a(r3, r0);
        r10 = new pku;
        r10.<init>(r9);
        r0 = r9.k;
        r3 = r9.m;
        r4 = r9.l;
        r5 = new pkv;
        r5.<init>(r9);
        r6 = new android.os.Bundle;
        r6.<init>();
        if (r4 == 0) goto L_0x0047;
    L_0x003c:
        r7 = r4.c;
        if (r7 == 0) goto L_0x0047;
    L_0x0040:
        r7 = r7.c;
        if (r7 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r7 = 1;
        goto L_0x0048;
    L_0x0047:
        r7 = 0;
    L_0x0048:
        r8 = "com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED";
        r6.putBoolean(r8, r7);
        if (r4 == 0) goto L_0x0059;
    L_0x004f:
        r4 = r4.c;
        if (r4 == 0) goto L_0x0059;
    L_0x0053:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0059;
    L_0x0058:
        r2 = 1;
    L_0x0059:
        r1 = "com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED";
        r6.putBoolean(r1, r2);
        r1 = new ptf;
        r1.<init>(r0);
        r0 = defpackage.pje.a;
        r2 = new pjh;
        r2.<init>(r3, r5);
        r2.d = r6;
        r2 = r2.a();
        r1.a(r0, r2);
        r1.a(r10);
        r1.a(r10);
        r10 = r1.b();
        r9.f = r10;
        r10 = r9.f;
        r10.c();
        return;
    L_0x0085:
        r10 = "Must be called from the main thread.";
        defpackage.pzr.b(r10);
        r10 = 2;
        r3 = r9.j;	 Catch:{ RemoteException -> 0x00ae }
        r3 = r3.c();	 Catch:{ RemoteException -> 0x00ae }
        if (r3 != 0) goto L_0x0094;
    L_0x0093:
        goto L_0x00c1;
    L_0x0094:
        r3 = r9.j;	 Catch:{ RemoteException -> 0x009a }
        r3.e();	 Catch:{ RemoteException -> 0x009a }
        return;
    L_0x009a:
        r3 = defpackage.pla.i;
        r10 = new java.lang.Object[r10];
        r4 = "notifyFailedToResumeSession";
        r10[r2] = r4;
        r2 = defpackage.poc.class;
        r2 = r2.getSimpleName();
        r10[r1] = r2;
        r3.b(r0, r10);
        return;
    L_0x00ae:
        r3 = defpackage.pla.i;
        r4 = new java.lang.Object[r10];
        r5 = "isResuming";
        r4[r2] = r5;
        r5 = defpackage.poc.class;
        r5 = r5.getSimpleName();
        r4[r1] = r5;
        r3.b(r0, r4);
    L_0x00c1:
        r3 = r9.j;	 Catch:{ RemoteException -> 0x00c7 }
        r3.d();	 Catch:{ RemoteException -> 0x00c7 }
        return;
    L_0x00c7:
        r3 = defpackage.pla.i;
        r10 = new java.lang.Object[r10];
        r4 = "notifyFailedToStartSession";
        r10[r2] = r4;
        r2 = defpackage.poc.class;
        r2 = r2.getSimpleName();
        r10[r1] = r2;
        r3.b(r0, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkq.e(android.os.Bundle):void");
    }

    public final void a(int i) {
        qod qod = this.e;
        if (qod.i) {
            qod.i = false;
            plw plw = qod.e;
            if (plw != null) {
                pzr.b("Must be called from the main thread.");
                plw.f.remove(qod);
            }
            if (!qbf.b()) {
                ((AudioManager) qod.a.getSystemService("audio")).abandonAudioFocus(null);
            }
            bbb.a(null);
            qnt qnt = qod.c;
            if (qnt != null) {
                qnt.a();
            }
            qnt = qod.d;
            if (qnt != null) {
                qnt.a();
            }
            wq wqVar = qod.g;
            if (wqVar != null) {
                wqVar.a(null);
                qod.g.a(null);
                qod.g.a(new vl().a());
                qod.a(0, null);
                qod.g.a(false);
                qod.g.c();
                qod.g = null;
            }
            qod.e = null;
            qod.f = null;
            qod.h = null;
            qod.g();
            if (i == 0) {
                qod.h();
            }
        }
        ptd ptd = this.f;
        if (ptd != null) {
            ptd.e();
            this.f = null;
        }
        this.m = null;
        plw plw2 = this.g;
        if (plw2 != null) {
            plw2.a(null);
            this.g = null;
        }
        this.h = null;
    }

    public final long c() {
        pzr.b("Must be called from the main thread.");
        plw plw = this.g;
        return plw != null ? plw.f() - this.g.e() : 0;
    }
}
