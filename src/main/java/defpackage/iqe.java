package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: iqe */
public final class iqe extends iqk implements iww {
    private final isa A;
    private final abhw B;
    private final fcb C;
    private final fcs D;
    private final alcb E;
    private final fab F;
    private final bapu G;
    private final aalw H;
    private String I;
    private iwx J;
    private ajwc K;
    private final ept L;
    private afsu M;
    public final iql a;
    public final jts b;
    public aafk c;
    public final abno d;
    public final abns e;
    public final xci f;
    public final xoi g;
    public final ixe h;
    public final akkq i;
    public final akzh j;
    public edl k;
    public final acxw l;
    public boolean m;

    public iqe(afqv afqv, bcaa bcaa, jtx jtx, jja jja, jjk jjk, Handler handler, abhw abhw, fcb fcb, fcs fcs, alcb alcb, abno abno, abns abns, xci xci, xoi xoi, fab fab, ixe ixe, zyw zyw, zzl zzl, bapu bapu, akkq akkq, akzh akzh, RecyclerView recyclerView, LoadingFrameLayout loadingFrameLayout, Activity activity, acvx acvx, isa isa, acxw acxw, iql iql, amqp amqp, syb syb) {
        xoi xoi2 = xoi;
        super(loadingFrameLayout, activity, acvx, zyw, zzl);
        this.B = abhw;
        this.C = fcb;
        this.D = fcs;
        this.E = alcb;
        this.d = abno;
        this.e = abns;
        this.f = xci;
        this.g = xoi2;
        this.F = fab;
        this.h = ixe;
        this.G = bapu;
        this.i = akkq;
        this.j = akzh;
        this.a = iql;
        this.H = (aalw) amqp.c();
        this.A = isa;
        this.l = acxw;
        xoi xoi3 = xoi2;
        jmw jmw = new jmw(activity, abhw, xci, (epf) bcaa.get(), xoi, acvx, jja, jjk, handler, recyclerView);
        arvt b = zzl.b();
        Object obj = null;
        if (b != null) {
            aume aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.ae) {
                obj = 1;
            }
        }
        this.b = jtx.a(null, acvx, recyclerView, abhw, jmw, akxw.n, akxj.d, obj == null ? 1 : 3, akhs.SEARCH, syb);
        this.b.L = new iqh(acvx, xoi3);
        dvr.a(this.b);
        aknh akpk = new akpk();
        akpk.add(epq.a(8));
        this.b.a(akpk);
        this.L = new ept();
        this.b.a(this.L);
    }

    public final void a(String str) {
        a(str, false);
    }

    public final void a(Configuration configuration) {
        this.b.a(configuration);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (!(this.I == null || this.t == null)) {
            abhv abhv = (abhv) this.G.get();
            String str = this.I;
            ajzz ajzz = this.t;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Invalid cache key: cache key is empty");
            }
            abhv.c.execute(new abhu(abhv, ajzz, str));
        }
        ajwc ajwc = this.K;
        if (ajwc != null) {
            bundle.putByteArray("sticky_horizontal_card_list", aocf.toByteArray(ajwc));
        }
    }

    public final iqm d() {
        iqm d = super.d();
        d.b = this.b.t();
        return d;
    }

    public final void b() {
        h();
        this.b.c();
        apxn a = this.q.a();
        if (a != null && (a.a & 16) != 0) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.bu) {
                afsu afsu = this.M;
                if (afsu != null) {
                    afsu.a();
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        String str = "sticky_horizontal_card_list";
        ajzz ajzz = null;
        if (bundle.containsKey(str)) {
            ajwc a;
            try {
                a = ajwc.a(bundle.getByteArray(str));
            } catch (aocg e) {
                xtl.a("InvalidProtocolBufferNanoException: ", e);
                a = null;
            }
            if (a != null) {
                this.K = a;
                this.J = new iwx(this.b);
                this.J.a(this.K);
                this.J.c = new WeakReference(this);
            }
        }
        str = "remove_search_response_data";
        if (bundle.containsKey(str)) {
            this.m = bundle.getBoolean(str);
        }
        str = "search_cache_key";
        if (bundle.containsKey(str)) {
            this.I = bundle.getString(str);
            abhv abhv = (abhv) this.G.get();
            bpz a2 = abhv.a.a(this.I);
            if (a2 != null) {
                ajzz ajzz2 = (ajzz) abhv.b.a(a2.a, ajzz.class);
                if (ajzz2 == null) {
                    xtl.c("Failed to deserialize search response from cache");
                } else {
                    ajzz = ajzz2;
                }
            }
            if (ajzz != null) {
                this.t = ajzz;
            }
        }
    }

    public final void a(axdr axdr) {
        if (axdr != null) {
            apxu a = axdr.a();
            anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                apxu a2 = axdr.a();
                anxr access$0002 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                a2.a(access$0002);
                Object b = a2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                String str = ((axcv) b).b;
                iqn iqn = this.y;
                if (iqn != null) {
                    iqn.a(str);
                }
                a(str, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    private final void a(java.lang.String r8, boolean r9) {
        /*
        r7 = this;
        r0 = 0;
        r7.a(r0);
        if (r9 == 0) goto L_0x0011;
    L_0x0006:
        r1 = r7.b;
        r1.k();
        r1 = r7.b;
        r1.l();
        goto L_0x003a;
    L_0x0011:
        r1 = r7.o;
        r1.a();
        r1 = r7.t;
        if (r1 == 0) goto L_0x003a;
    L_0x001a:
        r8 = r7.K;
        if (r8 == 0) goto L_0x0023;
    L_0x001e:
        r9 = r7.J;
        r9.a(r8);
    L_0x0023:
        r7.i();
        r8 = r7.p;
        r9 = r7.t;
        r9 = r9.c;
        r8.a(r9);
        r8 = new aafk;
        r9 = r7.t;
        r8.<init>(r9);
        r7.a(r8, r0);
        return;
    L_0x003a:
        r1 = r7.r;
        r1 = defpackage.foh.j(r1);
        r2 = 0;
        r3 = "";
        if (r1 == 0) goto L_0x00b3;
    L_0x0045:
        r1 = r7.a;
        r4 = r1.b;
        if (r4 == 0) goto L_0x0062;
    L_0x004b:
        r4 = r1.c;
        if (r4 == 0) goto L_0x0062;
    L_0x004f:
        r4 = r4.equals(r8);
        if (r4 == 0) goto L_0x0062;
    L_0x0055:
        r4 = r1.d;
        r1 = r1.b;
        r5 = defpackage.ajzz.class;
        r1 = r4.a(r1, r5);
        r1 = (defpackage.ajzz) r1;
        goto L_0x0063;
    L_0x0062:
        r1 = r2;
    L_0x0063:
        if (r1 == 0) goto L_0x00b3;
    L_0x0065:
        r8 = r7.r;
        r8 = defpackage.foh.k(r8);
        if (r8 == 0) goto L_0x0080;
    L_0x006d:
        r8 = r7.l;
        r0 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r8 = r8.b(r0, r3);
        if (r8 == 0) goto L_0x0080;
    L_0x0077:
        r8 = r7.l;
        r0 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r2 = "sr_r";
        r8.a(r2, r0, r3);
    L_0x0080:
        r7.i();
        r8 = r7.p;
        r0 = r1.c;
        r8.a(r0);
        r8 = new aafk;
        r8.<init>(r1);
        r7.a(r8, r9);
        r8 = r7.r;
        r8 = defpackage.foh.k(r8);
        if (r8 == 0) goto L_0x00ad;
    L_0x009a:
        r8 = r7.l;
        r9 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r8 = r8.b(r9, r3);
        if (r8 == 0) goto L_0x00ad;
    L_0x00a4:
        r8 = r7.l;
        r9 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r0 = "sr_p";
        r8.b(r0, r9, r3);
    L_0x00ad:
        r8 = r7.a;
        r8.a();
        return;
    L_0x00b3:
        r1 = new iqj;
        r1.<init>(r7, r9, r8);
        r4 = r7.r;
        r4 = defpackage.foh.k(r4);
        r5 = "sr_s";
        if (r4 == 0) goto L_0x00d4;
    L_0x00c2:
        r4 = r7.l;
        r6 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r4 = r4.b(r6, r3);
        if (r4 == 0) goto L_0x00d4;
    L_0x00cc:
        r4 = r7.l;
        r6 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r4.a(r5, r6, r3);
        goto L_0x00db;
    L_0x00d4:
        r4 = r7.l;
        r6 = defpackage.atyw.LATENCY_ACTION_SEARCH_UI;
        r4.a(r5, r6, r3);
    L_0x00db:
        r3 = new afsu;
        r3.<init>(r1);
        r7.M = r3;
        r1 = defpackage.ise.g();
        r3 = r7.B;
        r1 = r1.a(r3);
        r3 = r7.s;
        r1 = r1.a(r3);
        r8 = r1.a(r8);
        r1 = r7.u;
        if (r1 != 0) goto L_0x00fc;
    L_0x00fa:
        r1 = r2;
        goto L_0x012c;
    L_0x00fc:
        r1 = defpackage.atgl.b;
        r1 = r1.createBuilder();
        r1 = (defpackage.atgo) r1;
        r3 = super.f();
        r1.copyOnWrite();
        r4 = r1.instance;
        r4 = (defpackage.atgl) r4;
        r5 = r4.a;
        r5 = r5.a();
        if (r5 != 0) goto L_0x011f;
    L_0x0117:
        r5 = r4.a;
        r5 = defpackage.anxl.mutableCopy(r5);
        r4.a = r5;
    L_0x011f:
        r4 = r4.a;
        defpackage.anvf.addAll(r3, r4);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.atgl) r1;
    L_0x012c:
        r8 = r8.a(r1);
        if (r9 != 0) goto L_0x0134;
    L_0x0132:
        r2 = r7.v;
    L_0x0134:
        r8 = r8.a(r2);
        r8 = r8.a(r0);
        r8 = r8.a();
        r8 = r8.h();
        r9 = r7.B;
        r0 = r7.M;
        r9 = r9.a;
        r9.b(r8, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.a(java.lang.String, boolean):void");
    }

    public final void h() {
        edl edl = this.k;
        if (edl != null) {
            edl.a();
            this.k = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015a  */
    public final void a(defpackage.aafk r8, boolean r9) {
        /*
        r7 = this;
        r0 = r8.a;
        r1 = r0.a;
        r2 = 0;
        if (r1 == 0) goto L_0x003b;
    L_0x0007:
        r1 = r1.a;
        if (r1 == 0) goto L_0x003b;
    L_0x000b:
        r1 = r1.b;
        r1 = r1.length;
        if (r1 > 0) goto L_0x0011;
    L_0x0010:
        goto L_0x003b;
    L_0x0011:
        r1 = r7.H;
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r0 = r0.frameworkUpdates;
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r1.a(r0);
    L_0x001c:
        r0 = r7.o;
        r0.b();
        if (r9 == 0) goto L_0x002f;
    L_0x0023:
        r9 = r7.b;
        r0 = r8.d();
        r9.k = r2;
        r9.c(r0);
        goto L_0x004d;
    L_0x002f:
        r9 = r7.b;
        r0 = r8.d();
        r1 = r7.w;
        r9.b(r0, r1);
        goto L_0x004d;
    L_0x003b:
        r9 = r7.o;
        r0 = r7.n;
        r0 = r0.getResources();
        r1 = 2131952946; // 0x7f130532 float:1.954235E38 double:1.053324709E-314;
        r0 = r0.getString(r1);
        r9.a(r0);
    L_0x004d:
        r9 = r8.d();
        r0 = 1;
        if (r9 == 0) goto L_0x0089;
    L_0x0054:
        r9 = r9.a();
        r1 = r9.size();
        if (r1 <= 0) goto L_0x0089;
    L_0x005e:
        r1 = r9.get(r2);
        r1 = r1 instanceof defpackage.aafj;
        if (r1 == 0) goto L_0x0089;
    L_0x0066:
        r9 = r9.get(r2);
        r9 = (defpackage.aafj) r9;
        r9 = r9.a;
        r9 = r9.b;
        r1 = r9.length;
        if (r1 <= 0) goto L_0x0084;
    L_0x0073:
        r9 = r9[r2];
        r1 = r9.az;
        if (r1 != 0) goto L_0x0084;
    L_0x0079:
        r1 = r9.by;
        if (r1 != 0) goto L_0x0084;
    L_0x007d:
        r9 = r9.S;
        if (r9 == 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0084;
    L_0x0082:
        r9 = 1;
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r1 = r7.L;
        r1.a = r9;
    L_0x0089:
        r9 = r8.a;
        r1 = r9.d;
        r3 = 0;
        if (r1 == 0) goto L_0x00be;
    L_0x0090:
        r4 = r7.C;
        r5 = r1.a;
        r6 = 84469052; // 0x508e53c float:6.436793E-36 double:4.17332567E-316;
        if (r5 != r6) goto L_0x009e;
    L_0x0099:
        r1 = r1.b;
        r1 = (defpackage.aybe) r1;
        goto L_0x00a0;
    L_0x009e:
        r1 = defpackage.aybe.g;
    L_0x00a0:
        r1 = r1.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x00ba;
    L_0x00a6:
        r1 = r9.d;
        r5 = r1.a;
        if (r5 != r6) goto L_0x00b1;
    L_0x00ac:
        r1 = r1.b;
        r1 = (defpackage.aybe) r1;
        goto L_0x00b3;
    L_0x00b1:
        r1 = defpackage.aybe.g;
    L_0x00b3:
        r1 = r1.e;
        if (r1 != 0) goto L_0x00bb;
    L_0x00b7:
        r1 = defpackage.aybc.f;
        goto L_0x00bb;
    L_0x00ba:
        r1 = r3;
    L_0x00bb:
        r4.a(r1);
    L_0x00be:
        r1 = r9.f;
        if (r1 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00ed;
    L_0x00c3:
        r4 = r1.a;
        r5 = 96907215; // 0x5c6afcf float:1.8684412E-35 double:4.7878526E-316;
        if (r4 == r5) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00d6;
    L_0x00cb:
        r4 = r7.D;
        r1 = r1.b;
        r1 = (defpackage.auuc) r1;
        r5 = r7.p;
        r4.a(r1, r5);
    L_0x00d6:
        r1 = r9.f;
        r4 = r1.a;
        r5 = 152873793; // 0x91cab41 float:1.885834E-33 double:7.55296893E-316;
        if (r4 != r5) goto L_0x00ed;
    L_0x00df:
        r4 = r7.E;
        r1 = r1.b;
        r1 = (defpackage.ayhz) r1;
        r5 = new iqg;
        r5.<init>(r7);
        r4.a(r1, r5);
    L_0x00ed:
        r9 = defpackage.akcm.a(r9);
        r9 = defpackage.gwa.a(r9);
        r7.x = r9;
        r7.c = r8;
        r8 = r7.c;
        r8 = r8.a;
        if (r8 == 0) goto L_0x0112;
    L_0x00ff:
        r8 = r8.e;
        if (r8 == 0) goto L_0x0112;
    L_0x0103:
        r9 = r8.a;
        r1 = 188186167; // 0xb377e37 float:3.5339471E-32 double:9.297632E-316;
        if (r9 != r1) goto L_0x010f;
    L_0x010a:
        r8 = r8.b;
        r8 = (defpackage.axdi) r8;
        goto L_0x0113;
    L_0x010f:
        r8 = defpackage.axdi.c;
        goto L_0x0113;
    L_0x0112:
        r8 = r3;
    L_0x0113:
        if (r8 != 0) goto L_0x0116;
    L_0x0115:
        goto L_0x0153;
    L_0x0116:
        r9 = r8.b;
        if (r9 != 0) goto L_0x011c;
    L_0x011a:
        r9 = defpackage.axak.a;
    L_0x011c:
        r1 = com.google.protos.youtube.api.innertube.SimpleSearchFilterGroupRendererOuterClass.simpleSearchFilterGroupRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r9.a(r1);
        r9 = r9.h;
        r1 = r1.d;
        r9 = r9.a(r1);
        if (r9 != 0) goto L_0x0130;
    L_0x012f:
        goto L_0x0153;
    L_0x0130:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0136;
    L_0x0134:
        r8 = defpackage.axak.a;
    L_0x0136:
        r9 = com.google.protos.youtube.api.innertube.SimpleSearchFilterGroupRendererOuterClass.simpleSearchFilterGroupRenderer;
        r9 = defpackage.anxl.checkIsLite(r9);
        r8.a(r9);
        r8 = r8.h;
        r1 = r9.d;
        r8 = r8.b(r1);
        if (r8 != 0) goto L_0x014c;
    L_0x0149:
        r8 = r9.b;
        goto L_0x0150;
    L_0x014c:
        r8 = r9.a(r8);
    L_0x0150:
        r3 = r8;
        r3 = (defpackage.axny) r3;
    L_0x0153:
        r7.u = r3;
        r8 = r7.u;
        if (r8 == 0) goto L_0x015a;
    L_0x0159:
        goto L_0x015b;
    L_0x015a:
        r0 = 0;
    L_0x015b:
        r7.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.a(aafk, boolean):void");
    }

    private final void a(boolean z) {
        isa isa = this.A;
        if (isa != null) {
            isa.a(z);
        }
    }

    public final void i() {
        if (!(this.t == null || this.z == null)) {
            apxu apxu = this.s;
            if (apxu != null) {
                apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                apxx.a(avjd.b, this.z);
                this.s = (apxu) ((anxl) apxx.build());
            }
        }
        this.p.a(acwl.am, acww.DEFAULT, this.s);
        this.p.b(acwc.SEARCH_BOX, null);
        this.p.b(acwc.MOBILE_BACK_BUTTON, null);
        this.F.b(this.p.c().a);
        this.F.a(acwc.SEARCH_BOX.dU);
    }

    public final /* bridge */ /* synthetic */ String e() {
        return this.x;
    }

    public final /* bridge */ /* synthetic */ List f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ axny g() {
        return this.u;
    }
}
