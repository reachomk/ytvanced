package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: lru */
public final class lru implements ejc, lra, lrb, lrj, lrm, lui, t {
    private final bcaa A;
    private final lsr B;
    private final ltw C;
    private final ltn D;
    private final len E;
    private final ezg F;
    private final ltk G;
    private final lns H;
    private final bapu I;
    private final eif J;
    private final akpe K;
    private final lub L;
    private final lto M;
    private final lsw N;
    private final ltj O;
    private final emd P;
    private final lsh Q;
    private final lhy R;
    private final lit S;
    private final lie T;
    private final hbg U;
    private final dvw V;
    private final akko W;
    private final lke X;
    private final zyw Y;
    private final zzl Z;
    public final Context a;
    private lsp aA;
    private lnp aB;
    private final ArrayList aC;
    private ltu aD;
    private Configuration aE;
    private final vcx aa;
    private final lrh ab;
    private final int ac;
    private final foi ad;
    private final bcaa ae;
    private final lrr af;
    private final fly ag;
    private final kwi ah;
    private lij ai;
    private lkb aj;
    private lhx ak;
    private liu al;
    private lii am;
    private lic an;
    private lue ao;
    private leq ap;
    private CoordinatorLayout aq;
    private TextView ar;
    private View as;
    private View at;
    private RelativeLayout au;
    private ltv av;
    private lro aw;
    private final ArrayList ax;
    private akve ay;
    private jhy az;
    public final kza b;
    public final acvx c;
    public lia d;
    public ltx e;
    public RecyclerView f;
    public ans g;
    public akwy h;
    public vcw i;
    public fmf j;
    private final Activity k;
    private final xci l;
    private final akkq m;
    private final has n;
    private final haq o;
    private final ajam p;
    private final bdfu q;
    private final waw r;
    @Deprecated
    private final vuv s;
    private final vdx t;
    private final vod u;
    private final afqv v;
    private final ewi w;
    private final aaas x;
    private final bcaa y;
    private final eld z;

