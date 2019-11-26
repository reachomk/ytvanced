package defpackage;

import android.content.res.Configuration;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;

/* renamed from: hfc */
public final class hfc extends nf {
    public hel a;
    private int b;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x02bd  */
    public final android.view.View a(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
        r8 = this;
        r11 = r8.p();
        r11 = defpackage.xse.a(r11);
        r11 = (defpackage.hfe) r11;
        r11 = r11.kc();
        r11.a(r8);
        r11 = 0;
        r0 = 2131034910; // 0x7f05031e float:1.768035E38 double:1.052871139E-314;
        r9 = r9.inflate(r0, r10, r11);
        r10 = r8.a;
        r0 = r8.b;
        r10.k = r0;
        r0 = r10.q;
        if (r0 != 0) goto L_0x0330;
    L_0x0023:
        defpackage.amqw.a(r9);
        r0 = r10.j;
        if (r0 == 0) goto L_0x003c;
    L_0x002a:
        r0 = 2131758363; // 0x7f100d1b float:1.9147688E38 double:1.0532285724E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r0 = defpackage.amqw.a(r0);
        r0 = (android.view.ViewGroup) r0;
        r10.o = r0;
        goto L_0x004d;
    L_0x003c:
        r0 = 2131756486; // 0x7f1005c6 float:1.914388E38 double:1.053227645E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r0 = defpackage.amqw.a(r0);
        r0 = (android.view.ViewGroup) r0;
        r10.o = r0;
    L_0x004d:
        r0 = r10.c;
        r0 = r0.get();
        r0 = (defpackage.hdy) r0;
        r10.l = r0;
        r0 = r10.l;
        r1 = r10.o;
        r0.a(r1);
        r0 = 2131757467; // 0x7f10099b float:1.914587E38 double:1.0532281297E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r0 = defpackage.amqw.a(r0);
        r0 = (android.view.ViewGroup) r0;
        r10.p = r0;
        r0 = 2131757519; // 0x7f1009cf float:1.9145976E38 double:1.0532281554E-314;
        r0 = r9.findViewById(r0);
        r0 = (com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout) r0;
        r0 = defpackage.amqw.a(r0);
        r0 = (com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout) r0;
        r10.m = r0;
        r0 = 2131757520; // 0x7f1009d0 float:1.9145978E38 double:1.053228156E-314;
        r0 = r9.findViewById(r0);
        r0 = defpackage.amqw.a(r0);
        r0 = (android.view.View) r0;
        r10.n = r0;
        r0 = r10.e;
        r1 = new hem;
        r1.<init>(r10);
        r2 = 1;
        r3 = new java.lang.Class[r2];
        r4 = com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class;
        r3[r11] = r4;
        r0.a(r1, r3);
        r11 = r10.d;
        r0 = r10.p;
        r1 = r11.u;
        if (r1 != 0) goto L_0x02d5;
    L_0x00a8:
        r1 = r11.c;
        r1 = r1.get();
        r1 = (defpackage.aeca) r1;
        r3 = r1.g;
        r11.B = r3;
        r3 = 2131757469; // 0x7f10099d float:1.9145875E38 double:1.0532281307E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.view.ViewGroup) r3;
        r3 = defpackage.amqw.a(r3);
        r3 = (android.view.ViewGroup) r3;
        r11.r = r3;
        r3 = 2131757473; // 0x7f1009a1 float:1.9145883E38 double:1.0532281327E-314;
        r3 = r0.findViewById(r3);
        r3 = defpackage.amqw.a(r3);
        r3 = (android.support.v7.widget.RecyclerView) r3;
        r4 = new ans;
        r4.<init>();
        r4.b(r2);
        r3.a(r4);
        r3.setNestedScrollingEnabled(r2);
        r4 = 2131757472; // 0x7f1009a0 float:1.914588E38 double:1.053228132E-314;
        r4 = r0.findViewById(r4);
        r4 = defpackage.amqw.a(r4);
        r4 = (com.google.android.libraries.youtube.common.ui.LoadingFrameLayout) r4;
        r11.v = r4;
        r4 = 2131757476; // 0x7f1009a4 float:1.9145889E38 double:1.053228134E-314;
        r4 = r0.findViewById(r4);
        r4 = defpackage.amqw.a(r4);
        r4 = (android.widget.TextView) r4;
        r11.s = r4;
        r4 = 2131757474; // 0x7f1009a2 float:1.9145885E38 double:1.053228133E-314;
        r4 = r0.findViewById(r4);
        r4 = defpackage.amqw.a(r4);
        r4 = (android.view.ViewGroup) r4;
        r11.x = r4;
        r4 = 2131757477; // 0x7f1009a5 float:1.914589E38 double:1.0532281347E-314;
        r4 = r0.findViewById(r4);
        r4 = defpackage.amqw.a(r4);
        r4 = (android.view.View) r4;
        r11.t = r4;
        r4 = 2131757468; // 0x7f10099c float:1.9145873E38 double:1.05322813E-314;
        r4 = r0.findViewById(r4);
        r4 = defpackage.amqw.a(r4);
        r4 = (android.view.View) r4;
        r11.w = r4;
        r4 = 2131755819; // 0x7f10032b float:1.9142528E38 double:1.0532273155E-314;
        r4 = r0.findViewById(r4);
        r4 = (androidx.mediarouter.app.MediaRouteButton) r4;
        r4 = defpackage.amqw.a(r4);
        r4 = (androidx.mediarouter.app.MediaRouteButton) r4;
        r11.A = r4;
        r11.a();
        r4 = r11.f;
        r5 = 0;
        r4.a(r5);
        r4 = r11.f;
        r4 = r4.b;
        r4.a(r5);
        r4 = r11.f;
        r4.a(r3);
        r4 = r11.f;
        r5 = r11.v;
        r4.a(r5);
        r4 = r11.d;
        r5 = r4.a();
        r0 = defpackage.amqw.a(r0);
        r0 = (android.view.View) r0;
        r4.a = r0;
        r0 = r4.a();
        if (r0 == r5) goto L_0x016f;
    L_0x016c:
        r4.e();
    L_0x016f:
        r0 = r11.n;
        r4 = r11.A;
        r0.a(r4);
        r1.a(r11);
        r0 = r11.h;
        r0 = r0.get();
        r0 = (defpackage.aibd) r0;
        r0 = r0.A;
        if (r0 != 0) goto L_0x0186;
    L_0x0185:
        goto L_0x01ab;
    L_0x0186:
        r0 = r11.o;
        r1 = r11.h;
        r1.get();
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = defpackage.aipo.a(r0, r4);
        if (r0 == 0) goto L_0x01ab;
    L_0x0195:
        r0 = r11.C;
        r1 = r11.h;
        r1 = r1.get();
        r1 = (defpackage.aibd) r1;
        r1 = r1.A;
        r4 = r11.p;
        r1 = r1.a(r4);
        r0.a(r1);
        goto L_0x01ba;
    L_0x01ab:
        r0 = r11.b;
        r1 = r11.h;
        r1 = r1.get();
        r1 = (defpackage.aibd) r1;
        r1 = r1.A;
        r0.a(r1);
    L_0x01ba:
        r0 = r11.i;
        r0 = r0.get();
        if (r0 == 0) goto L_0x01e6;
    L_0x01c2:
        r0 = r11.o;
        r1 = r11.i;
        r1.get();
        r4 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = defpackage.aipo.a(r0, r4);
        if (r0 == 0) goto L_0x01e6;
    L_0x01d2:
        r0 = r11.C;
        r1 = r11.i;
        r1 = r1.get();
        r1 = (defpackage.hek) r1;
        r4 = r11.p;
        r1 = r1.a(r4);
        r0.a(r1);
        goto L_0x01f1;
    L_0x01e6:
        r0 = r11.b;
        r1 = r11.i;
        r1 = r1.get();
        r0.a(r1);
    L_0x01f1:
        r0 = r11.b;
        r1 = r11.h;
        r1 = r1.get();
        r1 = (defpackage.aibd) r1;
        r1 = r1.B;
        r0.a(r1);
        r0 = r11.o;
        r0 = defpackage.foh.f(r0);
        if (r0 == 0) goto L_0x021d;
    L_0x0208:
        r0 = r11.q;
        r0 = r0.get();
        r0 = (defpackage.lhs) r0;
        r1 = r0.b;
        monitor-enter(r1);
        r0 = r0.b;	 Catch:{ all -> 0x021a }
        r0.add(r11);	 Catch:{ all -> 0x021a }
        monitor-exit(r1);	 Catch:{ all -> 0x021a }
        goto L_0x021d;
    L_0x021a:
        r9 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x021a }
        throw r9;
    L_0x021d:
        r0 = r11.k;
        r1 = r11.f;
        r4 = new hfo;
        r5 = r0.a;
        r5 = r5.get();
        r5 = (defpackage.adqf) r5;
        r5 = defpackage.hfs.a(r5, r2);
        r5 = (defpackage.adqf) r5;
        r6 = 2;
        r3 = defpackage.hfs.a(r3, r6);
        r3 = (android.support.v7.widget.RecyclerView) r3;
        r7 = 3;
        r1 = defpackage.hfs.a(r1, r7);
        r1 = (defpackage.lsl) r1;
        r0 = r0.b;
        r0 = r0.get();
        r0 = (defpackage.aeca) r0;
        r7 = 4;
        r0 = defpackage.hfs.a(r0, r7);
        r0 = (defpackage.aeca) r0;
        r4.<init>(r5, r3, r1, r0);
        r11.y = r4;
        r0 = r11.y;
        r1 = r0.c;
        r1 = r1.c();
        r0.e = r1;
        r1 = r0.b;
        r1 = r1.d;
        r1 = r1.d();
        if (r1 != 0) goto L_0x026e;
    L_0x0267:
        r1 = r0.b;
        r3 = r0.h;
        r1.a(r3);
    L_0x026e:
        r1 = r0.d;
        r3 = r0.i;
        r1.a(r3);
        r1 = r0.d;
        r1 = r1.g;
        r0.g = r1;
        r0.b();
        r0 = r11.l;
        if (r0 == 0) goto L_0x02b3;
    L_0x0282:
        r0 = r11.m;
        r1 = r11.r;
        r3 = new hef;
        r0 = r0.a;
        r0 = r0.get();
        r0 = (defpackage.adqf) r0;
        r0 = defpackage.heh.a(r0, r2);
        r0 = (defpackage.adqf) r0;
        r1 = defpackage.heh.a(r1, r6);
        r1 = (android.view.ViewGroup) r1;
        r3.<init>(r0, r1);
        r11.z = r3;
        r0 = r11.z;
        r1 = r0.a;
        r1.a(r0);
        r1 = r0.a;
        r1 = r1.c();
        if (r1 == 0) goto L_0x02b3;
    L_0x02b0:
        r0.a(r1);
    L_0x02b3:
        r11.u = r2;
        r0 = r11.B;
        r0 = r0.i();
        if (r0 == r6) goto L_0x02d5;
    L_0x02bd:
        r11.b();
        r11.c();
        r0 = r11.B;
        r0 = r0.l();
        r1 = 5;
        if (r0 != r1) goto L_0x02d5;
    L_0x02cc:
        r0 = r11.B;
        r0 = r0.g();
        r11.a(r0);
    L_0x02d5:
        r11 = r10.a;
        r11.a(r10);
        r11 = r10.a;
        r0 = r10.d;
        r11.a(r0);
        r10.b();
        r11 = new heq;
        r11.<init>(r10);
        r10.r = r11;
        r11 = r10.b;
        r0 = r10.r;
        r11.a(r0);
        r11 = new her;
        r11.<init>(r10);
        r10.s = r11;
        r11 = r10.o;
        r0 = r10.s;
        r11.addOnLayoutChangeListener(r0);
        r11 = new hen;
        r11.<init>(r10);
        r10.t = r11;
        r11 = r10.m;
        r0 = r10.t;
        r11.a(r0);
        r11 = r10.m;
        r0 = r10.h;
        r11.a(r0);
        r11 = r10.m;
        r0 = r10.g;
        r11.b = r0;
        r0 = r10.k;
        r11.i = r0;
        r11 = r10.i;
        r0 = new heo;
        r0.<init>(r10);
        r11.a(r0);
        r11 = r10.f;
        r11.a(r10);
        r10.q = r2;
    L_0x0330:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfc.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void d(int i) {
        this.b = i;
        hel hel = this.a;
        if (hel != null) {
            hel.k = i;
            MdxWatchDrawerLayout mdxWatchDrawerLayout = hel.m;
            if (mdxWatchDrawerLayout != null) {
                mdxWatchDrawerLayout.i = i;
                if (mdxWatchDrawerLayout.getMeasuredHeight() == 0) {
                    return;
                }
                if (mdxWatchDrawerLayout.j) {
                    mdxWatchDrawerLayout.k = true;
                    return;
                }
                mdxWatchDrawerLayout.a();
                mdxWatchDrawerLayout.requestLayout();
            }
        }
    }

