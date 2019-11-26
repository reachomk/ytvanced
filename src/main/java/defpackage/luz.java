package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.apps.youtube.app.watch.nextgenwatch.swipey.SwipeyRecyclerView;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: luz */
public final class luz implements lqb, lwc, xcp {
    private final alck A;
    private fkc B;
    private ezy C;
    private lvz D;
    private NextGenWatchLayout E;
    private lcp F;
    private lql G;
    private boolean H;
    private boolean I;
    private float J;
    private String K;
    private boolean L = false;
    private boolean M;
    public final ahyg b;
    public NextGenWatchContainerLayout c;
    public ejd d;
    private final List e;
    private final Activity f;
    private final elm g;
    private final bcaa h;
    private final elh i;
    private final adqf j;
    private final eyb k;
    private final bcaa l;
    private final emd m;
    private final lvq n;
    private final lud o;
    private final bcaa p;
    private final fos q;
    private final llg r;
    private final zyw s;
    private final eti t;
    private final lvi u;
    private final lvf v;
    private final bcaa w;
    private final xol x;
    private final bcaa y;
    private final lvj z;

    public luz(Activity activity, elh elh, adqf adqf, elm elm, bcaa bcaa, bcaa bcaa2, emd emd, lvq lvq, lud lud, bcaa bcaa3, fos fos, llg llg, zyw zyw, eti eti, eyb eyb, bcaa bcaa4, ahyg ahyg, lvi lvi, xol xol, bcaa bcaa5, lvj lvj, alck alck) {
        elh elh2 = elh;
        this.f = activity;
        this.i = elh2;
        this.g = elm;
        this.j = adqf;
        this.h = bcaa;
        this.l = bcaa2;
        this.m = emd;
        this.n = lvq;
        this.o = lud;
        this.p = bcaa3;
        this.q = fos;
        this.r = llg;
        this.s = zyw;
        this.t = eti;
        this.k = eyb;
        this.w = bcaa4;
        this.b = ahyg;
        this.u = lvi;
        this.x = xol;
        this.y = bcaa5;
        this.z = lvj;
        this.A = alck;
        this.e = new CopyOnWriteArrayList();
        this.d = ejd.NONE;
        this.v = new lvf(elh, this);
        a(this.v);
        ffs ffs = new ffs("NGWU");
    }

    public final void a() {
    }

