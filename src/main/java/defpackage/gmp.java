package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: gmp */
public final class gmp extends nf implements gnp, goa, gor, gph, gpj, gpz, gqi, xfc {
    public gax Z;
    public final afjv a = new gnc(this);
    public aepj aA;
    public afmi aB;
    public zyw aC;
    public ajam aD;
    public amro aE;
    public amro aF;
    public amro aG;
    public acxm aH;
    public Set aI;
    public ajzq aJ;
    public gop aK;
    public ajkj aL;
    public ajcp aM;
    public aiqq aN;
    public gnr aO;
    public apxu aP;
    private RecyclerView aQ;
    private gnn aR;
    private apxu aS;
    private final gng aT = new gng(this);
    private final gnd aU = new gnd(this);
    private final bdfu aV = new bdfu();
    private gpa aW;
    public gmd aa;
    public glv ab;
    public gqf ac;
    public gml ad;
    public gmo ae;
    public gpl af;
    public goq ag;
    public gqc ah;
    public xci ai;
    public akkq aj;
    public airt ak;
    public aizy al;
    public aaas am;
    public afpu an;
    public ekn ao;
    public acwa ap;
    public ahyg aq;
    public vcr ar;
    public bapu as;
    public bapu at;
    public bapu au;
    public xry av;
    public xhv aw;
    public SharedPreferences ax;
    public afia ay;
    public aiqf az;
    public gqw b;
    public gqa c;

    private final gnn af() {
        if (this.aR == null) {
            this.aR = ((gnq) xse.a(p())).a(new gns(this));
        }
        return this.aR;
    }

    public final gpa f() {
        gpl gpl = this.af;
        Context context = (Context) gpl.a((Context) gpl.a.get(), 1);
        akkq akkq = (akkq) gpl.a((akkq) gpl.b.get(), 2);
        aizy aizy = (aizy) gpl.a((aizy) gpl.c.get(), 3);
        acwa acwa = (acwa) gpl.a((acwa) gpl.d.get(), 4);
        goe goe = (goe) gpl.a((goe) gpl.e.get(), 5);
        gof gof = (gof) gpl.a((gof) gpl.f.get(), 6);
        goa goa = (goa) gpl.a((goa) gpl.g.get(), 7);
        got got = (got) gpl.a((got) gpl.h.get(), 8);
        gpl.a((gou) gpl.i.get(), 9);
        return new gpa(context, akkq, aizy, acwa, goe, gof, goa, got, (est) gpl.a((est) gpl.j.get(), 10), (gpq) gpl.a((gpq) gpl.k.get(), 11), (aaas) gpl.a((aaas) gpl.l.get(), 12), (gpt) gpl.a((gpt) gpl.m.get(), 13), (gph) gpl.a(this, 14));
    }

