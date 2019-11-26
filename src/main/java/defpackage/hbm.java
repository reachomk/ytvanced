package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hbm */
public final class hbm extends ekk implements abql {
    public final hbg a;
    public final hbj b;
    public final aaas c;
    public final abqi d;
    public aphv e;
    public boolean f;
    private final xci g;
    private final bctz h;
    private final ajam i;
    private final zyw j;
    private final bdfu k = new bdfu();
    private final hbt l = new hbt(this);
    private final hbq m = new hbq(this);

    public hbm(elm elm, hbg hbg, hbj hbj, aaas aaas, abqi abqi, xci xci, bctz bctz, ajam ajam, zyw zyw) {
        super(elm);
        this.a = hbg;
        this.b = hbj;
        this.c = aaas;
        this.d = abqi;
        this.g = xci;
        this.h = bctz;
        this.i = ajam;
        this.j = zyw;
    }

    public final void A_() {
        if (foh.x(this.j)) {
            bdfu bdfu = this.k;
            bctz a = this.i.t().f().a(emg.a(this.j, 281474976710656L, 1));
            hbt hbt = this.l;
            hbt.getClass();
            bdfu.a(a.a(new hbp(hbt), hbo.a));
        } else {
            this.g.a(this.l);
        }
        this.g.a(this.m);
        this.k.a(this.h.a(new hbr(this)));
        this.a.af_();
    }

    public final void ar_() {
        if (!foh.x(this.j)) {
            this.g.b(this.l);
        }
        this.g.b(this.m);
        this.k.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    public final void a(boolean r4) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0005;
    L_0x0003:
        r1 = r0;
        goto L_0x0013;
    L_0x0005:
        r1 = r3.e;
        r2 = r1.a;
        r2 = r2 & 512;
        if (r2 == 0) goto L_0x0003;
    L_0x000d:
        r1 = r1.h;
        if (r1 != 0) goto L_0x0013;
    L_0x0011:
        r1 = defpackage.apxu.d;
    L_0x0013:
        if (r4 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0024;
    L_0x0016:
        r4 = r3.e;
        r2 = r4.a;
        r2 = r2 & 16384;
        if (r2 == 0) goto L_0x0024;
    L_0x001e:
        r1 = r4.m;
        if (r1 != 0) goto L_0x0024;
    L_0x0022:
        r1 = defpackage.apxu.d;
    L_0x0024:
        r4 = r3.c;
        r4.a(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbm.a(boolean):void");
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("toggle_source", this);
        return hashMap;
    }
}