    public final void i() {
        super.i();
        hel hel = this.a;
        if (hel.q) {
            zyw zyw;
            hel.f.a(null);
            adqi adqi = hel.r;
            if (adqi != null) {
                hel.b.b(adqi);
                hel.r = null;
            }
            her her = hel.s;
            if (her != null) {
                hel.o.removeOnLayoutChangeListener(her);
                hel.s = null;
            }
            heu heu = hel.t;
            if (heu != null) {
                hel.m.b(heu);
            }
            hel.m.b(hel.h);
            hel.m.b = null;
            hel.a.b(hel.d);
            aecb aecb = hel.d;
            adqg adqg = aecb.z;
            if (adqg != null) {
                adqg.a.b((adqi) adqg);
                adqe adqe = adqg.b;
                if (adqe != null) {
                    adqe.b(adqg);
                }
            }
            ((aeca) aecb.c.get()).b(aecb);
            aecb.C.a();
            if (((aibd) aecb.h.get()).A != null) {
                zyw = aecb.o;
                aecb.h.get();
                if (!aipo.a(zyw, 8192)) {
                    aecb.b.b(((aibd) aecb.h.get()).A);
                }
            }
            if (aecb.i.get() != null) {
                zyw = aecb.o;
                aecb.i.get();
                if (!aipo.a(zyw, 262144)) {
                    aecb.b.b(aecb.i.get());
                }
            }
            aecb.b.b(((aibd) aecb.h.get()).B);
            if (foh.f(aecb.o)) {
                lhs lhs = (lhs) aecb.q.get();
                synchronized (lhs.b) {
                    lhs.b.remove(aecb);
                }
            }
            hfm hfm = aecb.d;
            boolean a = hfm.a();
            hfm.a = null;
            if (hfm.a() != a) {
                hfm.e();
            }
            ((heb) aecb.g.get()).b();
            aecb.j.b();
            TextView textView = aecb.L;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            aecb.n.b(aecb.A);
            aecb.L = null;
            aecb.s = null;
            aecb.M = null;
            aecb.F = null;
            aecb.E = null;
            aecb.D = null;
            textView = aecb.G;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            aecb.G = null;
            aecb.J = null;
            textView = aecb.H;
            if (textView != null) {
                textView.setOnClickListener(null);
            }
            aecb.H = null;
            aecb.t = null;
            aecb.N = null;
            aecb.I = null;
            ImageView imageView = aecb.K;
            if (imageView != null) {
                imageView.setOnClickListener(null);
            }
            aecb.K = null;
            aecb.w = null;
            aecb.v = null;
            aecb.y = null;
            aecb.z = null;
            aecb.u = false;
            hel.a.b(hel);
            hel.l.a();
            hel.a(0.0f);
            hel.b(0.0f);
            hel.q = false;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.d.a();
    }
}