    public final acvx W() {
        return this.ap.t();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        af().a(this);
        this.aO = new gnr(this.aH, this.ah);
        this.aW = f();
        for (ag a : this.aI) {
            this.V.a(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x026c  */
    public final android.view.View a(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r23;
        r2 = r0.aj;
        defpackage.amqw.a(r2);
        r2 = 0;
        r3 = 2131035229; // 0x7f05045d float:1.7680998E38 double:1.0528712967E-314;
        r4 = r21;
        r5 = r22;
        r3 = r4.inflate(r3, r5, r2);
        r15 = new aieg;
        r4 = r20.M_();
        r15.<init>(r4);
        r14 = new aidq;
        r6 = r20.p();
        r7 = r0.ax;
        r8 = r0.ai;
        r9 = r0.ay;
        r10 = r0.aB;
        r11 = r0.aw;
        r12 = r0.av;
        r4 = r0.az;
        r13 = r4.b;
        r5 = r0.aF;
        r4 = r0.aE;
        r2 = r0.aG;
        r1 = r0.aA;
        r21 = r3;
        r3 = r0.aD;
        r18 = r3;
        r3 = r0.aC;
        r16 = r4;
        r4 = r14;
        r17 = r5;
        r5 = r15;
        r0 = r14;
        r14 = r17;
        r22 = r0;
        r0 = r15;
        r15 = r16;
        r16 = r2;
        r17 = r1;
        r19 = r3;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r1 = new gop;
        r2 = r20.M_();
        r3 = r22;
        r1.<init>(r2, r0, r3);
        r0.a = r1;
        r0 = r20;
        r0.aK = r1;
        r1 = 2131758125; // 0x7f100c2d float:1.9147205E38 double:1.053228455E-314;
        r2 = r21;
        r1 = r2.findViewById(r1);
        r1 = (android.support.v7.widget.RecyclerView) r1;
        r0.aQ = r1;
        r1 = r20.p();
        r1 = r1.getIntent();
        r1 = r1.getExtras();
        r3 = "com.google.android.apps.youtube.PlaybackStartDescriptor";
        r4 = 0;
        r5 = r23;
        if (r5 == 0) goto L_0x00a0;
    L_0x008c:
        r6 = "DismissalSurvey";
        r6 = r5.getParcelable(r6);
        r6 = (defpackage.ajrb) r6;
        if (r6 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x00a0;
    L_0x0097:
        r7 = defpackage.apxu.d;
        r6 = r6.a(r7);
        r6 = (defpackage.apxu) r6;
        goto L_0x00bd;
    L_0x00a0:
        if (r1 == 0) goto L_0x00bc;
    L_0x00a2:
        r6 = r1.get(r3);
        r6 = (defpackage.aiqq) r6;
        r6 = defpackage.gmp.a(r6);
        if (r6 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00bc;
    L_0x00af:
        r7 = r6.a;
        r7 = r7 & 32;
        if (r7 == 0) goto L_0x00bc;
    L_0x00b5:
        r6 = r6.g;
        if (r6 != 0) goto L_0x00bd;
    L_0x00b9:
        r6 = defpackage.apxu.d;
        goto L_0x00bd;
    L_0x00bc:
        r6 = r4;
    L_0x00bd:
        r0.aS = r6;
        r6 = "ReelToReelListBundleKey";
        if (r5 == 0) goto L_0x00c9;
    L_0x00c3:
        r4 = r5.getParcelable(r6);
        r4 = (defpackage.gas) r4;
    L_0x00c9:
        if (r4 == 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00d4;
    L_0x00cc:
        if (r1 == 0) goto L_0x00d4;
    L_0x00ce:
        r4 = r1.getParcelable(r6);
        r4 = (defpackage.gas) r4;
    L_0x00d4:
        if (r5 == 0) goto L_0x00e1;
    L_0x00d6:
        r3 = "PlaybackServiceState";
        r3 = r5.getParcelable(r3);
        r3 = (defpackage.ajcp) r3;
        r0.aM = r3;
        goto L_0x0104;
    L_0x00e1:
        if (r1 == 0) goto L_0x0104;
    L_0x00e3:
        r3 = r1.get(r3);
        r3 = (defpackage.aiqq) r3;
        r0.aN = r3;
        r3 = r0.aN;
        r3 = defpackage.gmp.a(r3);
        if (r3 == 0) goto L_0x0104;
    L_0x00f3:
        if (r4 != 0) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00ff;
    L_0x00f6:
        r5 = r4.a;
        r5 = r5.isEmpty();
        if (r5 != 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x0104;
    L_0x00ff:
        r4 = new gas;
        r4.<init>(r3);
    L_0x0104:
        r3 = 2131758126; // 0x7f100c2e float:1.9147207E38 double:1.0532284553E-314;
        r3 = r2.findViewById(r3);
        r3 = (defpackage.ajkj) r3;
        r0.aL = r3;
        r3 = r0.ar;
        r5 = r0.aL;
        r3.a(r5);
        r3 = r0.aL;
        r5 = 2;
        r5 = new defpackage.aiub[r5];
        r6 = r0.aK;
        r7 = r6.a;
        r8 = 0;
        r5[r8] = r7;
        r7 = 1;
        r5[r7] = r6;
        r3.a(r5);
        if (r4 != 0) goto L_0x0133;
    L_0x012a:
        r4 = new gas;
        r3 = defpackage.amul.g();
        r4.<init>(r3);
    L_0x0133:
        r3 = r0.Z;
        r5 = new java.util.ArrayList;
        r6 = r4.a;
        r6 = r6.size();
        r5.<init>(r6);
        r6 = r4.a;
        r6 = r6.iterator();
    L_0x0146:
        r8 = 0;
    L_0x0147:
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x0168;
    L_0x014d:
        r9 = r6.next();
        r9 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r9;
        r10 = r9.i;
        if (r10 != 0) goto L_0x0164;
    L_0x0157:
        r10 = r3.a(r9);
        r5.add(r10);
        if (r8 != 0) goto L_0x0162;
    L_0x0160:
        if (r10 == r9) goto L_0x0146;
    L_0x0162:
        r8 = 1;
        goto L_0x0147;
    L_0x0164:
        r5.add(r9);
        goto L_0x0147;
    L_0x0168:
        if (r8 == 0) goto L_0x0174;
    L_0x016a:
        r3 = new gas;
        r5 = java.util.Collections.unmodifiableList(r5);
        r3.<init>(r5);
        goto L_0x0175;
    L_0x0174:
        r3 = r4;
    L_0x0175:
        r5 = r0.aN;
        if (r4 != r3) goto L_0x017a;
    L_0x0179:
        goto L_0x01ba;
    L_0x017a:
        if (r5 != 0) goto L_0x017d;
    L_0x017c:
        goto L_0x01ba;
    L_0x017d:
        r4 = r5.c();
        r4 = r3.a(r4);
        if (r4 < 0) goto L_0x01ba;
    L_0x0187:
        r6 = defpackage.gmp.a(r5);
        r8 = r3.a;
        r4 = r8.get(r4);
        r4 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r4;
        if (r4 == 0) goto L_0x01ba;
    L_0x0195:
        r6 = r4.equals(r6);
        if (r6 != 0) goto L_0x01ba;
    L_0x019b:
        r5 = defpackage.aiqq.a();
        r6 = defpackage.apxu.d;
        r6 = r6.createBuilder();
        r6 = (defpackage.apxx) r6;
        r8 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
        r6.a(r8, r4);
        r4 = r6.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.apxu) r4;
        r5.a = r4;
        r5 = r5.b();
    L_0x01ba:
        r0.aN = r5;
        r4 = r0.aa;
        r5 = r0.aQ;
        r6 = r0.aL;
        r8 = new gms;
        r8.<init>(r0);
        r9 = defpackage.amqw.a(r5);
        r9 = (android.support.v7.widget.RecyclerView) r9;
        r4.k = r9;
        r6 = defpackage.amqw.a(r6);
        r6 = (android.view.View) r6;
        r4.l = r6;
        r6 = defpackage.amqw.a(r8);
        r6 = (defpackage.gno) r6;
        r4.g = r6;
        r5.r = r7;
        r6 = new gmh;
        r8 = r5.getContext();
        r6.<init>(r4, r8);
        r5.a(r6);
        r8 = 0;
        r6.e(r8);
        r6.a(r7);
        r8 = new aoq;
        r8.<init>();
        r8.a(r5);
        r8 = new gmf;
        r8.<init>(r4, r6);
        r5.a(r8);
        r8 = new goe;
        r9 = r4.d;
        r10 = r4.a;
        r11 = r4.b;
        r8.<init>(r9, r10, r11);
        r9 = 6;
        r8.d = r9;
        r9 = new gmi;
        r9.<init>(r4, r5, r6);
        r8.b = r9;
        r5.a(r8);
        r4 = r0.aa;
        r4.e = r3;
        r5 = r4.k;
        defpackage.xpr.a(r5, r7);
        r5 = new gme;
        r5.<init>(r0, r3, r4);
        r4.f = r5;
        r5 = r4.k;
        r4 = r4.f;
        r5.a(r4);
        r4 = r0.b;
        r4.a = r3;
        r3 = 21;
        if (r1 == 0) goto L_0x025b;
    L_0x023b:
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 < r3) goto L_0x025b;
    L_0x023f:
        r4 = "com.google.android.apps.youtube.ThumbnailData";
        r1 = r1.getParcelable(r4);
        r1 = (defpackage.ajrb) r1;
        if (r1 == 0) goto L_0x0264;
    L_0x0249:
        r4 = r20.ac();
        r4 = r4.f;
        r5 = defpackage.aygk.f;
        r1 = r1.a(r5);
        r1 = (defpackage.aygk) r1;
        r4.a(r1);
        goto L_0x0264;
    L_0x025b:
        r1 = r20.ac();
        r1 = r1.f;
        r1.b();
    L_0x0264:
        r1 = r20.p();
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 < r3) goto L_0x026f;
    L_0x026c:
        r1.startPostponedEnterTransition();
    L_0x026f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmp.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private static ReelWatchEndpointOuterClass$ReelWatchEndpoint a(aiqq aiqq) {
        if (aiqq != null) {
            apxu apxu = aiqq.b;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            }
        }
        return null;
    }

    public final void B() {
        super.B();
        this.ao.a(eko.REEL);
        if (foh.x(this.aC)) {
            this.aV.a(this.aT.a(this.aD));
        } else {
            this.ai.a(this.aT);
        }
        this.ai.a(this.aU);
        if (aipo.a(this.aC, 32768)) {
            this.aV.a(this.aK.b.n.a(this.aD));
        } else {
            this.ai.a(this.aK.b.n);
        }
        this.aV.a(this.aK.b.o.a(this.aD));
        this.ai.a(this.aK.b.p);
        this.ai.a(this.ad);
        bdfu bdfu = this.aV;
        bcuo[] bcuoArr = new bcuo[1];
        bctz c = this.aD.C().c().c(gmr.a);
        gng gng = this.aT;
        gng.getClass();
        bcuoArr[0] = c.a(new gmu(gng));
        bdfu.a(bcuoArr);
        gqc gqc = this.ah;
        gqc.h.a(gqc.f.E().a(new gqb(gqc), gqe.a));
        this.ac.a(this);
        this.c.a(this);
        ac().c.a();
        gnb gnb = new gnb(this);
        this.aL.getViewTreeObserver().addOnGlobalLayoutListener(gnb);
        if (this.aL.getWidth() != 0 && this.aL.getHeight() != 0) {
            gnb.onGlobalLayout();
        }
    }

    public final void e(Bundle bundle) {
        Parcelable f = this.ao.c == eko.REEL ? this.al.f(true) : null;
        if (f != null) {
            bundle.putParcelable("PlaybackServiceState", f);
        }
        anze anze = this.aS;
        if (anze != null) {
            bundle.putParcelable("DismissalSurvey", new ajrb(anze));
        }
    }

    public final void ad_() {
        gpa ac = ac();
        ac.d.a(true);
        ac.k.a();
        this.ah.h.a();
        this.ac.b(this);
        ListIterator listIterator = this.c.a.listIterator();
        while (listIterator.hasNext()) {
            Object obj = (gpz) ((WeakReference) listIterator.next()).get();
            if (obj == this || obj == null) {
                listIterator.remove();
            }
        }
        this.ai.b(this.ad);
        this.aV.a();
        if (!aipo.a(this.aC, 32768)) {
            this.ai.b(this.aK.b.n);
        }
        this.ai.b(this.aK.b.p);
        if (!foh.x(this.aC)) {
            this.ai.b(this.aT);
        }
        this.ai.b(this.aU);
        if (this.ao.c == eko.REEL) {
            this.al.b();
            this.al.b(p().isFinishing());
        }
        this.aq.a(ahxy.a);
        super.ad_();
    }

    public final void X_() {
        gpa gpa = this.aW;
        if (gpa != null) {
            gpa.h();
        }
        super.X_();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int width = this.aL.getWidth();
        int height = this.aL.getHeight();
        ViewTreeObserver viewTreeObserver = this.aL.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new gne(this, width, height, viewTreeObserver));
    }

    public final void a(boolean z) {
        if (z) {
            this.ag.b();
        } else {
            this.ag.a();
        }
    }

    private final void c(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 16) == 0) {
                    gof gof = ac().f;
                    gof.d.a(gof.c);
                    xpr.a(gof.c, true);
                    return;
                }
                gof gof2 = ac().f;
                aygk aygk = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                gof2.e.a(aygk);
                xpr.a(gof2.c, true);
            }
        }
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 16) != 0) {
                    gof gof = ac().f;
                    aygk aygk = reelWatchEndpointOuterClass$ReelWatchEndpoint.f;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    Uri c = aklb.c(aygk, gof.c.getWidth(), gof.c.getHeight());
                    if (c != null) {
                        gof.a.b(c, gof.f);
                    }
                }
            }
        }
    }

    public final void X() {
        a(acwc.LIGHTWEIGHT_PLAYER_DISMISS_BUTTON);
    }

    public final void a(acwc acwc) {
        this.aq.c();
        W().a(3, new acvs(acwc), null);
        this.ad.b();
        nn p = p();
        if (p != null) {
            if (VERSION.SDK_INT >= 21) {
                ac().f.a();
                if (VERSION.SDK_INT >= 21) {
                    p.finishAfterTransition();
                } else {
                    p.finish();
                }
                p.overridePendingTransition(0, R.anim.reel_activity_slide_down);
            } else {
                p.finish();
            }
        }
        apxu apxu = this.aS;
        if (apxu != null) {
            this.am.a(apxu, null);
        }
    }

    public final void Y() {
        ajzp ag = ag();
        if (ag != null) {
            awyd awyd = ag.b;
            if (awyd != null) {
                awyb awyb = awyd.b;
                if (awyb == null) {
                    awyb = awyb.h;
                }
                if ((awyb.a & 4) != 0) {
                    awyb awyb2 = ag.b.b;
                    if (awyb2 == null) {
                        awyb2 = awyb.h;
                    }
                    if ((awyb2.a & 64) != 0) {
                        W().a(3, new acvs(awyb2.g), null);
                    }
                    aaas aaas = this.am;
                    apxu apxu = awyb2.d;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                }
            }
        }
    }

    public final void Z() {
        ajzp ag = ag();
        if (ag != null) {
            auvr auvr = ag.c;
            if (auvr != null && ag.e != null && (auvr.a & 1) != 0) {
                anxl anxl = auvr.b;
                if (anxl == null) {
                    anxl = auvn.l;
                }
                auvq auvq = (auvq) ((anxo) anxl.toBuilder());
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                ((gnu) this.as.get()).a(p(), ac().g, ac().c, (auvn) ((anxl) auvq.build()), hashMap);
            }
        }
    }

    public final void aa() {
        ajzp ag = ag();
        if (ag != null) {
            ajzw ajzw = ag.f;
            if (ajzw != null) {
                awyt awyt = (awyt) ajzv.a(ajzw, awyt.class);
                if (awyt != null) {
                    int i = awyt.a;
                    if ((i & 16) != 0) {
                        if ((i & 64) != 0) {
                            W().a(3, new acvs(awyt.g), null);
                        }
                        aaas aaas = this.am;
                        apxu apxu = awyt.f;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        aaas.a(apxu, null);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    public final void b(java.lang.String r10) {
        /*
        r9 = this;
        r0 = r9.aJ;
        r1 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x0005:
        r0 = r0.b;
        if (r0 == 0) goto L_0x0010;
    L_0x0009:
        r0 = r0.g;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r0 = r0.b;
        goto L_0x0011;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0071;
    L_0x0014:
        r10 = r0.equals(r10);
        if (r10 == 0) goto L_0x0071;
    L_0x001a:
        r10 = r9.ag();
        if (r10 == 0) goto L_0x0070;
    L_0x0020:
        r10 = r10.e;
        if (r10 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0070;
    L_0x0025:
        r0 = r10.a;
        r2 = 66439850; // 0x3f5caaa float:1.4446335E-36 double:3.28256474E-316;
        if (r0 != r2) goto L_0x0032;
    L_0x002c:
        r2 = r10.b;
        r2 = (defpackage.auvn) r2;
        r7 = r2;
        goto L_0x0033;
    L_0x0032:
        r7 = r1;
    L_0x0033:
        r2 = 113762946; // 0x6c7e282 float:7.5188304E-35 double:5.62063634E-316;
        if (r0 != r2) goto L_0x003d;
    L_0x0038:
        r10 = r10.b;
        r1 = r10;
        r1 = (defpackage.axav) r1;
    L_0x003d:
        if (r1 == 0) goto L_0x0051;
    L_0x003f:
        r10 = r9.at;
        r10 = r10.get();
        r10 = (defpackage.akso) r10;
        r0 = r9.au;
        r0 = r0.get();
        r10.a(r1, r0);
        goto L_0x0070;
    L_0x0051:
        if (r7 == 0) goto L_0x0070;
    L_0x0053:
        r10 = r9.as;
        r10 = r10.get();
        r3 = r10;
        r3 = (defpackage.gnu) r3;
        r4 = r9.p();
        r10 = r9.ac();
        r5 = r10.g;
        r10 = r9.ac();
        r6 = r10.c;
        r8 = 0;
        r3.a(r4, r5, r6, r7, r8);
    L_0x0070:
        return;
    L_0x0071:
        r10 = r9.M_();
        r0 = 2131953503; // 0x7f13075f float:1.9543479E38 double:1.0533249844E-314;
        r1 = 0;
        defpackage.xpr.a(r10, r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmp.b(java.lang.String):void");
    }

    public final void ab() {
        aidq aidq = this.aK.b;
        aidq.b();
        this.aK.a(aidq.q);
    }

    public final void a(ajzq ajzq, String str, boolean z) {
        long j;
        String str2 = null;
        if (ajzq != null) {
            ajxu ajxu = ajzq.b;
            if (ajxu != null) {
                atep atep = ajxu.g;
                if (atep != null) {
                    str2 = atep.b;
                }
            }
        }
        gml gml = this.ad;
        synchronized (gml.a) {
            if (gml.c == null || !gml.b(str2)) {
                j = 0;
            } else {
                j = gml.b.a();
                gml.c.a("ps_r");
                gml.c.a("r_wrr");
                atyt atyt = (atyt) atyq.e.createBuilder();
                atyt.a(!z ? 2 : 4);
                atyq atyq = (atyq) ((anxl) atyt.build());
                atyl atyl = (atyl) atyi.l.createBuilder();
                String str3 = !z ? "warm" : "hot";
                atyl.copyOnWrite();
                atyi atyi = (atyi) atyl.instance;
                atyi.a |= 8;
                atyi.e = str3;
                atyl.a(atyq);
                gml.c.a((atyi) ((anxl) atyl.build()));
                j -= gml.d;
            }
        }
        p().runOnUiThread(new gmt(this, j, ajzq, str));
    }

    public final void b(apxu apxu) {
        String str = null;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
                str = reelWatchEndpointOuterClass$ReelWatchEndpoint.b;
            }
        }
        gml gml = this.ad;
        synchronized (gml.a) {
            if (gml.c != null && gml.b(str)) {
                gml.c.a("r_wrs");
            }
        }
    }

    public final void a(apxu apxu, ajzq ajzq, int i) {
        p().runOnUiThread(new gmy(this, i, ajzq, apxu));
    }

    public final void c(String str) {
        p().runOnUiThread(new gmx(this, str));
    }

    public final void a(asla asla, aslc aslc) {
        int a = awxf.a(aslc.c);
        if (a != 0 && a == 2) {
            gax gax = this.Z;
            String str = asla.c;
            synchronized (gax.a) {
                gax.a.remove(str);
            }
            if (g(true) == 1) {
                a(acwc.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
            }
        }
    }

    public final boolean d(String str) {
        if (!(this.aP == null || TextUtils.isEmpty(str))) {
            apxu apxu = this.aP;
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.aP;
                access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
                if (!(reelWatchEndpointOuterClass$ReelWatchEndpoint.b.isEmpty() || reelWatchEndpointOuterClass$ReelWatchEndpoint.b.equals(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void a(Runnable runnable) {
        amqw.a((Object) runnable);
        ac().c.a(a(!this.aw.c() ? R.string.reel_error_no_connection : R.string.reel_generic_error_message), new gna(this, runnable));
    }

    private final ajzp ag() {
        ajzq ajzq = this.aJ;
        if (ajzq != null) {
            ajzs ajzs = ajzq.a;
            if (ajzs != null) {
                return ajzs.a;
            }
        }
        return null;
    }

    public static awyf a(ajzp ajzp) {
        if (ajzp != null) {
            awyh awyh = ajzp.d;
            if ((awyh.a & 1) != 0) {
                awyf awyf = awyh.b;
                if (awyf == null) {
                    awyf = awyf.d;
                }
                return awyf;
            }
        }
        return null;
    }

    public final gpa ac() {
        gmd gmd = this.aa;
        gme gme = gmd.f;
        gmj gmj = null;
        if (gme != null) {
            int i = gmd.h;
            if (i >= 0 && i < gme.a()) {
                gmj = (gmj) gmd.f.c.get(gmd.h);
            }
        }
        if (gmj != null) {
            gmm gmm = gmj.c;
            if (gmm != null) {
                return gmm.p;
            }
        }
        return this.aW;
    }

    public final /* synthetic */ Object n() {
        return af();
    }

    public final int f(boolean z) {
        ajzq ajzq = this.aJ;
        if (ajzq != null) {
            apxu apxu = ajzq.d;
            if (apxu != null) {
                this.aP = apxu;
                apxu apxu2 = this.aP;
                anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu2.a(access$000);
                Object b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
                String str = reelWatchEndpointOuterClass$ReelWatchEndpoint != null ? reelWatchEndpointOuterClass$ReelWatchEndpoint.b : null;
                this.ad.a(1, 4, str);
                c(this.aP);
                ajzp a = ggf.a(this.aJ);
                this.aJ = null;
                if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
                    this.aa.a(this.aP);
                    this.Z.a(this.aP);
                }
                if (a != null) {
                    ajzw ajzw = a.h;
                    if (ajzw != null) {
                        aphg aphg = (aphg) ajzv.a(ajzw, aphg.class);
                        if (!(aphg == null || this.aP == null)) {
                            W().a(aphg.r.d(), null);
                            if ((aphg.a & 262144) == 0) {
                                apxx apxx = (apxx) ((anxo) this.aP.toBuilder());
                                apxx.a();
                                this.aP = (apxu) ((anxl) apxx.build());
                            } else {
                                apxx apxx2 = (apxx) ((anxo) this.aP.toBuilder());
                                apxx2.a(aphg.r);
                                this.aP = (apxu) ((anxl) apxx2.build());
                            }
                        }
                    }
                }
                this.ad.c(str);
                aiqs a2 = aiqq.a();
                a2.a = this.aP;
                this.al.b(new aizl(aizn.JUMP, a2.b(), this.ad.a()));
                this.aK.a(0);
                this.aK.b(0);
                ac().c.a();
                return 2;
            } else if (z) {
                return h(false);
            }
        }
        return 1;
    }

    public final int ad() {
        return h(true);
    }

    private final int h(boolean z) {
        gmd gmd = this.aa;
        int i = z ^ 1;
        if (gmd.e != null) {
            int i2 = gmd.i;
            if (i2 > 0) {
                gmd.j = i;
                gmd.k.e(i2 - 1);
                return 3;
            }
        }
        this.al.a(0);
        return 4;
    }

    public final int a(boolean z, boolean z2) {
        ajzq ajzq = this.aJ;
        if (ajzq == null) {
            return 1;
        }
        ajzp a = ggf.a(ajzq);
        apxu apxu = this.aJ.c;
        if (apxu != null) {
            this.aP = apxu;
            this.aJ = null;
            apxu apxu2 = this.aP;
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu2.a(access$000);
            Object b = apxu2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            String str = reelWatchEndpointOuterClass$ReelWatchEndpoint != null ? reelWatchEndpointOuterClass$ReelWatchEndpoint.b : null;
            this.ad.a(!z ? 2 : 5, 4, str);
            this.aK.a(0);
            this.aK.b(0);
            c(this.aP);
            if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
                this.aa.a(this.aP);
                this.Z.a(this.aP);
            }
            this.ad.c(str);
            ajzw ajzw;
            apxx apxx;
            if (z) {
                if (a != null) {
                    ajzw = a.i;
                    if (ajzw != null) {
                        aoze aoze = (aoze) ajzv.a(ajzw, aoze.class);
                        if (!(aoze == null || this.aP == null)) {
                            W().a(aoze.c.d(), null);
                            apxx = (apxx) ((anxo) this.aP.toBuilder());
                            apxx.a(aoze.c);
                            this.aP = (apxu) ((anxl) apxx.build());
                        }
                    }
                }
            } else if (a != null) {
                ajzw = a.g;
                if (ajzw != null) {
                    aphg aphg = (aphg) ajzv.a(ajzw, aphg.class);
                    if (!(aphg == null || this.aP == null)) {
                        W().a(aphg.r.d(), null);
                        if ((aphg.a & 262144) == 0) {
                            apxx = (apxx) ((anxo) this.aP.toBuilder());
                            apxx.a();
                            this.aP = (apxu) ((anxl) apxx.build());
                        } else {
                            apxx = (apxx) ((anxo) this.aP.toBuilder());
                            apxx.a(aphg.r);
                            this.aP = (apxu) ((anxl) apxx.build());
                        }
                    }
                }
            }
            aiqs a2 = aiqq.a();
            a2.e = z;
            a2.d = z;
            a2.a = this.aP;
            this.al.b(new aizl(aizn.JUMP, a2.b(), this.ad.a()));
            ac().c.a();
            return 2;
        } else if (!z2) {
            return 1;
        } else {
            if (z) {
                return a(2, true);
            }
            return a(1, true);
        }
    }

    public final int ae() {
        return a(0, true);
    }

    public final int g(boolean z) {
        if (this.aJ == null) {
            return 1;
        }
        int a = a(false, false);
        if (a == 1 && z) {
            a = f(false);
        }
        return a == 1 ? a(2, false) : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    private final int a(int r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.al;
        r0 = r0.m();
        r1 = 1;
        if (r0 == 0) goto L_0x00a3;
    L_0x0009:
        r0 = r6.aJ;
        if (r0 == 0) goto L_0x0020;
    L_0x000d:
        r2 = r6.aP;
        if (r2 == 0) goto L_0x0020;
    L_0x0011:
        r3 = r0.d;
        if (r3 != 0) goto L_0x0020;
    L_0x0015:
        r3 = r0.c;
        if (r3 != 0) goto L_0x0020;
    L_0x0019:
        r0 = r6.Z;
        r0.b(r2);
        goto L_0x00a3;
    L_0x0020:
        r2 = 2;
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x004d;
    L_0x0024:
        r3 = r0.d;
        if (r3 == 0) goto L_0x004d;
    L_0x0028:
        r0 = r0.c;
        if (r0 != 0) goto L_0x004d;
    L_0x002c:
        r0 = r6.ag();
        r0 = defpackage.gmp.a(r0);
        if (r0 == 0) goto L_0x004d;
    L_0x0036:
        r3 = r0.a;
        r4 = r3 & 1;
        if (r4 == 0) goto L_0x004d;
    L_0x003c:
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x004d;
    L_0x003f:
        r0 = r0.b;
        if (r0 != r2) goto L_0x004d;
    L_0x0043:
        r0 = r6.Z;
        r2 = r6.aJ;
        r2 = r2.d;
        r0.b(r2);
        goto L_0x00a3;
    L_0x004d:
        r0 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.m;
        r0 = r0.createBuilder();
        r0 = (defpackage.awyu) r0;
        r3 = r6.al;
        r3 = r3.m();
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r4;
        if (r3 == 0) goto L_0x009d;
    L_0x0064:
        r5 = r4.a;
        r2 = r2 | r5;
        r4.a = r2;
        r4.c = r3;
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r2;
        r3 = r2.a;
        r3 = r3 | 4;
        r2.a = r3;
        r2.d = r1;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r0;
        r2 = defpackage.apxu.d;
        r2 = r2.createBuilder();
        r2 = (defpackage.apxx) r2;
        r3 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
        r2.a(r3, r0);
        r0 = r2.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.apxu) r0;
        r2 = r6.Z;
        r2.b(r0);
        goto L_0x00a3;
    L_0x009d:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        throw r7;
    L_0x00a3:
        r0 = r6.aa;
        r2 = r0.e;
        if (r2 != 0) goto L_0x00ab;
    L_0x00a9:
        r7 = 1;
        goto L_0x00c0;
    L_0x00ab:
        r2 = r0.i;
        r3 = r0.f;
        r3 = r3.a();
        r3 = r3 + -1;
        if (r2 >= r3) goto L_0x00a9;
    L_0x00b7:
        r0.j = r7;
        r7 = r0.k;
        r2 = r2 + r1;
        r7.e(r2);
        r7 = 3;
    L_0x00c0:
        if (r8 == 0) goto L_0x00e9;
    L_0x00c2:
        if (r7 == r1) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00e9;
    L_0x00c5:
        r8 = r6.M_();
        r0 = r6.aL;
        r2 = r6.M_();
        r3 = 2131953429; // 0x7f130715 float:1.9543329E38 double:1.053324948E-314;
        r2 = r2.getString(r3);
        defpackage.xrn.a(r8, r0, r2);
        r8 = r6.M_();
        r8 = defpackage.xrn.c(r8);
        if (r8 != 0) goto L_0x00e9;
    L_0x00e3:
        r7 = defpackage.acwc.LIGHTWEIGHT_PLAYER_AUTO_DISMISS;
        r6.a(r7);
        return r1;
    L_0x00e9:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmp.a(int, boolean):int");
    }
}
