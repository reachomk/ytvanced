package defpackage;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.Future;

/* renamed from: zqe */
public final class zqe implements tek, ten, zqz {
    public Context a;
    public tlf b;
    public zzl c;
    private final zqi d = new zqi();
    private tlc e;

    zqe() {
    }

    public final synchronized void b() {
    }

    public final synchronized void d() {
        tlc tlc = this.e;
        if (tlc != null) {
            tlc.c();
            this.e = null;
        }
    }

    /* JADX WARNING: Missing block: B:24:0x0058, code skipped:
            return;
     */
    public final synchronized void a(defpackage.zrc r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ all -> 0x005f }
        r0 = r0.b();	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0059;
    L_0x0009:
        r0 = r2.c;	 Catch:{ all -> 0x005f }
        r0 = r0.b();	 Catch:{ all -> 0x005f }
        r0 = r0.c;	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = defpackage.aujp.C;	 Catch:{ all -> 0x005f }
    L_0x0015:
        r0 = r0.l;	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0059;
    L_0x001a:
        r0 = r2.a;	 Catch:{ all -> 0x005f }
        r1 = 3;
        r0 = defpackage.alai.a(r0, r1);	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0059;
    L_0x0023:
        r0 = r2.e;	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0031;
    L_0x0027:
        r0 = r2.b;	 Catch:{ all -> 0x005f }
        r1 = r2.a;	 Catch:{ all -> 0x005f }
        r0 = r0.a(r1, r2, r2);	 Catch:{ all -> 0x005f }
        r2.e = r0;	 Catch:{ all -> 0x005f }
    L_0x0031:
        r0 = r2.e;	 Catch:{ all -> 0x005f }
        r0 = r0.e();	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0041;
    L_0x0039:
        r0 = r2.f();	 Catch:{ all -> 0x005f }
        r3.a(r0);	 Catch:{ all -> 0x005f }
        goto L_0x0057;
    L_0x0041:
        r0 = r2.d;	 Catch:{ all -> 0x005f }
        r0 = r0.a;	 Catch:{ all -> 0x005f }
        r0.add(r3);	 Catch:{ all -> 0x005f }
        r3 = r2.e;	 Catch:{ all -> 0x005f }
        r3 = r3.d();	 Catch:{ all -> 0x005f }
        if (r3 != 0) goto L_0x0057;
    L_0x0050:
        r3 = r2.e;	 Catch:{ all -> 0x005f }
        r3.b();	 Catch:{ all -> 0x005f }
        monitor-exit(r2);
        return;
    L_0x0057:
        monitor-exit(r2);
        return;
    L_0x0059:
        r0 = 0;
        r3.a(r0);	 Catch:{ all -> 0x005f }
        monitor-exit(r2);
        return;
    L_0x005f:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqe.a(zrc):void");
    }

    public final Future e() {
        wxf a = wxf.a();
        a(new zqd(a));
        return new wza(a);
    }

    public final synchronized void a() {
        this.d.a(new zqg(this));
    }

    public final synchronized void c() {
        this.d.a(zqf.a);
    }

    public final aukf f() {
        tlc tlc = this.e;
        if (tlc == null) {
            return null;
        }
        Location a = tlc.a();
        if (a == null) {
            return null;
        }
        auki auki = (auki) aukf.e.createBuilder();
        double longitude = a.getLongitude();
        auki.copyOnWrite();
        aukf aukf = (aukf) auki.instance;
        aukf.a |= 2;
        aukf.c = longitude;
        longitude = a.getLatitude();
        auki.copyOnWrite();
        aukf = (aukf) auki.instance;
        aukf.a |= 1;
        aukf.b = longitude;
        float accuracy = a.getAccuracy();
        auki.copyOnWrite();
        aukf aukf2 = (aukf) auki.instance;
        aukf2.a |= 4;
        aukf2.d = (double) accuracy;
        return (aukf) ((anxl) auki.build());
    }
}