    public final void a(ezy ezy, lvz lvz, View view, fkc fkc) {
        this.C = (ezy) amqw.a((Object) ezy);
        this.D = (lvz) amqw.a((Object) lvz);
        this.B = (fkc) amqw.a((Object) fkc);
        this.c = (NextGenWatchContainerLayout) view.findViewById(R.id.next_gen_watch_container_layout);
        ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.watch_player);
        if (foh.f(this.s)) {
            lnf lnf;
            lnw lnw;
            lmv lmv = (lmv) this.y.get();
            NextGenWatchContainerLayout nextGenWatchContainerLayout = this.c;
            SwipeyRecyclerView swipeyRecyclerView = (SwipeyRecyclerView) nextGenWatchContainerLayout.findViewById(R.id.swipey_watch_recycler_view);
            lvc lvc = new lvc(this);
            amqw.b(lmv.w == null);
            lmv.w = swipeyRecyclerView;
            Context context = swipeyRecyclerView.getContext();
            boolean a = foh.a(lmv.h);
            boolean a2 = foh.a(lmv.g, lmv.h);
            lqt f = ((lum) lmv.d.get()).f();
            nextGenWatchContainerLayout.getClass();
            lmv.y = new lnf(f, new lmu(nextGenWatchContainerLayout), lmv.o, lmv.a);
            lmp lmp = lmv.f;
            Context context2 = (Context) lmp.a((Context) lmp.a.get(), 1);
            Context context3 = (Context) lmp.a((Context) lmp.b.get(), 2);
            luf luf = (luf) lmp.a((luf) lmp.c.get(), 3);
            lmg lmg = r13;
            lmg lmg2 = new lmg(context2, context3, luf, (SharedPreferences) lmp.a((SharedPreferences) lmp.d.get(), 4), (lqt) lmp.a(f, 5), (Set) lmp.a(amuw.a(lmv.y, lmv.v), 6));
            lmv.x = lmg;
            int dimensionPixelSize = !a ? context.getResources().getDimensionPixelSize(R.dimen.swipey_gutter_width) / 2 : 0;
            lnf lnf2 = lmv.y;
            if (a2) {
                lod lod = r10;
                lnf = lnf2;
                lnv lnv = new lnv(lmv.w, lmv.j, lnf2, lnf2, (lnr) lmv.k.get());
                ((lob) lmv.l.get()).a(lod);
                lnw = lod;
            } else {
                lnw = new lls();
                lnf = lnf2;
            }
            apn lma = new lma(lnf, lnw, lmv.b, lmv.x, lmv.i, dimensionPixelSize, a);
            lmv.y.a(new lmx(lmv, lvc));
            lnf lnf3 = lmv.y;
            Object lmw = new lmw(lmv);
            amqw.a(lmw);
            lnf3.a.add(lmw);
            lmv.y.a((lnj) lma);
            if (!a) {
                lma.a.add(new lmz(lmv, ViewConfiguration.get(context).getScaledTouchSlop()));
            }
            lma.a(false);
            lmw = new lmy(context);
            aad.a(lmw);
            swipeyRecyclerView.y = lmw;
            swipeyRecyclerView.k();
            swipeyRecyclerView.r = true;
            swipeyRecyclerView.a(1);
            swipeyRecyclerView.a(lma);
            swipeyRecyclerView.a(lmv.x);
            swipeyRecyclerView.H = false;
            if (a2) {
                swipeyRecyclerView.a(new loa((lob) lnz.a((lob) lmv.m.a.get(), 1), (lnr) lnz.a((lnr) lmv.k.get(), 2)));
            }
            if (a) {
                swipeyRecyclerView.a(null);
            }
            Context context4 = lmv.w.getContext();
            eif eif = (eif) lmv.b.get();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new llv(lmv.t));
            if (a) {
                lmv.u.a();
            }
            arrayList.add(new llq());
            arrayList.add(new llp(eif));
            arrayList.add(new lll(context4, eif));
            arrayList.add(new lnm(eif, lmv.n));
            zyw zyw = lmv.g;
            float f2 = 2.5f;
            if (foh.f(zyw)) {
                apxn a3 = zyw.a();
                if (a3 != null) {
                    aulu aulu = a3.e;
                    if (aulu == null) {
                        aulu = aulu.bw;
                    }
                    if ((aulu.i & 33554432) != 0) {
                        aulu aulu2 = a3.e;
                        if (aulu2 == null) {
                            aulu2 = aulu.bw;
                        }
                        f2 = aulu2.aW;
                    }
                }
            }
            arrayList.add(new llj(context4, Math.max(f2, 1.0f)));
            SwipeyRecyclerView swipeyRecyclerView2 = lmv.w;
            swipeyRecyclerView2.T.clear();
            swipeyRecyclerView2.T.addAll(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lmh lmh = (lmh) arrayList.get(i);
                if (lmh instanceof llh) {
                    lmv.s.add((llh) lmh);
                }
            }
            if (!a) {
                apk llm = new llm(lmv.w);
                lmv.w.a(llm);
                ((eif) lmv.b.get()).a(llm);
            }
            new lmd(lmv.w).a(lmv.w);
            ext lnd = new lnd((aikf) lmv.c.get(), lmv.w, lmv.x);
            exu exu = lmv.a;
            lnd.a.c.add(lnd);
            aikf aikf = lnd.a;
            aikf.d.add(lnd);
            aikf.f.a((aikg) lnd);
            exu.a(lnd);
            exv exv = (lly) lmv.p.get();
            exu = lmv.a;
            exu.a(exv);
            if (exu.a) {
                exv.a();
            }
            ((lfw) exv.a.get()).c = (lfy) amqw.a(exv.b);
            loe lmo = new lmo(viewGroup);
            if (a2) {
                ((lnr) lmv.k.get()).a((eln) lmo);
                ((lob) lmv.l.get()).a(lmo);
            }
            this.G = new lql(viewGroup, lmo);
        } else {
            this.G = new lql(viewGroup, new llu());
            NextGenWatchLayout nextGenWatchLayout = (NextGenWatchLayout) this.c.findViewById(R.id.next_gen_watch_layout);
            if (!foh.o(this.s)) {
                nextGenWatchLayout.g.setOnClickListener(new lvb(this));
            }
            ViewGroup viewGroup2 = (ViewGroup) nextGenWatchLayout.findViewById(R.id.video_metadata_layout);
            viewGroup2.setTag(viewGroup2.getId(), this.n.a(this, this.p, nextGenWatchLayout, viewGroup2, nextGenWatchLayout.a, nextGenWatchLayout.a(), nextGenWatchLayout.f(), nextGenWatchLayout));
            a(nextGenWatchLayout);
        }
        ezy.a(0, ra.c(this.f, R.color.yt_black_pure));
        this.B.a(this.d);
    }

    /* Access modifiers changed, original: final */
    public final void a(NextGenWatchLayout nextGenWatchLayout) {
        NextGenWatchLayout nextGenWatchLayout2 = this.E;
        if (nextGenWatchLayout2 != nextGenWatchLayout) {
            int i = 0;
            if (nextGenWatchLayout2 != null) {
                nextGenWatchLayout2.j = null;
                nextGenWatchLayout2.a(false);
                this.E.d.b(this.v);
                if (this.d.b() && !this.d.d()) {
                    xpr.a(this.f);
                }
            }
            this.E = nextGenWatchLayout;
            nextGenWatchLayout2 = this.E;
            if (nextGenWatchLayout2 != null) {
                nextGenWatchLayout2.j = this;
                nextGenWatchLayout2.a(true);
                this.E.a(this.v);
            }
            this.G.a.a((lqk) nextGenWatchLayout);
            Object obj = nextGenWatchLayout != null ? nextGenWatchLayout.d : null;
            NextGenWatchContainerLayout nextGenWatchContainerLayout = this.c;
            nextGenWatchContainerLayout.f.a = obj;
            nextGenWatchContainerLayout.requestLayout();
            lvi lvi = this.u;
            while (i < lvi.b.size()) {
                lvh lvh = (lvh) lvi.b.valueAt(i);
                lla a = obj != null ? obj.a(lvh.a) : null;
                lla lla = lvh.c;
                if (lla != a) {
                    if (lla != null) {
                        lla.b(lvh);
                    }
                    lvh.c = a;
                    a = lvh.c;
                    if (a != null) {
                        a.a(lvh);
                        lvh.b(lvh.c);
                    }
                }
                i++;
            }
            lvf lvf = this.v;
            if (lvf.a != obj) {
                lvf.a = obj;
                lvf.a();
                llc llc = lvf.a;
                if (llc != null) {
                    lvf.a(llc.a());
                }
            }
        }
    }

    public final int d() {
        return foh.f(this.s) ? R.layout.swipey_next_gen_watch_layout : R.layout.single_next_gen_watch_layout;
    }

    public final void b(ejd ejd) {
        a(ejd, false);
    }

    private final void a(ejd ejd, boolean z) {
        if (this.d != ejd) {
            int i;
            int i2 = 0;
            switch (ejd.ordinal()) {
                case 0:
                case 6:
                case 7:
                case 8:
                case 9:
                    i = 0;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                case 10:
                case 11:
                    d(ejd);
                    i = 3;
                    break;
                default:
                    throw new IllegalStateException(String.format("The following player view mode is not supported %s", new Object[]{ejd.toString()}));
            }
            Object obj = (!z || this.B.b(ejd)) ? null : 1;
            lqq lve = new lve(this, ejd);
            NextGenWatchLayout nextGenWatchLayout = this.E;
            float f = 0.0f;
            if (nextGenWatchLayout == null) {
                NextGenWatchContainerLayout nextGenWatchContainerLayout = this.c;
                obj = (obj != null && nextGenWatchContainerLayout.d.b == 0 && i == 1) ? 1 : null;
                nextGenWatchContainerLayout.d.a(i);
                if (obj != null) {
                    lpu lpu = nextGenWatchContainerLayout.e;
                    if (!lpu.a()) {
                        lpu.c = lve;
                        i = lpu.d.getHeight();
                        Animator[] animatorArr = new Animator[3];
                        View view = lpu.d.b;
                        r8 = new float[2];
                        r8[0] = (float) ((int) (((float) i) * 0.66f));
                        r8[1] = 0.0f;
                        String str = "translationY";
                        animatorArr[0] = ObjectAnimator.ofFloat(view, str, r8);
                        animatorArr[1] = ObjectAnimator.ofFloat(lpu.d.c, str, new float[]{r0, 0.0f});
                        animatorArr[2] = ObjectAnimator.ofFloat(lpu.d.a, "alpha", new float[]{0.0f, 1.0f});
                        while (i2 < 3) {
                            animatorArr[i2].setDuration((long) lpu.a).setInterpolator(new AccelerateDecelerateInterpolator());
                            i2++;
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(animatorArr);
                        animatorSet.addListener(lpu);
                        lpu.b = animatorSet;
                        lpu.b.start();
                    }
                } else {
                    lve.a();
                }
                nextGenWatchContainerLayout.a();
            } else if (obj != null) {
                int a = nextGenWatchLayout.a(i);
                if (nextGenWatchLayout.d.aF_() && lol.a(128, a)) {
                    nextGenWatchLayout.a(2, true, null);
                    a = nextGenWatchLayout.a(2, 128, i, a);
                } else {
                    a = nextGenWatchLayout.a(i, a);
                }
                if (a != 2) {
                    if (a == 1) {
                        f = nextGenWatchLayout.k.d.c;
                    }
                    nextGenWatchLayout.k.a(f, new lqi(nextGenWatchLayout, false, lve));
                    return;
                }
                nextGenWatchLayout.a(i, lve);
            } else {
                nextGenWatchLayout.a(i, lve);
            }
        }
    }

    public final void c(ejd ejd) {
        ejd ejd2 = this.d;
        if (ejd2 != ejd) {
            this.d = ejd;
            ejd ejd3 = this.d;
            for (ejc a : this.e) {
                a.a(ejd2, ejd3);
                if (ejd3 != this.d) {
                    break;
                }
            }
            this.B.a(this.d);
            d(this.d);
            boolean z = true;
            if (this.d != ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
                Object obj = (this.d.c() || this.d.a()) ? 1 : null;
                c(obj == null ? 0.0f : 1.0f);
            }
            if (this.d != ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED && this.d.l()) {
                ((elk) this.h.get()).a(1.0f);
            }
            if (foh.o(this.s)) {
                int dimensionPixelOffset;
                if (this.d.d()) {
                    Resources resources = this.f.getResources();
                    dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.floaty_bar_start_bottom_padding) + resources.getDimensionPixelSize(R.dimen.floaty_bar_height);
                } else {
                    dimensionPixelOffset = 0;
                }
                eti eti = this.t;
                if (eti.b != dimensionPixelOffset) {
                    eti.b = dimensionPixelOffset;
                    if (!eti.a.isEmpty()) {
                        for (eth a2 : eti.a) {
                            a2.a(eti.b);
                        }
                    }
                }
            }
            if (this.d == ejd.WATCH_WHILE_MINIMIZED) {
                lui lui = this.o.a;
                if (lui != null) {
                    lkb h = lui.h();
                    if (h != null) {
                        h.e();
                    }
                }
            }
            ejd3 = this.d;
            if (!(!ejd3.l() || ejd3.g() || ejd3.d())) {
                this.A.b();
            }
            if (!(foh.B(this.s) && ejd2 == ejd.WATCH_WHILE_MAXIMIZED && this.d == ejd.WATCH_WHILE_FULLSCREEN)) {
                z = false;
            }
            this.L = z;
            if (this.M && ejd == ejd.WATCH_WHILE_MINIMIZED) {
                g(false);
            }
        }
    }

    private final void d(ejd ejd) {
        if ((!this.I || this.z.f()) && ejd.a()) {
            p();
            if (ejd.k()) {
                this.x.b(4);
            } else {
                this.x.b(2);
            }
            j(true);
            return;
        }
        this.x.b();
    }

    private final void j(boolean z) {
        if (z && !this.H && ((elk) this.h.get()).a()) {
            p();
            this.x.a(0);
        }
    }

    private final boolean p() {
        this.j.c();
        return true;
    }

    private final void k(boolean z) {
        if (!this.q.isInMultiWindowMode()) {
            this.H = z;
            z = this.d.a();
            if (!this.H) {
                j(z);
            } else if (z) {
                this.x.a(1);
            }
        }
    }

    public final void e() {
        b(ejd.VIRTUAL_REALITY_FULLSCREEN);
    }

    public final void f() {
        if (this.d.k()) {
            ejd ejd;
            if (this.B.a(true)) {
                ejd = ejd.WATCH_WHILE_MAXIMIZED;
            } else {
                ejd = ejd.WATCH_WHILE_FULLSCREEN;
            }
            b(ejd);
        }
    }

    public final void e(boolean z) {
        ejd ejd = ejd.WATCH_WHILE_MINIMIZED;
        boolean z2 = false;
        if (z && !this.d.a()) {
            z2 = true;
        }
        a(ejd, z2);
    }

    public final void f(boolean z) {
        if (this.B.a(false)) {
            a(ejd.WATCH_WHILE_MAXIMIZED, z);
        } else {
            b(ejd.WATCH_WHILE_FULLSCREEN);
        }
    }

    public final void g(boolean z) {
        ejd ejd = ejd.NONE;
        boolean z2 = false;
        if (z && this.d.b()) {
            z2 = true;
        }
        a(ejd, z2);
    }

    public final void g() {
        if (!this.d.a() && this.j.c() == null) {
            ejd a = this.d.a(true);
            a(a, 1 ^ this.B.b(a));
        }
    }

    public final void h() {
        b(ejd.WATCH_WHILE_PICTURE_IN_PICTURE);
    }

    public final void i() {
        if (this.d == ejd.WATCH_WHILE_PICTURE_IN_PICTURE) {
            ejd ejd;
            if (this.B.a(true)) {
                ejd = ejd.WATCH_WHILE_MAXIMIZED;
            } else {
                ejd = ejd.WATCH_WHILE_FULLSCREEN;
            }
            b(ejd);
        }
    }

    public final void j() {
        if (this.d.a()) {
            ejd a = this.d.a(false);
            a(a, this.B.b(a) ^ 1);
        }
    }

    public final void k() {
        b(this.B.d());
    }

    public final void l() {
        b(ejd.INLINE_MUTED);
    }

    public final void m() {
        b(ejd.INLINE_CAROUSEL);
    }

    public final boolean h(boolean z) {
        ejd ejd = this.d;
        if (ejd.c()) {
            if (ejd == ejd.WATCH_WHILE_MAXIMIZED && lsj.a(this.o)) {
                return true;
            }
            if (z) {
                this.f.finish();
                return true;
            } else if (this.L && ejd.a()) {
                j();
                return true;
            } else {
                e(true);
                return true;
            }
        } else if (ejd.k()) {
            ((ahxc) this.w.get()).a();
            return true;
        } else if (!ejd.a()) {
            return false;
        } else {
            j();
            return true;
        }
    }

    public final void i(boolean z) {
        if (this.I != z) {
            this.I = z;
            d(this.d);
        }
    }

    public final lcp n() {
        if (this.F == null) {
            this.F = new luh(new lvg(this), (elf) this.i.get(), (elk) this.h.get(), this.g, this.B, this.j);
        }
        return this.F;
    }

    public final elr o() {
        return this.G;
    }

    public final eix a(int i) {
        return this.u.a(i);
    }

    public final void c(ejc ejc) {
        if (!this.e.contains(ejc)) {
            this.e.add(0, ejc);
        }
    }

    public final void a(ejc ejc) {
        if (!this.e.contains(ejc)) {
            this.e.add(ejc);
        }
    }

    public final void b(ejc ejc) {
        this.e.remove(ejc);
    }

    public final ejd c() {
        return this.d;
    }

    public final void a(boolean z, int i) {
        if (this.c.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.c.getLayoutParams();
            marginLayoutParams.bottomMargin = !z ? 0 : i;
            this.c.setLayoutParams(marginLayoutParams);
        }
        this.M = z;
        if (z) {
            c_(2, i);
            if (this.M && this.r.b()) {
                g(false);
                return;
            }
            return;
        }
        c_(2, 0);
        if (((aizy) this.l.get()).p() != null && this.d == ejd.NONE) {
            e(false);
        }
    }

    public final void c_(int i, int i2) {
        this.k.a(i, i2);
    }

    private final void c(float f) {
        if (this.J != f) {
            this.J = f;
            this.C.a(0, f);
            this.D.b(this.J);
        }
    }

    public final void a_(int i) {
        xpu.a(this.c, new lvd(this, i));
    }

    public final void a(float f) {
        c(1.0f - f);
        c(ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED);
        l(false);
    }

    public final void b(float f) {
        ((elk) this.h.get()).a(f);
        c(ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED);
        l(true);
    }

    public final void a(boolean z) {
        a(z, ejd.NONE);
        l(false);
    }

    public final void b(boolean z) {
        a(z, ejd.WATCH_WHILE_MINIMIZED);
        l(false);
    }

    public final void c(boolean z) {
        a(z, ejd.WATCH_WHILE_MAXIMIZED);
        l(false);
    }

    public final void d(boolean z) {
        a(z, ejd.WATCH_WHILE_FULLSCREEN);
        l(false);
    }

    public final void b() {
        this.L = false;
    }

    private final void l(boolean z) {
        if (!z) {
            String str = this.K;
            if (str != null) {
                this.m.a(str);
                this.K = null;
            }
        } else if (this.K == null) {
            this.K = this.m.b();
        }
    }

    private final void a(boolean z, ejd ejd) {
        if (!z) {
            return;
        }
        if ((this.d != ejd.WATCH_WHILE_MINIMIZED && ejd == ejd.WATCH_WHILE_MINIMIZED) || ((this.d != ejd.WATCH_WHILE_MAXIMIZED && ejd == ejd.WATCH_WHILE_MAXIMIZED) || !((this.d != ejd.WATCH_WHILE_PICTURE_IN_PICTURE || ejd == ejd.WATCH_WHILE_PICTURE_IN_PICTURE) && this.d.a() == ejd.a() && this.d.l() == ejd.l()))) {
            c(ejd);
        }
    }

    public final void a(ejd ejd) {
        b(ejd);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjc.class, ahkk.class, ahkp.class};
        } else if (i != 0) {
            if (i == 1) {
                k(((ahkk) obj).a);
            } else if (i == 2) {
                k(false);
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((ahjc) obj).h == 6 && !this.d.g()) {
            g(false);
            return null;
        }
        return clsArr;
    }
}
