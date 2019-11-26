package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lqz */
public final class lqz {
    public final enm a;
    public boolean b;
    public CharSequence c;
    public CharSequence d;
    public aygk e;
    public ahjc f;
    public Bundle g;
    public float h;
    public aafv i;
    private final lre j;
    private final aamj k;
    private final List l;
    private lrc m;

    public lqz(aamj aamj, enm enm) {
        this(aamj, enm, null);
    }

    public lqz(aamj aamj, enm enm, lre lre) {
        this.h = 0.0f;
        this.a = (enm) amqw.a((Object) enm);
        this.j = lre;
        this.k = aamj;
        this.l = new ArrayList();
    }

    public final void a(lrb lrb) {
        if (!this.l.contains(lrb)) {
            this.l.add(lrb);
            i();
        }
    }

    public final void b(lrb lrb) {
        this.l.remove(lrb);
        if (this.l.isEmpty()) {
            i();
        }
    }

    public final CharSequence a() {
        if (this.c == null) {
            g();
        }
        return this.c;
    }

    public final CharSequence b() {
        if (this.d == null) {
            g();
        }
        return this.d;
    }

    public final aygk c() {
        if (this.e == null) {
            aafv d = d();
            if (d != null) {
                akcb akcb = d.a;
                if (akcb != null) {
                    this.e = akcb.o;
                }
            }
        }
        return this.e;
    }

    public final aafv d() {
        aafv aafv = this.i;
        if (aafv == null) {
            byte[] f = f();
            if (f != null) {
                this.i = new aafv((akcb) this.k.a(f, akcb.class));
                return this.i;
            }
            aafv = null;
        }
        return aafv;
    }

    public final aafv e() {
        lrc lrc = this.m;
        return lrc != null ? (aafv) lrc.get() : null;
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            a(1);
        }
    }

    public final void a(aafv aafv) {
        if (this.f != null) {
            aafv = null;
        }
        if (aafv == null) {
            a(null);
        }
        a(b(aafv));
    }

    public final void a(Bundle bundle) {
        if (this.g != bundle) {
            this.g = bundle;
            a(64);
        }
    }

    public final int b(aafv aafv) {
        lrc lrc = this.m;
        lrc lrc2 = null;
        if ((lrc != null ? (aafv) lrc.get() : null) == aafv) {
            return 0;
        }
        if (aafv != null) {
            lrc2 = new lrc(aafv, h());
        }
        this.m = lrc2;
        lre lre = this.j;
        if (lre != null) {
            lre.a(this, aafv);
        }
        return 16;
    }

    public final void a(int i) {
        if (i != 0) {
            for (lrb a : this.l) {
                a.a(this, i);
            }
        }
    }

    private final void g() {
        if (d() != null && d().f != null && d().f.a != null) {
            akab akab = d().f.a.a;
            if (akab != null) {
                akad[] akadArr = akab.b;
                if (akadArr != null && akadArr.length != 0) {
                    ajwt ajwt = akadArr[0].c;
                    if (ajwt != null) {
                        ajww[] ajwwArr = ajwt.b;
                        if (ajwwArr != null && ajwwArr.length != 0) {
                            akay akay = ajwwArr[0].al;
                            if (akay != null) {
                                this.c = ajqy.a(akay.a);
                                akav akav = akay.e;
                                if (akav != null) {
                                    akat akat = akav.a;
                                    if (akat != null) {
                                        this.d = ajqy.a(akat.b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    public final byte[] f() {
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.d();
        r1 = 0;
        if (r0 == 0) goto L_0x0058;
    L_0x0009:
        r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r3 = r0.h;
        r2 = r2.d;
        r2 = r3.a(r2);
        if (r2 == 0) goto L_0x0058;
    L_0x001c:
        r2 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0032;
    L_0x002f:
        r0 = r2.b;
        goto L_0x0036;
    L_0x0032:
        r0 = r2.a(r0);
    L_0x0036:
        r0 = (defpackage.azje) r0;
        r2 = r0.n;
        if (r2 != 0) goto L_0x003e;
    L_0x003c:
        r2 = defpackage.azjj.c;
    L_0x003e:
        r2 = r2.a;
        r3 = 128400768; // 0x7a73d80 float:2.5163514E-34 double:6.34384084E-316;
        if (r2 == r3) goto L_0x0046;
    L_0x0045:
        goto L_0x0058;
    L_0x0046:
        r0 = r0.n;
        if (r0 != 0) goto L_0x004c;
    L_0x004a:
        r0 = defpackage.azjj.c;
    L_0x004c:
        r2 = r0.a;
        if (r2 != r3) goto L_0x0055;
    L_0x0050:
        r0 = r0.b;
        r0 = (defpackage.azjh) r0;
        goto L_0x0059;
    L_0x0055:
        r0 = defpackage.azjh.c;
        goto L_0x0059;
    L_0x0058:
        r0 = r1;
    L_0x0059:
        if (r0 == 0) goto L_0x0062;
    L_0x005b:
        r0 = r0.b;
        r0 = r0.d();
        return r0;
    L_0x0062:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqz.f():byte[]");
    }

    private final int h() {
        return this.l.isEmpty() ^ 1;
    }

    private final void i() {
        int h = h();
        lrc lrc = this.m;
        if (lrc != null) {
            lrc.a(h);
        }
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("id", this.a);
        a.a("isCurrentPlayback", this.b);
        a.a("title", this.c);
        a.a("idHashCode", this.a.hashCode());
        return a.toString();
    }

    public static boolean a(ahjc ahjc) {
        return ahjc.h == 12;
    }
}
