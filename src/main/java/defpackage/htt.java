package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: htt */
public final class htt implements elo {
    private final ijc A;
    private final iiv B;
    private final hzj C;
    private final ihg D;
    private final aiaa E;
    private final aibd F;
    private final vvf G;
    private final vwu H;
    private final vwh I;
    private final ahys J;
    private final aifl K;
    private final ahug L;
    private final aidq M;
    private final hdg N;
    private final ahvi O;
    private final exh P;
    private final hwj Q;
    private final hzd R;
    private final ifl S;
    private final iif T;
    private final wcl U;
    private final zwa V;
    private final ahvr W;
    private final ibr X;
    private final ahvn Y;
    private final hwk Z;
    private final Activity a;
    private final ijp aa;
    private final InlineTimeBar ab;
    private final aibe ac;
    private final aibe ad;
    private final aibe ae;
    private final zyw af;
    private final ajam ag;
    private final Collection ah;
    private final Collection ai;
    private final Collection aj;
    private final Collection ak;
    private final Collection al;
    private final Collection am;
    private final Collection an;
    private final Collection ao;
    private final hva b;
    private final YouTubePlayerOverlaysLayout c;
    private final ahnq d;
    private final xci e;
    private final vvh f;
    private final vge g;
    private final bcaa h;
    private final hwv i;
    private final eif j;
    private final zwj k;
    private final elu l;
    private final aicu m;
    private final icc n;
    private final iaz o;
    private final ici p;
    private final fgc q;
    private final elm r;
    private final idx s;
    private final bdfu t = new bdfu();
    private final ahlq u;
    private final ahvw v;
    private final ahvz w;
    private final lcd x;
    private final aiii y;
    private final xqs z;

