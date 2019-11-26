package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.ui.PivotTabsBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: jgv */
public final class jgv implements fjf, fjm, jle, xcp, xmt {
    public final xci a;
    public final eav b;
    public final fjg c;
    public final Executor d;
    private final Resources e;
    private final aaxz f;
    private final akvp g;
    private final aaas h;
    private final afwx i;
    private final jpa j;
    private final zyw k;
    private final zzl l;
    private final eif m;
    private final bcaa n;
    private final akpi o;
    private final Map p = new HashMap();
    private final Set q = Collections.newSetFromMap(new WeakHashMap());
    private final aaal r;
    private ArrayList s = new ArrayList();
    private Map t = new HashMap();
    private PivotTabsBar u;
    private aaxx v;
    private boolean w;
    private hel x;
    private int y;

    public jgv(Resources resources, xci xci, aaxz aaxz, eav eav, akvp akvp, aaas aaas, jpa jpa, afwx afwx, fjg fjg, zyw zyw, zzl zzl, eif eif, bcaa bcaa, akpi akpi, Executor executor, aaal aaal) {
        this.e = resources;
        this.a = xci;
        this.f = aaxz;
        this.b = eav;
        this.g = akvp;
        this.h = aaas;
        this.i = afwx;
        this.j = jpa;
        this.c = fjg;
        this.k = zyw;
        this.l = zzl;
        this.m = eif;
        this.n = bcaa;
        this.o = akpi;
        this.d = executor;
        this.r = aaal;
        this.y = resources.getConfiguration().smallestScreenWidthDp;
        this.p.put("com.google.android.apps.youtube.app.endpoint.flags", Integer.valueOf(16));
        aaya a = this.f.a();
        this.a.d(new efe());
        this.f.a(a, new jgy(this));
    }

    public final void a(String str) {
    }

    public final void a(jlh jlh) {
        this.q.add(jlh);
    }

    public final void a(PivotTabsBar pivotTabsBar) {
        this.u = pivotTabsBar;
        this.m.a(this);
        this.c.a((fjm) this);
        this.c.a((fjf) this);
        xss.a(this.e.getDisplayMetrics(), 48);
        this.u.o = true;
        a(this.c.a(), false);
        a();
    }

