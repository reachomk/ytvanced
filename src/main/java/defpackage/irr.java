package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.provider.SearchRecentSuggestions;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: irr */
public final class irr extends fja implements iqn, xoy {
    private View aA;
    private akyd aB;
    private xoe aC;
    public SearchRecentSuggestions ae;
    public xci af;
    public bcaa ag;
    public ixe ah;
    public fab ai;
    public hdk aj;
    public iqf ak;
    public iqi al;
    public zyw am;
    public afpu an;
    public ewi ao;
    public ebk ap;
    public jpt aq;
    public Executor ar;
    public String as;
    public iqk at;
    private String au;
    private TextView av;
    private LoadingFrameLayout aw;
    private boolean ax;
    private isa ay;
    private View az;

    public static fiw a(String str, axny axny, byte[] bArr, boolean z, boolean z2, ajwc ajwc, boolean z3) {
        amqw.a((Object) str, (Object) "query cannot be null");
        Bundle b = fiw.b();
        b.putString("search_query", str);
        if (axny != null) {
            b.putParcelable("innertube_search_filters", aobp.a(axny));
        }
        b.putByteArray("searchbox_stats", bArr);
        b.putBoolean("no_history", z);
        b.putBoolean("preserve_search_nav_history", z2);
        b.putInt("network_connectivity_requirement", 2);
        double random = Math.random();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
        stringBuilder.append("SEARCH_RESULTS_");
        stringBuilder.append(str);
        stringBuilder.append(random);
        b.putString("search_cache_key", stringBuilder.toString());
        b.putBoolean("remove_search_response_data", z3);
        if (ajwc != null) {
            b.putByteArray("sticky_horizontal_card_list", aocf.toByteArray(ajwc));
        }
        return new fiw(irr.class, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    public static defpackage.fiw a(defpackage.apxu r10, defpackage.axny r11, byte[] r12, boolean r13, defpackage.ajwc r14, boolean r15) {
        /*
        defpackage.amqw.a(r10);
        r0 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r10.a(r0);
        r1 = r10.h;
        r0 = r0.d;
        r0 = r1.a(r0);
        defpackage.amqw.a(r0);
        r0 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r10.a(r0);
        r1 = r10.h;
        r2 = r0.d;
        r1 = r1.b(r2);
        if (r1 != 0) goto L_0x002d;
    L_0x002a:
        r0 = r0.b;
        goto L_0x0031;
    L_0x002d:
        r0 = r0.a(r1);
    L_0x0031:
        r0 = (defpackage.axcv) r0;
        r1 = r0.a;
        r1 = r1 & 4;
        r2 = 0;
        if (r1 == 0) goto L_0x0050;
    L_0x003a:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0040;
    L_0x003e:
        r0 = defpackage.axda.c;
    L_0x0040:
        r1 = r0.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0050;
    L_0x0046:
        r0 = r0.b;
        if (r0 != 0) goto L_0x004c;
    L_0x004a:
        r0 = defpackage.axcy.d;
    L_0x004c:
        r2 = r0.b;
        r7 = r2;
        goto L_0x0051;
    L_0x0050:
        r7 = 0;
    L_0x0051:
        r0 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r10.a(r0);
        r1 = r10.h;
        r2 = r0.d;
        r1 = r1.b(r2);
        if (r1 != 0) goto L_0x0067;
    L_0x0064:
        r0 = r0.b;
        goto L_0x006b;
    L_0x0067:
        r0 = r0.a(r1);
    L_0x006b:
        r0 = (defpackage.axcv) r0;
        r3 = r0.b;
        r4 = r11;
        r5 = r12;
        r6 = r13;
        r8 = r14;
        r9 = r15;
        r11 = defpackage.irr.a(r3, r4, r5, r6, r7, r8, r9);
        r11.a(r10);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irr.a(apxu, axny, byte[], boolean, ajwc, boolean):fiw");
    }

    public static boolean a(fiw fiw) {
        return fiw.a == irr.class;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        ((isc) xse.a(p())).a(this);
        this.az = layoutInflater.inflate(R.layout.search_results_fragment, viewGroup, false);
        this.aw = (LoadingFrameLayout) this.az.findViewById(R.id.loading_layout);
        this.aw.a(this);
        RecyclerView recyclerView = (RecyclerView) this.aw.findViewById(R.id.results);
        if (this.at == null) {
            if (this.ap.a) {
                iqf iqf = this.ak;
                this.at = new iqd(iqf.a, (aiuu) iqf.a((aiuu) iqf.b.get(), 2), iqf.c, iqf.d, (hsy) iqf.a((hsy) iqf.e.get(), 5), (hmc) iqf.a((hmc) iqf.f.get(), 6), (hmj) iqf.a((hmj) iqf.g.get(), 7), (akkq) iqf.a((akkq) iqf.h.get(), 8), (xhv) iqf.a((xhv) iqf.i.get(), 9), (agur) iqf.a((agur) iqf.j.get(), 10), (agvs) iqf.a((agvs) iqf.k.get(), 11), iqf.l, (akpe) iqf.a((akpe) iqf.m.get(), 13), (Executor) iqf.a((Executor) iqf.n.get(), 14), (xci) iqf.a((xci) iqf.o.get(), 15), (aaas) iqf.a((aaas) iqf.p.get(), 16), (xoi) iqf.a((xoi) iqf.q.get(), 17), (zyw) iqf.a((zyw) iqf.r.get(), 18), (zzl) iqf.a((zzl) iqf.s.get(), 19), (hqp) iqf.a((hqp) iqf.t.get(), 20), iqf.u, (hng) iqf.a((hng) iqf.v.get(), 22), (RecyclerView) iqf.a(recyclerView, 23), (LoadingFrameLayout) iqf.a(this.aw, 24), (Activity) iqf.a(p(), 25), (acvx) iqf.a(t(), 26));
            } else {
                iqi iqi = this.al;
                LoadingFrameLayout loadingFrameLayout = this.aw;
                nn p = p();
                acvx t = t();
                this.at = new iqe((afqv) iqi.a((afqv) iqi.a.get(), 1), iqi.b, (jtx) iqi.a((jtx) iqi.c.get(), 4), (jja) iqi.a((jja) iqi.d.get(), 5), (jjk) iqi.a((jjk) iqi.e.get(), 6), (Handler) iqi.a((Handler) iqi.f.get(), 7), (abhw) iqi.a((abhw) iqi.g.get(), 8), (fcb) iqi.a((fcb) iqi.h.get(), 9), (fcs) iqi.a((fcs) iqi.i.get(), 10), (alcb) iqi.a((alcb) iqi.j.get(), 11), (abno) iqi.a((abno) iqi.k.get(), 12), (abns) iqi.a((abns) iqi.l.get(), 13), (xci) iqi.a((xci) iqi.m.get(), 14), (xoi) iqi.a((xoi) iqi.n.get(), 15), (fab) iqi.a((fab) iqi.o.get(), 16), (ixe) iqi.a((ixe) iqi.p.get(), 17), (zyw) iqi.a((zyw) iqi.q.get(), 18), (zzl) iqi.a((zzl) iqi.r.get(), 19), (bapu) iqi.a((bapu) iqi.s.get(), 20), (akkq) iqi.a((akkq) iqi.t.get(), 21), (akzh) iqi.a((akzh) iqi.u.get(), 22), (RecyclerView) iqi.a(recyclerView, 23), (LoadingFrameLayout) iqi.a(loadingFrameLayout, 24), (Activity) iqi.a(p, 25), (acvx) iqi.a(t, 26), this.ay, (acxw) iqi.a((acxw) iqi.v.get(), 28), (iql) iqi.a((iql) iqi.w.get(), 29), (amqp) iqi.a((amqp) iqi.x.get(), 30), (syb) iqi.a((syb) iqi.y.get(), 31));
            }
        }
        Bundle bundle3 = this.j;
        if (bundle2 == null) {
            bundle2 = bundle3;
        } else if (bundle3 != null) {
            str = "navigation_endpoint_interaction_logging_extension";
            if (bundle3.containsKey(str)) {
                bundle2.putByteArray(str, bundle3.getByteArray(str));
            }
        }
        str = "search_cache_key";
        if (this.j.containsKey(str)) {
            this.au = this.j.getString(str);
        }
        if (bundle2 != null) {
            this.at.b(bundle2);
        }
        this.at.a(this.aB);
        if (this.as == null) {
            String string = bundle2.getString("search_query");
            this.as = string;
            if (!TextUtils.isEmpty(string)) {
                this.as = string.trim();
            } else if (TextUtils.isEmpty(this.as)) {
                this.as = "";
            }
            TextView textView = this.av;
            if (textView != null) {
                textView.setText(this.as);
            }
            fab fab = this.ai;
            if (fab != null) {
                fab.a(this.as);
            }
            if (this.ah.b() && !this.an.g()) {
                aayi aayi = (aayi) this.ag.get();
                aayj a = aayi.a();
                a.g();
                xan.a(aayi.a(a), this.ar, iry.a, new isb(this));
            }
            if (v()) {
                ao();
            } else {
                this.ax = true;
            }
        }
        this.aA = this.aq.c(LayoutInflater.from(this.a.g().h()));
        View view = this.aA;
        this.av = (TextView) view.findViewById(R.id.search_query);
        this.av.setText(this.as);
        this.av.setOnClickListener(new iru(this));
        View findViewById = view.findViewById(R.id.search_clear);
        View findViewById2 = view.findViewById(R.id.search_filter);
        if (foh.A(this.am)) {
            if (!(findViewById2 == null || this.at.g() == null || this.ap.a)) {
                findViewById2.setOnClickListener(new irx(this));
                findViewById2.setVisibility(0);
            }
            findViewById.setVisibility(8);
        } else {
            findViewById.setOnClickListener(new irw(this));
            findViewById.setVisibility(0);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        view = view.findViewById(R.id.voice_search);
        PackageManager packageManager = this.a.getPackageManager();
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        if (!(view == null || intent.resolveActivity(packageManager) == null)) {
            view.setOnClickListener(new irz(this));
        }
        return this.az;
    }

    public final void W_() {
        super.W_();
        this.ao.a();
        this.ai.a(this.as);
        if (this.ax) {
            ao();
        }
        this.ax = false;
        this.at.a((iqn) this);
    }

    public final void ad_() {
        super.ad_();
        this.af.d(new efm());
    }

    public final void B() {
        super.B();
        this.ar.execute(new irq(this));
        if (foh.A(this.am)) {
            this.ar.execute(new irt(this));
        }
    }

    public final void N_() {
        super.N_();
        this.at.a(null);
        this.ai.a("");
    }

    public final void i() {
        super.i();
        this.at.b();
    }

    public final void e(Bundle bundle) {
        bundle.putString("search_cache_key", this.au);
        bundle.putString("search_query", this.as);
        iqk iqk = this.at;
        if (iqk != null) {
            iqk.a(bundle);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.at.a(configuration);
        this.ar.execute(new irs(this));
        if (foh.A(this.am)) {
            this.ar.execute(new irv(this));
        }
    }

    /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            if (r2.bg != false) goto L_0x0047;
     */
    public final defpackage.ezz W() {
        /*
        r3 = this;
        r0 = r3.c;
        if (r0 != 0) goto L_0x0054;
    L_0x0004:
        r0 = r3.ab;
        r0 = r0.i();
        r1 = r3.aA;
        r0.b = r1;
        r1 = r3.ap;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0017;
    L_0x0014:
        r1 = defpackage.amwp.a;
        goto L_0x004b;
    L_0x0017:
        r1 = defpackage.amuw.i();
        r2 = r3.am;
        r2 = defpackage.foh.A(r2);
        if (r2 != 0) goto L_0x002f;
    L_0x0023:
        r2 = new isa;
        r2.<init>(r3);
        r3.ay = r2;
        r2 = r3.ay;
        r1.c(r2);
    L_0x002f:
        r2 = r3.am;
        r2 = r2.a();
        if (r2 == 0) goto L_0x0042;
    L_0x0037:
        r2 = r2.e;
        if (r2 != 0) goto L_0x003d;
    L_0x003b:
        r2 = defpackage.aulu.bw;
    L_0x003d:
        r2 = r2.bg;
        if (r2 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0047;
    L_0x0042:
        r2 = r3.aj;
        r1.c(r2);
    L_0x0047:
        r1 = r1.a();
    L_0x004b:
        r0.a(r1);
        r0 = r0.a();
        r3.c = r0;
    L_0x0054:
        r0 = r3.c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irr.W():ezz");
    }

    public final void bf_() {
        ao();
    }

    public final String Z() {
        return this.at.e();
    }

    public final Object ai() {
        isf isf = new isf();
        iqk iqk = this.at;
        if (iqk != null) {
            isf.a = iqk.d();
        }
        return isf;
    }

    public final void a(Object obj) {
        if (obj instanceof isf) {
            this.aB = ((isf) obj).a;
        }
    }

    public final void a(String str) {
        this.as = str;
        this.ai.a(str);
        this.av.setText(this.as);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        if (this.at.g() != null) {
            isa isa = this.ay;
            if (!(isa == null || isa.a == null || !F_())) {
                if (this.at.f().isEmpty()) {
                    this.ay.a(al(), an());
                } else {
                    this.ay.a(al(), am());
                }
            }
        }
    }

    public final void ak() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.aA.findViewById(R.id.search_filter);
        if (!(this.at.g() == null || appCompatImageView == null || !F_())) {
            if (this.at.f().isEmpty()) {
                irr.a(appCompatImageView, al(), an());
            } else {
                irr.a(appCompatImageView, al(), am());
            }
        }
    }

    private static void a(AppCompatImageView appCompatImageView, xoe xoe, int i) {
        if (xoe != null) {
            appCompatImageView.setImageDrawable(xoe.a(appCompatImageView.getContext().getResources().getDrawable(R.drawable.ic_menu_filter_mtrl_alpha).mutate(), i));
        }
    }

    private final xoe al() {
        if (this.aC == null) {
            nn p = p();
            if (p != null && (p instanceof dvg)) {
                this.aC = ((dvg) p).s();
            }
        }
        return this.aC;
    }

    private final int am() {
        return q().getColor(R.color.yt_material_blue_500);
    }

    private final int an() {
        return ezo.b(R.attr.ytIconActiveOther).a(M_());
    }

    private final void ao() {
        this.at.a(this.as);
    }
}