    public htt(Activity activity, hva hva, YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, ahnq ahnq, bcaa bcaa, xci xci, vvh vvh, vge vge, bcaa bcaa2, hxr hxr, hwv hwv, fgc fgc, eif eif, elm elm, zwj zwj, elu elu, aibe aibe, exh exh, ifl ifl, InlineTimeBar inlineTimeBar, ahvn ahvn, ahvr ahvr, aicl aicl, aicl aicl2, iif iif, wcl wcl, zwa zwa, aiaa aiaa, hwk hwk, ahvw ahvw, ahvz ahvz, lcd lcd, aicu aicu, icc icc, ibr ibr, ici ici, vvs vvs, vvf vvf, aibd aibd, aiax aiax, aige aige, aihx aihx, aiev aiev, aife aife, ieh ieh, vvm vvm, vwu vwu, vwh vwh, ihg ihg, aicw aicw, aiac aiac, hzj hzj, ahys ahys, aiii aiii, aifl aifl, aidq aidq, ahug ahug, ahvi ahvi, aiep aiep, hwj hwj, hzd hzd, hdg hdg, ihb ihb, idx idx, ifh ifh, ieg ieg, iaz iaz, ijp ijp, zyw zyw, ajam ajam, ahlq ahlq, xqs xqs, ijc ijc, iiv iiv) {
        ahnq ahnq2 = ahnq;
        elm elm2 = elm;
        aibd aibd2 = aibd;
        vwu vwu2 = vwu;
        aiac aiac2 = aiac;
        ahys ahys2 = ahys;
        aiii aiii2 = aiii;
        aifl aifl2 = aifl;
        aidq aidq2 = aidq;
        ahug ahug2 = ahug;
        ahvi ahvi2 = ahvi;
        hdg hdg2 = hdg;
        idx idx2 = idx;
        this.a = activity;
        this.b = hva;
        this.c = youTubePlayerOverlaysLayout;
        this.d = ahnq2;
        this.e = xci;
        this.f = vvh;
        this.g = vge;
        this.h = bcaa2;
        this.i = hwv;
        this.q = fgc;
        this.S = ifl;
        this.j = eif;
        this.k = zwj;
        this.l = elu;
        this.r = elm2;
        this.ac = aibe;
        this.P = exh;
        this.ab = inlineTimeBar;
        this.Y = ahvn;
        this.ae = aicl;
        this.ad = aicl2;
        this.T = iif;
        this.U = wcl;
        this.V = zwa;
        this.E = aiaa;
        this.W = ahvr;
        this.Z = hwk;
        this.v = ahvw;
        this.w = ahvz;
        this.x = lcd;
        this.m = aicu;
        this.n = icc;
        this.X = ibr;
        this.p = ici;
        this.B = iiv;
        this.G = vvf;
        this.F = aibd2;
        this.H = vwu2;
        this.I = vwh;
        this.D = ihg;
        this.C = hzj;
        this.J = ahys2;
        this.K = aifl2;
        this.M = aidq2;
        this.L = ahug2;
        this.O = ahvi2;
        this.Q = hwj;
        this.R = hzd;
        this.N = hdg2;
        this.o = iaz;
        this.aa = ijp;
        this.af = zyw;
        this.ag = ajam;
        this.u = ahlq;
        this.y = aiii2;
        this.z = xqs;
        this.A = ijc;
        this.s = idx2;
        this.ah = new ArrayList();
        this.ah.add(ahnq2);
        this.ai = new ArrayList();
        this.ai.add(aicw);
        this.ai.add(ahvi2);
        this.ai.add(ahug2);
        this.ai.add((ajan) bcaa.get());
        this.ai.add(aibd2.A);
        this.aj = new ArrayList();
        this.aj.add(aifl2);
        this.aj.add(aiax);
        this.aj.add(aiep);
        this.aj.add(aige);
        this.aj.add(aihx);
        this.aj.add(aiev);
        this.aj.add(aife);
        this.ak = new ArrayList();
        this.ak.add(aidq2.n);
        this.ak.add(aiac2.u);
        this.ak.add(ahys2.u);
        this.ak.add(aiii2.a);
        this.al = new ArrayList();
        this.al.add(hxr);
        this.am = new ArrayList();
        this.am.add(idx2);
        this.am.add(ieh);
        this.an = new ArrayList();
        this.an.add(vvs);
        this.an.add(vwu2);
        this.ao = new ArrayList();
        this.ao.add(aiac2.v);
        this.ao.add(ahys2.v);
        this.ao.add(aiii2.b);
        this.ao.add(aibd2.B);
        this.ao.add(aidq2.p);
        this.ao.add(hdg2);
        this.ao.add(ihb);
        this.ao.add(ifh);
        this.ao.add(ieg);
        this.ao.add(vvm);
        LayoutInflater from = LayoutInflater.from(this.a);
        this.q.a(this.n);
        this.S.a((View) this.h.get());
        this.S.v = this.J;
        this.Y.a(this.ac);
        aicu aicu2 = this.m;
        if (aicu2 instanceof aidj) {
            ((aidj) aicu2).a(this.S);
        }
        iif iif2 = this.T;
        ifl ifl2 = this.S;
        if (ifl2.r == null) {
            ifl2.r = new aitp((TextView) ifl2.t.findViewById(R.id.player_learn_more_button));
        }
        iif2.a(ifl2.r);
        this.S.a(this.V.d);
        this.B.a(this.S);
        this.B.a(this.Q);
        this.B.a(this.C);
        ImageView imageView = (ImageView) from.inflate(R.layout.youtube_controls_overlay_ad_overflow_menu_button, null);
        imageView.setVisibility(8);
        this.S.a((View) imageView);
        this.T.a(imageView);
        this.z.a(this.X);
        this.L.a(this.l);
        this.l.a(2, this.X);
        this.d.a(this.W);
        this.d.a(this.Y);
        this.d.a(this.U);
        this.d.a(this.v);
        this.d.a(this.w);
        this.d.a(this.x);
        this.c.h = new aici(this.S);
        zwj zwj2 = this.k;
        zwj2.h = this.C;
        zwj2.i = this.F;
        this.V.d.setOnClickListener(new zwl(zwj2));
        this.i.b = this.M;
        this.j.a(this.Q);
        this.Z.a(this.Q);
        this.Z.a(this.u);
        this.Q.a(this.S);
        this.o.a = this.S;
        this.L.a(this.aa);
        this.j.a(this.aa);
        this.r.a(this.aa);
        elm2.a(this);
    }

