package defpackage;

/* renamed from: afdi */
final class afdi implements aepr, afkj {
    public final /* synthetic */ afdj a;

    afdi(afdj afdj) {
        this.a = afdj;
    }

    public final void a() {
        this.a.d.f(afne.NATIVE_MEDIA_PLAYER);
        afdj afdj = this.a;
        aahr aahr = afdj.s;
        if (aahr != null) {
            afdj.b(aahr);
            this.a.s = null;
        }
    }

    public final void b() {
        this.a.x();
    }

    public final void c() {
        this.a.d.g(afne.NATIVE_MEDIA_PLAYER);
        aajj aajj = this.a.r;
        if (aajj != null && aajj.g()) {
            afdj afdj = this.a;
            afdj.h.a(new afif("surfaceunavailable", afdj.o()));
        }
        boolean z = this.a.q;
        this.a.a(true);
        afdj afdj2 = this.a;
        afdj2.q = z;
        afdj2.e(false);
        afkh afkh = this.a.u;
        if (afkh != null) {
            afkh.c();
        }
    }

    public final void d() {
        c();
    }

    public final void a(aeps aeps) {
        afdj afdj = this.a;
        afdj.k = true;
        afdj.w = aeps.h();
        b(aeps);
    }

    public final void a(aeps aeps, int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (this.a.a.getMainLooper().getThread() == Thread.currentThread()) {
                afkh afkh = this.a.u;
                if (afkh != null) {
                    afkh.a(i, i2);
                }
            } else {
                this.a.f.post(new afdl(this, i, i2));
            }
            if (!this.a.i) {
                this.a.i = true;
                b(aeps);
            }
        }
    }

    private final void b(aeps aeps) {
        if (this.a.h()) {
            if (!this.a.j) {
                long j = this.a.v;
                if (j != 0) {
                    aeps.a(j);
                }
            }
            afdj afdj = this.a;
            afdj.a(afdj.y);
            afdj = this.a;
            afdj.n = false;
            if (!afdj.j || this.a.i) {
                this.a.c(false);
            }
            if (this.a.q) {
                this.a.m();
            }
        }
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code skipped:
            if (r1 == 100) goto L_0x0010;
     */
    public final void b(int r3) {
        /*
        r2 = this;
        r0 = 100;
        r1 = 90;
        if (r3 <= r1) goto L_0x000f;
    L_0x0006:
        r1 = r2.a;
        r1 = r1.x;
        if (r1 != r3) goto L_0x000d;
    L_0x000c:
        goto L_0x0010;
    L_0x000d:
        if (r1 == r0) goto L_0x0010;
    L_0x000f:
        r0 = r3;
    L_0x0010:
        r3 = r2.a;
        r3.x = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdi.b(int):void");
    }

    public final void j() {
        if (this.a.p) {
            afdj afdj = this.a;
            afdj.p = false;
            if (!afdj.m) {
                if (this.a.l) {
                    this.a.h.c();
                } else {
                    this.a.h.d();
                }
            }
        }
    }

    public final void i() {
        afdj afdj = this.a;
        afdj.v = 0;
        afdj.l = false;
        afdj.h.f();
        this.a.e(false);
    }

    public final void e() {
        this.a.d.h(afne.NATIVE_MEDIA_PLAYER);
    }

    public final boolean b(int i, int i2) {
        String str = "]";
        String str2 = ", extra=";
        int i3 = 0;
        afdj afdj;
        StringBuilder stringBuilder;
        if (this.a.k) {
            afdj = this.a;
            afdj.n = false;
            afdj.o = true;
            stringBuilder = new StringBuilder(71);
            stringBuilder.append("MediaPlayer error during playback [what=");
            stringBuilder.append(i);
            stringBuilder.append(str2);
            stringBuilder.append(i2);
            stringBuilder.append(str);
            xtl.d(stringBuilder.toString());
        } else {
            afdj = this.a;
            afdj.n = true;
            afdj.o = false;
            stringBuilder = new StringBuilder(70);
            stringBuilder.append("MediaPlayer error during prepare [what=");
            stringBuilder.append(i);
            stringBuilder.append(str2);
            stringBuilder.append(i2);
            stringBuilder.append(str);
            xtl.d(stringBuilder.toString());
        }
        afif[] a = afdj.a(i, i2, this.a.g.b(), this.a.b.c(), this.a.o(), this.a.t);
        int length = a.length;
        afdj afdj2;
        if (a[length - 1].d()) {
            this.a.g.d();
            afdj2 = this.a;
            afdj2.n = false;
            afdj2.o = false;
            afdj2.a(true);
            while (i3 < length) {
                this.a.h.a(a[i3]);
                i3++;
            }
        } else {
            this.a.g.a();
            if (i == 100) {
                afkh afkh = this.a.u;
                if (afkh != null) {
                    afkh.d();
                }
            }
            while (i3 < length) {
                this.a.h.a(a[i3]);
                i3++;
            }
            if (this.a.j) {
                afdj2 = this.a;
                afdj2.a(afdj2.t);
            } else {
                afdj2 = this.a;
                afdj2.a(afdj2.t, afdj2.v);
            }
            afdj2 = this.a;
            afdn afdn = afdj2.g;
            long j = afdj2.v;
            afdn.d();
            afdn.c = j;
            afdn.b.postDelayed(afdn.a, 1000);
        }
        return true;
    }

    public final boolean a(int i, int i2) {
        String toHexString = Integer.toHexString(i);
        String toHexString2 = Integer.toHexString(i2);
        String.valueOf(toHexString).length();
        String.valueOf(toHexString2).length();
        if (i == 701) {
            String.valueOf(this.a.t).length();
            this.a.c(true);
        } else if (i == 702) {
            this.a.c(false);
        }
        return false;
    }
}
