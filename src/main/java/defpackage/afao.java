package defpackage;

import java.util.List;

/* renamed from: afao */
public class afao implements oqm {
    public final afau[] a;
    private final oqx b;
    private final boolean c;
    private final boolean d;
    private final int[] e;
    private final oum f;
    private final int g;
    private final ovi h;
    private final int i;
    private boolean j;
    private final afav k;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0067 A:{LOOP_END, LOOP:0: B:8:0x0065->B:9:0x0067} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084 A:{LOOP_END, LOOP:1: B:11:0x007f->B:13:0x0084} */
    protected afao(defpackage.oqx r3, defpackage.afjc r4, int[] r5, defpackage.oum r6, int r7, defpackage.ovi r8, int r9, defpackage.afag r10, int r11) {
        /*
        r2 = this;
        r2.<init>();
        r2.b = r3;
        r0 = r4.a();
        r0 = r0.l;
        r2.c = r0;
        r4 = r4.a();
        r4 = r4.v;
        r2.d = r4;
        r2.e = r5;
        r2.f = r6;
        r2.g = r7;
        r2.h = r8;
        r2.i = r9;
        r4 = new afav;
        r4.<init>(r10, r11);
        r2.k = r4;
        r4 = r3.d;
        r4 = r4.size();
        r4 = r4 + -1;
        r8 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = 0;
        if (r4 != 0) goto L_0x0042;
    L_0x0036:
        r10 = r3.b;
        r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r4 == 0) goto L_0x004f;
    L_0x003c:
        r3 = r3.d;
        r3.get(r5);
        goto L_0x0050;
    L_0x0042:
        r4 = r3.d;
        r8 = 1;
        r4.get(r8);
        r3 = r3.d;
        r3.get(r5);
        r8 = 0;
    L_0x004f:
        r10 = r8;
    L_0x0050:
        r3 = defpackage.nyr.b(r10);
        r8 = r2.b;
        r8 = r8.a();
        r8 = r8.a;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r10 = r2.e;
        r11 = r10.length;
        r0 = 0;
    L_0x0065:
        if (r0 >= r11) goto L_0x0077;
    L_0x0067:
        r1 = r10[r0];
        r1 = r8.get(r1);
        r1 = (defpackage.oqy) r1;
        r1 = r1.b;
        r9.addAll(r1);
        r0 = r0 + 1;
        goto L_0x0065;
    L_0x0077:
        r8 = r6.g();
        r8 = new defpackage.afau[r8];
        r2.a = r8;
    L_0x007f:
        r8 = r2.a;
        r8 = r8.length;
        if (r5 >= r8) goto L_0x009a;
    L_0x0084:
        r8 = r6.b(r5);
        r8 = r9.get(r8);
        r8 = (defpackage.orc) r8;
        r10 = r2.a;
        r11 = new afau;
        r11.<init>(r3, r7, r8);
        r10[r5] = r11;
        r5 = r5 + 1;
        goto L_0x007f;
    L_0x009a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afao.<init>(oqx, afjc, int[], oum, int, ovi, int, afag, int):void");
    }

    public final void a() {
    }

    public final long a(long j, oap oap) {
        for (afau afau : this.a) {
            if (afau.c != null) {
                long c = afau.c(j);
                long a = afau.a(c);
                long a2 = (a >= j || c >= ((long) (afau.b() - 1))) ? a : afau.a(c + 1);
                return ozp.a(j, oap, a, a2);
            }
        }
        return j;
    }

    public final int a(long j, List list) {
        if (this.f.g() < 2) {
            return list.size();
        }
        return this.f.a(j, list);
    }

    public void a(long j, long j2, List list, oql oql) {
        oqr oqr;
        long a;
        oqz oqz;
        oql oql2 = oql;
        long j3 = j2 - j;
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        if (list.isEmpty()) {
            List list2 = list;
            oqr = null;
        } else {
            oqr = (oqr) list.get(list.size() - 1);
        }
        oqq[] oqqArr = new oqq[this.f.g()];
        int i = 0;
        while (i < oqqArr.length) {
            oqq[] oqqArr2;
            int i2;
            afau afau = this.a[i];
            if (afau.c == null) {
                oqqArr[i] = oqq.a;
                oqqArr2 = oqqArr;
                i2 = i;
            } else {
                long a2 = afau.a(this.b, currentTimeMillis);
                oqqArr2 = oqqArr;
                i2 = i;
                a = afao.a(afau, oqr, j2, a2, afau.b(this.b, currentTimeMillis));
                if (a < a2) {
                    oqqArr2[i2] = oqq.a;
                } else {
                    oqqArr2[i2] = new afax(a);
                }
            }
            i = i2 + 1;
            oqqArr = oqqArr2;
        }
        this.f.a(j, j3, -9223372036854775807L, list);
        afau afau2 = this.a[this.f.b()];
        oqg oqg = afau2.a;
        if (oqg != null) {
            orc orc = afau2.b;
            oqz = oqg.c == null ? orc.f : null;
            oqz a3 = afau2.c == null ? orc.a() : null;
            if (!(oqz == null && a3 == null)) {
                oql2.a = a(afau2, this.h, this.f.h(), this.f.c(), this.f.d(), oqz, a3);
                return;
            }
        }
        int i3 = 1;
        if (afau2.b() == 0) {
            oql2.b = true;
            return;
        }
        long a4 = afau2.a(this.b, currentTimeMillis);
        currentTimeMillis = afau2.b(this.b, currentTimeMillis);
        a = afao.a(afau2, oqr, j2, a4, currentTimeMillis);
        if (a > currentTimeMillis || (this.j && a >= currentTimeMillis)) {
            oql2.b = true;
            return;
        }
        long j4 = afau2.d;
        if (j4 != -9223372036854775807L && afau2.a(a) >= j4) {
            oql2.b = true;
            return;
        }
        oqh oqs;
        i = (int) Math.min((long) this.i, (currentTimeMillis - a) + 1);
        if (j4 != -9223372036854775807L) {
            while (i > 1 && afau2.a((((long) i) + a) - 1) >= j4) {
                i--;
            }
        }
        long j5 = !list.isEmpty() ? -9223372036854775807L : j2;
        ovi ovi = this.h;
        int i4 = this.g;
        nzw h = this.f.h();
        int c = this.f.c();
        Object d = this.f.d();
        orc orc2 = afau2.b;
        long a5 = afau2.a(a);
        oqz = afau2.d(a);
        String str = orc2.d;
        if (afau2.a == null) {
            oqs = new oqs(ovi, new ovm(oqz.a(str), oqz.a, oqz.b, orc2.c()), h, c, d, a5, afau2.b(a), a, i4, h);
        } else {
            int i5 = 1;
            while (i3 < i) {
                oqz a6 = oqz.a(afau2.d(((long) i3) + a), str);
                if (a6 == null) {
                    break;
                }
                i5++;
                i3++;
                oqz = a6;
            }
            long b = afau2.b((((long) i5) + a) - 1);
            long j6 = afau2.d;
            long j7 = (j6 == -9223372036854775807L || j6 > b) ? -9223372036854775807L : j6;
            ovm ovm = new ovm(oqz.a(str), oqz.a, oqz.b, orc2.c());
            long j8 = -orc2.e;
            if (this.d) {
                oqh afar = new afar(ovi, ovm, h, c, d, a5, b, j5, j7, a, i5, j8, afau2.a, this.k, i4);
            } else {
                oqs = new oqp(ovi, ovm, h, c, d, a5, b, j5, j7, a, i5, j8, afau2.a);
            }
        }
        oql2.a = oqs;
    }

    public final void a(oqh oqh) {
        int a;
        if (oqh instanceof afap) {
            a = this.f.a(((afap) oqh).g);
        } else if (oqh instanceof oqo) {
            a = this.f.a(((oqo) oqh).g);
        } else {
            a = -1;
        }
        if (a >= 0) {
            afau[] afauArr = this.a;
            afau afau = afauArr[a];
            if (afau.c == null) {
                ofu ofu = afau.a.b;
                if (ofu != null) {
                    afauArr[a] = new afau(afau.d, afau.b, afau.a, afau.e, new oqw((ofj) ofu, afau.b.e));
                }
            }
        }
    }

    public final boolean a(oqh oqh, boolean z, Exception exception, long j) {
        if (z) {
            if ((oqh instanceof oqr) && (exception instanceof owd) && ((owd) exception).a == 404) {
                afau afau = this.a[this.f.a(oqh.g)];
                int b = afau.b();
                if (!(b == -1 || b == 0)) {
                    if (((oqr) oqh).d() > (afau.a() + ((long) b)) - 1) {
                        this.j = true;
                        return true;
                    }
                }
            }
            if (j != -9223372036854775807L) {
                oum oum = this.f;
                if (oum.a(oum.a(oqh.g), j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long a(afau afau, oqr oqr, long j, long j2, long j3) {
        if (oqr != null) {
            long d = oqr.d();
            if (d != -1) {
                return d;
            }
        }
        return ozp.a(afau.c(j), j2, j3);
    }

    /* Access modifiers changed, original: protected */
    public oqh a(afau afau, ovi ovi, nzw nzw, int i, Object obj, oqz oqz, oqz oqz2) {
        String str = afau.b.d;
        if (oqz != null) {
            oqz2 = oqz.a(oqz2, str);
            if (oqz2 == null) {
                oqz2 = oqz;
            }
        }
        ovm ovm = new ovm(oqz2.a(str), oqz2.a, oqz2.b, afau.b.c());
        if (this.c) {
            return new afap(ovi, ovm, nzw, i, obj, afau.a);
        }
        return new oqo(ovi, ovm, nzw, i, obj, afau.a);
    }
}
