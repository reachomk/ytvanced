package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import com.google.android.youtube.R;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: jyi */
public final class jyi implements akot, fgz, fhn, jud, xcp {
    private final juf A;
    private final fhb B;
    private final ImageView C;
    private final akwz D;
    private kde E;
    private akyu F;
    private juc G;
    public final Context a;
    public final int b;
    public final int c;
    public final fni d;
    public final akpk e;
    public final jvz f;
    public final akkq g;
    public final jyw h;
    public final jzb i = new jzb(this);
    public acvx j;
    public int k;
    public ajry l;
    public int m;
    public boolean n;
    public Runnable o;
    public final FrameLayout p;
    public final SnappyRecyclerView q;
    public final jvm r;
    private final kdl s;
    private final View t;
    private final jze u;
    private final xci v;
    private final akyz w;
    private final jyx x;
    private final ent y;
    private final jvf z;

    public jyi(Context context, ScheduledExecutorService scheduledExecutorService, xsc xsc, jze jze, kdl kdl, xci xci, fni fni, juf juf, jvf jvf, akyz akyz, fhb fhb, jvz jvz, akkq akkq) {
        this.a = context;
        this.s = kdl;
        this.u = jze;
        this.v = xci;
        this.d = fni;
        this.w = akyz;
        this.x = new jyx(this, xsc, scheduledExecutorService);
        this.A = juf;
        this.B = fhb;
        this.f = jvz;
        this.g = akkq;
        this.p = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.carousel_item_layout, null);
        this.q = (SnappyRecyclerView) this.p.findViewById(R.id.carousel_items);
        this.t = this.p.findViewById(R.id.divider);
        this.C = (ImageView) this.p.findViewById(R.id.dismiss_button);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.horizontal_list_buttons_height);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        jze jze2 = this.u;
        SnappyRecyclerView snappyRecyclerView = this.q;
        jze2.h = snappyRecyclerView;
        jze2.f = new jzh(jze2.h, jze2.c, jze2.d, jze2.e);
        jze2.h.a(jze2.b);
        jze2.h.setNestedScrollingEnabled(false);
        jze2.h.T = new xor(snappyRecyclerView);
        this.r = jze.b;
        this.D = jze.f;
        this.e = this.D.a;
        this.y = new ent();
        this.q.o = this.y;
        this.z = jvf;
        this.h = new jyz(this, this.p);
        this.q.a(new jys());
        this.p.addOnLayoutChangeListener(new jyl(this));
    }

    public final void a(boolean z) {
    }

    public final fhc b() {
        return null;
    }

    public final View K_() {
        return this.p;
    }

    public final void a(akpb akpb) {
        this.v.b(this);
        ajry ajry = this.l;
        if (ajry != null && ajry.a != null) {
            int i = this.k;
            if (i >= 0 && i < this.e.size()) {
                Object obj = this.e.get(this.k);
                for (ajsa ajsa : this.l.a) {
                    if (aafh.a(ajsa) == obj) {
                        this.l.setExtension(ajrx.a, ajsa);
                        break;
                    }
                }
            } else {
                this.l.setExtension(ajrx.a, null);
            }
        }
        this.u.g.e = null;
        this.x.a = 0;
        jzb jzb = this.i;
        jzb.b = 0;
        jzb.a.clear();
        this.e.clear();
        xpr.a(this.p, false);
        kde kde = this.E;
        if (kde != null) {
            kde.a(akpb);
        }
        juc juc = this.G;
        if (juc != null) {
            this.z.b(juc);
        }
        this.G = null;
    }

    public final synchronized void c() {
        this.x.a();
    }

    public final synchronized void d() {
        if (!h()) {
            this.x.b();
        }
    }

    private final boolean h() {
        ajry ajry = this.l;
        return ajry != null && ajry.hasExtension(ajrx.b) && ((Boolean) this.l.getExtension(ajrx.b)).booleanValue();
    }

    public final void e() {
        if (!h() && this.e.size() > 1) {
            Object obj = this.e.get(this.k);
            if (obj instanceof aqto) {
                aqto aqto = (aqto) obj;
                this.x.a((long) aqto.s, (long) aqto.t);
            }
        }
    }

    public static boolean a(ajry ajry) {
        apjs apjs = ajry.b;
        return apjs != null && apjs.a == 141960765;
    }

    private final void i() {
        this.q.b(this.i);
        if (this.e.size() <= 1) {
            this.h.a(false);
            return;
        }
        this.h.a(this.l);
        f();
        this.q.a(this.i);
    }

    public final void f() {
        if (abe.E(this.p)) {
            boolean z = true;
            if (abe.g(this.p) != 1) {
                z = false;
            }
            b(z);
            return;
        }
        this.p.addOnLayoutChangeListener(new jyu(this));
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        int size;
        if (z) {
            size = (this.e.size() - this.k) - 1;
        } else {
            size = this.k;
        }
        this.h.a(size);
    }

    public static void a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public final void g() {
        jze jze = this.u;
        int i = this.k;
        int width = this.p.getWidth();
        int height = this.p.getHeight();
        akwz akwz = jze.f;
        if (akwz != null) {
            int i2;
            jzj jzj = jze.g;
            akpk akpk = akwz.a;
            if (!(jzj.e != null && akpk.size() == jzj.e.length && jzj.d == height && jzj.c == width)) {
                jzj.e = new boolean[akpk.size()];
            }
            jzj.d = height;
            jzj.c = width;
            if (i == 0) {
                i2 = i;
                i = 2;
            } else if (i != akpk.size() - 1) {
                i2 = i - 2;
                i += 2;
            } else {
                i2 = i - 2;
            }
            while (i2 < akpk.size() && i2 <= i) {
                if (i2 >= 0) {
                    boolean[] zArr = jzj.e;
                    if (!zArr[i2]) {
                        zArr[i2] = true;
                        Object obj = akpk.get(i2);
                        Context context;
                        akkq akkq;
                        aygk aygk;
                        if (obj instanceof aqto) {
                            context = jzj.a;
                            akkq = jzj.b;
                            aqto aqto = (aqto) obj;
                            aygk a = kbi.a(context, aqto);
                            if (a != null) {
                                akkq.a(a, width, height);
                            }
                            a = aqto.j;
                            if (a == null) {
                                a = aygk.f;
                            }
                            zz a2 = kbi.a(context, a, context.getResources().getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height));
                            if (a2 != null) {
                                aygk = aqto.j;
                                if (aygk == null) {
                                    aygk = aygk.f;
                                }
                                akkq.a(aygk, ((Integer) a2.a).intValue(), ((Integer) a2.b).intValue());
                            }
                        } else if (obj instanceof ajwn) {
                            context = jzj.a;
                            akkq = jzj.b;
                            aygk = wrt.a((ajwn) obj, wsb.a(context.getResources().getConfiguration().orientation));
                            if (aygk != null) {
                                akkq.a(aygk, width, height);
                            }
                        }
                    }
                }
                i2++;
            }
        }
    }

    public final View a() {
        return this.p;
    }

    public final bblt a(int i) {
        if (i != 0) {
            return this.B.a().b(new jyt(this));
        }
        this.f.a(false);
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof jyi) && ((jyi) fhn).l == this.l) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int i;
        acwb acwb = akor;
        ajry ajry = (ajry) obj;
        this.v.a(this);
        xpr.a(this.p, true);
        this.l = ajry;
        this.j = acwb.a;
        this.j.a(ajry.d, null);
        if (this.G == null && this.l.g == 3) {
            juf juf = this.A;
            zyw zyw = (zyw) juf.a((zyw) juf.a.get(), 1);
            fhk fhk = (fhk) juf.a((fhk) juf.b.get(), 2);
            jtw jtw = (jtw) juf.a((jtw) juf.c.get(), 3);
            fga fga = (fga) juf.a((fga) juf.d.get(), 4);
            jty jty = (jty) juf.a((jty) juf.e.get(), 5);
            xci xci = (xci) juf.a((xci) juf.f.get(), 6);
            juc juc = r9;
            juc juc2 = new juc(zyw, fhk, jtw, fga, jty, xci, (fgc) juf.a((fgc) juf.g.get(), 7), (xpt) juf.a((xpt) juf.h.get(), 8), (RecyclerView) juf.a(this.q, 9), (akpd) juf.a(this.D.b, 10), (aknh) juf.a(this.e, 11), (ent) juf.a(this.y, 12));
            this.G = juc;
        }
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        if (layoutParams != null) {
            ajsa[] ajsaArr = this.l.a;
            if (!(ajsaArr == null || ajsaArr.length == 0)) {
                if (ajsaArr[0].b != null) {
                    layoutParams.height = -1;
                } else {
                    layoutParams.height = -2;
                }
                this.p.setLayoutParams(layoutParams);
            }
        }
        this.D.b.a(new jyn(this));
        this.D.a(this.l.a);
        if (this.l.hasExtension(ajrx.c)) {
            for (ajsa ajsa : (ajsa[]) this.l.getExtension(ajrx.c)) {
                if (ajsa != null) {
                    this.e.remove(aafh.a(ajsa));
                    this.e.a();
                }
            }
        }
        akpd akpd = this.D.b;
        akpd.a(new jym(this));
        akpd.a(new jyp(this));
        akpd.a(new jyo(this));
        if (this.l.hasExtension(ajrx.a)) {
            Object a = aafh.a((ajsa) this.l.getExtension(ajrx.a));
            for (i = 0; i < this.e.size(); i++) {
                if (a == this.e.get(i)) {
                    this.k = i;
                    break;
                }
            }
        } else {
            this.k = 0;
        }
        this.q.c(this.k);
        e();
        if (jyi.a(this.l)) {
            arut arut;
            if (this.E == null) {
                this.E = this.s.a(this.p);
                RecyclerView recyclerView = this.E.a;
                this.p.addView(recyclerView);
                LayoutParams layoutParams2 = (LayoutParams) recyclerView.getLayoutParams();
                layoutParams2.gravity = 8388691;
                recyclerView.setLayoutParams(layoutParams2);
            }
            kde kde = this.E;
            apjs apjs = this.l.b;
            if (apjs.a == 141960765) {
                arut = (arut) apjs.b;
            } else {
                arut = arut.e;
            }
            kde.a_(acwb, arut);
            this.D.b.a(new jyr(this));
            xpr.a(this.t, true);
            jyi.a(this.t, this.b);
        } else {
            xpr.a(this.t, false);
        }
        i();
        aphg aphg = (aphg) ajzv.a(this.l.e, aphg.class);
        if (aphg == null || aphg.f || xrn.c(this.a)) {
            xpr.a(this.C, false);
        } else {
            if (this.F == null) {
                this.F = this.w.a(this.C);
                this.F.c = new jyk(this);
            }
            this.F.a(aphg, this.j);
        }
        juc juc3 = this.G;
        if (juc3 != null) {
            this.z.c(juc3);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zyg.class};
        } else if (i == 0) {
            obj = ((zyg) obj).d;
            if (!(obj instanceof ajwn) && !(obj instanceof aqto)) {
                return null;
            }
            i = 0;
            while (true) {
                ajsa[] ajsaArr = this.l.a;
                if (i >= ajsaArr.length) {
                    break;
                } else if (obj == aafh.a(ajsaArr[i])) {
                    if (!this.l.hasExtension(ajrx.c) || ((ajsa[]) this.l.getExtension(ajrx.c)).length == 0) {
                        this.l.setExtension(ajrx.c, new ajsa[this.l.a.length]);
                    }
                    ((ajsa[]) this.l.getExtension(ajrx.c))[i] = this.l.a[i];
                } else {
                    i++;
                }
            }
            if (this.e.size() == 1 && this.e.get(0) == obj) {
                this.v.d(new zyg(this.l));
                return null;
            }
            i = this.k;
            int size = this.e.size() - 1;
            this.e.remove(obj);
            if (this.e.isEmpty()) {
                this.v.d(new zyg(this.l));
                return null;
            }
            if (i == size) {
                this.k = 0;
            }
            this.q.c(this.k);
            i();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
