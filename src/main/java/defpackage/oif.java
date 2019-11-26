package defpackage;

import java.util.Arrays;

/* renamed from: oif */
public final class oif implements ofm {
    private ofo a;
    private oii b;
    private boolean c;

    public final void c() {
    }

    public final boolean a(ofp ofp) {
        try {
            return b(ofp);
        } catch (oae unused) {
            return false;
        }
    }

    public final void a(ofo ofo) {
        this.a = ofo;
    }

    public final void a(long j, long j2) {
        oii oii = this.b;
        if (oii != null) {
            oie oie = oii.b;
            oie.a.a();
            oie.b.a();
            oie.c = -1;
            oie.d = false;
            if (j == 0) {
                oii.a(oii.m ^ 1);
            } else if (oii.i != 0) {
                oii.f = oii.e.b_(j2);
                oii.i = 2;
            }
        }
    }

    public final int a(ofp ofp, ofv ofv) {
        ofp ofp2 = ofp;
        if (this.b == null) {
            if (b(ofp)) {
                ofp.a();
            } else {
                throw new oae("Failed to determine bitstream type");
            }
        }
        int i = 0;
        if (!this.c) {
            ofy a = this.a.a(0, 1);
            this.a.a();
            oii oii = this.b;
            oii.d = this.a;
            oii.c = a;
            oii.a(true);
            this.c = true;
        }
        oii oii2 = this.b;
        int i2 = oii2.i;
        long a2;
        oza oza;
        if (i2 != 0) {
            if (i2 == 1) {
                ofp2.a((int) oii2.g);
                oii2.i = 2;
            } else if (i2 == 2) {
                a2 = oii2.e.a(ofp2);
                if (a2 >= 0) {
                    ofv.a = a2;
                    i = 1;
                } else {
                    if (a2 < -1) {
                        oii2.c(-(a2 + 2));
                    }
                    if (!oii2.m) {
                        oii2.d.a(oii2.e.a());
                        oii2.m = true;
                    }
                    if (oii2.l > 0 || oii2.b.a(ofp2)) {
                        oii2.l = 0;
                        oza = oii2.b.b;
                        long a3 = oii2.a(oza);
                        if (a3 >= 0) {
                            long j = oii2.h;
                            if (j + a3 >= oii2.f) {
                                long a4 = oii2.a(j);
                                oii2.c.a(oza, oza.c);
                                oii2.c.a(a4, 1, oza.c, 0, null);
                                oii2.f = -1;
                            }
                        }
                        oii2.h += a3;
                    } else {
                        oii2.i = 3;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            return i;
        }
        while (oii2.b.a(ofp2)) {
            ofl ofl = (ofl) ofp2;
            a2 = ofl.c;
            long j2 = oii2.g;
            oii2.l = a2 - j2;
            if (oii2.a(oii2.b.b, j2, oii2.k)) {
                oii2.g = ofl.c;
            } else {
                int i3;
                nzw nzw = oii2.k.a;
                oii2.j = nzw.w;
                if (!oii2.n) {
                    oii2.c.a(nzw);
                    oii2.n = true;
                }
                oig oig = oii2.k.b;
                if (oig != null) {
                    oii2.e = oig;
                    i3 = 2;
                } else {
                    a2 = ofl.b;
                    if (a2 != -1) {
                        oih oih = oii2.b.a;
                        boolean z = (oih.a & 4) != 0;
                        long j3 = oii2.g;
                        long j4 = (long) (oih.d + oih.e);
                        long j5 = oih.b;
                        i3 = 2;
                        oii2.e = new oib(j3, a2, oii2, j4, j5, z);
                    } else {
                        i3 = 2;
                        oii2.e = new oik();
                    }
                }
                oii2.k = null;
                oii2.i = i3;
                oza = oii2.b.b;
                byte[] bArr = oza.a;
                if (bArr.length != 65025) {
                    oza.a = Arrays.copyOf(bArr, Math.max(65025, oza.c));
                    return 0;
                }
                return i;
            }
        }
        oii2.i = 3;
        i = -1;
        return i;
    }

    private final boolean b(ofp ofp) {
        oih oih = new oih();
        if (oih.a(ofp, true) && (oih.a & 2) == 2) {
            int min = Math.min(oih.e, 8);
            oza oza = new oza(min);
            ofp.c(oza.a, 0, min);
            oza a = oif.a(oza);
            if (a.b() >= 5 && a.d() == 127 && a.i() == 1179402563) {
                this.b = new oid();
            } else {
                try {
                    if (oio.a(1, oif.a(oza), true)) {
                        this.b = new oim();
                    }
                } catch (oae unused) {
                }
                if (oij.b(oif.a(oza))) {
                    this.b = new oij();
                }
            }
            return true;
        }
        return false;
    }

    private static oza a(oza oza) {
        oza.c(0);
        return oza;
    }
}
