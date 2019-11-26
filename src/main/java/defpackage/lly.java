package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: lly */
public final class lly implements exv, lgt {
    public final bcaa a;
    public final llx b = new llx();
    private final ahyg c;
    private final lfx d;
    private final lgq e;
    private final lnn f;
    private enm g;

    public lly(ahyg ahyg, bcaa bcaa, lfx lfx, lgq lgq, lnn lnn) {
        this.c = ahyg;
        this.a = bcaa;
        this.d = lfx;
        this.e = lgq;
        this.f = lnn;
    }

    public final void a() {
        this.e.a.a.add(this);
        this.c.a(this.b);
        enm enm = (enm) aikb.a(this.e);
        if (!amqq.a(this.g, enm)) {
            a(enm, null);
        }
    }

    public final void b() {
        this.e.a.a.remove(this);
        this.c.a(ahxy.a);
    }

    public final acvx a(enm enm) {
        lnn lnn = this.f;
        lnq lnq = (lnq) lnn.b.get(enm);
        if (lnq == null) {
            lnq = new lnq(lnn.a);
            lnn.b.put(enm, lnq);
        }
        acvx a = lnq.a();
        if (a != null) {
            return a;
        }
        a = lnq.a.a(acxe.m);
        lnq.b = new WeakReference(a);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    public final void a(defpackage.enm r4, defpackage.enm r5, defpackage.aizn r6, int r7) {
        /*
        r3 = this;
        r0 = r3.g;
        r0 = r3.b(r0);
        r5 = r3.b(r5);
        r1 = 0;
        r2 = 2;
        if (r7 == r2) goto L_0x0010;
    L_0x000e:
        r6 = r1;
        goto L_0x0020;
    L_0x0010:
        r7 = defpackage.aizn.PREVIOUS;
        if (r6 != r7) goto L_0x0019;
    L_0x0014:
        r5 = defpackage.acwc.PLAYER_PREVIOUS_BUTTON;
    L_0x0016:
        r6 = r5;
        r5 = r0;
        goto L_0x0020;
    L_0x0019:
        r7 = defpackage.aizn.NEXT;
        if (r6 != r7) goto L_0x000e;
    L_0x001d:
        r5 = defpackage.acwc.PLAYER_NEXT_BUTTON;
        goto L_0x0016;
    L_0x0020:
        if (r5 == 0) goto L_0x0026;
    L_0x0022:
        r1 = defpackage.ahyh.a(r5, r6);
    L_0x0026:
        r3.a(r4, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lly.a(enm, enm, aizn, int):void");
    }

    public final void c() {
        a(null, null);
    }

    private final void a(enm enm, ahyh ahyh) {
        enm enm2 = this.g;
        if (enm2 != null) {
            lnq lnq = (lnq) this.f.b.get(enm2);
            if (lnq != null) {
                WeakReference weakReference = lnq.b;
                acvx acvx = weakReference != null ? (acvx) weakReference.get() : null;
                if (acvx != null) {
                    acvx.a();
                }
            }
        }
        this.g = enm;
        if (enm != null) {
            this.d.a(a(enm));
            this.c.a(ahyh);
            return;
        }
        this.d.a(null);
        this.c.a(null);
    }

    private final String b(enm enm) {
        if (enm != null) {
            lnn lnn = this.f;
            if (lnn.b.containsKey(enm)) {
                acvx a = ((lnq) lnn.b.get(enm)).a();
                if (a != null) {
                    acwp c = a.c();
                    if (c != null) {
                        return c.a;
                    }
                }
            }
        }
        return null;
    }
}
