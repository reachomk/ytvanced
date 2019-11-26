package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: jtw */
public final class jtw implements akov {
    public boolean a;
    public View b;
    public final WeakHashMap c = new WeakHashMap();
    public final WeakHashMap d = new WeakHashMap();
    public ffx e;
    public foq f;
    public ffu g;
    private final jtq h;
    private final eby i;
    private final Handler j = new Handler(Looper.getMainLooper(), new jtz(this));
    private final bcaa k;
    private xpu l;
    private int m;

    public jtw(jtq jtq, bcaa bcaa, eby eby) {
        this.h = jtq;
        this.k = bcaa;
        this.i = eby;
    }

    public final void a(akot akot, Object obj) {
        if ((akot instanceof fgz) && fod.a(obj)) {
            foq b = fod.b(obj);
            fgz fgz = (fgz) akot;
            xak.a();
            this.d.put(fgz, new ffu(fgz, b));
            this.j.removeMessages(1);
            this.j.sendEmptyMessage(1);
        }
    }

    public final void a() {
        this.j.removeMessages(1);
        if (!this.d.isEmpty()) {
            for (ffu ffu : this.d.values()) {
                String valueOf = String.valueOf(jtw.a(jtw.a(ffu).b));
                this.c.size();
                valueOf.length();
                this.c.put(ffu.a(), ffu);
            }
            this.d.clear();
        }
    }

    public final void a(ffx ffx) {
        if (ffx != this.e) {
            String.valueOf(ffx).length();
            ffx ffx2 = null;
            if (ffx == null || !ffx.i()) {
                this.e = null;
                this.m = 1;
            } else {
                this.e = ffx;
                this.m = ffx.j();
            }
            this.f = null;
            jtq jtq = this.h;
            ffx ffx3 = this.e;
            if (ffx3 != null && ffx3.i()) {
                ffx2 = ffx3;
            }
            jtq.e = ffx2;
            if (jtq.e != null) {
                jtq.a.a(jtq.c);
            } else {
                jtq.a.b(jtq.c);
            }
            a();
            a(0);
        }
    }

    public final void a(ffx ffx, int i) {
        if (ffx == this.e) {
            a();
            a(i);
        }
    }

    public final void a(int i) {
        ffu ffu = null;
        if (i == 0) {
            this.f = null;
        }
        ffx ffx = this.e;
        if (ffx == null) {
            this.f = null;
        } else {
            View a = ffx.a();
            if (a == null || !xpr.a(this.b, a)) {
                this.f = null;
            } else {
                if (this.l == null) {
                    this.l = new xpu();
                }
                Object obj = this.h.a() != null ? this.h.a().c : null;
                Object h = this.e.h();
                ffu ffu2 = null;
                float f = 0.0f;
                int i2 = 0;
                for (ffu ffu3 : this.c.values()) {
                    View b = ffu3.b();
                    if (b != null) {
                        if (xpr.a(a, b)) {
                            int i3;
                            float c;
                            int width;
                            xpu.a(this.l, b, this.b);
                            if (this.m == 0) {
                                i3 = this.l.a.left;
                            } else {
                                i3 = this.l.a.top;
                            }
                            if (this.m == 0) {
                                c = (float) this.l.c();
                                width = this.l.a.width();
                            } else {
                                c = (float) this.l.d();
                                width = this.l.a.height();
                            }
                            c /= (float) width;
                            if (c >= jtw.a(ffu3).d) {
                                if (b(ffu3)) {
                                    c += 0.7f;
                                }
                                if (obj != null && jtw.a(ffu3).c == obj) {
                                    c += 0.25f;
                                }
                                if (h == jtw.a(ffu3).c) {
                                    c += 0.25f;
                                }
                                float f2 = c - f;
                                if (f2 >= 0.0f) {
                                    if (f2 <= 0.1f) {
                                        if (i2 >= 0) {
                                            if (i3 >= 0) {
                                                if (i3 >= i2) {
                                                }
                                            }
                                        }
                                    }
                                    ffu2 = ffu3;
                                    i2 = i3;
                                    f = c;
                                }
                            }
                        }
                    }
                }
                if (!b(ffu2)) {
                    this.f = null;
                }
                ffu = ffu2;
            }
        }
        a(ffu, i);
    }

    public final void a(ffu ffu, int i) {
        if (i == 1 || i == 2 || this.g != ffu) {
            fob fob;
            ffu ffu2 = this.g;
            this.g = ffu;
            View view = null;
            if (ffu2 != null) {
                fob = ffu2.b;
            } else {
                fob = null;
            }
            fob fob2 = ffu != null ? ffu.b : null;
            if (fob != null && fob.a(fob2)) {
                if (ffu != null) {
                    view = ffu.b();
                }
                ((xpw) this.k.get()).a(view);
            } else {
                eby eby = this.i;
                if (foh.f(eby.b)) {
                    eby.a.d(new eca());
                }
            }
            jtq jtq = this.h;
            b(ffu);
            jtq.g = ffu;
            jtq.f = false;
            foq b = jtq.b();
            if (b == null) {
                jtq.a.g();
            } else {
                String.valueOf(b).length();
                if (fod.c(b.c)) {
                    fgc fgc = jtq.a;
                    if (foh.H(fgc.b) ? fgc.c.d == null : fgc.d == null) {
                        jtq.b.a(true);
                        return;
                    } else {
                        jtq.a.f();
                        return;
                    }
                }
                jtq.b.a(false);
                jtq.a.a(b, ffu.a(), i);
            }
        }
    }

    private final boolean b(ffu ffu) {
        foq foq;
        if (ffu == null) {
            foq = null;
        } else {
            foq = (foq) ffu.b;
        }
        return this.f == foq;
    }

    public static foq a(ffu ffu) {
        return (foq) ffu.b;
    }

    public static CharSequence a(aryi aryi) {
        arye a = fod.a(aryi);
        arml arml = null;
        if (a == null) {
            return null;
        }
        if ((a.a & 1) != 0) {
            arml = a.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }
}
