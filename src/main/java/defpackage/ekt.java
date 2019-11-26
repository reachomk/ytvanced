package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ekt */
public final class ekt implements ajan, eib, ell, t, xcp {
    public final Set a = new HashSet();
    public int b = 0;
    private final aizy c;
    private final zyw d;
    private final xci e;
    private final ajam f;
    private final bdfu g = new bdfu();
    private String h;

    public ekt(aizy aizy, xci xci, ajam ajam, zyw zyw) {
        this.c = aizy;
        this.e = xci;
        this.f = ajam;
        this.d = zyw;
        this.h = aizy.k();
        if (!TextUtils.isEmpty(this.h)) {
            this.b = !aizy.c() ? 1 : 2;
        }
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void ar_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final long e() {
        return 1;
    }

    public final void a(ela ela) {
        this.a.add(ela);
    }

    public final void aw_() {
        if (foh.w(this.d)) {
            this.g.a(a(this.f));
        } else {
            this.e.a((Object) this);
        }
    }

    public final void a(af afVar) {
        if (foh.w(this.d)) {
            this.g.a();
        } else {
            this.e.b(this);
        }
    }

    public final synchronized void a(eja eja) {
        if (eja == null) {
            this.h = null;
            a(0);
        } else if (!TextUtils.equals(eja.b(), this.h)) {
            a(1);
        }
    }

    public final synchronized void A_() {
        if (!this.c.c()) {
            if (TextUtils.isEmpty(this.h)) {
                a(0);
            } else {
                a(1);
            }
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0030, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ahkn r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r6.a;	 Catch:{ all -> 0x0031 }
        r1 = 1;
        r2 = new defpackage.airi[r1];	 Catch:{ all -> 0x0031 }
        r3 = defpackage.airi.NEW;	 Catch:{ all -> 0x0031 }
        r4 = 0;
        r2[r4] = r3;	 Catch:{ all -> 0x0031 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0015;
    L_0x0011:
        r6 = 0;
        r5.h = r6;	 Catch:{ all -> 0x0031 }
        goto L_0x002f;
    L_0x0015:
        r0 = r6.a;	 Catch:{ all -> 0x0031 }
        r1 = new defpackage.airi[r1];	 Catch:{ all -> 0x0031 }
        r2 = defpackage.airi.PLAYBACK_LOADED;	 Catch:{ all -> 0x0031 }
        r1[r4] = r2;	 Catch:{ all -> 0x0031 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x002f;
    L_0x0023:
        r6 = r6.b;	 Catch:{ all -> 0x0031 }
        if (r6 == 0) goto L_0x002f;
    L_0x0027:
        r6 = r6.b();	 Catch:{ all -> 0x0031 }
        r5.h = r6;	 Catch:{ all -> 0x0031 }
        monitor-exit(r5);
        return;
    L_0x002f:
        monitor-exit(r5);
        return;
    L_0x0031:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekt.a(ahkn):void");
    }

    public final void a(ahkr ahkr) {
        int i = ahkr.a;
        if (i != 2) {
            if (i == 8) {
                a(4);
            } else if (!(ahkr.a() || this.b == 1)) {
                a(3);
            }
            return;
        }
        a(2);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().d.f().a(emg.a(this.d, 2, 1)).a(new ekw(this), ekv.a), ajam.Q().a.f().a(emg.a(this.d, 2)).a(new eky(this), ekx.a)};
    }

    private final void a(int i) {
        if (this.b != i) {
            this.b = i;
            for (ela a : this.a) {
                a.a(i);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
