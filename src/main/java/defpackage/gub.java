package defpackage;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gub */
public class gub extends fja implements akxw, ejc, kzn, kzp, kzq, wqt, xcp {
    public haf aA;
    public akkq aB;
    public xoi aC;
    public xsc aD;
    public bcaa aE;
    public xci aF;
    public epf aG;
    public afxb aH;
    public Handler aI;
    public bcaa aJ;
    public afqv aK;
    public eod aL;
    public afwx aM;
    public AppTabsBar aN;
    public lao aO;
    public lbf aP;
    public lbd aQ;
    public lay aR;
    public lau aS;
    public lba aT;
    public lbj aU;
    public kyp aV;
    public lbx aW;
    public gab aX;
    public eoa aY;
    public aaas aZ;
    public ebs ae;
    public edl af;
    public Resources ag;
    public gur ah;
    public SpecificNetworkErrorViewLoadingFrameLayout ai;
    public fal aj;
    public lbw ak;
    public ffg al;
    public aaff am;
    public apxu an;
    public String ao;
    public int ap;
    public boolean aq;
    public long ar;
    public byte[] as;
    public ezq at;
    public jpa au;
    public guv av;
    public boolean aw;
    public boolean ax;
    public ebk ay;
    public aapn az;
    public SharedPreferences bA;
    public afve bB;
    public eif bC;
    public bcaa bD;
    public ScheduledExecutorService bE;
    public fev bF;
    public bcaa bG;
    public bcaa bH;
    public bcaa bI;
    public bcaa bJ;
    public kye bK;
    public acxw bL;
    public eit bM;
    public jqn bN;
    public afuu bO;
    public syb bP;
    public akve bQ;
    public gvc bR;
    public acxt bS;
    public AtomicBoolean bT;
    public apxu bU;
    public boolean bV;
    public int bW = 0;
    public int bX = 0;
    private gtz bY;
    private gux bZ;
    public bcaa ba;
    public jps bb;
    public jjp bc;
    public alss bd;
    public jke be;
    public jnt bf;
    public lbv bg;
    public xpa bh;
    public wqq bi;
    public guz bj;
    public zyw bk;
    public zzl bl;
    public ebp bm;
    public jtx bn;
    public hdm bo;
    public hdi bp;
    public zeb bq;
    public afql br;
    public InlinePlayerLayout bs;
    public akpe bt;
    public gvh bu;
    public jij bv;
    public alcb bw;
    public hnl bx;
    public hng by;
    public acum bz;
    private guo ca;
    private afsw cb;
    private akwb cc;
    private kzo cd;
    private CharSequence ce;
    private boolean cf;
    private boolean cg;
    private akbc ch;
    private final List ci = new ArrayList();
    private jif cj;
    private akyd ck;
    private faa cl;
    private boolean cm;
    private akpk cn;
    private int co;
    private boolean cp = false;
    private Set cq;
    private long cr;
    private boolean cs;
    private ScheduledFuture ct;
    private ViewGroup cu;
    private final OnLayoutChangeListener cv = new gua(this);

    /* Access modifiers changed, original: protected */
    public void a(akxv akxv) {
    }

    public final boolean ap_() {
        return true;
    }

    public static boolean a(fiw fiw) {
        return gub.class.isAssignableFrom(fiw.a);
    }

