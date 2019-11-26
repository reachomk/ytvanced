package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;

/* renamed from: fso */
public final class fso implements ejc, ffx, fsg, fsm, ygs, zcg {
    public final xpw a;
    public final fgc b;
    public final fsc c;
    public final ygr d;
    public final zbe e;
    public final eif f;
    public final InlinePlayerLayout g;
    public final ftd h;
    public final aknh i;
    public ygg j;
    public boolean k;
    public fsk l;
    public boolean m;
    public int n;
    public int o = 1;
    private final fte p;
    private final RecyclerView q;
    private final lwc r;
    private final xpu s;
    private final xpu t;
    private int u;

    public fso(Activity activity, xci xci, akkq akkq, eid eid, aaas aaas, elv elv, ffw ffw, gal gal, hdd hdd, xpw xpw, fgc fgc, fsc fsc, RecyclerView recyclerView, akpd akpd, aknh aknh, ygr ygr, zbe zbe, eif eif, lwc lwc, InlinePlayerLayout inlinePlayerLayout) {
        RecyclerView recyclerView2 = recyclerView;
        akpd akpd2 = akpd;
        ftd ftd = new ftd(activity, xci, akkq, eid, aaas, elv, ffw, hdd, gal, xpw, zbe);
        Object fte = new fte(recyclerView2, akpd2, aknh);
        Object xpu = new xpu();
        Object xpu2 = new xpu();
        this.a = (xpw) amqw.a((Object) xpw);
        this.b = (fgc) amqw.a((Object) fgc);
        this.c = (fsc) amqw.a((Object) fsc);
        this.q = (RecyclerView) amqw.a((Object) recyclerView);
        this.i = (aknh) amqw.a((Object) aknh);
        this.d = (ygr) amqw.a((Object) ygr);
        this.e = (zbe) amqw.a((Object) zbe);
        this.f = (eif) amqw.a((Object) eif);
        this.r = (lwc) amqw.a((Object) lwc);
        this.g = (InlinePlayerLayout) amqw.a((Object) inlinePlayerLayout);
        this.h = (ftd) amqw.a((Object) ftd);
        c(1);
        this.s = (xpu) amqw.a(xpu);
        this.t = (xpu) amqw.a(xpu2);
        recyclerView2.a(new fss(this));
        this.p = (fte) amqw.a(fte);
        akpd2.a(new fsr(this));
    }

    public final void a(boolean z) {
    }

    public final void c() {
    }

    public final boolean f() {
        return true;
    }