    public final void A_() {
        b(this.ai);
        b(this.aj);
        b(this.ak);
        a(foh.w(this.af), this.al);
        a(foh.x(this.af), this.am);
        a(this.ah);
        a(this.an);
        if (aipo.a(this.af, 2)) {
            this.t.a(this.Q.a(this.ag));
        } else {
            this.e.a(this.Q, ahkw.class);
            this.e.a(this.Q, hwj.class);
        }
        if (aipo.a(this.af, 134217728)) {
            this.t.a(this.R.a(this.ag));
        } else {
            this.e.a(this.R, aimh.class);
        }
        apxn a = this.af.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.aS) {
                this.t.a(this.w.a(this.ag));
            }
        }
        this.t.a(this.F.C.a(this.ag));
        this.t.a(this.ag.C().a(new aiih(this.y)));
        this.e.a(this.C, zvv.class);
        this.t.a(this.A.a(this.ag));
        this.t.a(this.M.o.a(this.ag));
        for (Object a2 : this.ao) {
            this.e.a(a2);
        }
        this.T.a(this.e, true);
        wqt wqt = this.P;
        xci xci = this.e;
        if (foh.x(wqt.d)) {
            wqt.e.a(wqt.a.a(wqt.c));
        } else {
            xci.a(wqt.a);
        }
        xci.a(wqt.b);
        wqt.h.a(wqt);
        this.f.a(this.G);
        this.g.a(this.H);
        this.g.a(this.I);
        this.g.a(this.D);
        hdg hdg = this.N;
        hdg.a(hdg.a.c());
        vwh vwh = this.I;
        if (vwh.d != null) {
            vwh.a(vwh.h);
        }
        ihg ihg = this.D;
        if (ihg.c) {
            ihg.b();
        }
        this.Q.c();
        aibd aibd = this.F;
        if (aibd.b()) {
            AccessibilityStateChangeListener accessibilityStateChangeListener = aibd.h;
            xrn.a(accessibilityStateChangeListener.a, accessibilityStateChangeListener);
            accessibilityStateChangeListener.b.c();
        }
        aibd.z.a();
        ahvp ahvp = this.O;
        ahvp.a.a(ahvp);
        ahvp.b.a(ahvp);
        ((ahxc) ahvp.c.get()).g = ahvp;
        this.j.a(this.p);
        idx idx = this.s;
        idx.b.a();
        idx.b.a(ieb.a(idx.a).a(new iec(idx)));
        this.S.t.addOnLayoutChangeListener(this.R);
    }

    public final void ar_() {
        int i;
        this.t.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.ai);
        arrayList.addAll(this.aj);
        arrayList.addAll(this.ak);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ajan ajan = (ajan) arrayList.get(i);
            if (ajan == null || !aipo.a(this.af, ajan.e())) {
                this.e.b(ajan);
            }
        }
        arrayList = new ArrayList();
        if (!foh.w(this.af)) {
            arrayList.addAll(this.al);
        }
        if (!foh.x(this.af)) {
            arrayList.addAll(this.am);
        }
        size = arrayList.size();
        for (i = 0; i < size; i++) {
            this.e.b((ajan) arrayList.get(i));
        }
        if (!aipo.a(this.af, 2)) {
            this.e.b(this.Q);
        }
        if (!aipo.a(this.af, 134217728)) {
            this.e.b(this.R);
        }
        this.e.b(this.C);
        for (Object b : this.ao) {
            this.e.b(b);
        }
        this.T.a(this.e, false);
        exh exh = this.P;
        xci xci = this.e;
        if (foh.x(exh.d)) {
            exh.e.a();
        } else {
            xci.b(exh.a);
        }
        xci.b(exh.b);
        exh.h.b(exh);
        this.f.e();
        this.g.b(this.H);
        this.g.b(this.I);
        this.g.b(this.D);
        vwu vwu = this.H;
        if (!(vwu.e == null || vwu.g == null)) {
            vwu.c();
        }
        vwh vwh = this.I;
        if (vwh.d != null) {
            vwh.b();
        }
        ihg ihg = this.D;
        if (ihg.c) {
            ihg.c();
        }
        hwj hwj = this.Q;
        if (hwj.e == 2) {
            hwj.e = 3;
            hwj.c();
        }
        aibd aibd = this.F;
        if (aibd.b()) {
            aibg aibg = aibd.h;
            xrn.b(aibg.a, aibg);
        }
        aibd.z.b();
        ahvi ahvi = this.O;
        ahvi.a.a(null);
        ahvi.b.a(null);
        ((ahxc) ahvi.c.get()).g = null;
        this.j.b(this.p);
        this.s.b.a();
        this.S.t.removeOnLayoutChangeListener(this.R);
    }

    private final void a(Collection collection) {
        for (ajan a : collection) {
            this.t.a(a.a(this.ag));
        }
    }

    private final void b(Collection collection) {
        for (Object obj : collection) {
            if (obj == null || !aipo.a(this.af, obj.e())) {
                this.e.a(obj);
            } else {
                this.t.a(obj.a(this.ag));
            }
        }
    }

    private final void a(boolean z, Collection collection) {
        if (z) {
            for (ajan a : collection) {
                this.t.a(a.a(this.ag));
            }
            return;
        }
        for (Object a2 : collection) {
            this.e.a(a2);
        }
    }

    public final void c() {
        this.K.a();
        iaz iaz = this.o;
        ados ados = iaz.b;
        adoh adoh = iaz.e;
        ados.c.remove(adoh);
        adoj adoj = ados.b;
        if (adoj != null) {
            adoj.i.remove(adoh);
        }
        this.o.a = null;
    }

    public final void a(ejd ejd, ejd ejd2) {
        ifl ifl;
        int a = htt.a(ejd);
        int a2 = htt.a(ejd2);
        boolean z = false;
        if (a != a2) {
            if (a == 2) {
                this.S.t.removeView(this.ab);
            } else if (a == 1) {
                this.b.b(0, this.ab);
            } else if (a == 3) {
                this.b.b(1, this.ab);
            }
            if (a2 == 2) {
                ifl = this.S;
                ifl.t.addView(this.ab);
                ifl.h.bringToFront();
            } else if (a2 == 1) {
                this.b.a(0, this.ab);
            } else if (a2 == 3) {
                this.b.a(1, this.ab);
            }
        }
        ifl = this.S;
        aibe aibe = this.ad;
        if (!emq.a(ejd2)) {
            aibe = this.ac;
        }
        ifl.a(aibe);
        ahvn ahvn = this.Y;
        if (ejd2.k()) {
            aibe = this.ae;
        } else {
            aibe = this.ac;
        }
        ahvn.a(aibe);
        this.v.a(this.Q);
        boolean g = ejd.g();
        boolean g2 = ejd2.g();
        if (g != g2) {
            TouchImageView touchImageView = this.V.d;
            if (touchImageView.getParent() != null) {
                ((ViewGroup) touchImageView.getParent()).removeView(touchImageView);
            }
            if (!g2) {
                this.S.a(this.V.d);
            }
        }
        hzj hzj = this.C;
        g2 = ejd2.g();
        zwa zwa = hzj.a.i;
        zwa.f = g2;
        zwa.e.a(g2);
        zwa.e();
        zwa.d();
        ahys ahys = this.J;
        Object obj = (ejd2.d() || ejd2.n()) ? 1 : null;
        boolean e = ejd2.e();
        ahys.m = ejd2.g();
        g2 = obj != null || e;
        if (ahys.k != g2) {
            ahys.k = g2;
            if (g2) {
                ahzw ahzw = ahys.n;
                if (ahzw != null) {
                    ahzw.a(true);
                }
            }
            if (ahys.j) {
                ahys.j();
            }
        }
        aiaa aiaa = this.E;
        g2 = ejd2.g();
        if (ejd2.a() && !ejd2.n()) {
            z = true;
        }
        aiaa.b(g2, z);
    }

    private static int a(ejd ejd) {
        if (ejd.g() && ejd != ejd.INLINE_MUTED) {
            return 3;
        }
        if (ejd.a()) {
            return 2;
        }
        return ejd.c() ? 1 : 0;
    }

    public final void d() {
        this.S.n();
    }

    public final void e() {
        this.S.f();
    }
}