    public static boolean c(fiw fiw) {
        apxu a = fiw.a();
        if (gub.a(fiw)) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ("SPunlimited".equals(((apge) obj).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(fiw fiw) {
        return gub.a(fiw) && fix.a(fiw.a());
    }

    public static boolean e(fiw fiw) {
        apxu a = fiw.a();
        if (gub.a(fiw)) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ("FEwhat_to_watch".equals(((apge) obj).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(fiw fiw) {
        apxu a = fiw.a();
        if (gub.a(fiw)) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ("FEhistory".equals(((apge) obj).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(fiw fiw) {
        apxu a = fiw.a();
        if (gub.a(fiw)) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ("FElibrary".equals(((apge) obj).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(fiw fiw) {
        apxu a = fiw.a();
        if (gub.a(fiw)) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            if (a.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ("FEhistory".equals(((apge) obj).b)) {
                    access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                    a.a(access$000);
                    Object b2 = a.h.b(access$000.d);
                    if (b2 == null) {
                        obj = access$000.b;
                    } else {
                        obj = access$000.a(b2);
                    }
                    if (((apge) obj).d.length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static fiw a(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        return gub.a(apxu, fix.a(apxu));
    }

    public static fiw a(apxu apxu, boolean z) {
        return gub.a(apxu, z, false);
    }

    public static fiw a(apxu apxu, boolean z, boolean z2) {
        amqw.a((Object) apxu);
        Bundle b = fiw.b();
        b.putBoolean("home_pane", z);
        b.putBoolean("detail_pane", z2);
        b.putInt("network_connectivity_requirement", 2);
        if (z) {
            return fiw.a(gwd.class, apxu, b);
        }
        return fiw.a(gub.class, apxu, b);
    }

    public final void b(Bundle bundle) {
        this.cr = SystemClock.elapsedRealtime();
        super.b(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0484  */
    /* JADX WARNING: Missing block: B:11:0x0041, code skipped:
            if (((defpackage.avjf) r4).b.isEmpty() == false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:62:0x046b, code skipped:
            if (r3.h.a(r1.d) == false) goto L_0x046d;
     */
    public android.view.View a(android.view.LayoutInflater r26, android.view.ViewGroup r27, android.os.Bundle r28) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r27;
        r2 = r28;
        r3 = r25.q();
        r0.ag = r3;
        if (r2 != 0) goto L_0x0011;
    L_0x000e:
        r3 = r0.j;
        goto L_0x0012;
    L_0x0011:
        r3 = r2;
    L_0x0012:
        r4 = "navigation_endpoint";
        r3 = r3.getByteArray(r4);
        r3 = defpackage.aaax.b(r3);
        if (r2 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0044;
    L_0x001f:
        r4 = defpackage.avjd.b;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r5 = r3.h;
        r6 = r4.d;
        r5 = r5.b(r6);
        if (r5 != 0) goto L_0x0035;
    L_0x0032:
        r4 = r4.b;
        goto L_0x0039;
    L_0x0035:
        r4 = r4.a(r5);
    L_0x0039:
        r4 = (defpackage.avjf) r4;
        r4 = r4.b;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x007b;
    L_0x0044:
        r4 = r0.j;
        r5 = "navigation_endpoint_interaction_logging_extension";
        r4 = r4.getByteArray(r5);
        if (r4 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x007b;
    L_0x004f:
        r5 = defpackage.avjf.h;
        r5 = r5.createBuilder();
        r5 = (defpackage.avjh) r5;
        r6 = defpackage.anxa.c();	 Catch:{ anyg -> 0x005e }
        r5.mergeFrom(r4, r6);	 Catch:{ anyg -> 0x005e }
    L_0x005e:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.apxx) r3;
        r4 = defpackage.avjd.b;
        r5 = r5.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.avjf) r5;
        r3.a(r4, r5);
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.apxu) r3;
    L_0x007b:
        r0.an = r3;
        r25.al();
        r4 = r0.bA;
        r4 = defpackage.fmv.a(r4);
        r0.co = r4;
        if (r1 == 0) goto L_0x009d;
    L_0x008a:
        r0.cu = r1;
        r4 = r27.getWidth();
        r0.bW = r4;
        r4 = r27.getHeight();
        r0.bX = r4;
        r4 = r0.cv;
        r1.addOnLayoutChangeListener(r4);
    L_0x009d:
        r4 = r25.aG();
        if (r4 != 0) goto L_0x00a7;
    L_0x00a3:
        r4 = 2131034248; // 0x7f050088 float:1.7679008E38 double:1.052870812E-314;
        goto L_0x00aa;
    L_0x00a7:
        r4 = 2131034250; // 0x7f05008a float:1.7679012E38 double:1.052870813E-314;
    L_0x00aa:
        r5 = 0;
        r6 = r26;
        r1 = r6.inflate(r4, r1, r5);
        r1 = (com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout) r1;
        r0.ai = r1;
        r1 = r0.bF;
        r4 = r0.ai;
        r6 = r25.t();
        r7 = r1.d;
        if (r7 == 0) goto L_0x00c4;
    L_0x00c1:
        r1.a();
    L_0x00c4:
        r1.e = r0;
        r1.c = r6;
        r1 = r1.a;
        r1.a(r4);
        r6 = r0.cr;
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x00e3;
    L_0x00d5:
        r1 = r0.bm;
        r1 = r1.a;
        r4 = new eer;
        r4.<init>(r6);
        r1.d(r4);
        r0.cr = r8;
    L_0x00e3:
        r1 = new java.util.HashSet;
        r1.<init>();
        r0.cq = r1;
        r1 = r0.bu;
        r4 = r0.cq;
        r15 = new gvc;
        r6 = r1.a;
        r6 = r6.get();
        r6 = (android.content.Context) r6;
        r14 = 1;
        r6 = defpackage.gvh.a(r6, r14);
        r7 = r6;
        r7 = (android.content.Context) r7;
        r6 = r1.b;
        r6 = r6.get();
        r6 = (defpackage.xoi) r6;
        r13 = 2;
        r6 = defpackage.gvh.a(r6, r13);
        r8 = r6;
        r8 = (defpackage.xoi) r8;
        r6 = r1.c;
        r6 = r6.get();
        r6 = (defpackage.kyp) r6;
        r12 = 3;
        r6 = defpackage.gvh.a(r6, r12);
        r9 = r6;
        r9 = (defpackage.kyp) r9;
        r6 = r1.d;
        r6 = r6.get();
        r6 = (defpackage.kmc) r6;
        r11 = 4;
        r6 = defpackage.gvh.a(r6, r11);
        r10 = r6;
        r10 = (defpackage.kmc) r10;
        r6 = r1.e;
        r6 = r6.get();
        r6 = (defpackage.fcb) r6;
        r5 = 5;
        r6 = defpackage.gvh.a(r6, r5);
        r16 = r6;
        r16 = (defpackage.fcb) r16;
        r6 = r1.f;
        r6 = r6.get();
        r6 = (defpackage.fcs) r6;
        r5 = 6;
        r6 = defpackage.gvh.a(r6, r5);
        r17 = r6;
        r17 = (defpackage.fcs) r17;
        r6 = r1.g;
        r6 = r6.get();
        r6 = (defpackage.acwa) r6;
        r5 = 7;
        r6 = defpackage.gvh.a(r6, r5);
        r18 = r6;
        r18 = (defpackage.acwa) r18;
        r6 = r1.h;
        r6 = r6.get();
        r6 = (defpackage.alcb) r6;
        r11 = 8;
        r6 = defpackage.gvh.a(r6, r11);
        r20 = r6;
        r20 = (defpackage.alcb) r20;
        r6 = r1.i;
        r6 = r6.get();
        r6 = (defpackage.fnh) r6;
        r11 = 9;
        r6 = defpackage.gvh.a(r6, r11);
        r21 = r6;
        r21 = (defpackage.fnh) r21;
        r6 = r1.j;
        r6 = r6.get();
        r6 = (defpackage.aaas) r6;
        r11 = 10;
        r6 = defpackage.gvh.a(r6, r11);
        r22 = r6;
        r22 = (defpackage.aaas) r22;
        r6 = r1.k;
        r6 = r6.get();
        r6 = (defpackage.fni) r6;
        r11 = 11;
        r6 = defpackage.gvh.a(r6, r11);
        r23 = r6;
        r23 = (defpackage.fni) r23;
        r6 = r1.l;
        r6 = r6.get();
        r6 = (defpackage.eig) r6;
        r11 = 12;
        r6 = defpackage.gvh.a(r6, r11);
        r24 = r6;
        r24 = (defpackage.eig) r24;
        r6 = 13;
        r4 = defpackage.gvh.a(r4, r6);
        r4 = (java.util.Set) r4;
        r1 = r1.m;
        r1 = r1.get();
        r1 = (defpackage.lci) r1;
        r6 = 14;
        r1 = defpackage.gvh.a(r1, r6);
        r1 = (defpackage.lci) r1;
        r6 = r15;
        r5 = 4;
        r11 = r16;
        r5 = 3;
        r12 = r17;
        r5 = 2;
        r13 = r18;
        r5 = 1;
        r14 = r20;
        r5 = r15;
        r15 = r21;
        r16 = r22;
        r17 = r23;
        r18 = r24;
        r19 = r4;
        r20 = r1;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        r0.bR = r5;
        r1 = new guo;
        r1.<init>(r0);
        r0.ca = r1;
        r1 = new gug;
        r1.<init>(r0);
        r0.cb = r1;
        r1 = new gur;
        r1.<init>(r0);
        r0.ah = r1;
        r1 = new gtz;
        r5 = r25.p();
        r6 = r0.az;
        r7 = r0.bR;
        r8 = r0.bB;
        r9 = r0.bk;
        r10 = r0.bG;
        r11 = r0.bl;
        r12 = r0.bH;
        r4 = r1;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);
        r0.bY = r1;
        r1 = r0.ai;
        r4 = new guw;
        r4.<init>(r0);
        r1.a(r4);
        r1 = r0.aL;
        r4 = r0.bY;
        r5 = r25.t();
        r1 = r1.a(r4, r5);
        r0.cc = r1;
        r1 = r25.aG();
        if (r1 != 0) goto L_0x0242;
    L_0x0241:
        goto L_0x029a;
    L_0x0242:
        if (r2 != 0) goto L_0x029a;
    L_0x0244:
        r1 = 1;
        r0.cf = r1;
        r1 = r0.ag;
        r4 = 2131558606; // 0x7f0d00ce float:1.8742533E38 double:1.0531298793E-314;
        r1 = r1.getColor(r4);
        r4 = r0.ab;
        r4 = r4.b;
        r4 = r4.k();
        r5 = r0.ag;
        r6 = 2131559398; // 0x7f0d03e6 float:1.8744139E38 double:1.0531302706E-314;
        r5 = r5.getColor(r6);
        r5 = defpackage.ezo.a(r5);
        r4 = r4.a(r5);
        r5 = r0.ag;
        r6 = 2131559405; // 0x7f0d03ed float:1.8744153E38 double:1.053130274E-314;
        r5 = r5.getColor(r6);
        r5 = defpackage.ezo.a(r5);
        r4 = r4.b(r5);
        r5 = defpackage.ezo.a(r1);
        r4 = r4.c(r5);
        r5 = defpackage.ezo.a(r1);
        r4 = r4.d(r5);
        r1 = defpackage.ezo.a(r1);
        r1 = r4.e(r1);
        r1 = r1.a();
        r0.cl = r1;
        goto L_0x0328;
    L_0x029a:
        r1 = r0.at;
        r1 = r1.g();
        r0.cf = r1;
        r1 = r0.at;
        r1 = r1.h();
        r4 = r0.at;
        r4 = r4.i();
        r5 = r0.ag;
        r6 = 2131559505; // 0x7f0d0451 float:1.8744356E38 double:1.0531303235E-314;
        r5 = r5.getColor(r6);
        r6 = r0.ag;
        r7 = 2131559506; // 0x7f0d0452 float:1.8744358E38 double:1.053130324E-314;
        r6 = r6.getColor(r7);
        if (r2 == 0) goto L_0x02f2;
    L_0x02c2:
        r1 = r0.a;
        r4 = "instance_action_bar_color";
        r4 = r2.getBundle(r4);
        r1 = defpackage.ezo.a(r1, r4);
        r4 = r0.a;
        r5 = "instance_status_bar_color";
        r5 = r2.getBundle(r5);
        r4 = defpackage.ezo.a(r4, r5);
        r5 = r0.a;
        r6 = "instance_activated_text_color";
        r6 = r2.getBundle(r6);
        r5 = defpackage.ezo.a(r5, r6);
        r6 = r0.a;
        r7 = "instance_secondary_text_color";
        r7 = r2.getBundle(r7);
        r6 = defpackage.ezo.a(r6, r7);
    L_0x02f2:
        r7 = r0.ab;
        r7 = r7.b;
        r7 = r7.k();
        r8 = defpackage.ezo.a(r1);
        r7 = r7.a(r8);
        r1 = defpackage.ezo.a(r1);
        r1 = r7.a(r1);
        r4 = defpackage.ezo.a(r4);
        r1 = r1.b(r4);
        r4 = defpackage.ezo.a(r5);
        r1 = r1.c(r4);
        r4 = defpackage.ezo.a(r6);
        r1 = r1.d(r4);
        r1 = r1.a();
        r0.cl = r1;
    L_0x0328:
        r1 = r0.bs;
        r4 = 0;
        r1.c = r4;
        r1 = r0.bg;
        r4 = r25.t();
        r5 = 2131953685; // 0x7f130815 float:1.9543848E38 double:1.0533250743E-314;
        r5 = r0.a(r5);
        r14 = new lbw;
        r6 = r1.a;
        r6 = r6.get();
        r6 = (defpackage.fmx) r6;
        r7 = 1;
        r6 = defpackage.lbv.a(r6, r7);
        r7 = r6;
        r7 = (defpackage.fmx) r7;
        r6 = r1.b;
        r6 = r6.get();
        r6 = (defpackage.akvp) r6;
        r8 = 2;
        r6 = defpackage.lbv.a(r6, r8);
        r8 = r6;
        r8 = (defpackage.akvp) r8;
        r6 = r1.c;
        r6 = r6.get();
        r6 = (defpackage.afwx) r6;
        r9 = 3;
        r6 = defpackage.lbv.a(r6, r9);
        r9 = r6;
        r9 = (defpackage.afwx) r9;
        r6 = r1.d;
        r6 = r6.get();
        r6 = (defpackage.akpi) r6;
        r10 = 4;
        r6 = defpackage.lbv.a(r6, r10);
        r10 = r6;
        r10 = (defpackage.akpi) r10;
        r1 = r1.e;
        r1 = r1.get();
        r1 = (defpackage.zzl) r1;
        r6 = 5;
        r1 = defpackage.lbv.a(r1, r6);
        r11 = r1;
        r11 = (defpackage.zzl) r11;
        r1 = 6;
        r1 = defpackage.lbv.a(r4, r1);
        r12 = r1;
        r12 = (defpackage.acvx) r12;
        r1 = 7;
        r1 = defpackage.lbv.a(r5, r1);
        r13 = r1;
        r13 = (java.lang.String) r13;
        r6 = r14;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13);
        r0.ak = r14;
        r1 = r0.bZ;
        if (r1 == 0) goto L_0x043b;
    L_0x03a6:
        r1 = r1.a;
        if (r1 == 0) goto L_0x043b;
    L_0x03aa:
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x043b;
    L_0x03b0:
        r1 = r25.aO();
        if (r1 == 0) goto L_0x03b8;
    L_0x03b6:
        goto L_0x043b;
    L_0x03b8:
        r25.aw();
        r1 = r0.bZ;
        r1 = r1.i;
        r0.as = r1;
        r1 = r25.t();
        r4 = r0.as;
        r1.a(r4);
        r1 = r0.bZ;
        r1 = r1.d;
        r0.am = r1;
        r1 = r0.am;
        if (r1 == 0) goto L_0x03db;
    L_0x03d4:
        r1 = r0.a(r1);
        r0.a(r1);
    L_0x03db:
        r25.ay();
        r1 = r0.bZ;
        r4 = r1.e;
        r0.ce = r4;
        r4 = r1.m;
        r0.ck = r4;
        r4 = r1.a;
        r1 = r1.c;
        r5 = r25.ax();
        r6 = r0.bZ;
        r6 = r6.b;
        r0.a(r4, r1, r5, r6);
        r1 = r0.ak;
        r1 = r1.d();
        if (r1 == 0) goto L_0x0402;
    L_0x03ff:
        r1.d();
    L_0x0402:
        r1 = r0.ai;
        r1.c();
        r1 = r0.bZ;
        r4 = r1.f;
        r0.cf = r4;
        r4 = r1.g;
        r0.cg = r4;
        r4 = r1.h;
        r0.ar = r4;
        r4 = r1.k;
        r0.cm = r4;
        r4 = r1.l;
        r0.bU = r4;
        r1 = r1.j;
        r0.cl = r1;
        r1 = 0;
        r0.aq = r1;
        r1 = new java.util.concurrent.atomic.AtomicBoolean;
        r4 = 1;
        r1.<init>(r4);
        r0.bT = r1;
        r1 = r0.bK;
        r5 = r0.am;
        r5 = r5.a;
        r5 = r5.l;
        r1.b(r5);
        r0.i(r4);
        goto L_0x0446;
    L_0x043b:
        r4 = 1;
        r0.aq = r4;
        r1 = new java.util.concurrent.atomic.AtomicBoolean;
        r4 = 0;
        r1.<init>(r4);
        r0.bT = r1;
    L_0x0446:
        r1 = r0.ak;
        r4 = r0.b;
        if (r4 != 0) goto L_0x0453;
    L_0x044c:
        r4 = new java.util.HashSet;
        r4.<init>();
        r0.b = r4;
    L_0x0453:
        r4 = r0.b;
        r4.add(r1);
        if (r3 == 0) goto L_0x046d;
    L_0x045a:
        r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r3.a(r1);
        r3 = r3.h;
        r1 = r1.d;
        r1 = r3.a(r1);
        if (r1 != 0) goto L_0x0472;
    L_0x046d:
        r1 = "Browse Fragment was given a navigation endpoint without browse data.";
        defpackage.xtl.c(r1);
    L_0x0472:
        r1 = r0.a;
        r1 = r1.getWindow();
        r1 = r1.getDecorView();
        r3 = 32;
        r1.sendAccessibilityEvent(r3);
        if (r2 != 0) goto L_0x0484;
    L_0x0483:
        goto L_0x0497;
    L_0x0484:
        r1 = r0.bA;
        r1 = defpackage.fmv.a(r1);
        r3 = "PREVIOUS_THEME";
        r2 = r2.getInt(r3, r1);
        if (r1 == r2) goto L_0x0497;
    L_0x0492:
        r1 = 1;
        r0.aq = r1;
        r0.cp = r1;
    L_0x0497:
        r1 = r0.ai;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void a(ajrr ajrr) {
        apxu[] apxuArr = ajrr.h;
        if (apxuArr != null) {
            this.aZ.a(apxuArr, null);
        }
        apxu[] apxuArr2 = ajrr.i;
        if (apxuArr2 != null) {
            this.aZ.a(apxuArr2, null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int f() {
        return this.ai.f;
    }

    public boolean ak() {
        return f() == 5 || this.bV;
    }

    /* Access modifiers changed, original: protected */
    public void al() {
        ((gup) xse.a(p())).a(new gvd()).a(this);
    }

    private final boolean aG() {
        return aR() == 3 && !wvl.a(this.bk);
    }

    /* Access modifiers changed, original: protected|final */
    public final void am() {
        for (enx a : this.ci) {
            a.a(1);
        }
    }

    /* Access modifiers changed, original: protected */
    public void an() {
        this.aj.a(new gus(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    public final void ao() {
        /*
        r4 = this;
        r0 = r4.v();
        if (r0 == 0) goto L_0x004d;
    L_0x0006:
        r0 = r4.al;
        r1 = r4.cd;
        r2 = r1 instanceof defpackage.laz;
        r3 = 0;
        if (r2 == 0) goto L_0x002c;
    L_0x000f:
        r1 = (defpackage.laz) r1;
        if (r1 == 0) goto L_0x002c;
    L_0x0013:
        r2 = new ffh;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0027;
    L_0x0019:
        r1 = (defpackage.ajxx) r1;
        r1 = r1.v;
        if (r1 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0027;
    L_0x0020:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0028;
    L_0x0024:
        r1 = defpackage.artk.f;
        goto L_0x0028;
    L_0x0027:
        r1 = r3;
    L_0x0028:
        r2.<init>(r1);
        goto L_0x002d;
    L_0x002c:
        r2 = r3;
    L_0x002d:
        if (r2 != 0) goto L_0x0040;
    L_0x002f:
        r1 = r4.au();
        if (r1 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0041;
    L_0x0036:
        r1 = r1.a;
        if (r1 == 0) goto L_0x0041;
    L_0x003a:
        r3 = new ffe;
        r3.<init>(r1);
        goto L_0x0041;
    L_0x0040:
        r3 = r2;
    L_0x0041:
        r1 = r4.t();
        defpackage.amqw.a(r1);
        r0.m = r1;
        r0.a(r3);
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.ao():void");
    }

    public final void a(boolean z) {
        this.al.a(z);
    }

    public final void W_() {
        this.bm.a.d(new eet());
        super.W_();
        this.aF.a(this.aE.get());
        this.aF.a(this.bx);
        this.aF.a(this.by);
        if (aH()) {
            this.bC.a(this);
        }
        if (aH() && this.bC.c().c()) {
            this.cs = false;
        } else {
            aI();
        }
        this.aF.a((Object) this, gub.class);
        kzo kzo = this.cd;
        if (kzo != null) {
            kzo.a();
        }
        lbw lbw = this.ak;
        if (lbw != null) {
            lbw.h = false;
            lbw.d.a(lbw, -1);
            akwy d = lbw.d();
            if (d != null) {
                d.d();
                akwl akwl = d.h.b;
                if (akwl != null && (akwl.a instanceof akuv)) {
                    akwm akwm = akwl.e;
                    if (akwm != null) {
                        akwm.G_();
                    }
                }
            }
        }
        this.ap = 0;
        this.aI.postDelayed(new gud(this), 500);
        this.aF.a(this.bp);
        ao();
        this.bi.a((wqt) this);
    }

    public final void B() {
        this.bm.a.d(new eeu());
        super.B();
    }

    private final boolean aH() {
        return foh.s(this.bk) != 0 && TextUtils.equals(aapu.a(aq()), "FEwhat_to_watch");
    }

    private final void aI() {
        this.cs = true;
        long b = this.aD.b();
        long j = this.ar;
        if (!this.aq && b <= j && this.cm == this.br.a()) {
            a(false, false, this.ar - b);
            if (this.bT.get()) {
                as();
                return;
            }
        }
        g(aO());
    }

    public final void N_() {
        super.N_();
        aK();
        if (aH()) {
            this.bC.b(this);
        }
        this.aF.b(this);
        kzo kzo = this.cd;
        if (kzo != null) {
            kzo.b();
        }
        afwz afwz = this.ak;
        if (afwz != null) {
            afwz.d.a(afwz);
            akwy d = afwz.d();
            if (d != null) {
                d.m();
            }
        }
        at();
        guv guv = this.av;
        if (guv != null) {
            guv.a();
        }
        this.aF.b(this.bp);
        this.an = aq();
        this.aF.b(this.aE.get());
        this.aF.b(this.bx);
        this.aF.b(this.by);
        this.al.a(null);
        this.bi.b(this);
    }

    public final void i() {
        super.i();
        ViewGroup viewGroup = this.cu;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.cv);
            this.cu = null;
        }
        guo guo = this.ca;
        if (guo != null) {
            guo.a = true;
            guo.b.ah.a();
            arvt b = this.bl.b();
            if (b != null) {
                aydo aydo = b.x;
                if (aydo == null) {
                    aydo = aydo.c;
                }
                if (aydo.b) {
                    this.aA.d();
                }
            }
        }
        fev fev = this.bF;
        if (fev.d) {
            fev.a();
        }
        fev.e = null;
        fev.c = acvx.g;
        fev.d = false;
        jqn jqn = this.bN;
        if (jqn != null) {
            jqn.f();
        }
        this.bs.c = true;
        this.bO.a();
    }

    public final void X_() {
        super.X_();
        for (enx a : this.ci) {
            a.a();
        }
        aeh aeh = this.bj.e;
        if (aeh != null) {
            aeh.dismiss();
        }
    }

    public void e(Bundle bundle) {
        if (aq() != null) {
            bundle.putByteArray("navigation_endpoint", aq().toByteArray());
        }
        bundle.putBundle("instance_action_bar_color", this.cl.a().a());
        bundle.putBundle("instance_status_bar_color", this.cl.b().a());
        bundle.putBundle("instance_activated_text_color", this.cl.d().a());
        bundle.putBundle("instance_secondary_text_color", this.cl.f().a());
        bundle.putInt("PREVIOUS_THEME", this.co);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fal fal = this.aj;
        if (fal != null) {
            fal.d();
        }
        lbw lbw = this.ak;
        if (lbw != null) {
            for (lbt lbt : lbw.b) {
                lbt.c.a(configuration);
                jmz jmz = lbt.d;
                if (jmz != null && jmz.f) {
                    jmz.a(configuration.orientation);
                }
            }
        }
        if (f() == 5 || f() == 6) {
            SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = this.ai;
            FrameLayout frameLayout = specificNetworkErrorViewLoadingFrameLayout.d;
            if (frameLayout != null) {
                specificNetworkErrorViewLoadingFrameLayout.removeView(frameLayout);
                specificNetworkErrorViewLoadingFrameLayout.a();
                specificNetworkErrorViewLoadingFrameLayout.e.a();
                specificNetworkErrorViewLoadingFrameLayout.d.setVisibility(0);
            }
            this.ai.a(new guw(this));
        }
        if (aQ()) {
            View z = z();
            RecyclerView recyclerView = z != null ? (RecyclerView) z.findViewById(R.id.results) : null;
            if (recyclerView != null) {
                double f = (double) xss.f(this.a);
                Double.isNaN(f);
                int i = (int) (f * 0.175d);
                recyclerView.setPadding(i, 0, i, 0);
            }
        }
        this.bO.a();
    }

    /* Access modifiers changed, original: protected */
    public boolean ap() {
        if (this.ak != null) {
            if (!TextUtils.equals("FEactivity", aapu.a(this.an))) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final apxu aq() {
        if (ap()) {
            akbc e = this.ak.e();
            if (!(e == null || e.a == null || e.equals(this.ch))) {
                return e.a;
            }
        }
        return this.an;
    }

    public final void ar() {
        this.c = null;
        this.at.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    private final void a(boolean r12, boolean r13, long r14) {
        /*
        r11 = this;
        r0 = r11.aq();
        r0 = defpackage.aapu.a(r0);
        r1 = 5;
        r2 = 3;
        r3 = -1;
        r4 = 4;
        r5 = 2;
        r6 = 1;
        if (r0 == 0) goto L_0x0060;
    L_0x0010:
        r7 = r0.hashCode();
        switch(r7) {
            case -1806723300: goto L_0x0040;
            case -381996905: goto L_0x0036;
            case 363605732: goto L_0x002c;
            case 1012886772: goto L_0x0022;
            case 1038153415: goto L_0x0018;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x004a;
    L_0x0018:
        r7 = "FEwhat_to_watch";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x0020:
        r0 = 0;
        goto L_0x004b;
    L_0x0022:
        r7 = "FEexplore";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x002a:
        r0 = 4;
        goto L_0x004b;
    L_0x002c:
        r7 = "FEtrending";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x0034:
        r0 = 1;
        goto L_0x004b;
    L_0x0036:
        r7 = "FEsubscriptions";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x003e:
        r0 = 2;
        goto L_0x004b;
    L_0x0040:
        r7 = "FElibrary";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x0048:
        r0 = 3;
        goto L_0x004b;
    L_0x004a:
        r0 = -1;
    L_0x004b:
        if (r0 == 0) goto L_0x005e;
    L_0x004d:
        if (r0 == r6) goto L_0x005c;
    L_0x004f:
        if (r0 == r5) goto L_0x005a;
    L_0x0051:
        if (r0 == r2) goto L_0x0058;
    L_0x0053:
        if (r0 == r4) goto L_0x0056;
    L_0x0055:
        goto L_0x0060;
    L_0x0056:
        r0 = 6;
        goto L_0x0061;
    L_0x0058:
        r0 = 5;
        goto L_0x0061;
    L_0x005a:
        r0 = 4;
        goto L_0x0061;
    L_0x005c:
        r0 = 3;
        goto L_0x0061;
    L_0x005e:
        r0 = 2;
        goto L_0x0061;
    L_0x0060:
        r0 = 1;
    L_0x0061:
        if (r0 == r6) goto L_0x0104;
    L_0x0063:
        if (r13 == 0) goto L_0x007c;
    L_0x0065:
        r7 = r11.ar;
        r9 = 0;
        r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r13 == 0) goto L_0x0079;
    L_0x006d:
        if (r12 != 0) goto L_0x0076;
    L_0x006f:
        r12 = r11.aq;
        if (r12 != 0) goto L_0x0074;
    L_0x0073:
        goto L_0x007e;
    L_0x0074:
        r12 = 1;
        goto L_0x0082;
    L_0x0076:
        r12 = 1;
        r1 = 4;
        goto L_0x0082;
    L_0x0079:
        r12 = 1;
        r1 = 2;
        goto L_0x0082;
    L_0x007c:
        if (r12 == 0) goto L_0x0080;
    L_0x007e:
        r12 = 1;
        goto L_0x0081;
    L_0x0080:
        r12 = 2;
    L_0x0081:
        r1 = 1;
    L_0x0082:
        r13 = defpackage.auls.g;
        r13 = r13.createBuilder();
        r13 = (defpackage.aulr) r13;
        r13.copyOnWrite();
        r2 = r13.instance;
        r2 = (defpackage.auls) r2;
        r7 = r2.a;
        r6 = r6 | r7;
        r2.a = r6;
        r0 = r0 + r3;
        r2.b = r0;
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.auls) r0;
        r2 = r0.a;
        r2 = r2 | r5;
        r0.a = r2;
        r0.c = r5;
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.auls) r0;
        r2 = r0.a;
        r2 = r2 | r4;
        r0.a = r2;
        r1 = r1 + r3;
        r0.d = r1;
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.auls) r0;
        r1 = r0.a;
        r1 = r1 | 8;
        r0.a = r1;
        r12 = r12 + r3;
        r0.e = r12;
        r12 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r14 = r12.toMinutes(r14);
        r13.copyOnWrite();
        r12 = r13.instance;
        r12 = (defpackage.auls) r12;
        r0 = r12.a;
        r0 = r0 | 16;
        r12.a = r0;
        r15 = (int) r14;
        r12.f = r15;
        r12 = defpackage.asmw.f;
        r12 = r12.createBuilder();
        r12 = (defpackage.asmz) r12;
        r12.copyOnWrite();
        r14 = r12.instance;
        r14 = (defpackage.asmw) r14;
        r13 = r13.build();
        r13 = (defpackage.anxl) r13;
        r14.c = r13;
        r13 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r14.b = r13;
        r12 = r12.build();
        r12 = (defpackage.anxl) r12;
        r12 = (defpackage.asmw) r12;
        r13 = r11.bz;
        r13.a(r12);
    L_0x0104:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.a(boolean, boolean, long):void");
    }

    public final CharSequence Y() {
        return this.ce;
    }

    public final ezz W() {
        ezz ezz = this.c;
        if (ezz != null) {
            return ezz;
        }
        amuv i;
        fag a = this.au.a();
        amuw amuw = a.a;
        kzo kzo = this.cd;
        if (kzo != null) {
            amuw = kzo.a(amuw);
        }
        if (this.aw) {
            i = amuw.i();
            i.c((ezu) this.ba.get());
            i.b(amuw);
            amuw = i.a();
        }
        if (this.ax) {
            i = amuw.i();
            i.b(this.bb.a());
            i.b(amuw);
            amuw = i.a();
        }
        if (TextUtils.equals("FEconnections", aapu.a(this.an))) {
            amuw = amwp.a;
        }
        Object c = aJ() ? this.cd.c() : null;
        boolean z = false;
        if (c != null && this.cd.d()) {
            z = true;
        }
        faf i2 = a.i();
        i2.a = this.ce;
        i2.a(amuw);
        i2.d = this.cf;
        i2.e = this.cg;
        i2.c = this.cl;
        i2.f = c;
        i2.g = z;
        return i2.a();
    }

    private final boolean aJ() {
        kzo kzo = this.cd;
        return (kzo == null || kzo.c() == null) ? false : true;
    }

    public final String Z() {
        return this.ao;
    }

    /* JADX WARNING: Missing block: B:3:0x0014, code skipped:
            if (r0.b.c != false) goto L_0x0024;
     */
    public final boolean ab() {
        /*
        r5 = this;
        r0 = r5.bR;
        r1 = r0.b;
        r1 = r1.c();
        r2 = 1;
        if (r1 == 0) goto L_0x0017;
    L_0x000b:
        r1 = r0.b;
        r1.b();
        r1 = r0.b;
        r1 = r1.c;
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0024;
    L_0x0017:
        r1 = r0.f;
        r1 = r1.c();
        if (r1 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r0.f;
        r0.a();
    L_0x0024:
        return r2;
    L_0x0025:
        r0 = r5.bk;
        r0 = r0.a();
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0043;
    L_0x002e:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0034;
    L_0x0032:
        r0 = defpackage.aulu.bw;
    L_0x0034:
        r0 = r0.aK;
        if (r0 == 0) goto L_0x0043;
    L_0x0038:
        r0 = r5.bN;
        if (r0 == 0) goto L_0x0043;
    L_0x003c:
        r0 = r0.i();
        if (r0 == 0) goto L_0x0043;
    L_0x0042:
        return r2;
    L_0x0043:
        r0 = r5.ak;
        r1 = r0.a();
        r3 = r0.b;
        r3 = r3.size();
        r4 = 0;
        if (r1 < r3) goto L_0x0053;
    L_0x0052:
        goto L_0x0060;
    L_0x0053:
        if (r1 >= 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0060;
    L_0x0056:
        r0 = r0.b;
        r0 = r0.get(r1);
        r0 = (defpackage.lbt) r0;
        r4 = r0.d;
    L_0x0060:
        if (r4 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0073;
    L_0x0063:
        r0 = r4.f;
        if (r0 == 0) goto L_0x0073;
    L_0x0067:
        r0 = r4.g;
        if (r0 == 0) goto L_0x0073;
    L_0x006b:
        r1 = r4.h;
        if (r1 == 0) goto L_0x0073;
    L_0x006f:
        r4.a(r0);
        return r2;
    L_0x0073:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.ab():boolean");
    }

    public final void aj() {
        g(true);
    }

    public final void f(boolean z) {
        if (z) {
            this.cm = this.br.a();
            kyp kyp = this.aV;
            evz evz = kyp.c;
            if (evz != null) {
                evz.a = null;
            }
            evy evy = kyp.d;
            if (evy != null) {
                evy.a = null;
            }
            ewa ewa = kyp.e;
            if (ewa != null) {
                ewa.a = null;
            }
            evx evx = kyp.f;
            if (evx != null) {
                evx.a = null;
            }
            ewc ewc = kyp.g;
            if (ewc != null) {
                ewc.a = null;
            }
            kyp.h.a(null);
            kyp.j.a(null);
            fng fng = kyp.i;
            if (fng != null) {
                fng.a(null);
            }
            if (!this.cq.isEmpty()) {
                for (String a : this.cq) {
                    this.bw.a(a);
                }
                this.cq.clear();
            }
            this.ah.b();
        }
        this.aw = false;
        this.ax = false;
        this.ak.b();
        this.at.j();
        jqn jqn = this.bN;
        if (jqn != null) {
            jqn.f();
        }
        this.ai.b();
        ffg ffg = this.al;
        ffg.d();
        ffg.b();
        ffl ffl = ffg.j;
        ffl.a.clear();
        ffl.b.clear();
        ffg.e = null;
        ffg.f = null;
        ffg.a.b();
        ffg.b.b();
        for (enx a2 : this.ci) {
            a2.a();
        }
        this.ci.clear();
        ar();
    }

    public final void as() {
        if (TextUtils.equals(aapu.a(aq()), "FEwhat_to_watch")) {
            aK();
            long b = this.ar - this.aD.b();
            ScheduledExecutorService scheduledExecutorService = this.bE;
            guc guc = new guc(this);
            if (b <= 0) {
                b = 0;
            }
            this.ct = scheduledExecutorService.schedule(guc, b, TimeUnit.MILLISECONDS);
        }
    }

    private final void aK() {
        ScheduledFuture scheduledFuture = this.ct;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.ct = null;
        }
    }

    public final void g(boolean z) {
        f(true);
        this.bT.set(false);
        h(z);
        aF();
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0125  */
    public void h(boolean r15) {
        /*
        r14 = this;
        r0 = r14.an;
        r5 = defpackage.foe.a(r0);
        r0 = r14.az;
        r1 = new xfp;
        r7 = r0.a;
        r8 = new zzv;
        r8.<init>();
        r9 = new zzs;
        r9.<init>();
        r10 = new zzt;
        r10.<init>();
        r11 = new zzq;
        r11.<init>();
        r6 = r1;
        r6.<init>(r7, r8, r9, r10, r11);
        r0 = r0.a(r1);
        r2 = r14.an;
        r4 = defpackage.aapu.a(r2);
        r6 = r14.bq;
        r7 = r14.bB;
        r8 = r14.p();
        r9 = r14.bk;
        r10 = r14.bG;
        r11 = r14.bI;
        r12 = r14.bH;
        r13 = r14.bl;
        r1 = r0;
        r3 = r15;
        r15 = defpackage.haf.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        r14.an = r15;
        r15 = r14.bm;
        r15 = r15.a;
        r1 = new eez;
        r1.<init>();
        r15.d(r1);
        r15 = r14.aP();
        if (r15 == 0) goto L_0x006b;
    L_0x005a:
        r15 = r14.bL;
        r1 = defpackage.atyw.LATENCY_ACTION_VIDEO_LIST;
        r15 = r15.a(r1);
        r14.bS = r15;
        r15 = r14.bS;
        r1 = "br_s";
        r15.a(r1);
    L_0x006b:
        r15 = r14.aD;
        r1 = r15.b();
        r3 = r14.ar;
        r15 = 0;
        r5 = 1;
        r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r6 <= 0) goto L_0x007b;
    L_0x0079:
        r1 = 1;
        goto L_0x007c;
    L_0x007b:
        r1 = 0;
    L_0x007c:
        r2 = 0;
        r14.a(r1, r5, r2);
        r1 = r14.aA;
        r2 = r14.ca;
        r3 = r14.cb;
        r4 = r1.f;
        r4 = r4.get();
        r4 = (defpackage.hot) r4;
        r6 = defpackage.hot.a(r0);
        if (r6 != 0) goto L_0x0097;
    L_0x0095:
        goto L_0x0144;
    L_0x0097:
        r6 = defpackage.hot.a(r0);
        if (r6 != 0) goto L_0x00a4;
    L_0x009d:
        r15 = "`BrowseServiceOfflineInitialResponder.handleRequest` called on request that this responder does not respond to.";
        defpackage.xtl.c(r15);
        goto L_0x0144;
    L_0x00a4:
        r6 = r0.b;
        r7 = "FElibrary";
        r8 = r7.equals(r6);
        if (r8 != 0) goto L_0x00be;
    L_0x00ae:
        r15 = defpackage.ebm.c(r6);
        r5 = r4.a;
        r6 = new hos;
        r6.<init>(r4, r15, r3);
        r5.execute(r6);
        goto L_0x0144;
    L_0x00be:
        r4 = r4.c;
        r4 = r4.get();
        r4 = (defpackage.hoz) r4;
        r6 = 0;
        r8 = r4.a;	 Catch:{ IOException -> 0x00f0 }
        r8 = r8.get();	 Catch:{ IOException -> 0x00f0 }
        r8 = (defpackage.eav) r8;	 Catch:{ IOException -> 0x00f0 }
        r9 = r8.f();	 Catch:{ IOException -> 0x00f0 }
        r9 = r9.a();	 Catch:{ IOException -> 0x00f0 }
        r9 = (defpackage.ajrr) r9;	 Catch:{ IOException -> 0x00f0 }
        if (r9 != 0) goto L_0x00ee;
    L_0x00db:
        r10 = r8.e;	 Catch:{ IOException -> 0x00f0 }
        r10 = defpackage.foh.F(r10);	 Catch:{ IOException -> 0x00f0 }
        if (r10 == 0) goto L_0x00ee;
    L_0x00e3:
        r8 = r8.d;	 Catch:{ IOException -> 0x00f0 }
        r8 = r8.a();	 Catch:{ IOException -> 0x00f0 }
        r8 = defpackage.eaw.a(r8);	 Catch:{ IOException -> 0x00f0 }
        goto L_0x00f1;
    L_0x00ee:
        r8 = r9;
        goto L_0x00f1;
    L_0x00f0:
        r8 = r6;
    L_0x00f1:
        if (r8 == 0) goto L_0x00f5;
    L_0x00f3:
        r6 = r8;
        goto L_0x0123;
    L_0x00f5:
        r8 = r4.a;	 Catch:{ IOException -> 0x0102 }
        r8 = r8.get();	 Catch:{ IOException -> 0x0102 }
        r8 = (defpackage.eav) r8;	 Catch:{ IOException -> 0x0102 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0102 }
        goto L_0x0103;
    L_0x0102:
        r8 = r6;
    L_0x0103:
        if (r8 == 0) goto L_0x0123;
    L_0x0105:
        r9 = r8.a;
        if (r9 != 0) goto L_0x010a;
    L_0x0109:
        goto L_0x0123;
    L_0x010a:
        r9 = r4.b;
        r9.get();
        r8 = r8.a;
        r8 = defpackage.eaw.a(r8);
        if (r8 == 0) goto L_0x0123;
    L_0x0117:
        r4 = r4.a;
        r4 = r4.get();
        r4 = (defpackage.eav) r4;
        r4.a(r8, r7);
        goto L_0x00f3;
    L_0x0123:
        if (r6 == 0) goto L_0x0144;
    L_0x0125:
        r4 = new aaff;
        r4.<init>(r6);
        r15 = java.lang.Boolean.valueOf(r15);
        r6 = "browse_response_enable_logging";
        r4.a(r6, r15);
        r15 = java.lang.Boolean.valueOf(r5);
        r5 = "browse_response_new_response_needed";
        r4.a(r5, r15);
        r5 = "browse_response_is_loading_response";
        r4.a(r5, r15);
        r3.a(r4);
    L_0x0144:
        r1.a(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.h(boolean):void");
    }

    /* Access modifiers changed, original: protected */
    public void a(aaff aaff, boolean z) {
        this.bV = z;
    }

    /* Access modifiers changed, original: protected */
    public void a(bqn bqn) {
        aw();
        if (!this.bV) {
            xst b = this.aC.b(bqn);
            if (bqn instanceof bqe) {
                aL();
            } else {
                boolean z = bqn instanceof bpx;
                int i = R.drawable.quantum_ic_error_outline_grey600_48;
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout;
                if (!z) {
                    if (b.c == 1) {
                        i = R.drawable.quantum_ic_cloud_off_grey600_48;
                    }
                    specificNetworkErrorViewLoadingFrameLayout = this.ai;
                    specificNetworkErrorViewLoadingFrameLayout.c.a(b.a);
                    specificNetworkErrorViewLoadingFrameLayout.c.a(true);
                    specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                    specificNetworkErrorViewLoadingFrameLayout.c.a(i);
                    specificNetworkErrorViewLoadingFrameLayout.a(3);
                } else if (((bpx) bqn).getCause() instanceof IOException) {
                    aL();
                } else {
                    specificNetworkErrorViewLoadingFrameLayout = this.ai;
                    specificNetworkErrorViewLoadingFrameLayout.c.a(M_().getResources().getString(R.string.auth_error_help_message));
                    specificNetworkErrorViewLoadingFrameLayout.c.a((int) R.drawable.quantum_ic_error_outline_grey600_48);
                    specificNetworkErrorViewLoadingFrameLayout.c.a(false);
                    specificNetworkErrorViewLoadingFrameLayout.c.b(true);
                    specificNetworkErrorViewLoadingFrameLayout.a(3);
                }
            }
            gyi.a(t(), b.b);
        }
        this.bm.a.d(new eep());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aaff aaff, boolean z, boolean z2, boolean z3) {
        this.ah.a(aaff, 0, z, z2, z3);
    }

    private final void aL() {
        this.ai.d();
    }

    public final void at() {
        ebs ebs = this.ae;
        if (ebs != null) {
            ebs.a(new efa(), true);
            this.ae = null;
        }
        edl edl = this.af;
        if (edl != null) {
            edl.a();
            this.af = null;
        }
    }

    public final jts au() {
        if (this.aj != null) {
            lbw lbw = this.ak;
            if (lbw != null) {
                return (jts) lbw.d();
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03cc A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x071c  */
    /* JADX WARNING: Missing block: B:212:0x06c6, code skipped:
            if (r7 == 2) goto L_0x06d3;
     */
    public final void a(java.util.List r45, java.util.List r46, java.lang.Object r47, int r48) {
        /*
        r44 = this;
        r11 = r44;
        r12 = r45;
        r13 = r46;
        r14 = r47;
        r15 = r48;
        r9 = 1;
        if (r14 == 0) goto L_0x0026;
    L_0x000d:
        r0 = r14 instanceof defpackage.arjg;
        if (r0 != 0) goto L_0x0026;
    L_0x0011:
        r0 = r14 instanceof defpackage.axom;
        if (r0 != 0) goto L_0x0026;
    L_0x0015:
        r0 = r14 instanceof defpackage.ayix;
        if (r0 != 0) goto L_0x0026;
    L_0x0019:
        r0 = r14 instanceof defpackage.arvx;
        if (r0 != 0) goto L_0x0026;
    L_0x001d:
        r0 = r44.aJ();
        if (r0 == 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        r0 = 1;
        goto L_0x0027;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r1 = r11.bo;
        r8 = 0;
        r1.e = r8;
        r1 = r11.at;
        r1.j();
        r1 = r11.ak;
        r1.b();
        r1 = defpackage.ampo.a;
        r2 = new android.util.TypedValue;
        r2.<init>();
        r3 = r44.p();
        r3 = r3.getTheme();
        r4 = 2130772333; // 0x7f01016d float:1.7147781E38 double:1.052741409E-314;
        r3 = r3.resolveAttribute(r4, r2, r9);
        if (r3 == 0) goto L_0x005e;
    L_0x004e:
        r1 = r11.ag;
        r3 = r2.resourceId;
        r1 = r1.getColor(r3);
        r1 = java.lang.Integer.valueOf(r1);
        r1 = defpackage.amqp.b(r1);
    L_0x005e:
        r16 = r1;
        r1 = defpackage.ampo.a;
        r3 = r44.p();
        r3 = r3.getTheme();
        r4 = 2130772318; // 0x7f01015e float:1.7147751E38 double:1.0527414014E-314;
        r3 = r3.resolveAttribute(r4, r2, r9);
        if (r3 == 0) goto L_0x0083;
    L_0x0073:
        r1 = r11.ag;
        r2 = r2.resourceId;
        r1 = r1.getColor(r2);
        r1 = java.lang.Integer.valueOf(r1);
        r1 = defpackage.amqp.b(r1);
    L_0x0083:
        r17 = r1;
        r1 = r11.ci;
        r1.clear();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r1 = r45.size();
        r2 = 4;
        r6 = 3;
        r5 = 2;
        if (r1 <= r9) goto L_0x00ed;
    L_0x0098:
        r1 = r11.S;
        if (r1 != 0) goto L_0x00a0;
    L_0x009c:
        r1 = r11.g(r8);
    L_0x00a0:
        r3 = 2131034249; // 0x7f050089 float:1.767901E38 double:1.0528708125E-314;
        r4 = r11.ai;
        r1.inflate(r3, r4, r9);
        r1 = r11.ai;
        r3 = 2131755748; // 0x7f1002e4 float:1.9142384E38 double:1.0532272804E-314;
        r1 = r1.findViewById(r3);
        r1 = (com.google.android.libraries.youtube.common.ui.RtlAwareViewPager) r1;
        r3 = r11.be;
        r4 = new jjy;
        r10 = r3.a;
        r10 = r10.get();
        r10 = (defpackage.ezq) r10;
        r10 = defpackage.jke.a(r10, r9);
        r10 = (defpackage.ezq) r10;
        r8 = r3.b;
        r8 = r8.get();
        r8 = (com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar) r8;
        r8 = defpackage.jke.a(r8, r5);
        r8 = (com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar) r8;
        r3 = r3.c;
        r3 = r3.get();
        r3 = (android.support.constraint.ConstraintLayout) r3;
        r3 = defpackage.jke.a(r3, r6);
        r3 = (android.support.constraint.ConstraintLayout) r3;
        r1 = defpackage.jke.a(r1, r2);
        r1 = (com.google.android.libraries.youtube.common.ui.RtlAwareViewPager) r1;
        r4.<init>(r10, r8, r3, r1);
        r11.aj = r4;
        goto L_0x0128;
    L_0x00ed:
        r1 = r11.bf;
        r3 = r11.ai;
        r4 = new jnp;
        r8 = r1.a;
        r8 = r8.get();
        r8 = (defpackage.ezq) r8;
        r8 = defpackage.jnt.a(r8, r9);
        r8 = (defpackage.ezq) r8;
        r10 = r1.b;
        r10 = r10.get();
        r10 = (com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar) r10;
        r10 = defpackage.jnt.a(r10, r5);
        r10 = (com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar) r10;
        r1 = r1.c;
        r1 = r1.get();
        r1 = (android.support.constraint.ConstraintLayout) r1;
        r1 = defpackage.jnt.a(r1, r6);
        r1 = (android.support.constraint.ConstraintLayout) r1;
        r2 = defpackage.jnt.a(r3, r2);
        r2 = (android.view.ViewGroup) r2;
        r4.<init>(r8, r10, r1, r2);
        r11.aj = r4;
    L_0x0128:
        r44.an();
        r21 = r0;
        r8 = 0;
        r20 = -1;
    L_0x0130:
        r0 = r45.size();
        if (r8 >= r0) goto L_0x066c;
    L_0x0136:
        r0 = r12.get(r8);
        r0 = (defpackage.aafp) r0;
        r4 = r0.a();
        if (r4 != 0) goto L_0x014c;
    L_0x0142:
        r0 = r7;
        r22 = r8;
        r1 = -1;
        r4 = 0;
        r10 = 2;
        r23 = 3;
        goto L_0x0661;
    L_0x014c:
        r3 = r0.a;
        r1 = r4.a;
        r2 = r11.a;
        r2 = android.view.LayoutInflater.from(r2);
        r5 = r3.g;
        r6 = 2131756068; // 0x7f100424 float:1.9143033E38 double:1.0532274385E-314;
        if (r5 != 0) goto L_0x015e;
    L_0x015d:
        goto L_0x018b;
    L_0x015e:
        r5 = r5.a;
        r5 = r5 & r9;
        if (r5 == 0) goto L_0x018b;
    L_0x0163:
        r1 = 2131035304; // 0x7f0504a8 float:1.768115E38 double:1.052871334E-314;
        r5 = 0;
        r1 = r2.inflate(r1, r5);
        r2 = 2131755717; // 0x7f1002c5 float:1.9142321E38 double:1.053227265E-314;
        r2 = r1.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r5 = r3.g;
        r5 = r5.b;
        if (r5 != 0) goto L_0x017c;
    L_0x017a:
        r5 = defpackage.aulk.c;
    L_0x017c:
        r5 = r5.b;
        if (r5 != 0) goto L_0x0182;
    L_0x0180:
        r5 = defpackage.arml.f;
    L_0x0182:
        r5 = defpackage.ajqy.a(r5);
        r2.setText(r5);
        r5 = 0;
        goto L_0x01aa;
    L_0x018b:
        r1 = r1.i;
        if (r1 == 0) goto L_0x01a2;
    L_0x018f:
        r1 = 2131035303; // 0x7f0504a7 float:1.7681148E38 double:1.0528713333E-314;
        r5 = 0;
        r1 = r2.inflate(r1, r5);
        r2 = r1.findViewById(r6);
        if (r2 == 0) goto L_0x01aa;
    L_0x019d:
        r9 = 0;
        r2.setEnabled(r9);
        goto L_0x01aa;
    L_0x01a2:
        r5 = 0;
        r1 = 2131035299; // 0x7f0504a3 float:1.768114E38 double:1.0528713313E-314;
        r1 = r2.inflate(r1, r5);
    L_0x01aa:
        r2 = 2131758261; // 0x7f100cb5 float:1.914748E38 double:1.053228522E-314;
        r2 = r1.findViewById(r2);
        r9 = r2;
        r9 = (android.support.v7.widget.RecyclerView) r9;
        r2 = r11.bW;
        r5 = r11.bX;
        r25 = r44.aQ();
        if (r25 == 0) goto L_0x01d9;
    L_0x01be:
        r10 = r11.a;
        r10 = defpackage.xss.f(r10);
        r26 = r7;
        r6 = (double) r10;
        r27 = 4595473059768854118; // 0x3fc6666666666666 float:2.720083E23 double:0.175;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r27;
        r6 = (int) r6;
        r7 = 0;
        r9.setPadding(r6, r7, r6, r7);
        r6 = r6 + r6;
        r2 = r2 - r6;
        goto L_0x01db;
    L_0x01d9:
        r26 = r7;
    L_0x01db:
        r6 = r9.getWidth();
        if (r6 != 0) goto L_0x01f9;
    L_0x01e1:
        r6 = r11.bW;
        if (r6 <= 0) goto L_0x01f9;
    L_0x01e5:
        r6 = r11.bX;
        if (r6 <= 0) goto L_0x01f9;
    L_0x01e9:
        r6 = r9.getLeft();
        r2 = r2 + r6;
        r9.setRight(r2);
        r2 = r9.getTop();
        r5 = r5 + r2;
        r9.setBottom(r5);
    L_0x01f9:
        r2 = r11.bF;
        r5 = android.os.Build.VERSION.SDK_INT;
        r6 = 22;
        if (r5 < r6) goto L_0x0220;
    L_0x0201:
        r5 = r2.a;
        r5 = r5.b();
        r5 = r5.a();
        if (r5 == 0) goto L_0x0220;
    L_0x020d:
        r2 = r2.a;
        r2 = r2.b();
        r2 = r2.b();
        r2 = (android.view.View) r2;
        r5 = r9.getId();
        r2.setAccessibilityTraversalBefore(r5);
    L_0x0220:
        r2 = 2131756068; // 0x7f100424 float:1.9143033E38 double:1.0532274385E-314;
        r2 = r1.findViewById(r2);
        r2 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r2;
        if (r2 != 0) goto L_0x023f;
    L_0x022b:
        r2 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
        r5 = r44.p();
        r2.<init>(r5);
        r5 = new android.view.ViewGroup$LayoutParams;
        r10 = -1;
        r5.<init>(r10, r10);
        r2.addView(r1, r5);
        r1 = r2;
        goto L_0x0240;
    L_0x023f:
        r10 = -1;
    L_0x0240:
        r5 = r16.a();
        r7 = 1;
        if (r5 == 0) goto L_0x025b;
    L_0x0247:
        r5 = new int[r7];
        r6 = r16.b();
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        r18 = 0;
        r5[r18] = r6;
        r2.a(r5);
        goto L_0x025d;
    L_0x025b:
        r18 = 0;
    L_0x025d:
        r5 = r17.a();
        if (r5 == 0) goto L_0x0270;
    L_0x0263:
        r5 = r17.b();
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r2.a(r5);
    L_0x0270:
        r5 = r11.aY;
        r2 = r5.a(r2);
        r1 = defpackage.zz.a(r2, r1);
        r2 = r1.a;
        r6 = r2;
        r6 = (defpackage.enx) r6;
        r1 = r1.b;
        r5 = r1;
        r5 = (android.view.View) r5;
        if (r13 == 0) goto L_0x028f;
    L_0x0286:
        r1 = r13.get(r8);
        r1 = (defpackage.akyd) r1;
        r19 = r1;
        goto L_0x0291;
    L_0x028f:
        r19 = 0;
    L_0x0291:
        r1 = r11.bn;
        r2 = r44.t();
        r7 = r11.bY;
        r10 = r11.cc;
        r27 = r3;
        r3 = r0.a;
        r3 = r3.j;
        r28 = r4;
        r4 = "FEnotifications_inbox";
        r3 = android.text.TextUtils.equals(r4, r3);
        if (r3 == 0) goto L_0x02ac;
    L_0x02ab:
        goto L_0x02b8;
    L_0x02ac:
        r0 = r0.a;
        r0 = r0.j;
        r3 = "FEhistory";
        r0 = android.text.TextUtils.equals(r3, r0);
        if (r0 == 0) goto L_0x02bb;
    L_0x02b8:
        r29 = 3;
        goto L_0x02bd;
    L_0x02bb:
        r29 = 1;
    L_0x02bd:
        r30 = defpackage.akhs.HOME;
        r4 = r11.bP;
        r0 = r1;
        r1 = r19;
        r13 = r27;
        r3 = r9;
        r27 = r4;
        r12 = r28;
        r4 = r7;
        r7 = r5;
        r22 = 0;
        r5 = r10;
        r10 = r6;
        r23 = 3;
        r6 = r44;
        r32 = r7;
        r31 = r26;
        r24 = 1;
        r7 = r10;
        r12 = r22;
        r22 = r8;
        r8 = r29;
        r33 = r9;
        r9 = r30;
        r34 = r10;
        r10 = r27;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = new guq;
        r1.<init>(r11);
        r0.L = r1;
        r1 = new gut;
        r1.<init>(r11);
        r0.M = r1;
        r1 = r0.I;
        if (r1 == 0) goto L_0x0305;
    L_0x0300:
        r0.a(r1);
        r0.I = r12;
    L_0x0305:
        r1 = r11.bk;
        r1 = defpackage.foh.h(r1);
        if (r1 == 0) goto L_0x031f;
    L_0x030d:
        r1 = r11.bk;
        r1 = defpackage.foh.i(r1);
        if (r1 == 0) goto L_0x0316;
    L_0x0315:
        goto L_0x031f;
    L_0x0316:
        r1 = r0.e;
        r1 = (defpackage.akpd) r1;
        r2 = r11.aX;
        r1.a(r2);
    L_0x031f:
        defpackage.dvr.a(r0);
        r2 = r34;
        if (r2 == 0) goto L_0x032e;
    L_0x0326:
        r2.a(r0);
        r1 = r11.ci;
        r1.add(r2);
    L_0x032e:
        r1 = new guj;
        r1.<init>(r11, r0);
        r0.a(r1);
        r1 = new afxi;
        r2 = r11.aH;
        r1.<init>(r0, r2);
        r0.a(r1);
        r1 = r11.aV;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0353;
    L_0x0348:
        r1 = new gul;
        r2 = r33;
        r1.<init>(r11, r2);
        r2.a(r1);
        goto L_0x0355;
    L_0x0353:
        r2 = r33;
    L_0x0355:
        r1 = new guk;
        r1.<init>(r11);
        r2.a(r1);
        r1 = r11.at;
        r1.a(r2);
        r1 = new akpk;
        r1.<init>();
        r11.cn = r1;
        r1 = r44.af();
        if (r1 == 0) goto L_0x0393;
    L_0x036f:
        r1 = r11.j;
        if (r1 == 0) goto L_0x0393;
    L_0x0373:
        r3 = "needs_nested_header";
        r4 = 0;
        r1 = r1.getBoolean(r3, r4);
        if (r1 == 0) goto L_0x0394;
    L_0x037c:
        r1 = r11.cd;
        if (r1 == 0) goto L_0x0394;
    L_0x0380:
        r3 = r11.cn;
        r5 = new fah;
        r6 = r11.ce;
        r7 = defpackage.amwp.a;
        r1 = r1.a(r7);
        r5.<init>(r6, r1);
        r3.add(r5);
        goto L_0x0394;
    L_0x0393:
        r4 = 0;
    L_0x0394:
        if (r21 == 0) goto L_0x039b;
    L_0x0396:
        r1 = r11.cn;
        r1.add(r14);
    L_0x039b:
        r1 = r13.f;
        if (r1 != 0) goto L_0x03a0;
    L_0x039f:
        goto L_0x03c1;
    L_0x03a0:
        r3 = r1.a;
        r5 = r3 & 1;
        if (r5 == 0) goto L_0x03b2;
    L_0x03a6:
        r3 = r11.cn;
        r1 = r1.b;
        if (r1 != 0) goto L_0x03ae;
    L_0x03ac:
        r1 = defpackage.aofj.m;
    L_0x03ae:
        r3.add(r1);
        goto L_0x03c1;
    L_0x03b2:
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x03c1;
    L_0x03b6:
        r3 = r11.cn;
        r1 = r1.c;
        if (r1 != 0) goto L_0x03be;
    L_0x03bc:
        r1 = defpackage.axnh.f;
    L_0x03be:
        r3.add(r1);
    L_0x03c1:
        r1 = r11.cn;
        r0.a(r1);
        r1 = -1;
        if (r15 == r1) goto L_0x03cc;
    L_0x03c9:
        r3 = r28;
        goto L_0x03da;
    L_0x03cc:
        if (r19 != 0) goto L_0x03c9;
    L_0x03ce:
        r3 = r13.c;
        if (r3 != 0) goto L_0x03d3;
    L_0x03d2:
        goto L_0x03d5;
    L_0x03d3:
        r20 = r22;
    L_0x03d5:
        r3 = r28;
        r0.a(r3);
    L_0x03da:
        r11.a(r0);
        r3 = r3.a;
        r5 = r3.i;
        if (r5 == 0) goto L_0x045e;
    L_0x03e3:
        r5 = r11.a;
        r5 = defpackage.xss.b(r5);
        if (r5 == 0) goto L_0x0413;
    L_0x03eb:
        r5 = new jok;
        r6 = r32;
        r36 = r6;
        r36 = (android.view.ViewGroup) r36;
        r7 = r11.bt;
        r8 = r11.aG;
        r9 = r11.az;
        r10 = r11.aF;
        r12 = r11.aC;
        r43 = r44.t();
        r35 = r5;
        r37 = r0;
        r38 = r7;
        r39 = r8;
        r40 = r9;
        r41 = r10;
        r42 = r12;
        r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43);
        goto L_0x043a;
    L_0x0413:
        r6 = r32;
        r5 = new jic;
        r36 = r6;
        r36 = (android.view.ViewGroup) r36;
        r7 = r11.bt;
        r8 = r11.aG;
        r9 = r11.az;
        r10 = r11.aF;
        r12 = r11.aC;
        r43 = r44.t();
        r35 = r5;
        r37 = r0;
        r38 = r7;
        r39 = r8;
        r40 = r9;
        r41 = r10;
        r42 = r12;
        r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43);
    L_0x043a:
        r8 = r5;
        r3 = r3.h;
        if (r3 == 0) goto L_0x044e;
    L_0x043f:
        r5 = r3.a;
        r7 = 105924295; // 0x65046c7 float:3.917245E-35 double:5.2333555E-316;
        if (r5 != r7) goto L_0x044b;
    L_0x0446:
        r3 = r3.b;
        r3 = (defpackage.axeo) r3;
        goto L_0x044f;
    L_0x044b:
        r3 = defpackage.axeo.b;
        goto L_0x044f;
    L_0x044e:
        r3 = 0;
    L_0x044f:
        if (r3 != 0) goto L_0x0452;
    L_0x0451:
        goto L_0x0455;
    L_0x0452:
        r8.a(r3);
    L_0x0455:
        r3 = new gun;
        r3.<init>(r8);
        r0.a(r3);
        goto L_0x0461;
    L_0x045e:
        r6 = r32;
        r8 = 0;
    L_0x0461:
        r3 = new xrg;
        r3.<init>();
        r5 = r3.b;
        if (r5 == 0) goto L_0x047a;
    L_0x046a:
        r7 = r3.a();
        r5.b(r7);
        r5 = r3.b;
        r7 = r3.b();
        r5.b(r7);
    L_0x047a:
        r3.b = r2;
        r5 = r3.b;
        if (r5 == 0) goto L_0x0490;
    L_0x0480:
        r7 = r3.a();
        r5.a(r7);
        r5 = r3.b;
        r7 = r3.b();
        r5.a(r7);
    L_0x0490:
        r5 = new akoo;
        r7 = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";
        r5.<init>(r3, r7);
        r0.a(r5);
        r3 = new jhf;
        r3.<init>();
        r3.c = r0;
        r5 = r3.a;
        r7 = r3.c;
        r7 = r7.o;
        r9 = r5.p;
        if (r9 != r7) goto L_0x04ad;
    L_0x04ab:
        goto L_0x0544;
    L_0x04ad:
        if (r9 == 0) goto L_0x04f3;
    L_0x04af:
        r9.b(r5);
        r9 = r5.p;
        r10 = r5.w;
        r9.b(r10);
        r9 = r5.p;
        r9.b(r5);
        r9 = r5.n;
        r9 = r9.size();
        r9 = r9 + r1;
    L_0x04c5:
        if (r9 < 0) goto L_0x04d7;
    L_0x04c7:
        r10 = r5.n;
        r10 = r10.get(r4);
        r10 = (defpackage.atk) r10;
        r10 = r10.e;
        defpackage.atg.b(r10);
        r9 = r9 + -1;
        goto L_0x04c5;
    L_0x04d7:
        r9 = r5.n;
        r9.clear();
        r9 = 0;
        r5.s = r9;
        r5.t = r1;
        r5.c();
        r10 = r5.v;
        if (r10 != 0) goto L_0x04e9;
    L_0x04e8:
        goto L_0x04ed;
    L_0x04e9:
        r10.a = r4;
        r5.v = r9;
    L_0x04ed:
        r10 = r5.u;
        if (r10 == 0) goto L_0x04f3;
    L_0x04f1:
        r5.u = r9;
    L_0x04f3:
        r5.p = r7;
        if (r7 == 0) goto L_0x0544;
    L_0x04f7:
        r7 = r7.getResources();
        r9 = 2131625317; // 0x7f0e0565 float:1.8877839E38 double:1.053162839E-314;
        r9 = r7.getDimension(r9);
        r5.e = r9;
        r9 = 2131625316; // 0x7f0e0564 float:1.8877837E38 double:1.0531628384E-314;
        r7 = r7.getDimension(r9);
        r5.f = r7;
        r7 = r5.p;
        r7 = r7.getContext();
        r7 = android.view.ViewConfiguration.get(r7);
        r7 = r7.getScaledTouchSlop();
        r5.o = r7;
        r7 = r5.p;
        r7.a(r5);
        r7 = r5.p;
        r9 = r5.w;
        r7.a(r9);
        r7 = r5.p;
        r7.a(r5);
        r7 = new ath;
        r7.<init>(r5);
        r5.v = r7;
        r7 = new aan;
        r9 = r5.p;
        r9 = r9.getContext();
        r10 = r5.v;
        r7.<init>(r9, r10);
        r5.u = r7;
    L_0x0544:
        r5 = r11.aF;
        defpackage.amqw.a(r3);
        defpackage.amqw.a(r5);
        defpackage.amqw.a(r5);
        r7 = new jhs;
        r7.<init>(r5);
        r3.a(r7);
        defpackage.amqw.a(r5);
        r7 = new jhq;
        r7.<init>(r5);
        r3.a(r7);
        defpackage.amqw.a(r5);
        r7 = new jho;
        r7.<init>(r5);
        r3.a(r7);
        r5 = r3.d;
        if (r5 != 0) goto L_0x0578;
    L_0x0571:
        r5 = new jhi;
        r5.<init>(r3);
        r3.d = r5;
    L_0x0578:
        r5 = r3.d;
        r0.a(r5);
        r5 = new jhg;
        r5.<init>();
        defpackage.amqw.a(r3);
        r3.a(r5);
        r3.a(r5);
        r3.a(r5);
        r3 = new jmh;
        r3.<init>();
        r5 = r3.a;
        if (r5 == 0) goto L_0x05a7;
    L_0x0597:
        r7 = r3.b();
        r5.b(r7);
        r5 = r3.a;
        r7 = r3.c();
        r5.b(r7);
    L_0x05a7:
        r3.a = r2;
        r5 = r3.a;
        if (r5 == 0) goto L_0x05bd;
    L_0x05ad:
        r7 = r3.b();
        r5.a(r7);
        r5 = r3.a;
        r7 = r3.c();
        r5.a(r7);
    L_0x05bd:
        r5 = r44.aa();
        r5 = defpackage.aapu.a(r5);
        r3.c = r5;
        r5 = r3.b;
        if (r5 != 0) goto L_0x05d2;
    L_0x05cb:
        r5 = new jmg;
        r5.<init>(r3);
        r3.b = r5;
    L_0x05d2:
        r3 = r3.b;
        r0.a(r3);
        r3 = r44.ae();
        if (r3 == 0) goto L_0x063d;
    L_0x05dd:
        r3 = r11.ck;
        if (r3 != 0) goto L_0x0603;
    L_0x05e1:
        r3 = r11.bv;
        r5 = r11.j;
        r7 = "split_pane_library_opened_in_offline_mode";
        r5 = r5.getBoolean(r7);
        r7 = new jif;
        r3 = r3.a;
        r3 = r3.get();
        r3 = (defpackage.aaal) r3;
        r9 = 1;
        r3 = defpackage.jij.a(r3, r9);
        r3 = (defpackage.aaal) r3;
        r7.<init>(r3, r5);
        r11.cj = r7;
        r10 = 2;
        goto L_0x0622;
    L_0x0603:
        r9 = 1;
        r5 = r11.bv;
        r7 = new jif;
        r5 = r5.a;
        r5 = r5.get();
        r5 = (defpackage.aaal) r5;
        r5 = defpackage.jij.a(r5, r9);
        r5 = (defpackage.aaal) r5;
        r10 = 2;
        r3 = defpackage.jij.a(r3, r10);
        r3 = (defpackage.akyd) r3;
        r7.<init>(r5, r3);
        r11.cj = r7;
    L_0x0622:
        r3 = r11.cj;
        r5 = r44.af();
        r3.e = r5;
        r3 = r11.cj;
        r5 = r3.c;
        if (r5 != 0) goto L_0x0637;
    L_0x0630:
        r5 = new jii;
        r5.<init>(r3);
        r3.c = r5;
    L_0x0637:
        r3 = r3.c;
        r0.a(r3);
        goto L_0x0642;
    L_0x063d:
        r3 = 0;
        r9 = 1;
        r10 = 2;
        r11.cj = r3;
    L_0x0642:
        r3 = new guf;
        r3.<init>(r11);
        r0.a(r3);
        r3 = r11.bD;
        r3 = r3.get();
        r3 = (defpackage.aph) r3;
        r2.a(r3);
        r2 = new lbt;
        r2.<init>(r13, r6, r0, r8);
        r0 = r31;
        r0.add(r2);
        r21 = 0;
    L_0x0661:
        r8 = r22 + 1;
        r12 = r45;
        r13 = r46;
        r7 = r0;
        r5 = 2;
        r6 = 3;
        goto L_0x0130;
    L_0x066c:
        r0 = r7;
        r1 = -1;
        r4 = 0;
        r10 = 2;
        if (r15 == r1) goto L_0x0673;
    L_0x0672:
        goto L_0x0675;
    L_0x0673:
        r15 = r20;
    L_0x0675:
        r2 = r11.ak;
        r3 = r11.aj;
        r2.g = r3;
        r3.a(r2);
        r5 = r2.b;
        r5.clear();
        r5 = r2.b;
        r5.addAll(r0);
        r5 = 0;
    L_0x0689:
        r6 = r0.size();
        if (r5 >= r6) goto L_0x072f;
    L_0x068f:
        r6 = r0.get(r5);
        r6 = (defpackage.lbt) r6;
        r7 = new eyj;
        r8 = r6.c;
        r8 = r8.o;
        r7.<init>(r8);
        r8 = new fam;
        r8.<init>();
        r12 = r6.b;
        r8.a = r12;
        r12 = r8.b;
        if (r12 != 0) goto L_0x06b2;
    L_0x06ab:
        r12 = new java.util.LinkedList;
        r12.<init>();
        r8.b = r12;
    L_0x06b2:
        r12 = r8.b;
        r12.add(r7);
        r6 = r6.a;
        r7 = r6.h;
        if (r7 != 0) goto L_0x06be;
    L_0x06bd:
        goto L_0x06c9;
    L_0x06be:
        r7 = r7.b;
        r7 = defpackage.aydy.a(r7);
        if (r7 == 0) goto L_0x06c9;
    L_0x06c6:
        if (r7 != r10) goto L_0x06c9;
    L_0x06c8:
        goto L_0x06d3;
    L_0x06c9:
        r7 = r2.d;
        r12 = r6.j;
        r7 = r7.a(r12);
        if (r7 == 0) goto L_0x06d5;
    L_0x06d3:
        r7 = 1;
        goto L_0x06d6;
    L_0x06d5:
        r7 = 0;
    L_0x06d6:
        r12 = r6.e;
        if (r12 == 0) goto L_0x06fb;
    L_0x06da:
        r13 = r2.c;
        r12 = r12.b;
        r12 = defpackage.arwh.a(r12);
        if (r12 != 0) goto L_0x06e6;
    L_0x06e4:
        r12 = defpackage.arwh.UNKNOWN;
    L_0x06e6:
        r12 = r13.a(r12);
        r13 = r2.g;
        r14 = r6.b;
        r14 = r2.a(r14, r7);
        r8 = r8.a();
        r7 = r13.a(r12, r7, r14, r8);
        goto L_0x0707;
    L_0x06fb:
        r12 = r2.g;
        r13 = r6.b;
        r8 = r8.a();
        r7 = r12.a(r13, r13, r7, r8);
    L_0x0707:
        r8 = r2.e;
        r8.a(r6, r7);
        r8 = r6.i;
        if (r8 != 0) goto L_0x0711;
    L_0x0710:
        goto L_0x0723;
    L_0x0711:
        r12 = r8.a;
        r12 = r12 & r10;
        if (r12 == 0) goto L_0x0723;
    L_0x0716:
        r12 = r2.a;
        r8 = r8.c;
        if (r8 != 0) goto L_0x071e;
    L_0x071c:
        r8 = defpackage.aruh.j;
    L_0x071e:
        r13 = r2.f;
        r12.a(r8, r7, r6, r13);
    L_0x0723:
        r7 = r2.f;
        r6 = r6.k;
        r8 = 0;
        r7.a(r6, r8);
        r5 = r5 + 1;
        goto L_0x0689;
    L_0x072f:
        if (r15 != r1) goto L_0x0732;
    L_0x0731:
        goto L_0x0735;
    L_0x0732:
        r3.a(r15, r9, r4);
    L_0x0735:
        r0 = r11.aN;
        r0 = r0.b();
        if (r0 <= r9) goto L_0x0740;
    L_0x073d:
        r44.ar();
    L_0x0740:
        r0 = r11.ak;
        r0 = r0.e();
        r11.ch = r0;
        r0 = r11.aV;
        r1 = r11.ak;
        r1 = r1.e();
        r0.a(r1);
        r0 = r11.aV;
        r1 = r11.aN;
        if (r1 == 0) goto L_0x07b4;
    L_0x0759:
        r2 = r45.size();
        if (r4 >= r2) goto L_0x07af;
    L_0x075f:
        r2 = r45;
        r3 = r2.get(r4);
        r3 = (defpackage.aafp) r3;
        r3 = r3.a;
        if (r3 != 0) goto L_0x076c;
    L_0x076b:
        goto L_0x07ac;
    L_0x076c:
        r3 = r3.a;
        r5 = r0.c;
        if (r5 == 0) goto L_0x0783;
    L_0x0772:
        r5 = "FEsubscriptions";
        r5 = defpackage.kyp.a(r3, r5);
        if (r5 == 0) goto L_0x0783;
    L_0x077a:
        r3 = r0.c;
        r5 = r1.c(r4);
        r3.a = r5;
        goto L_0x07ac;
    L_0x0783:
        r5 = r0.d;
        if (r5 == 0) goto L_0x0798;
    L_0x0787:
        r5 = "FEaccount";
        r5 = defpackage.kyp.a(r3, r5);
        if (r5 == 0) goto L_0x0798;
    L_0x078f:
        r3 = r0.d;
        r5 = r1.c(r4);
        r3.a = r5;
        goto L_0x07ac;
    L_0x0798:
        r5 = r0.g;
        if (r5 == 0) goto L_0x07ac;
    L_0x079c:
        r5 = "FEtrending";
        r3 = defpackage.kyp.a(r3, r5);
        if (r3 == 0) goto L_0x07ac;
    L_0x07a4:
        r3 = r0.g;
        r5 = r1.c(r4);
        r3.a = r5;
    L_0x07ac:
        r4 = r4 + 1;
        goto L_0x0759;
    L_0x07af:
        r0 = r0.a;
        r0.a();
    L_0x07b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.a(java.util.List, java.util.List, java.lang.Object, int):void");
    }

    public final boolean av() {
        return amqq.a(aapu.a(aq()), "FEwhat_to_watch");
    }

    public final kzo a(aaff aaff) {
        aaff aaff2 = aaff;
        ajrp ajrp = aaff2.a.c;
        if (ajrp != null) {
            if (ajrp.a != null) {
                lao lao = this.aO;
                return new lal((aaas) lao.a((aaas) lao.a.get(), 1), (jpp) lao.a((jpp) lao.b.get(), 2), (acvx) lao.a(t(), 3), (aaff) lao.a(aaff2, 4), (ajrw) lao.a(ajrp.a, 5));
            } else if (ajrp.b != null) {
                lay lay = this.aR;
                return new lav((aaas) lay.a((aaas) lay.a.get(), 1), (xci) lay.a((xci) lay.b.get(), 2), (aaff) lay.a(aaff2, 3));
            } else if (ajrp.i != null) {
                lbx lbx = this.aW;
                return new lby((aaas) lbx.a((aaas) lbx.a.get(), 1), (xci) lbx.a((xci) lbx.b.get(), 2), (aaff) lbx.a(aaff2, 3));
            } else {
                ajxx ajxx = ajrp.c;
                if (ajxx != null) {
                    return this.aQ.a(ajxx);
                }
                if (ajrp.d != null) {
                    lbf lbf = this.aP;
                    return new lbg((aaas) lbf.a((aaas) lbf.a.get(), 1), (jpp) lbf.a((jpp) lbf.b.get(), 2), (acvx) lbf.a(t(), 3), (aaff) lbf.a(aaff2, 4), (axom) lbf.a(ajrp.d, 5));
                } else if (ajrp.e != null) {
                    lau lau = this.aS;
                    return new lar((aaas) lau.a((aaas) lau.a.get(), 1), (xci) lau.a((xci) lau.b.get(), 2), (aaff) lau.a(aaff2, 3));
                } else {
                    arvx arvx = ajrp.g;
                    if (arvx != null) {
                        return new lap(arvx);
                    }
                    ayix ayix = ajrp.h;
                    if (ayix != null) {
                        return new lbk((jps) lbj.a((jps) this.aU.a.get(), 1), (ayix) lbj.a(ayix, 2));
                    }
                    axvu axvu = ajrp.f;
                    if (axvu != null) {
                        return new lbi(axvu);
                    }
                    aqvl aqvl = ajrp.j;
                    if (aqvl != null) {
                        return new lat(aqvl);
                    }
                    aqdm aqdm = ajrp.l;
                    if (aqdm != null) {
                        return new lan(aqdm);
                    }
                    attr attr = ajrp.k;
                    if (attr != null) {
                        return new lax((jps) lba.a((jps) this.aT.a.get(), 1), (attr) lba.a(attr, 2));
                    }
                }
            }
        }
        return null;
    }

    public final void a(kzo kzo) {
        kzo kzo2 = this.cd;
        if (kzo2 != null) {
            kzo2.b();
        }
        this.cd = kzo;
        if (kzo != null) {
            kzo.b = this;
            kzo.c = this;
            kzo.d = this;
            kzo.a();
        }
    }

    public final void aw() {
        acwl acwl;
        fak fak;
        acvx t = t();
        String a = aapu.a(aq());
        if (a == null) {
            acwl = acwl.d;
        } else {
            Object obj = (a.hashCode() == 714505897 && a.equals("FEred_originals_home")) ? null : -1;
            if (obj != null) {
                acwl = acwl.d;
            } else {
                acwl = acwl.aE;
            }
        }
        t.a(acwl, acww.DEFAULT, this.an);
        t().b(acwc.MOBILE_BACK_BUTTON, null);
        jpa jpa = this.au;
        if (jpa == null) {
            fak = null;
        } else if (jpa.b() != 2) {
            fak = jpa.h;
        } else if (jpa.p) {
            fak = jpa.i;
        } else {
            fak = jpa.m;
        }
        if (fak != null) {
            fak.b(t().c().a);
            fak.a(acwc.SEARCH_BOX.dU);
        }
        t().b(acwc.SEARCH_BOX, null);
        amqp b = ((jle) this.bJ.get()).b();
        if (b.a()) {
            aaxx aaxx = (aaxx) b.b();
            ajwa ajwa = aaxx.a;
            if (ajwa != null && ajwa.b != null) {
                t().a(aaxx.a.b);
                ajvz[] ajvzArr = aaxx.a.a;
                if (ajvzArr != null) {
                    for (ajvz ajvz : ajvzArr) {
                        ajxi ajxi = ajvz.c;
                        if (!(ajxi == null || ajxi.a == null)) {
                            t().a(ajvz.c.a, null);
                        }
                        avzz avzz = ajvz.b;
                        if (!(avzz == null || avzz.a.size() == 0)) {
                            for (awab awab : avzz.a) {
                                avzx avzx;
                                if (awab.a == 117501096) {
                                    avzx = (avzx) awab.b;
                                } else {
                                    avzx = avzx.j;
                                }
                                if ((avzx.a & 512) != 0) {
                                    t().a(avzx.i.d(), null);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Object ax() {
        kzo kzo = this.cd;
        return kzo != null ? kzo.a : null;
    }

    public final void ay() {
        kzo kzo = this.cd;
        if (kzo != null) {
            this.ce = kzo.e();
            this.cf = this.cd.f();
            this.cg = this.cd.g();
            return;
        }
        this.ce = null;
        this.cf = false;
        this.cg = false;
    }

    private final void aM() {
        if (this.bT.get()) {
            as();
        } else {
            aI();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (foh.s(this.bk) == 1) {
            if (ejd.c() && !ejd2.c()) {
                aM();
            }
        } else if (foh.s(this.bk) == 2 && !this.cs && ejd.c() && !ejd2.c()) {
            aM();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Missing block: B:33:0x0071, code skipped:
            if (r3.a == 213380311) goto L_0x0074;
     */
    public final void i(boolean r12) {
        /*
        r11 = this;
        r0 = r11.au();
        r1 = r11.ak;
        r1 = r1.a();
        r2 = 0;
        if (r1 < 0) goto L_0x001e;
    L_0x000d:
        r3 = r11.ci;
        r3 = r3.size();
        if (r1 >= r3) goto L_0x001e;
    L_0x0015:
        r3 = r11.ci;
        r1 = r3.get(r1);
        r1 = (defpackage.enx) r1;
        goto L_0x001f;
    L_0x001e:
        r1 = r2;
    L_0x001f:
        r3 = r11.bk;
        r3 = defpackage.foh.J(r3);
        if (r3 == 0) goto L_0x00ca;
    L_0x0027:
        r3 = r11.bN;
        if (r3 == 0) goto L_0x00ca;
    L_0x002b:
        if (r0 == 0) goto L_0x00ca;
    L_0x002d:
        if (r1 == 0) goto L_0x00ca;
    L_0x002f:
        r3 = r11.ak;
        r3 = r3.b;
        r3 = r3.size();
        r4 = 1;
        if (r3 == r4) goto L_0x0042;
    L_0x003a:
        r12 = r11.ak;
        r12 = r12.b;
        r12.size();
        return;
    L_0x0042:
        if (r12 == 0) goto L_0x004b;
    L_0x0044:
        r12 = r11.bZ;
        if (r12 == 0) goto L_0x004b;
    L_0x0048:
        r12 = r12.n;
        goto L_0x004c;
    L_0x004b:
        r12 = r2;
    L_0x004c:
        r3 = r11.ak;
        r3 = r3.e();
        r3 = r3.d;
        if (r3 == 0) goto L_0x005f;
    L_0x0056:
        r3 = r3.a;
        if (r3 == 0) goto L_0x005f;
    L_0x005a:
        r2 = new aafn;
        r2.<init>(r3);
    L_0x005f:
        if (r12 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0074;
    L_0x0062:
        if (r2 == 0) goto L_0x00ca;
    L_0x0064:
        r3 = r2.a;
        if (r3 == 0) goto L_0x00ca;
    L_0x0068:
        r3 = r3.f;
        if (r3 == 0) goto L_0x00ca;
    L_0x006c:
        r3 = r3.a;
        r5 = 213380311; // 0xcb7ecd7 float:2.8338157E-31 double:1.05423881E-315;
        if (r3 == r5) goto L_0x0074;
    L_0x0073:
        goto L_0x00ca;
    L_0x0074:
        r3 = r11.t();
        r9 = r11.at;
        r10 = r11.bN;
        if (r3 != 0) goto L_0x0080;
    L_0x007e:
        r3 = defpackage.acvx.g;
    L_0x0080:
        defpackage.amqw.a(r3);
        defpackage.amqw.a(r9);
        defpackage.amqw.a(r10);
        defpackage.amqw.a(r0);
        defpackage.amqw.a(r1);
        if (r12 == 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0096;
    L_0x0092:
        if (r2 == 0) goto L_0x0095;
    L_0x0094:
        goto L_0x0096;
    L_0x0095:
        r4 = 0;
    L_0x0096:
        r5 = "Caller must provide either transientState or a sectionList depending on whether the feed filter bar is being restored (i.e. after fragment destruction) or populated for the first time).";
        defpackage.amqw.a(r4, r5);
        if (r12 != 0) goto L_0x00a2;
    L_0x009d:
        r12 = r10.a(r2, r0, r3);
        goto L_0x00a6;
    L_0x00a2:
        r12 = r10.a(r12, r0, r3);
    L_0x00a6:
        if (r12 == 0) goto L_0x00ca;
    L_0x00a8:
        r4 = r10.b();
        r5 = r10.h();
        r8 = r0.o;
        r3 = r9;
        r6 = r10;
        r7 = r1;
        r3.a(r4, r5, r6, r7, r8);
        r12 = r1.c;
        r2 = new jqz;
        r2.<init>(r10);
        r12.a(r2);
        r12 = new jrc;
        r12.<init>(r10, r9, r1, r0);
        r0.a(r12);
    L_0x00ca:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.i(boolean):void");
    }

    public final void az() {
        g(true);
    }

    public final void aA() {
        aN();
    }

    private final void aN() {
        jqn jqn = this.bN;
        if (jqn != null) {
            jqn.f();
        }
        lbw lbw = this.ak;
        int a = lbw.a();
        if (a < lbw.b.size() && a >= 0) {
            ((lbt) lbw.b.get(a)).c.f();
        }
    }

    public void H_() {
        aN();
        am();
        View z = z();
        if (z != null) {
            z.post(new gue(this));
        }
    }

    public final void a(Object obj, Object obj2) {
        akpk akpk = this.cn;
        if (akpk != null) {
            akpk.a(obj, obj2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    public final void a(defpackage.akcf r6) {
        /*
        r5 = this;
        r0 = r5.bJ;
        r0 = r0.get();
        r0 = (defpackage.jle) r0;
        r0.d();
        r0 = 1;
        if (r6 == 0) goto L_0x008d;
    L_0x000e:
        r1 = r5.bR;
        r2 = r6.a;
        if (r2 == 0) goto L_0x001d;
    L_0x0014:
        r2 = r2.h;
        r2 = r1.a(r2);
        if (r2 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0044;
    L_0x001d:
        r2 = r6.a;
        r3 = 0;
        if (r2 == 0) goto L_0x0025;
    L_0x0022:
        r4 = r2.e;
        goto L_0x0026;
    L_0x0025:
        r4 = r3;
    L_0x0026:
        if (r4 == 0) goto L_0x0045;
    L_0x0028:
        r0 = r1.c;
        r0 = r0.t();
        r6 = r6.c;
        r0.a(r6);
        r6 = new android.util.Pair;
        r0 = new gve;
        r0.<init>(r5);
        r2 = "overlay_controller_param";
        r6.<init>(r2, r0);
        r0 = r1.f;
        r0.a(r4, r6);
    L_0x0044:
        return;
    L_0x0045:
        if (r2 != 0) goto L_0x0049;
    L_0x0047:
        r2 = r3;
        goto L_0x005f;
    L_0x0049:
        r2 = r2.a;
        if (r2 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0047;
    L_0x004e:
        r4 = r2.a;
        r4 = r4 & r0;
        if (r4 == 0) goto L_0x005a;
    L_0x0053:
        r2 = r2.b;
        if (r2 != 0) goto L_0x005b;
    L_0x0057:
        r2 = defpackage.arml.f;
        goto L_0x005b;
    L_0x005a:
        r2 = r3;
    L_0x005b:
        r2 = defpackage.ajqy.a(r2);
    L_0x005f:
        r4 = android.text.TextUtils.isEmpty(r2);
        if (r4 != 0) goto L_0x006e;
    L_0x0065:
        r4 = r1.a;
        r2 = r2.toString();
        r4.a(r2);
    L_0x006e:
        r2 = r6.a;
        if (r2 == 0) goto L_0x0075;
    L_0x0072:
        r2 = r2.g;
        goto L_0x0076;
    L_0x0075:
        r2 = r3;
    L_0x0076:
        if (r2 == 0) goto L_0x008d;
    L_0x0078:
        r0 = r1.c;
        r0 = r0.t();
        r6 = r6.c;
        r0.a(r6);
        r6 = defpackage.wsq.a(r2);
        r0 = r5.v;
        r6.a(r0, r3);
        return;
    L_0x008d:
        r5.g(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.a(akcf):void");
    }

    public final void ac_() {
        g(true);
    }

    public final void ah() {
        fal fal = this.aj;
        if (fal != null) {
            fal.c();
        }
    }

    public final boolean aB() {
        return aR() == 3 && wvl.a(this.bk);
    }

    public final void d(int i) {
        a(this.ab.b.d(), this.ab.b.f(), ezo.a(xnq.a(this.ab.b.a().a(this.a), 179)), this.ab.b.b(), this.ab.b.d(), i);
    }

    private final void a(ezo ezo, ezo ezo2, ezo ezo3, ezo ezo4, ezo ezo5, int i) {
        a(ezo.a(this.a), ezo2.a(this.a), ezo3.a(this.a), ezo4.a(this.a), ezo5.a(this.a), i);
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        a(i, i2, i3, i4, i5, 0);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.cl = this.ab.b.k().a(ezo.a(i3)).a(ezo.a(i3)).b(ezo.a(i4)).e(ezo.a(i5)).c(ezo.a(i)).d(ezo.a(i2)).c(i6).a();
        ar();
    }

    public final void aC() {
        int color = this.ag.getColor(R.color.theme_main_tab_text_color_activated);
        a(color, this.ag.getColor(R.color.theme_main_tab_text_color_normal), this.ag.getColor(R.color.yt_grey3), this.ag.getColor(R.color.yt_grey4), color);
    }

    public final void aD() {
        a(this.ab.b.d(), this.ab.b.f(), this.ab.b.a(), this.ab.b.b(), this.ab.b.g(), 0);
    }

    public final Object ai() {
        if (this.aq) {
            return null;
        }
        gux gux = new gux();
        gux.d = this.am;
        gux.e = this.ce;
        gux.f = this.cf;
        gux.g = this.cg;
        gux.h = this.ar;
        gux.j = this.cl;
        gux.k = this.cm;
        gux.l = this.bU;
        jqn jqn = this.bN;
        if (jqn != null) {
            gux.n = jqn.e();
        }
        if (!(this.ak == null || this.aj == null)) {
            gux.a = new ArrayList();
            gux.c = new ArrayList();
            for (lbt lbt : this.ak.b) {
                gux.a.add(new aafp(lbt.a));
                gux.c.add(lbt.c.E_());
            }
            gux.b = this.aj.b();
            gux.i = this.as;
        }
        jif jif = this.cj;
        if (jif != null) {
            gux.m = new jik(jif.d, jif.b);
        }
        return gux;
    }

    public final void a(Object obj) {
        if (obj instanceof gux) {
            this.bZ = (gux) obj;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x003b, code skipped:
            if ((((defpackage.apge) r0).a & 64) != 0) goto L_0x006e;
     */
    private final boolean aO() {
        /*
        r5 = this;
        r0 = r5.an;
        r0 = defpackage.aapu.a(r0);
        r1 = "FEactivity";
        r0 = android.text.TextUtils.equals(r0, r1);
        if (r0 == 0) goto L_0x0016;
    L_0x000e:
        r0 = r5.aM;
        r0 = r0.b(r1);
        if (r0 > 0) goto L_0x006e;
    L_0x0016:
        r0 = r5.an;
        if (r0 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x003e;
    L_0x001b:
        r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0031;
    L_0x002e:
        r0 = r1.b;
        goto L_0x0035;
    L_0x0031:
        r0 = r1.a(r0);
    L_0x0035:
        r0 = (defpackage.apge) r0;
        r0 = r0.a;
        r0 = r0 & 64;
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x006e;
    L_0x003e:
        r0 = r5.ar;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x006a;
    L_0x0046:
        r0 = r5.bk;
        r0 = defpackage.foh.t(r0);
        if (r0 == 0) goto L_0x006a;
    L_0x004e:
        r0 = r5.aq();
        r0 = defpackage.aapu.a(r0);
        r1 = "FEwhat_to_watch";
        r0 = android.text.TextUtils.equals(r0, r1);
        if (r0 == 0) goto L_0x006a;
    L_0x005e:
        r0 = r5.aD;
        r0 = r0.b();
        r2 = r5.ar;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x006e;
    L_0x006a:
        r0 = r5.cp;
        if (r0 == 0) goto L_0x0070;
    L_0x006e:
        r0 = 1;
        return r0;
    L_0x0070:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gub.aO():boolean");
    }

    private final boolean aP() {
        apxu aq = aq();
        if (aq != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            aq.a(access$000);
            if (aq.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                aq.a(access$000);
                Object b = aq.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                if (((apge) b).b.startsWith("VL")) {
                    apxn a = this.bk.a();
                    if (a != null) {
                        aulu aulu = a.e;
                        if (aulu == null) {
                            aulu = aulu.bw;
                        }
                        if (aulu.aF) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean aE() {
        return (this.bS == null || !aP() || this.bV) ? false : true;
    }

    private final boolean aQ() {
        return xss.b(this.a) && foh.L(this.bk) && av();
    }

    /* Access modifiers changed, original: protected|final */
    public final void aF() {
        if (p() != null) {
            this.bQ.a(jtm.a(M_(), this.bl));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{fnn.class, fnm.class, gzx.class, jmt.class, wse.class, abgi.class, akuq.class};
                break;
            case 0:
                this.aq = true;
                break;
            case 1:
                g(true);
                break;
            case 2:
                gzx gzx = (gzx) obj;
                if (gzx.c() != null) {
                    jps jps = this.bb;
                    auvl c = gzx.c();
                    auvn auvn = jps.b;
                    if (auvn != null && auvn.b.size() > 0) {
                        auvq auvq = (auvq) ((anxo) jps.b.toBuilder());
                        auvm auvm = (auvm) auvj.j.createBuilder();
                        auvm.a(c);
                        auvq.a(0, auvm);
                        jps.b = (auvn) ((anxl) auvq.build());
                        jps.c = null;
                    }
                    ar();
                    g(true);
                    break;
                }
                break;
            case 3:
                jmt jmt = (jmt) obj;
                String a = aapu.a(aa());
                if (a != null && a.equals(jmt.b)) {
                    Object obj2;
                    apxu aa = aa();
                    anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                    aa.a(access$000);
                    Object b = aa.h.b(access$000.d);
                    if (b == null) {
                        obj2 = access$000.b;
                    } else {
                        obj2 = access$000.a(b);
                    }
                    apgd apgd = (apgd) ((anxo) ((apge) obj2).toBuilder());
                    String str = jmt.a;
                    apgd.copyOnWrite();
                    apge apge = (apge) apgd.instance;
                    if (str != null) {
                        apge.a |= 8;
                        apge.d = str;
                        apxx apxx = (apxx) ((anxo) aa.toBuilder());
                        apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
                        aa = (apxu) ((anxl) apxx.build());
                        fiw.a((fja) this).a(aa);
                        this.an = aa;
                        g(true);
                        break;
                    }
                    throw new NullPointerException();
                }
            case 4:
                g(true);
                break;
            case 5:
                abgi abgi = (abgi) obj;
                if (abgi.a.a != null) {
                    Object ax = ax();
                    obj = abgi.a.a.a;
                    a(this.aQ.a(obj));
                    if (ax != null) {
                        a(ax, obj);
                    }
                    ar();
                    break;
                }
                break;
            case 6:
                if (((akuq) obj).b != ajti.NEXT) {
                    this.at.f();
                    return null;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    private final int aR() {
        return gzd.a(aq(), this.bl);
    }
}
