package defpackage;

import android.os.Handler;
import java.util.List;

/* renamed from: aeqy */
public final class aeqy implements aeqt {
    private final oyk a;
    private final oye b;
    private final aajk c;
    private final zzl d;
    private final aeqz e;
    private long f;
    private long g;
    private aerg h;
    private aerg i = aerg.a;
    private long j;
    private apez k;
    private long l;
    private long m;
    private int n;
    private int o = 0;

    public aeqy(aajk aajk, zzl zzl, aeqz aeqz) {
        oye oye = oye.a;
        this.b = oye;
        this.c = aajk;
        this.d = zzl;
        this.f = -1;
        this.e = aeqz;
        this.a = new oyk();
    }

    public final void a(ovi ovi, ovm ovm, boolean z) {
    }

    public final owt b() {
        return this;
    }

    private final aerg e() {
        if (this.h != null) {
            int b = ((aajj) this.c.get()).b(2);
            int i = b - 1;
            if (b != 0) {
                Class cls;
                if (i == 2) {
                    cls = aeri.class;
                } else if (i == 3) {
                    cls = aerd.class;
                } else if (i != 4) {
                    cls = aera.class;
                } else {
                    cls = aeqw.class;
                }
                if (cls.isInstance(this.h)) {
                    return this.h;
                }
            }
            throw null;
        }
        this.h = a(false);
        aeqz aeqz = this.e;
        if (aeqz != null) {
            a(aeqz.a(), this.h);
        }
        return this.h;
    }

    private final aerg f() {
        if (this.j <= 0 || this.b.a() - this.j >= 900000) {
            this.j = this.b.a();
            arvt b = this.d.b();
            if (b != null) {
                auuo auuo = b.k;
                if (auuo == null) {
                    auuo = auuo.k;
                }
                apez apez = auuo.d;
                if (apez == null) {
                    apez = apez.d;
                }
                if ((apez.a & 2) != 0) {
                    auuo = b.k;
                    if (auuo == null) {
                        auuo = auuo.k;
                    }
                    anxl anxl = auuo.d;
                    if (anxl == null) {
                        anxl = apez.d;
                    }
                    if (!anxl.equals(this.k)) {
                        this.i = a(true);
                        auuo auuo2 = b.k;
                        if (auuo2 == null) {
                            auuo2 = auuo.k;
                        }
                        apez apez2 = auuo2.d;
                        if (apez2 == null) {
                            apez2 = apez.d;
                        }
                        this.k = apez2;
                        aeqz aeqz = this.e;
                        if (aeqz != null) {
                            a(aeqz.a(), this.i);
                        }
                    }
                }
            }
            this.i = aerg.a;
        }
        return this.i;
    }

    private final aerg a(boolean z) {
        aajj aajj = (aajj) this.c.get();
        int b = aajj.b(2);
        int i = b - 1;
        aerg aerg = null;
        if (b == 0) {
            throw null;
        } else if (i == 2) {
            return new aeri(aajj.aj(), aajj.ak());
        } else {
            if (i == 3) {
                arvt b2 = this.d.b();
                if (b2 != null) {
                    auuo auuo = b2.k;
                    if (auuo == null) {
                        auuo = auuo.k;
                    }
                    if ((auuo.a & 32) != 0) {
                        awma awma;
                        apez apez = auuo.d;
                        if (apez == null) {
                            apez = apez.d;
                        }
                        if (z) {
                            awma = apez.c;
                            if (awma == null) {
                                awma = awma.b;
                            }
                        } else {
                            awma = apez.b;
                            if (awma == null) {
                                awma = awma.b;
                            }
                        }
                        if (!(awma == null || awma.a.size() == 0)) {
                            aerg = new aerd(awma);
                        }
                    }
                }
                return aerg == null ? new aera(12, 0.5f) : aerg;
            } else if (i != 4) {
                return new aera(aajj.aj(), aajj.ak());
            } else {
                return new aeqw(aajj.aj(), aajj.ak());
            }
        }
    }

    public final void c() {
        aerg aerg = this.h;
        if (aerg != null) {
            aerg.a();
        }
        this.i.a();
    }

    public final synchronized long a() {
        return this.f;
    }

    public final synchronized long d() {
        return this.g;
    }

    public final void a(Handler handler, ova ova) {
        this.a.a(handler, ova);
    }

    public final void a(ova ova) {
        this.a.a((Object) ova);
    }

    public final synchronized void b(ovi ovi, ovm ovm, boolean z) {
        aajj aajj = (aajj) this.c.get();
        if (aajj != null) {
            int i;
            awdg awdg = aajj.c;
            if ((awdg.a & 2) != 0) {
                arhh arhh = awdg.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                i = arhh.Z;
            } else {
                i = 0;
            }
            this.o = i;
        }
        if (this.n == 0) {
            this.m = this.b.a();
        }
        this.n++;
    }

    public final synchronized void a(ovi ovi, ovm ovm, boolean z, int i) {
        this.l += (long) i;
    }

    public final synchronized void c(ovi ovi, ovm ovm, boolean z) {
        oxz.b(this.n > 0);
        long a = this.b.a();
        int i = (int) (a - this.m);
        if (i > 0) {
            long j = this.l;
            if (j >= ((long) this.o)) {
                j = (j * 8000) / ((long) i);
                float f = (float) j;
                e().a(f);
                f().a(f);
                g();
                a(i, this.l, this.f);
                aeqz aeqz = this.e;
                if (aeqz != null) {
                    aeqz.a(this.l, j);
                }
            }
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 > 0) {
            this.m = a;
        }
        this.l = 0;
    }

    public final void a(long j) {
        float f = (float) j;
        e().a(f);
        f().a(f);
        aeqz aeqz = this.e;
        if (aeqz != null) {
            aeqz.a(1, j);
        }
        g();
        a(0, 0, this.f);
    }

    private final void a(List list, aerg aerg) {
        if (!list.isEmpty()) {
            for (Long longValue : list) {
                aerg.a((float) longValue.longValue());
            }
            g();
        }
    }

    private final void g() {
        float b = this.h.b();
        long j = -1;
        this.f = !Float.isNaN(b) ? (long) b : -1;
        b = this.i.b();
        if (!Float.isNaN(b)) {
            j = (long) b;
        }
        this.g = j;
    }

    private final void a(int i, long j, long j2) {
        this.a.a(new aeqx(i, j, j2));
    }
}
