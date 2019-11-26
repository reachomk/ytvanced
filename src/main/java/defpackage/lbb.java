package defpackage;

import android.view.MenuItem;

/* renamed from: lbb */
final class lbb extends fai {
    private final int a;
    private final auvj b;
    private final /* synthetic */ laz c;

    lbb(laz laz, int i, auvj auvj) {
        this.c = laz;
        this.a = i;
        this.b = auvj;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        anvu anvu;
        acvx acvx = this.c.g;
        auvj auvj = this.b;
        auvl auvl = auvj.b;
        if (auvl == null) {
            auvl = auvl.f;
        }
        if ((auvl.a & 16) == 0) {
            auvp auvp = auvj.c;
            if (auvp == null) {
                auvp = auvp.h;
            }
            if ((auvp.a & 64) == 0) {
                auwb auwb = auvj.d;
                if (auwb == null) {
                    auwb = auwb.l;
                }
                if ((auwb.a & 1024) == 0) {
                    auvd auvd = auvj.e;
                    if (auvd == null) {
                        auvd = auvd.g;
                    }
                    if ((auvd.a & 16) == 0) {
                        auvf auvf = auvj.f;
                        if (auvf == null) {
                            auvf = auvf.g;
                        }
                        if ((auvf.a & 16) != 0) {
                            auvf auvf2 = auvj.f;
                            if (auvf2 == null) {
                                auvf2 = auvf.g;
                            }
                            anvu = auvf2.e;
                        } else {
                            anvu = anvu.a;
                        }
                    } else {
                        auvd auvd2 = auvj.e;
                        if (auvd2 == null) {
                            auvd2 = auvd.g;
                        }
                        anvu = auvd2.e;
                    }
                } else {
                    auwb auwb2 = auvj.d;
                    if (auwb2 == null) {
                        auwb2 = auwb.l;
                    }
                    anvu = auwb2.k;
                }
            } else {
                auvp auvp2 = auvj.c;
                if (auvp2 == null) {
                    auvp2 = auvp.h;
                }
                anvu = auvp2.g;
            }
        } else {
            auvl auvl2 = auvj.b;
            if (auvl2 == null) {
                auvl2 = auvl.f;
            }
            anvu = auvl2.e;
        }
        acvx.a(3, new acvs(anvu.d()), null);
        apxu c = abmk.c(this.b);
        if (c == null) {
            c = abmk.d(this.b);
        }
        this.c.f.a(c, null);
        return true;
    }

    public final CharSequence e() {
        return abmk.a(this.b);
    }

    public final int a() {
        return this.a;
    }

    public final int f() {
        return this.a;
    }
}