    public final boolean a(Runnable runnable) {
        jpa jpa = this.j;
        jpa.l = null;
        jpa.k = null;
        jpa.o = null;
        jpa.m = null;
        jpa.j.c().b();
        afwx afwx = this.i;
        xak.a();
        for (Entry entry : afwx.a.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                afwx.c(((afwv) entry.getKey()).a());
            }
        }
        afwx.a.clear();
        b(runnable);
        return true;
    }

    public final void a(boolean z) {
        if (!z) {
            e();
        }
    }

    private final void b(Runnable runnable) {
        aaya a = this.f.a();
        a.a(aall.WRITE_ONLY);
        this.a.d(new efe());
        this.f.a(a, new jha(this, runnable));
    }

    public final void a(float f) {
        c(f);
    }

    public final void b(float f) {
        c(f);
    }

    private final void c(float f) {
        if (this.w) {
            d(false);
            this.u.setTranslationY(f * ((float) this.u.getHeight()));
            return;
        }
        f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    public final boolean a(defpackage.fiw r6) {
        /*
        r5 = this;
        r0 = -1;
        if (r6 == 0) goto L_0x00cd;
    L_0x0003:
        r1 = defpackage.gub.a(r6);
        if (r1 != 0) goto L_0x0018;
    L_0x0009:
        r1 = r6.d();
        if (r1 != 0) goto L_0x0018;
    L_0x000f:
        r1 = defpackage.gwl.c(r6);
        if (r1 == 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0018;
    L_0x0016:
        r1 = 0;
        goto L_0x004d;
    L_0x0018:
        r1 = r6.a();
        r2 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r3 = r2.d;
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x0032;
    L_0x002f:
        r1 = r2.b;
        goto L_0x0036;
    L_0x0032:
        r1 = r2.a(r1);
    L_0x0036:
        r1 = (defpackage.apge) r1;
        r2 = r5.t;
        r3 = r1.i;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0045;
    L_0x0042:
        r1 = r1.b;
        goto L_0x0047;
    L_0x0045:
        r1 = r1.i;
    L_0x0047:
        r1 = r2.get(r1);
        r1 = (java.lang.Integer) r1;
    L_0x004d:
        r2 = defpackage.hrt.a(r6);
        r3 = "FElibrary";
        if (r2 == 0) goto L_0x005d;
    L_0x0055:
        r1 = r5.t;
        r1 = r1.get(r3);
        r1 = (java.lang.Integer) r1;
    L_0x005d:
        r2 = r6.a;
        r4 = defpackage.hki.class;
        if (r2 == r4) goto L_0x0064;
    L_0x0063:
        goto L_0x0075;
    L_0x0064:
        r1 = r5.t;
        r2 = "offline_playlist_top_level_tab_id";
        r2 = r6.a(r2);
        if (r2 != 0) goto L_0x006f;
    L_0x006e:
        r2 = r3;
    L_0x006f:
        r1 = r1.get(r2);
        r1 = (java.lang.Integer) r1;
    L_0x0075:
        r2 = r6.a();
        if (r2 == 0) goto L_0x00c6;
    L_0x007b:
        r2 = r6.a();
        r4 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r2.a(r4);
        r2 = r2.h;
        r4 = r4.d;
        r2 = r2.a(r4);
        if (r2 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00c6;
    L_0x0093:
        r6 = r6.a();
        r2 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r6.a(r2);
        r6 = r6.h;
        r4 = r2.d;
        r6 = r6.b(r4);
        if (r6 != 0) goto L_0x00ad;
    L_0x00aa:
        r6 = r2.b;
        goto L_0x00b1;
    L_0x00ad:
        r6 = r2.a(r6);
    L_0x00b1:
        r6 = (defpackage.apge) r6;
        r6 = r6.b;
        r2 = "FEhistory";
        r6 = r2.equals(r6);
        if (r6 == 0) goto L_0x00c6;
    L_0x00bd:
        r6 = r5.t;
        r6 = r6.get(r3);
        r1 = r6;
        r1 = (java.lang.Integer) r1;
    L_0x00c6:
        if (r1 == 0) goto L_0x00cd;
    L_0x00c8:
        r6 = r1.intValue();
        goto L_0x00ce;
    L_0x00cd:
        r6 = -1;
    L_0x00ce:
        r1 = 0;
        if (r6 == r0) goto L_0x00d8;
    L_0x00d1:
        r0 = r5.c;
        r0.a(r6, r1);
        r6 = 1;
        return r6;
    L_0x00d8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.a(fiw):boolean");
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!a(ejd2)) {
            f();
        }
        if (!this.w) {
            return;
        }
        if (ejd2.d() || !ejd2.l()) {
            e();
        }
    }

    private final void d(boolean z) {
        if (z) {
            this.u.setTranslationY(0.0f);
        }
        if (this.u.b() <= 0 || !a(this.m.c())) {
            f();
        } else {
            this.u.setVisibility(0);
        }
    }

    private final void e() {
        d(true);
    }

    private final void f() {
        this.u.setVisibility(8);
    }

    public final void a() {
        aaxx aaxx;
        try {
            aaxx = (aaxx) this.b.d().a();
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 38);
            stringBuilder.append("Failed to get offline guide response: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
            aaxx = null;
        }
        if (aaxx == null || aaxx.a == null) {
            ajwa ajwa = new ajwa();
            ajwa.a = new ajvz[1];
            ajvz ajvz = new ajvz();
            avzy avzy = (avzy) avzz.b.createBuilder();
            avzy.a(jgv.a("FEwhat_to_watch", this.e.getString(R.string.home), arwh.PIVOT_HOME));
            avzy.a(jgv.a("FEtrending", this.e.getString(R.string.trending), arwh.PIVOT_TRENDING));
            avzy.a(jgv.a("FEsubscriptions", this.e.getString(R.string.subscriptions), arwh.PIVOT_SUBSCRIPTIONS));
            avzy.a(jgv.a("FElibrary", this.e.getString(R.string.library), arwh.PIVOT_LIBRARY));
            ajvz.b = (avzz) ((anxl) avzy.build());
            ajwa.a[0] = ajvz;
            aaxx = new aaxx(ajwa);
        }
        b(a(aaxx));
    }

    public final amqp b() {
        return amqp.c(this.v);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:21:0x0076, code skipped:
            if (r9.p != false) goto L_0x015d;
     */
    public final boolean a(defpackage.aaxx r37) {
        /*
        r36 = this;
        r0 = r36;
        r1 = r37;
        if (r1 != 0) goto L_0x0009;
    L_0x0006:
        r1 = 0;
        goto L_0x026c;
    L_0x0009:
        r3 = r1.a;
        if (r3 == 0) goto L_0x0006;
    L_0x000d:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0.v = r1;
        r1 = r1.a;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0218;
    L_0x001a:
        r5 = r1.length;
        r6 = 0;
    L_0x001c:
        if (r6 >= r5) goto L_0x0218;
    L_0x001e:
        r7 = r1[r6];
        r8 = r7.c;
        if (r8 == 0) goto L_0x01d8;
    L_0x0024:
        r9 = r0.j;
        r10 = r8.a;
        r9.o = r10;
        r10 = r9.d;
        r10 = r10.i();
        r11 = defpackage.amuw.i();
        r12 = r9.g;
        r11.c(r12);
        r8 = r8.b;
        r12 = r8.length;
        r13 = 0;
        r14 = 0;
    L_0x003e:
        if (r13 >= r12) goto L_0x0173;
    L_0x0040:
        r15 = r8[r13];
        r2 = r15.b;
        if (r2 == 0) goto L_0x0080;
    L_0x0046:
        r4 = r9.e;
        r17 = r1;
        r1 = r9.b;
        r1 = r1.t();
        r1 = r4.a(r1, r2, r14);
        r2 = r2.m;
        if (r2 != 0) goto L_0x005a;
    L_0x0058:
        r2 = defpackage.apxu.d;
    L_0x005a:
        r4 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r2.a(r4);
        r18 = r5;
        r5 = r2.h;
        r4 = r4.d;
        r4 = r5.a(r4);
        if (r4 != 0) goto L_0x0070;
    L_0x006f:
        goto L_0x007a;
    L_0x0070:
        r9.m = r1;
        r9.n = r2;
        r2 = r9.p;
        if (r2 == 0) goto L_0x007a;
    L_0x0078:
        goto L_0x015d;
    L_0x007a:
        r11.c(r1);
        r14 = r14 + 1;
        goto L_0x0084;
    L_0x0080:
        r17 = r1;
        r18 = r5;
    L_0x0084:
        r1 = r15.c;
        if (r1 == 0) goto L_0x015d;
    L_0x0088:
        r2 = r9.f;
        r4 = r9.a;
        r4 = r4.getLayoutInflater();
        r5 = r9.a;
        r5 = r5.getResources();
        r15 = r9.b;
        r15 = r15.t();
        r33 = r8;
        r8 = new jpm;
        r34 = r12;
        r12 = r2.a;
        r12 = r12.get();
        r12 = (defpackage.nn) r12;
        r0 = 1;
        r12 = defpackage.jpn.a(r12, r0);
        r20 = r12;
        r20 = (defpackage.nn) r20;
        r0 = r2.b;
        r0 = r0.get();
        r0 = (defpackage.akkq) r0;
        r12 = 2;
        r0 = defpackage.jpn.a(r0, r12);
        r21 = r0;
        r21 = (defpackage.akkq) r21;
        r0 = r2.c;
        r0 = r0.get();
        r0 = (defpackage.egm) r0;
        r12 = 3;
        r0 = defpackage.jpn.a(r0, r12);
        r22 = r0;
        r22 = (defpackage.egm) r22;
        r0 = r2.d;
        r0 = r0.get();
        r0 = (defpackage.afqe) r0;
        r12 = 4;
        r0 = defpackage.jpn.a(r0, r12);
        r23 = r0;
        r23 = (defpackage.afqe) r23;
        r0 = r2.e;
        r12 = r2.f;
        r12 = r12.get();
        r12 = (defpackage.hdm) r12;
        r35 = r6;
        r6 = 6;
        r6 = defpackage.jpn.a(r12, r6);
        r25 = r6;
        r25 = (defpackage.hdm) r25;
        r6 = r2.g;
        r6 = r6.get();
        r6 = (defpackage.aeag) r6;
        r12 = 7;
        r6 = defpackage.jpn.a(r6, r12);
        r26 = r6;
        r26 = (defpackage.aeag) r26;
        r2 = r2.h;
        r2 = r2.get();
        r2 = (defpackage.akvp) r2;
        r6 = 8;
        r2 = defpackage.jpn.a(r2, r6);
        r27 = r2;
        r27 = (defpackage.akvp) r27;
        r2 = 9;
        r2 = defpackage.jpn.a(r4, r2);
        r28 = r2;
        r28 = (android.view.LayoutInflater) r28;
        r2 = 10;
        r2 = defpackage.jpn.a(r5, r2);
        r29 = r2;
        r29 = (android.content.res.Resources) r29;
        r2 = 11;
        r2 = defpackage.jpn.a(r15, r2);
        r30 = r2;
        r30 = (defpackage.acvx) r30;
        r2 = 12;
        r2 = defpackage.jpn.a(r1, r2);
        r31 = r2;
        r31 = (defpackage.akbb) r31;
        r19 = r8;
        r24 = r0;
        r32 = r14;
        r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);
        r9.l = r8;
        r0 = r9.l;
        r11.c(r0);
        r14 = r14 + 1;
        r0 = r1.f;
        r9.q = r0;
        goto L_0x0163;
    L_0x015d:
        r35 = r6;
        r33 = r8;
        r34 = r12;
    L_0x0163:
        r13 = r13 + 1;
        r0 = r36;
        r1 = r17;
        r5 = r18;
        r8 = r33;
        r12 = r34;
        r6 = r35;
        goto L_0x003e;
    L_0x0173:
        r17 = r1;
        r18 = r5;
        r35 = r6;
        r0 = r9.d;
        r0 = r0.b;
        r0 = r0.k();
        r1 = 2130772261; // 0x7f010125 float:1.7147635E38 double:1.0527413733E-314;
        r1 = defpackage.ezo.b(r1);
        r0 = r0.f(r1);
        r0 = r0.a();
        r10.c = r0;
        r9.a(r10);
        r0 = r11.a();
        r10.a(r0);
        r0 = r10.a();
        r9.k = r0;
        r0 = r9.j;
        r0 = r0.c();
        r0.b();
        r0 = r9.c;
        r0 = r0.d();
        if (r0 == 0) goto L_0x01de;
    L_0x01b3:
        r0 = r9.c;
        r0 = r0.d();
        r0 = r0.t();
        if (r0 == 0) goto L_0x01de;
    L_0x01bf:
        r0 = r9.o;
        if (r0 == 0) goto L_0x01de;
    L_0x01c3:
        r0 = r9.c;
        r0 = r0.d();
        r0 = r0.t();
        r1 = new acvs;
        r2 = r9.o;
        r1.<init>(r2);
        r0.b(r1);
        goto L_0x01de;
    L_0x01d8:
        r17 = r1;
        r18 = r5;
        r35 = r6;
    L_0x01de:
        r0 = r7.b;
        if (r0 != 0) goto L_0x01e3;
    L_0x01e2:
        goto L_0x020e;
    L_0x01e3:
        r1 = r0.a;
        r1 = r1.size();
        if (r1 == 0) goto L_0x020e;
    L_0x01eb:
        r0 = r0.a;
        r0 = r0.iterator();
    L_0x01f1:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x020e;
    L_0x01f7:
        r1 = r0.next();
        r1 = (defpackage.awab) r1;
        if (r1 == 0) goto L_0x01f1;
    L_0x01ff:
        r2 = r1.a;
        r4 = 117501096; // 0x700eca8 float:9.699197E-35 double:5.8053255E-316;
        if (r2 != r4) goto L_0x01f1;
    L_0x0206:
        r1 = r1.b;
        r1 = (defpackage.avzx) r1;
        r3.add(r1);
        goto L_0x01f1;
    L_0x020e:
        r6 = r35 + 1;
        r0 = r36;
        r1 = r17;
        r5 = r18;
        goto L_0x001c;
    L_0x0218:
        r0 = r36;
        r1 = r0.s;
        r0.s = r3;
        r2 = r1.size();
        r4 = r3.size();
        if (r2 != r4) goto L_0x0267;
    L_0x0228:
        r2 = 0;
    L_0x0229:
        r4 = r1.size();
        if (r2 >= r4) goto L_0x0263;
    L_0x022f:
        r4 = r1.get(r2);
        r4 = (defpackage.avzx) r4;
        r5 = r3.get(r2);
        r5 = (defpackage.avzx) r5;
        r6 = r4.e;
        if (r6 != 0) goto L_0x0241;
    L_0x023f:
        r6 = defpackage.arml.f;
    L_0x0241:
        r7 = r5.e;
        if (r7 != 0) goto L_0x0247;
    L_0x0245:
        r7 = defpackage.arml.f;
    L_0x0247:
        r6 = r6.equals(r7);
        if (r6 != 0) goto L_0x024e;
    L_0x024d:
        goto L_0x0267;
    L_0x024e:
        r4 = r4.f;
        if (r4 != 0) goto L_0x0254;
    L_0x0252:
        r4 = defpackage.arwf.c;
    L_0x0254:
        r5 = r5.f;
        if (r5 != 0) goto L_0x025a;
    L_0x0258:
        r5 = defpackage.arwf.c;
    L_0x025a:
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0267;
    L_0x0260:
        r2 = r2 + 1;
        goto L_0x0229;
    L_0x0263:
        r1 = 1;
        r16 = 1;
        goto L_0x026a;
    L_0x0267:
        r1 = 1;
        r16 = 0;
    L_0x026a:
        r1 = r16 ^ 1;
    L_0x026c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.a(aaxx):boolean");
    }

    public final void a(Configuration configuration) {
        if (this.y != configuration.smallestScreenWidthDp) {
            this.y = configuration.smallestScreenWidthDp;
            b(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    public final void b(boolean r13) {
        /*
        r12 = this;
        r0 = r12.u;
        if (r0 == 0) goto L_0x0118;
    L_0x0004:
        r1 = 0;
        if (r13 == 0) goto L_0x00d9;
    L_0x0007:
        r0.a();
        r13 = new java.util.HashMap;
        r13.<init>();
        r0 = 0;
    L_0x0010:
        r2 = r12.s;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x00bc;
    L_0x0018:
        r2 = r12.s;
        r2 = r2.get(r0);
        r2 = (defpackage.avzx) r2;
        r3 = r2.b;
        r4 = r12.g;
        r5 = r2.f;
        if (r5 != 0) goto L_0x002a;
    L_0x0028:
        r5 = defpackage.arwf.c;
    L_0x002a:
        r5 = r5.b;
        r5 = defpackage.arwh.a(r5);
        if (r5 != 0) goto L_0x0034;
    L_0x0032:
        r5 = defpackage.arwh.UNKNOWN;
    L_0x0034:
        r4 = r4.a(r5);
        r5 = r2.a;
        r5 = r5 & 64;
        r6 = 1;
        if (r5 == 0) goto L_0x0053;
    L_0x003f:
        r5 = r2.g;
        if (r5 != 0) goto L_0x0045;
    L_0x0043:
        r5 = defpackage.avzt.c;
    L_0x0045:
        r5 = r5.b;
        r5 = defpackage.avzv.a(r5);
        if (r5 == 0) goto L_0x0053;
    L_0x004d:
        r7 = 2;
        if (r5 == r7) goto L_0x0051;
    L_0x0050:
        goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0054;
    L_0x0053:
        r5 = 0;
    L_0x0054:
        r7 = r12.i;
        r7 = r7.a(r3);
        r8 = r12.u;
        r9 = r2.a;
        r9 = r9 & 8;
        if (r9 == 0) goto L_0x0069;
    L_0x0062:
        r9 = r2.e;
        if (r9 != 0) goto L_0x006a;
    L_0x0066:
        r9 = defpackage.arml.f;
        goto L_0x006a;
    L_0x0069:
        r9 = 0;
    L_0x006a:
        r9 = defpackage.ajqy.a(r9);
        if (r5 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0075;
    L_0x0071:
        if (r7 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0075;
    L_0x0074:
        r6 = 0;
    L_0x0075:
        r5 = r12.i;
        r3 = r5.b(r3);
        r5 = r8.c;
        r7 = 2131034683; // 0x7f05023b float:1.767989E38 double:1.052871027E-314;
        r10 = r8.s;
        r5 = r5.inflate(r7, r10, r1);
        r7 = new jlo;
        r10 = r8.q;
        r11 = r8.r;
        r7.<init>(r8, r5, r10, r11);
        r10 = r8.a;
        r10.add(r7);
        r10 = r7.c;
        r10.setImageResource(r4);
        r4 = r7.b;
        r4.setText(r9);
        r7.a(r6, r3);
        r3 = r8.p;
        r7.a(r3);
        r3 = r8.a(r5);
        r4 = r2.b;
        r5 = java.lang.Integer.valueOf(r0);
        r13.put(r4, r5);
        r4 = r12.o;
        r4.a(r2, r3);
        r0 = r0 + 1;
        goto L_0x0010;
    L_0x00bc:
        r0 = r12.u;
        r0.v = r12;
        r12.t = r13;
        r13 = r12.c;
        r13 = r13.c();
        if (r13 >= 0) goto L_0x00cb;
    L_0x00ca:
        goto L_0x0105;
    L_0x00cb:
        r0 = r12.u;
        r0 = r0.b();
        if (r13 >= r0) goto L_0x0105;
    L_0x00d3:
        r0 = r12.u;
        r0.b(r13, r1);
        goto L_0x0105;
    L_0x00d9:
        r13 = r12.s;
        r13 = r13.size();
        if (r1 >= r13) goto L_0x0105;
    L_0x00e1:
        r13 = r12.u;
        r13 = r13.t;
        if (r1 == r13) goto L_0x0102;
    L_0x00e7:
        r13 = r12.s;
        r13 = r13.get(r1);
        r13 = (defpackage.avzx) r13;
        r13 = r13.b;
        r0 = r12.i;
        r0 = r0.a(r13);
        r2 = r12.i;
        r13 = r2.b(r13);
        r2 = r12.u;
        r2.a(r1, r0, r13);
    L_0x0102:
        r1 = r1 + 1;
        goto L_0x00d9;
    L_0x0105:
        r13 = r12.c;
        r13 = r13.a();
        r13 = defpackage.jgv.b(r13);
        if (r13 == 0) goto L_0x0115;
    L_0x0111:
        r12.e();
        return;
    L_0x0115:
        r12.f();
    L_0x0118:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.b(boolean):void");
    }

    public final void a(fjl fjl) {
        a(this.c.a(), false);
    }

    public final void a(int i, int i2) {
        fiw a = this.c.a();
        boolean z = false;
        if (i2 == 1 && jgv.c(a)) {
            z = true;
        }
        a(a, z);
    }

    private final void a(fiw fiw, boolean z) {
        ((jxb) this.n.get()).a(fiw);
        boolean b = jgv.b(fiw);
        this.w = b;
        if (b) {
            e();
            int c = this.c.c();
            if (c >= 0 && c < this.u.b()) {
                this.u.b(c, z);
            }
            boolean a = gzd.a(fiw, this.l, this.k);
            PivotTabsBar pivotTabsBar = this.u;
            if (pivotTabsBar.p != a) {
                Drawable drawable;
                pivotTabsBar.p = a;
                if (a) {
                    drawable = pivotTabsBar.f;
                } else {
                    drawable = pivotTabsBar.e;
                }
                pivotTabsBar.setBackground(drawable);
                for (jlo a2 : pivotTabsBar.a) {
                    a2.a(pivotTabsBar.p);
                }
            }
            return;
        }
        f();
    }

    /* JADX WARNING: Missing block: B:15:0x0065, code skipped:
            if (((defpackage.axcv) r3).e.isEmpty() != false) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:23:0x00a2, code skipped:
            if (r1.h.a(r3.d) == false) goto L_0x00a6;
     */
    private static boolean b(defpackage.fiw r6) {
        /*
        r0 = 1;
        if (r6 == 0) goto L_0x00f0;
    L_0x0003:
        r1 = r6.a();
        r2 = 0;
        if (r1 == 0) goto L_0x0069;
    L_0x000a:
        r3 = com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x0068;
    L_0x001d:
        r3 = com.google.protos.youtube.api.innertube.ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x0068;
    L_0x0030:
        r3 = com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x0068;
    L_0x0043:
        r3 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r5 = r3.d;
        r4 = r4.b(r5);
        if (r4 != 0) goto L_0x0059;
    L_0x0056:
        r3 = r3.b;
        goto L_0x005d;
    L_0x0059:
        r3 = r3.a(r4);
    L_0x005d:
        r3 = (defpackage.axcv) r3;
        r3 = r3.e;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        return r2;
    L_0x0069:
        if (r1 == 0) goto L_0x00a6;
    L_0x006b:
        r3 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x00a5;
    L_0x007e:
        r3 = com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x00a5;
    L_0x0091:
        r3 = com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        return r2;
    L_0x00a6:
        if (r1 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00d0;
    L_0x00a9:
        r3 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r4 = r3.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x00bf;
    L_0x00bc:
        r1 = r3.b;
        goto L_0x00c3;
    L_0x00bf:
        r1 = r3.a(r1);
    L_0x00c3:
        r1 = (defpackage.apge) r1;
        r1 = r1.b;
        r3 = "FEvideo_picker";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x00cf:
        return r2;
    L_0x00d0:
        r1 = defpackage.fqb.a(r6);
        if (r1 != 0) goto L_0x00ef;
    L_0x00d6:
        r1 = defpackage.iqu.a(r6);
        if (r1 != 0) goto L_0x00ef;
    L_0x00dc:
        r1 = defpackage.frf.a(r6);
        if (r1 != 0) goto L_0x00ef;
    L_0x00e2:
        r1 = defpackage.fpx.a(r6);
        if (r1 != 0) goto L_0x00ef;
    L_0x00e8:
        r6 = r6.a;
        r1 = defpackage.frn.class;
        if (r6 == r1) goto L_0x00ef;
    L_0x00ee:
        return r0;
    L_0x00ef:
        return r2;
    L_0x00f0:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.b(fiw):boolean");
    }

    private final boolean a(ejd ejd) {
        hel hel = this.x;
        boolean z = false;
        if (!(ejd.a() || ejd.c())) {
            if (hel == null) {
                z = true;
            } else if (hel.a()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:8:0x0029, code skipped:
            if (r5 != false) goto L_0x0033;
     */
    public final void a(java.lang.String r1, boolean r2, int r3, long r4, boolean r6) {
        /*
        r0 = this;
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 != 0) goto L_0x007c;
    L_0x0006:
        r4 = r0.s;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x007c;
    L_0x000e:
        r4 = r0.t;
        r4 = r4.get(r1);
        r4 = (java.lang.Integer) r4;
        r5 = r0.t;
        r6 = "FEactivity";
        r5 = r5.containsKey(r6);
        if (r4 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0057;
    L_0x0021:
        r2 = "FEshared";
        r3 = r2.equals(r1);
        if (r3 != 0) goto L_0x002c;
    L_0x0029:
        if (r5 == 0) goto L_0x0042;
    L_0x002b:
        goto L_0x0033;
    L_0x002c:
        if (r5 != 0) goto L_0x0033;
    L_0x002e:
        r1 = 0;
        r0.b(r1);
        return;
    L_0x0033:
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x0043;
    L_0x0039:
        r2 = "FEnotifications_inbox";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        return;
    L_0x0043:
        r1 = r0.t;
        r1 = r1.get(r6);
        r4 = r1;
        r4 = (java.lang.Integer) r4;
        r1 = r0.i;
        r3 = r1.b(r6);
        if (r3 <= 0) goto L_0x0056;
    L_0x0054:
        r2 = 1;
        goto L_0x0057;
    L_0x0056:
        r2 = 0;
    L_0x0057:
        r1 = r4.intValue();
        r5 = r0.u;
        r5 = r5.t;
        if (r1 == r5) goto L_0x007c;
    L_0x0061:
        r1 = r4.intValue();
        if (r1 < 0) goto L_0x007c;
    L_0x0067:
        r1 = r4.intValue();
        r5 = r0.s;
        r5 = r5.size();
        if (r1 >= r5) goto L_0x007c;
    L_0x0073:
        r1 = r0.u;
        r4 = r4.intValue();
        r1.a(r4, r2, r3);
    L_0x007c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.a(java.lang.String, boolean, int, long, boolean):void");
    }

    public final void a(int i, int i2, boolean z) {
        this.i.c(((avzx) this.s.get(i2)).b);
        jxb jxb = (jxb) this.n.get();
        if (z) {
            jxb.a();
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            Integer num = (Integer) this.t.get("FElibrary");
            avzx avzx = (avzx) this.s.get(i3);
            avzr avzr = avzx.h;
            if (avzr == null) {
                avzr = avzr.c;
            }
            if (avzr.a == 102716411) {
                if (num.intValue() != i3) {
                    jxb.a(avzx, this.u.c(i3), null);
                } else if (jxb.b()) {
                    jxb.a(avzx, this.u.c(i3), jxb.d());
                }
            }
        }
        if (z) {
            if (i2 == i && this.c.g() && a(i2)) {
                for (jlh d : this.q) {
                    d.d();
                }
            } else if (i2 == i) {
                if (!this.c.g()) {
                    this.c.e();
                }
                if (!(this.c.g() && a(i2))) {
                    c();
                }
            } else {
                if (i != -1 && i < this.s.size()) {
                    avzx avzx2 = (avzx) this.s.get(i);
                    if (!avzx2.b.isEmpty()) {
                        int b = this.i.b(avzx2.b);
                        if (b > 0) {
                            this.u.a(i, true, b);
                        }
                    }
                }
                if (i != i2) {
                    this.c.a(i2, 0);
                    if (jgv.c(this.c.a())) {
                        c();
                    }
                }
            }
        }
    }

    public final boolean c() {
        avzx avzx = (avzx) this.s.get(this.u.t);
        if (avzx == null) {
            return false;
        }
        aaas aaas = this.h;
        apxu apxu = avzx.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, this.p);
        return true;
    }

    public final void a(hel hel) {
        this.x = hel;
    }

    public final void c(boolean z) {
        int i;
        if (z) {
            for (i = 0; i < this.s.size(); i++) {
                if (i != this.u.t) {
                    boolean z2;
                    int b;
                    String str = ((avzx) this.s.get(i)).b;
                    String str2 = "FEactivity";
                    if (str.equals(str2)) {
                        z2 = true;
                        if (!(this.i.a("FEshared") || this.i.a("FEnotifications_inbox"))) {
                            z2 = false;
                        }
                        b = this.i.b(str2);
                    } else {
                        z2 = this.i.a(str);
                        b = this.i.b(str);
                    }
                    this.u.a(i, z2, b);
                }
            }
            return;
        }
        for (i = 0; i < this.s.size(); i++) {
            PivotTabsBar pivotTabsBar = this.u;
            if (i != pivotTabsBar.t) {
                pivotTabsBar.a(i, false, 0);
            }
        }
    }

    public final void d() {
        b(null);
    }

    private static boolean c(fiw fiw) {
        return fiw == null || fil.a(fiw);
    }

    private final boolean a(int i) {
        fiw a = this.c.a();
        apxu a2 = a != null ? a.a() : null;
        apxu apxu = ((avzx) this.s.get(i)).d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return this.r.a(a2, apxu);
    }

    private static awab a(String str, String str2, arwh arwh) {
        avzw avzw = (avzw) avzx.j.createBuilder();
        avzw.copyOnWrite();
        avzx avzx = (avzx) avzw.instance;
        avzx.a |= 1;
        avzx.b = str;
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(str);
        apge apge = (apge) ((anxl) apgd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
        avzw.copyOnWrite();
        avzx avzx2 = (avzx) avzw.instance;
        avzx2.d = (apxu) ((anxl) apxx.build());
        avzx2.a |= 4;
        arwe arwe = (arwe) arwf.c.createBuilder();
        arwe.a(arwh);
        avzw.copyOnWrite();
        avzx avzx3 = (avzx) avzw.instance;
        avzx3.f = (arwf) ((anxl) arwe.build());
        avzx3.a |= 32;
        arml a = ajqy.a(str2);
        avzw.copyOnWrite();
        avzx avzx4 = (avzx) avzw.instance;
        if (a != null) {
            avzx4.e = a;
            avzx4.a |= 8;
            awaa awaa = (awaa) awab.c.createBuilder();
            awaa.copyOnWrite();
            awab awab = (awab) awaa.instance;
            awab.b = (anxl) avzw.build();
            awab.a = 117501096;
            return (awab) ((anxl) awaa.build());
        }
        throw new NullPointerException();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{uru.class};
        } else if (i == 0) {
            b(null);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