    public final boolean g() {
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final int j() {
        return 1;
    }

    public final View a() {
        ftd ftd = this.h;
        if (ftd != null) {
            StickyPlayerContainer stickyPlayerContainer = ftd.b;
            if (stickyPlayerContainer != null) {
                return (View) stickyPlayerContainer.getParent();
            }
        }
        return null;
    }

    public final void d() {
        if (this.f.c() == ejd.INLINE_FULLSCREEN) {
            this.m = true;
            this.p.a(true);
            this.h.c();
        }
    }

    public final void e() {
        this.p.a(false);
        if (this.n == 5) {
            ftd ftd = this.h;
            akor akor = ftd.c;
            if (akor != null) {
                ycp ycp = ftd.d;
                if (ycp != null) {
                    ftd.a(akor, ycp);
                }
            }
            this.e.a(this.h, false);
        }
        if (this.f.c() != ejd.WATCH_WHILE_MINIMIZED && this.m && this.n == 3) {
            fsk fsk = this.l;
            if (fsk != null) {
                xpu.a(this.t, fsk.i, this.q);
                if (this.t.a.isEmpty()) {
                    l();
                }
            }
        }
        this.m = false;
    }

    public final void a(ejd ejd, ejd ejd2) {
        String valueOf = String.valueOf(ejd2.name());
        String str = "set playerViewMode ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        int i;
        if (ejd == ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED && ejd2 == ejd.NONE) {
            i = this.n;
            if (i == 3) {
                if (this.l != null) {
                    a().post(new fsq(this));
                }
            } else if (i == 5 && this.j != null) {
                a().post(new fst(this));
            }
        } else if (ejd == ejd.INLINE && (ejd2 == ejd.WATCH_WHILE_MINIMIZED || ejd2 == ejd.WATCH_WHILE_MAXIMIZED)) {
            i = this.n;
            if (i == 3) {
                fsk fsk = this.l;
                if (fsk != null) {
                    this.d.b(fsk.a);
                    this.l.b(false);
                    this.l = null;
                    c(1);
                }
            } else if (i == 5) {
                ygg ygg = this.j;
                if (ygg != null) {
                    this.d.a((ycs) ygg.d(), false);
                    this.h.c();
                    this.h.d();
                    c(1);
                }
            }
        }
    }

    public final void a(fsk fsk) {
        if (fsk == null) {
            c(1);
        } else if (this.m) {
            this.a.a(fsk.a(), false);
        } else if (fsk.m.a) {
            if (this.n == 5) {
                this.h.b(true);
            }
            c(2);
            if (this.f.c() == ejd.WATCH_WHILE_MINIMIZED) {
                this.r.g(false);
            }
            this.a.a(fsk.a(), true);
            this.b.a(fod.b(fsk.a), null, 1);
        } else if (this.o == 2) {
            this.l = fsk;
            l();
        } else {
            this.a.a(fsk.a(), false);
            this.b.a(fod.b(fsk.a), null, 1);
            c(3);
        }
        if (!this.m) {
            this.l = fsk;
            n();
        }
    }

    public final void a(ygg ygg) {
        this.j = ygg;
    }

    public final void b(boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = this.l;
        int i = this.o;
        String a = fsh.a(i);
        if (i != 0) {
            objArr[1] = a;
            String.format("CAVC.onAnimationEnd inlinePresenter %s keyboardState %s", objArr);
            if (z) {
                if (this.o == 2 && this.l != null) {
                    l();
                } else if (this.l != null) {
                    c(3);
                    this.a.a(this.l.a(), false);
                    n();
                    return;
                }
            } else if (this.l == null) {
                c(1);
                this.b.g();
            }
            return;
        }
        throw null;
    }

    public final void k() {
        if (this.l == null) {
            this.b.g();
            c(1);
            m();
            this.a.a(null);
        } else if (this.o == 1) {
            c(3);
            m();
        } else {
            c(5);
        }
        StickyPlayerContainer stickyPlayerContainer = this.h.b;
        stickyPlayerContainer.setTranslationX(0.0f);
        stickyPlayerContainer.setTranslationY(0.0f);
        this.e.a(this.h);
    }

    public final void a(View view, int i) {
        zax o = o();
        xpu.a(this.t, view, this.q);
        int height = this.t.a.bottom - this.q.getHeight();
        if (height > 0 && o != null) {
            o.e(i, height);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (this.o == 1 && !this.m) {
            fsk fsk = this.l;
            if (fsk != null && fsk.i.getParent() == null && i == 0) {
                if (this.l != null) {
                    zax o = o();
                    if (o != null && this.l.c() < o.p()) {
                        l();
                    }
                }
                this.l = null;
                this.b.g();
                c(1);
                this.e.b();
            }
            int i2 = this.n;
            if (i2 == 3) {
                fsk fsk2 = this.l;
                if (fsk2 != null) {
                    xpu.a(this.s, fsk2.n, this.q);
                    if (this.s.a.isEmpty()) {
                        if (this.l.c() >= o().p()) {
                            this.d.b(this.l.a);
                            c(1);
                            this.b.g();
                            this.e.b();
                            this.l = null;
                            return;
                        }
                        l();
                    } else if (this.s.a.top <= 0) {
                        l();
                    }
                }
            } else if (i2 == 5) {
                ygg ygg = this.j;
                if (ygg != null) {
                    if (ygg.i.getParent() == null) {
                        this.u -= i;
                        return;
                    }
                    xpu.a(this.s, this.j.n, this.q);
                    i = this.s.a.top;
                    this.u = i;
                    this.h.e = i;
                    if (i >= 0) {
                        this.d.a((ycs) this.j.d(), true);
                        c(3);
                        this.h.c();
                        this.h.d();
                    }
                }
            }
        }
    }

    private final void l() {
        ygg ygg = this.j;
        if (ygg != null) {
            this.d.a((ycs) ygg.d(), false);
        }
        c(5);
        ftd ftd = this.h;
        fsk fsk = this.l;
        ftd.a(fsk.b, fsk.a);
        this.e.a(this.h, false);
        this.d.a(this.l.a);
        this.l = null;
    }

    public final boolean b() {
        return this.n != 1;
    }

    public final Object h() {
        fsk fsk = this.l;
        if (fsk == null) {
            return this.h.d;
        }
        return fsk.a;
    }

    private final void m() {
        ycp ycp = this.h.d;
        if (ycp != null) {
            this.d.b(ycp);
        }
        this.h.c();
        this.h.d();
    }

    private final void n() {
        zax o = o();
        if (o != null) {
            fsk fsk = this.l;
            if (fsk != null) {
                ViewGroup l = fsk.l();
                if (l == null || l.getVisibility() != 0) {
                    xpu.a(this.t, this.l.i, this.q);
                    int height = this.q.getHeight();
                    o.e(this.l.c(), this.t.a.top - ((int) (((float) height) * 0.15f)));
                }
            }
        }
    }

    private final zax o() {
        apn apn = this.q.n;
        if (apn instanceof zax) {
            return (zax) apn;
        }
        return null;
    }

    public final void a(int i) {
        Object[] objArr = new Object[1];
        String a = fsh.a(i);
        if (i != 0) {
            objArr[0] = a;
            String.format("CAVC.onKeyboardChange %s", objArr);
            this.o = i;
            if (i == 2 && this.n == 3) {
                l();
                return;
            } else if (i == 1 && this.n == 5) {
                b(0);
                return;
            } else {
                return;
            }
        }
        throw null;
    }

    public final void c(int i) {
        this.n = i;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "STUCK_TO_TOP" : "ANIMATION_COLLAPSING" : "INLINE_EXPANDED" : "ANIMATION_EXPANDING" : "COLLAPSED";
        String str2 = "set playerState ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
    }
}