    public lru(Activity activity, xci xci, akkq akkq, haq haq, has has, ajam ajam, waw waw, vuv vuv, vdx vdx, vod vod, emd emd, afqv afqv, ewi ewi, aaas aaas, eld eld, kza kza, eif eif, lie lie, lsr lsr, ltw ltw, acvx acvx, ezg ezg, bapu bapu, hbg hbg, ltn ltn, ltk ltk, lns lns, akpe akpe, lub lub, lto lto, lsw lsw, ltj ltj, lhy lhy, lit lit, exu exu, dvw dvw, lke lke, zyw zyw, zzl zzl, vcx vcx, foi foi, bcaa bcaa, lrr lrr, fly fly, kwi kwi, Context context, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        Activity activity2 = activity;
        this.k = activity2;
        this.a = context;
        this.l = xci;
        this.m = akkq;
        this.o = haq;
        this.n = has;
        this.p = ajam;
        this.r = waw;
        this.s = vuv;
        this.t = vdx;
        this.u = vod;
        this.v = afqv;
        this.w = ewi;
        this.x = aaas;
        this.y = bcaa4;
        this.z = eld;
        this.A = bcaa2;
        this.b = kza;
        this.B = lsr;
        this.C = ltw;
        int i = foh.f(zyw) ? foh.a(zzl) ? 1 : 2 : 0;
        this.ac = i;
        this.ah = kwi;
        this.c = i != 0 ? new lfx() : acvx;
        this.F = ezg;
        this.I = bapu;
        this.U = hbg;
        this.T = lie;
        this.E = (len) bcaa3.get();
        this.H = lns;
        this.D = ltn;
        this.G = ltk;
        this.J = eif;
        this.K = akpe;
        this.L = lub;
        this.M = lto;
        this.N = lsw;
        this.O = ltj;
        this.R = lhy;
        this.S = lit;
        this.V = dvw;
        this.X = lke;
        this.Y = zyw;
        this.Z = zzl;
        this.aa = vcx;
        this.ad = foi;
        this.ae = bcaa;
        this.P = emd;
        this.af = lrr;
        this.av = new lsm();
        this.ag = fly;
        this.ab = new lrh(exu, this);
        this.ab.a((lra) this);
        this.ab.a((lrm) this);
        this.Q = new lsh(this);
        this.q = new bdfu();
        this.aC = new ArrayList();
        this.ax = new ArrayList();
        this.W = akko.h.g().a((int) R.color.black).b(false).a();
        if (activity2 instanceof dvg) {
            ((dvg) activity2).e.a(this);
        }
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(af afVar) {
        this.ab.a(null);
        this.h.c();
        afVar.y_().b(this);
    }

    public final void a(View view, ViewGroup viewGroup, ezm ezm, aux aux, lij lij, ImageView imageView, lkd lkd) {
        zl zlVar;
        ezm ezm2 = ezm;
        aux aux2 = aux;
        lij lij2 = lij;
        ImageView imageView2 = imageView;
        lkd lkd2 = lkd;
        LayoutInflater from = LayoutInflater.from(this.a);
        this.aq = (CoordinatorLayout) from.inflate(R.layout.watch_panel, viewGroup, false);
        lkb lkb = null;
        if (!(this.ac == 2 || imageView2 == null)) {
            if (imageView.getParent() instanceof ViewGroup) {
                ((ViewGroup) imageView.getParent()).removeView(imageView2);
            }
            imageView2 = null;
        }
        lns lns = this.H;
        int i = 4;
        this.aB = new lnp((akkq) lns.a((akkq) lns.a.get(), 1), (elv) lns.a((elv) lns.b.get(), 2), imageView2, (akko) lns.a(this.W, 4));
        if (lkd2 != null) {
            lkb = this.X.a(lkd2);
        }
        this.aj = lkb;
        lrm lrm = this.aj;
        if (lrm != null) {
            this.ab.a(lrm);
            this.ab.a(this.aj);
        }
        View findViewById = this.aq.findViewById(R.id.scrim);
        View view2 = (LoadingFrameLayout) this.aq.findViewById(R.id.video_info_loading_layout);
        a((LoadingFrameLayout) view2);
        this.aC.add(this.M.a((LoadingFrameLayout) view2, false));
        this.ar = (TextView) view2.b.b.findViewById(R.id.title);
        this.f = (RecyclerView) view2.findViewById(R.id.watch_list);
        this.g = new eyy(from.getContext());
        this.f.a(this.g);
        this.as = this.aq.findViewById(R.id.set_bar);
        this.at = this.aq.findViewById(R.id.set_content);
        this.au = (RelativeLayout) this.aq.findViewById(R.id.engagement_panel);
        this.e = new ltx(view2, this.as, this.at, this.au, findViewById, this.E);
        this.L.a(this.e);
        this.e.a(this.L.a);
        len len = this.E;
        Object obj = this.au;
        haq haq = this.o;
        akoq a = ftm.a();
        if (len.l != obj) {
            len.n = false;
        }
        leu leu = len.a;
        bcaa bcaa = len.h;
        bcaa bcaa2 = len.i;
        leu.e = true;
        leu.b = bcaa;
        leu.c = bcaa2;
        len.l = (RelativeLayout) amqw.a(obj);
        len.m = true;
        len.k = new les(len.f, len.g, len.e, haq, a, len.j);
        this.E.a(new lsb(this));
        Activity activity = this.k;
        akkq akkq = this.m;
        aaas aaas = this.x;
        this.y.get();
        this.i = new vcw(activity, akkq, aaas, this.c, this.r, this.u);
        ltj ltj = this.O;
        vcw vcw = this.i;
        int i2 = 0;
        while (true) {
            zlVar = ltj.b;
            if (i2 >= zlVar.b) {
                break;
            }
            vcw.a((vcy) zlVar.a(i2));
            i2++;
        }
        i2 = 0;
        while (true) {
            zlVar = ltj.a;
            if (i2 >= zlVar.b) {
                break;
            }
            View view3 = view;
            vcw.a.add((vdc) zlVar.a(i2));
            i2++;
            i = 4;
        }
        vcw.a(new jrk(vcw, ltj.c));
        akpb akpb = (akpb) this.A.get();
        akpb.a(eqd.class, new eqc(this.a, this.aa));
        this.ay = new akve(c(this.a.getResources().getConfiguration()));
        this.az = new lsg(this, this.k);
        this.az.a(b(this.a.getResources().getConfiguration()));
        ltk ltk = this.G;
        lth lth = new lth((Context) ltk.a((Context) ltk.a.get(), 1), (haq) ltk.a((haq) ltk.b.get(), 2), (xci) ltk.a((xci) ltk.c.get(), 3), (akvz) ltk.a((akvz) ltk.d.get(), i), (xoi) ltk.a((xoi) ltk.e.get(), 5), (acvx) ltk.a((acvx) ltk.f.get(), 6), ltk.g, (lsz) ltk.a((lsz) ltk.h.get(), 8), (weo) ltk.a((weo) ltk.i.get(), 9), (jhz) ltk.a((jhz) ltk.j.get(), 10), (jhd) ltk.a((jhd) ltk.k.get(), 11), (akdk) ltk.a((akdk) ltk.l.get(), 12), (akdk) ltk.a((akdk) ltk.m.get(), 13), (amqp) ltk.a((amqp) ltk.n.get(), 14), (akvj) ltk.a(this.ay, 15), (jhy) ltk.a(this.az, 16));
        fly fly = this.ag;
        foi foi = this.ad;
        RecyclerView recyclerView = this.f;
        haq haq2 = this.o;
        this.h = fly.a(foi, recyclerView, haq2, lth, this.c, akpb, akxw.n, akxj.d, 0, akhs.WATCH, syb.a);
        dvr.a(this.h);
        this.h.a(ftm.a());
        this.h.a(new lsf(this));
        this.h.a(new itb());
        if (foh.E(this.Y)) {
            this.h.a(new lrz(this));
        }
        this.f.a(this.O.d.a);
        aknh aknh = this.D.a;
        this.h.a(aknh);
        aknh.b(new lsi(this, aknh));
        ltn ltn = this.D;
        ltn.b = this.Q;
        this.i.h.add(ltn);
        lsr lsr = this.B;
        this.aA = new lsp((Activity) lsr.a((Activity) lsr.a.get(), 1), (lsu) lsr.a((lsu) lsr.b.get(), 2), (lsn) lsr.a((lsn) lsr.c.get(), 3), (zyw) lsr.a((zyw) lsr.d.get(), i), (lub) lsr.a((lub) lsr.e.get(), 5), (ltz) lsr.a((ltz) lsr.f.get(), 6), (ltx) lsr.a(this.e, 7), (View) lsr.a(this.as, 8), (View) lsr.a(this.at, 9), (acvx) lsr.a(this.c, 10));
        this.aA.a(new lsc(this));
        this.aw = new lro(this.a, this.E, this.ab, this.J, this.e, this.D, this.P, this.f, this.h);
        leq leq = this.aw;
        leq.d.a((apv) leq);
        leq.b.a((lrm) leq);
        if (lrh.b(leq.b.b)) {
            leq.c.a(leq);
        }
        leq.a.a(leq);
        ltw ltw = this.C;
        this.aD = new ltu((Activity) ltw.a((Activity) ltw.a.get(), 1), (zwj) ltw.a((zwj) ltw.b.get(), 2), (zwh) ltw.a((zwh) ltw.c.get(), 3), (Context) ltw.a(this.a, 4), (ViewStub) ltw.a((ViewStub) this.aq.findViewById(R.id.info_cards_drawer), 5), (lrh) ltw.a(this.ab, 6));
        if (ezm2 != null) {
            if (ezm.a()) {
                a((ViewGroup) ezm.b());
            } else {
                ezm2.a(new lrt(this));
            }
        }
        if (aux2 != null) {
            int childCount = this.aq.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                view2 = this.aq.getChildAt(childCount);
                if (view2.getLayoutParams() instanceof auy) {
                    ((auy) view2.getLayoutParams()).a(aux2);
                }
            }
        }
        if (lij2 != null) {
            this.ai = lij2;
            this.al = new liu((adqf) lit.a((adqf) this.S.a.get(), 1), (lij) lit.a(lij2, 2));
            this.am = new lii((View) lih.a(view, 1), (lij) lih.a(lij2, 2));
            this.ab.a(this.al);
            this.ab.a(this.al);
            this.ab.a(this.am);
            lhy lhy = this.R;
            this.ak = new lhx((ahku) lhy.a((ahku) lhy.a.get(), 1), (ahkw) lhy.a((ahkw) lhy.b.get(), 2), (xci) lhy.a((xci) lhy.c.get(), 3), (ajam) lhy.a((ajam) lhy.d.get(), 4), (zyw) lhy.a((zyw) lhy.e.get(), 5), (lij) lhy.a(lij2, 6), (lrh) lhy.a(this.ab, 7));
            this.ab.a(this.ak);
            this.ab.a(this.ak);
            if (lij2 instanceof lip) {
                lie lie = this.T;
                this.an = new lic((ekj) lie.a((ekj) lie.a.get(), 1), (ekt) lie.a((ekt) lie.b.get(), 2), (xci) lie.a((xci) lie.c.get(), 3), (zyw) lie.a((zyw) lie.d.get(), 4), (lip) lie.a((lip) lij2, 5));
                this.ab.a(this.an);
                this.ab.a(this.an);
            }
            this.d = new lia(lij2);
            this.ab.a(this.d);
            this.ap = new lrw(this);
            this.ao = new lry(this);
            this.L.a(this.ao);
        }
        if (foh.E(this.Y)) {
            int i3;
            apa apa = (apa) this.h.e;
            StickyHeaderContainer stickyHeaderContainer = (StickyHeaderContainer) this.aq.findViewById(R.id.sticky_header_container);
            akoh akoh = this.h.d;
            apxn a2 = this.Y.a();
            if (a2 == null || (a2.a & 16) == 0) {
                i3 = 0;
            } else {
                aulu aulu = a2.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                i3 = aulu.aX;
            }
            this.j = new fmf(stickyHeaderContainer, apa, new ltg(akoh, i3));
        }
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            int i = 0;
            viewGroup2.setBackgroundColor(xwe.a(this.a, R.attr.ytBrandBackgroundSolid, 0));
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) viewGroup2;
            ltm a = this.M.a(loadingFrameLayout, true);
            lrr lrr = this.af;
            RecyclerView recyclerView = (RecyclerView) loadingFrameLayout.findViewById(R.id.watch_info_watch_list);
            bcaa bcaa = this.A;
            akpe akpe = this.K;
            ltc ltc = (ltc) lrr.a((ltc) lrr.a.get(), 1);
            RecyclerView recyclerView2 = (RecyclerView) lrr.a(recyclerView, 2);
            bcaa bcaa2 = (bcaa) lrr.a(bcaa, 3);
            lrs lrs = r11;
            akpe akpe2 = (akpe) lrr.a(akpe, 4);
            lrs lrs2 = new lrs(ltc, recyclerView2, bcaa2, akpe2, (acvx) lrr.a(this.c, 5), (akwy) lrr.a(this.h, 6));
            this.av = lrs;
            lqz lqz = this.ab.a;
            if (lqz != null) {
                ahjc ahjc = lqz.f;
                if (ahjc != null) {
                    xoy lrx;
                    eld eld;
                    if (lqz.a(ahjc)) {
                        eld = this.z;
                        eld.getClass();
                        lrx = new lrx(eld);
                    } else {
                        eld = this.z;
                        eld.getClass();
                        lrx = new lsa(eld);
                    }
                    loadingFrameLayout.a(lrx);
                    a.a = lrx;
                    a.a(ahjc);
                } else {
                    aafv e;
                    if (!this.ax.isEmpty()) {
                        i = ((LoadingFrameLayout) this.ax.get(0)).c;
                    }
                    if (i == 1) {
                        loadingFrameLayout.a();
                    } else if (i != 2) {
                        loadingFrameLayout.c();
                    } else {
                        loadingFrameLayout.b();
                    }
                    if (lqz.e() != null) {
                        e = lqz.e();
                    } else {
                        e = lqz.d();
                    }
                    this.av.a(e);
                }
            } else {
                loadingFrameLayout.c();
            }
            a(loadingFrameLayout);
            this.aC.add(a);
            Configuration configuration = this.aE;
            if (configuration != null) {
                this.av.a(configuration);
            }
        }
    }

    private final void a(LoadingFrameLayout loadingFrameLayout) {
        this.ax.add(loadingFrameLayout);
    }

    public final View f() {
        return this.aq;
    }

    public final void a(Configuration configuration) {
        this.aE = configuration;
        m();
        this.h.a(configuration);
        this.ay.a(c(configuration));
        this.av.a(configuration);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!this.J.c().a()) {
            abqf abqf = (abqf) this.I.get();
            abqg abqg = abqf.d;
            if (abqg != null && abqg.c) {
                ((abpo) abqf.a.get()).a(abqf.d.a());
                ((abpk) abqf.b.get()).a(abqf.d.b());
            }
        }
        m();
    }

    public final len g() {
        return this.E;
    }

    public final lkb h() {
        return this.aj;
    }

    public final void i() {
        lij lij = this.ai;
        if (lij != null) {
            lij.a(0, true);
        }
    }

    public final void j() {
        lij lij = this.ai;
        if (lij != null) {
            lij.a(1, true);
        }
    }

    public final int k() {
        if (!this.ax.isEmpty()) {
            return ((LoadingFrameLayout) this.ax.get(0)).c;
        }
        afpc.a(1, afpf.main, "Missing LoadingFrameLayout in DefaultWatchPanelViewController.");
        return 0;
    }

    public final void a(lqz lqz) {
        if (this.ac != 0) {
            lfx lfx = (lfx) this.c;
            if (lqz == null) {
                lfx.a(acvx.g);
            } else {
                lfx.a(((lly) this.ae.get()).a(lqz.a));
            }
        }
        this.ab.a(lqz);
    }

    public final lqz l() {
        return this.ab.a;
    }

    public final void a(int i, int i2) {
        if (i2 == 3) {
            bdfu bdfu = this.q;
            Object obj = this.i;
            ajam ajam = this.p;
            this.l.a(obj);
            bdfu.a(obj.a(ajam));
            if (foh.x(this.Y)) {
                this.q.a(this.D.a(this.p));
            } else {
                this.l.a(this.D);
            }
            this.l.a(this.V);
            if (this.ai != null) {
                this.E.a(this.ap);
            }
            if (wcf.e(this.Z)) {
                this.t.a(this.i);
                this.t.a(this.E);
            }
            this.s.a(this.i.c);
            this.s.a(this.E.d);
            lkb lkb = this.aj;
            if (lkb != null) {
                lkb.a();
                this.aj.f();
            }
        }
        if (i == 3) {
            this.q.a();
            this.l.b(this.i);
            if (!foh.x(this.Y)) {
                this.l.b(this.D);
            }
            this.l.b(this.V);
            lkb lkb2 = this.aj;
            if (lkb2 != null) {
                lkb2.b();
            }
            if (this.ai != null) {
                len len = this.E;
                Object obj2 = this.ap;
                amqw.a(obj2);
                len.c.remove(obj2);
            }
            if (wcf.e(this.Z)) {
                this.t.b(this.i);
                this.t.b(this.E);
            }
            this.s.b(this.i.c);
            this.s.b(this.E.d);
        }
        boolean b = lrh.b(i);
        boolean b2 = lrh.b(i2);
        if (b != b2) {
            if (b2) {
                this.J.a(this);
                a(this.a.getResources().getConfiguration());
                a(ejd.NONE, this.J.c());
                vdb vdb = this.i.d;
                if (vdb != null) {
                    vdb.b();
                }
            } else {
                this.J.b(this);
            }
        }
        boolean a = lrh.a(i);
        boolean a2 = lrh.a(i2);
        if (a == a2) {
            return;
        }
        if (a2) {
            this.aa.a = (vcw) amqw.a(this.i);
            return;
        }
        this.n.a();
        this.i.a();
        this.V.a();
        lsw lsw = this.N;
        lsw.a();
        lsw.a = null;
        this.aw.a();
        lqz lqz = this.ab.a;
        if (lqz != null) {
            this.F.a(lqz.a.c());
        }
        if (this.J.c().a()) {
            this.U.l();
        }
    }

    public final void a(lqz lqz, lqz lqz2) {
        enm enm = null;
        if (lqz != null) {
            this.F.a(lqz.a.c());
            lqz.b((lrb) this);
            Bundle t = (this.ax.isEmpty() || ((LoadingFrameLayout) this.ax.get(0)).c != 2 || this.g.p() <= 0) ? null : this.h.t();
            lqz.a(t);
        }
        if (lqz2 != null) {
            lqz2.a((lrb) this);
        }
        if (lqz2 != null) {
            enm = lqz2.a;
        }
        a(enm);
        a(lqz2, 127);
    }

    /* JADX WARNING: Missing block: B:11:0x001b, code skipped:
            if ((r10 & 8) != 0) goto L_0x001f;
     */
    public final void a(defpackage.lqz r9, int r10) {
        /*
        r8 = this;
        r0 = r8.ab;
        r0 = r0.a;
        if (r0 != r9) goto L_0x0101;
    L_0x0006:
        r0 = r10 & 32;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x001f;
    L_0x000b:
        r0 = r8.k();
        r1 = 3;
        if (r0 == r1) goto L_0x0101;
    L_0x0012:
        r1 = r10 & 16;
        if (r1 != 0) goto L_0x001f;
    L_0x0016:
        r1 = 1;
        if (r0 != r1) goto L_0x0101;
    L_0x0019:
        r10 = r10 & 8;
        if (r10 != 0) goto L_0x001f;
    L_0x001d:
        goto L_0x0101;
    L_0x001f:
        r10 = 0;
        if (r9 != 0) goto L_0x0027;
    L_0x0022:
        r8.a(r10);
        goto L_0x00ca;
    L_0x0027:
        r0 = r9.f;
        if (r0 != 0) goto L_0x008c;
    L_0x002b:
        r0 = r9.e();
        if (r0 == 0) goto L_0x0069;
    L_0x0031:
        r0 = r9.e();
        r8.a(r0);
        r0 = r9.e();
        r0 = r0.a;
        if (r0 == 0) goto L_0x00ca;
    L_0x0040:
        r0 = r9.e();
        r0 = r0.a;
        r0 = r0.m;
        if (r0 == 0) goto L_0x00ca;
    L_0x004a:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0.put(r1, r8);
        r1 = r8.h;
        r2 = "sectionListController";
        r0.put(r2, r1);
        r1 = r8.x;
        r2 = r9.e();
        r2 = r2.a;
        r2 = r2.m;
        r1.a(r2, r0);
        goto L_0x00ca;
    L_0x0069:
        r0 = r9.d();
        if (r0 == 0) goto L_0x0088;
    L_0x006f:
        r0 = r9.d();
        r8.a(r0);
        r0 = r8.aj;
        if (r0 == 0) goto L_0x00ca;
    L_0x007a:
        r0 = r9.a();
        r1 = r9.b();
        r2 = r8.aj;
        r2.a(r0, r1);
        goto L_0x00ca;
    L_0x0088:
        r8.a(r10);
        goto L_0x00ca;
    L_0x008c:
        r1 = defpackage.lqz.a(r0);
        if (r1 == 0) goto L_0x00a0;
    L_0x0092:
        r1 = r8.z;
        r1.getClass();
        r2 = new lse;
        r2.<init>(r1);
        r8.a(r2);
        goto L_0x00ad;
    L_0x00a0:
        r1 = r8.z;
        r1.getClass();
        r2 = new lsd;
        r2.<init>(r1);
        r8.a(r2);
    L_0x00ad:
        r1 = r8.aC;
        r2 = r1.size();
        r3 = 0;
    L_0x00b4:
        if (r3 < r2) goto L_0x00f5;
    L_0x00b6:
        r0 = r8.aA;
        r0.a(r10);
        r0 = r8.aA;
        r0.c();
        r0 = r8.E;
        r0.a();
        r0 = r8.e;
        r0.a();
    L_0x00ca:
        r0 = r8.aB;
        r1 = r0.d;
        if (r1 == 0) goto L_0x00f4;
    L_0x00d0:
        if (r9 == 0) goto L_0x00d7;
    L_0x00d2:
        r1 = r9.c();
        goto L_0x00d8;
    L_0x00d7:
        r1 = r10;
    L_0x00d8:
        r2 = r0.e;
        if (r1 == r2) goto L_0x00f4;
    L_0x00dc:
        r2 = r0.a;
        r3 = r0.b;
        r4 = r0.d;
        if (r9 != 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00eb;
    L_0x00e5:
        r9 = r9.a;
        r10 = r9.c();
    L_0x00eb:
        r5 = r10;
        r7 = r0.c;
        r6 = r1;
        defpackage.elq.a(r2, r3, r4, r5, r6, r7);
        r0.e = r1;
    L_0x00f4:
        return;
    L_0x00f5:
        r4 = r1.get(r3);
        r4 = (defpackage.ltm) r4;
        r4.a(r0);
        r3 = r3 + 1;
        goto L_0x00b4;
    L_0x0101:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.a(lqz, int):void");
    }

    private final void a(enm enm) {
        this.aA.a(enm);
        this.i.a();
        this.n.a();
        this.ar.setVisibility(8);
        ArrayList arrayList = this.ax;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).a();
        }
        this.E.a();
        this.ah.f();
        this.e.a();
        this.aw.a();
        this.av.a();
        this.aD.a.c();
    }

    private final void a(xoy xoy) {
        ArrayList arrayList = this.ax;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((LoadingFrameLayout) arrayList.get(i)).a(xoy);
        }
        arrayList = this.aC;
        size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ltm) arrayList.get(i2)).a = xoy;
        }
    }

    private final int c(Configuration configuration) {
        if (xss.b(this.a) && configuration.orientation == 2) {
            return 1;
        }
        return this.a.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
    }

    public final int b(Configuration configuration) {
        if (xss.b(this.a) && configuration.orientation == 2) {
            return 1;
        }
        return this.a.getResources().getInteger(R.integer.grid_shelf_num_columns);
    }

    /* JADX WARNING: Missing block: B:35:0x0175, code skipped:
            if (r5.length != 0) goto L_0x017c;
     */
    private final void a(defpackage.aafv r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r1.e;
        r3 = 0;
        r4 = 0;
        if (r2 != 0) goto L_0x001f;
    L_0x000a:
        r2 = r0.ax;
        r5 = r2.size();
        r6 = 0;
    L_0x0011:
        if (r6 >= r5) goto L_0x004d;
    L_0x0013:
        r7 = r2.get(r6);
        r7 = (com.google.android.libraries.youtube.common.ui.LoadingFrameLayout) r7;
        r7.c();
        r6 = r6 + 1;
        goto L_0x0011;
    L_0x001f:
        r2 = r0.ab;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0030;
    L_0x0025:
        r5 = r2.e();
        if (r5 != 0) goto L_0x002d;
    L_0x002b:
        r2.g = r4;
    L_0x002d:
        r2 = r2.g;
        goto L_0x0031;
    L_0x0030:
        r2 = r4;
    L_0x0031:
        r5 = r0.h;
        r6 = r1.e;
        r5.b(r6, r2);
        r2 = r0.ax;
        r5 = r2.size();
        r6 = 0;
    L_0x003f:
        if (r6 >= r5) goto L_0x004d;
    L_0x0041:
        r7 = r2.get(r6);
        r7 = (com.google.android.libraries.youtube.common.ui.LoadingFrameLayout) r7;
        r7.b();
        r6 = r6 + 1;
        goto L_0x003f;
    L_0x004d:
        r2 = r0.aA;
        r5 = r1.h;
        r2.k = r5;
        r5 = r2.k;
        if (r5 == 0) goto L_0x01a1;
    L_0x0057:
        r5 = defpackage.lsp.a(r5);
        if (r5 != 0) goto L_0x005f;
    L_0x005d:
        goto L_0x01a1;
    L_0x005f:
        r5 = r2.j;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        r9 = 1;
        if (r5 != 0) goto L_0x0116;
    L_0x0067:
        r5 = r2.f;
        r10 = 2131758303; // 0x7f100cdf float:1.9147566E38 double:1.0532285427E-314;
        r5 = r5.findViewById(r10);
        r5 = (android.support.v7.widget.RecyclerView) r5;
        r10 = new eyt;
        r11 = r2.a;
        r10.<init>(r11);
        r10.b(r9);
        r5.a(r10);
        r10 = r2.i;
        r5.setNestedScrollingEnabled(r10);
        r10 = r2.e;
        r11 = r2.d;
        r15 = new lsl;
        r12 = r10.a;
        r12 = r12.get();
        r12 = (defpackage.xci) r12;
        r12 = defpackage.lsn.a(r12, r9);
        r13 = r12;
        r13 = (defpackage.xci) r13;
        r12 = r10.b;
        r12 = r12.get();
        r12 = (defpackage.aaas) r12;
        r12 = defpackage.lsn.a(r12, r8);
        r14 = r12;
        r14 = (defpackage.aaas) r14;
        r12 = r10.c;
        r12 = r12.get();
        r12 = (defpackage.abka) r12;
        r12 = defpackage.lsn.a(r12, r7);
        r16 = r12;
        r16 = (defpackage.abka) r16;
        r12 = r10.d;
        r12 = r12.get();
        r12 = (defpackage.xoi) r12;
        r12 = defpackage.lsn.a(r12, r6);
        r17 = r12;
        r17 = (defpackage.xoi) r17;
        r12 = r10.e;
        r12 = r12.get();
        r12 = (defpackage.akpe) r12;
        r7 = 5;
        r7 = defpackage.lsn.a(r12, r7);
        r7 = (defpackage.akpe) r7;
        r10 = r10.f;
        r10 = r10.get();
        r10 = (defpackage.akph) r10;
        r12 = 6;
        r10 = defpackage.lsn.a(r10, r12);
        r18 = r10;
        r18 = (defpackage.akph) r18;
        r10 = 7;
        r10 = defpackage.lsn.a(r11, r10);
        r19 = r10;
        r19 = (defpackage.acvx) r19;
        r12 = r15;
        r10 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r7;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);
        r2.l = r10;
        r7 = r2.l;
        r7.a(r5);
        r5 = r2.l;
        r7 = r2.f;
        r5.a(r7);
        r5 = r2.h;
        r7 = 8;
        r5.setVisibility(r7);
        r2.j = r9;
        r2.b();
    L_0x0116:
        r5 = r2.k;
        r7 = r5.b;
        r10 = r1.i;
        r11 = r2.g;
        r7 = defpackage.xvd.b(r7);
        r7 = defpackage.xvd.f(r7);
        r11.setText(r7);
        if (r10 == 0) goto L_0x0151;
    L_0x012b:
        r7 = r10.b();
        if (r7 != 0) goto L_0x0137;
    L_0x0131:
        r7 = r10.a();
        if (r7 == 0) goto L_0x0151;
    L_0x0137:
        r7 = new java.lang.CharSequence[r8];
        r11 = r5.l;
        r11 = defpackage.ajqy.a(r11);
        r7[r3] = r11;
        r11 = r5.g;
        r11 = defpackage.ajqy.a(r11);
        r7[r9] = r11;
        r7 = defpackage.ajqy.a(r4, r7);
        r2.a(r7);
        goto L_0x015a;
    L_0x0151:
        r7 = r5.g;
        r7 = defpackage.ajqy.a(r7);
        r2.a(r7);
    L_0x015a:
        r7 = r2.l;
        r11 = new kgo;
        r11.<init>(r5, r10);
        r7.a(r11);
        r5 = r2.l;
        r7 = r2.k;
        r5.a(r7);
        r5 = r1.h;
        if (r5 != 0) goto L_0x0170;
    L_0x016f:
        goto L_0x0177;
    L_0x0170:
        r5 = r5.c;
        if (r5 == 0) goto L_0x0177;
    L_0x0174:
        r5 = r5.length;
        if (r5 != 0) goto L_0x017c;
    L_0x0177:
        r5 = r2.f;
        r5.a();
    L_0x017c:
        r5 = r2.c;
        r5 = r5.a(r6);
        r6 = r2.k;
        r6 = r6.p;
        r7 = r6 + -1;
        if (r6 == 0) goto L_0x01a0;
    L_0x018a:
        if (r7 == r9) goto L_0x0195;
    L_0x018c:
        if (r7 == r8) goto L_0x0194;
    L_0x018e:
        r6 = 3;
        if (r7 == r6) goto L_0x0192;
    L_0x0191:
        goto L_0x0195;
    L_0x0192:
        r5 = 0;
        goto L_0x0195;
    L_0x0194:
        r5 = 1;
    L_0x0195:
        r6 = r2.b;
        r6 = r6.b;
        r6 = r6 ^ r9;
        if (r6 == 0) goto L_0x01a4;
    L_0x019c:
        r2.a(r5, r3);
        goto L_0x01a4;
    L_0x01a0:
        throw r4;
    L_0x01a1:
        r2.c();
    L_0x01a4:
        r2 = r1.a;
        r5 = r0.n;
        r5.d = r4;
        r6 = r5.c;
        r6 = r6.isEmpty();
        if (r6 != 0) goto L_0x01cf;
    L_0x01b2:
        r6 = r5.c;
        r6 = r6.iterator();
    L_0x01b8:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x01ca;
    L_0x01be:
        r7 = r6.next();
        r7 = (java.lang.String) r7;
        r8 = r5.a;
        r8.a(r7);
        goto L_0x01b8;
    L_0x01ca:
        r6 = r5.c;
        r6.clear();
    L_0x01cf:
        r5.a(r2);
        r2 = r0.D;
        r5 = r1.e;
        if (r5 != 0) goto L_0x01da;
    L_0x01d8:
        r5 = r4;
        goto L_0x01fb;
    L_0x01da:
        r5 = r5.a;
        r5 = r5.b;
        r6 = r5.length;
        r7 = 0;
    L_0x01e0:
        if (r7 >= r6) goto L_0x01d8;
    L_0x01e2:
        r8 = r5[r7];
        r9 = r8.t;
        if (r9 == 0) goto L_0x01ee;
    L_0x01e8:
        r5 = new etc;
        r5.<init>(r9);
        goto L_0x01fb;
    L_0x01ee:
        r8 = r8.v;
        if (r8 == 0) goto L_0x01f8;
    L_0x01f2:
        r5 = new eru;
        r5.<init>(r8);
        goto L_0x01fb;
    L_0x01f8:
        r7 = r7 + 1;
        goto L_0x01e0;
    L_0x01fb:
        r6 = r2.a;
        r7 = r2.c;
        r6.remove(r7);
        r2.c = r5;
        r2.d();
        r5 = r1.e;
        if (r5 == 0) goto L_0x0231;
    L_0x020b:
        r5 = r5.a;
        r5 = r5.b;
        r6 = r5.length;
        r7 = 0;
    L_0x0211:
        if (r7 >= r6) goto L_0x0231;
    L_0x0213:
        r8 = r5[r7];
        r8 = r8.c;
        if (r8 == 0) goto L_0x022e;
    L_0x0219:
        r8 = r8.b;
        r9 = r8.length;
        r10 = 0;
    L_0x021d:
        if (r10 >= r9) goto L_0x022e;
    L_0x021f:
        r11 = r8[r10];
        r11 = r11.E;
        if (r11 != 0) goto L_0x0226;
    L_0x0225:
        goto L_0x022b;
    L_0x0226:
        r12 = r11.h;
        if (r12 == 0) goto L_0x022b;
    L_0x022a:
        goto L_0x0232;
    L_0x022b:
        r10 = r10 + 1;
        goto L_0x021d;
    L_0x022e:
        r7 = r7 + 1;
        goto L_0x0211;
    L_0x0231:
        r11 = r4;
    L_0x0232:
        r3 = r2.a;
        r5 = r2.d;
        r3.remove(r5);
        r2.d = r11;
        r2.f();
        r2 = r0.E;
        r2.a(r1);
        r2 = r0.N;
        r2.a(r1);
        r2 = r0.av;
        r2.a(r1);
        r20.m();
        r1 = r1.d;
        if (r1 == 0) goto L_0x027d;
    L_0x0254:
        r1 = r1.iterator();
    L_0x0258:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x027d;
    L_0x025e:
        r2 = r1.next();
        r2 = (defpackage.apxu) r2;
        r3 = com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r5 = r2.h;
        r3 = r3.d;
        r3 = r5.a(r3);
        if (r3 != 0) goto L_0x0258;
    L_0x0277:
        r3 = r0.x;
        r3.a(r2, r4);
        goto L_0x0258;
    L_0x027d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.a(aafv):void");
    }

    public final void m() {
        this.w.a();
    }
}
