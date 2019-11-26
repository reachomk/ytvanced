package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* renamed from: lja */
public final class lja implements lkb, lkz {
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final long q = TimeUnit.SECONDS.toMillis(5);
    private final xci A;
    private final ljm B;
    private final ljj C;
    private final bctz D;
    private final boolean E;
    private final boolean F;
    private CharSequence G;
    public int a = -1;
    public final zyw c;
    public final TextView d;
    public final ljp e;
    public final lka f;
    public final Runnable g;
    public final bdfg h;
    public final bdfi i;
    public final lri j;
    public final lri k;
    public final boolean l;
    public boolean m = false;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    private final bcaa r;
    private final View s;
    private final ViewGroup t;
    private final ViewGroup u;
    private final xqc v;
    private final lkh w;
    private final ajam x;
    private final bdfu y;
    private final bdfu z;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x01cf A:{LOOP_END, LOOP:0: B:27:0x01ab->B:31:0x01cf} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01b1 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01b1 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01cf A:{LOOP_END, LOOP:0: B:27:0x01ab->B:31:0x01cf} */
    public lja(defpackage.bcaa r14, defpackage.acvx r15, defpackage.lck r16, defpackage.lci r17, defpackage.ahly r18, defpackage.vwo r19, defpackage.ahkx r20, defpackage.vrk r21, defpackage.lkm r22, defpackage.zyw r23, defpackage.ajam r24, defpackage.xci r25, defpackage.lkd r26) {
        /*
        r13 = this;
        r0 = r13;
        r1 = r14;
        r2 = r15;
        r3 = r22;
        r4 = new ljt;
        r4.<init>();
        r5 = new ljw;
        r5.<init>();
        r6 = r26.d();
        r6 = (com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar) r6;
        r7 = new lkh;
        r8 = r3.a;
        r8 = r8.get();
        r8 = (defpackage.zyw) r8;
        r9 = 1;
        r8 = defpackage.lkm.a(r8, r9);
        r8 = (defpackage.zyw) r8;
        r10 = r3.b;
        r10 = r10.get();
        r10 = (defpackage.ajam) r10;
        r11 = 2;
        r10 = defpackage.lkm.a(r10, r11);
        r10 = (defpackage.ajam) r10;
        r3 = r3.c;
        r3 = r3.get();
        r3 = (defpackage.xci) r3;
        r12 = 3;
        r3 = defpackage.lkm.a(r3, r12);
        r3 = (defpackage.xci) r3;
        r12 = 4;
        r6 = defpackage.lkm.a(r6, r12);
        r6 = (com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar) r6;
        r7.<init>(r8, r10, r3, r6);
        r3 = r26.c();
        r6 = new lka;
        r8 = 2131756752; // 0x7f1006d0 float:1.914442E38 double:1.0532277765E-314;
        r8 = r3.findViewById(r8);
        r8 = (android.widget.ImageView) r8;
        r10 = 2131755754; // 0x7f1002ea float:1.9142396E38 double:1.0532272834E-314;
        r3 = r3.findViewById(r10);
        r3 = (android.widget.ProgressBar) r3;
        r10 = new ljh;
        r10.<init>(r14, r15);
        r6.<init>(r8, r3, r10);
        r13.<init>();
        r3 = -1;
        r0.a = r3;
        r3 = 0;
        r0.m = r3;
        r8 = r23;
        r0.c = r8;
        r10 = defpackage.foh.f(r23);
        r0.E = r10;
        if (r10 != 0) goto L_0x0089;
    L_0x0083:
        r10 = new lrg;
        r10.<init>();
        goto L_0x008e;
    L_0x0089:
        r10 = new lrl;
        r10.<init>();
    L_0x008e:
        r0.j = r10;
        r10 = r0.E;
        if (r10 != 0) goto L_0x009a;
    L_0x0094:
        r10 = new lrg;
        r10.<init>();
        goto L_0x009f;
    L_0x009a:
        r10 = new lrf;
        r10.<init>();
    L_0x009f:
        r0.k = r10;
        r0.r = r1;
        r0.w = r7;
        r0.f = r6;
        r1 = r24;
        r0.x = r1;
        r7 = r25;
        r0.A = r7;
        r7 = new bdfu;
        r7.<init>();
        r0.y = r7;
        r7 = new bdfu;
        r7.<init>();
        r0.z = r7;
        r7 = new ljm;
        r7.<init>(r13);
        r0.B = r7;
        r7 = new ljj;
        r7.<init>(r13);
        r0.C = r7;
        r7 = new ljk;
        r7.<init>(r13);
        r0.g = r7;
        r7 = r23.a();
        if (r7 == 0) goto L_0x00e5;
    L_0x00d8:
        r7 = r7.e;
        if (r7 != 0) goto L_0x00de;
    L_0x00dc:
        r7 = defpackage.aulu.bw;
    L_0x00de:
        r7 = r7.aT;
        if (r7 != 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00e5;
    L_0x00e3:
        r7 = 1;
        goto L_0x00e6;
    L_0x00e5:
        r7 = 0;
    L_0x00e6:
        r0.F = r7;
        r7 = r23.a();
        if (r7 == 0) goto L_0x00fb;
    L_0x00ee:
        r7 = r7.e;
        if (r7 != 0) goto L_0x00f4;
    L_0x00f2:
        r7 = defpackage.aulu.bw;
    L_0x00f4:
        r7 = r7.bi;
        if (r7 != 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00fb;
    L_0x00f9:
        r7 = 1;
        goto L_0x00fc;
    L_0x00fb:
        r7 = 0;
    L_0x00fc:
        r0.l = r7;
        r7 = r26.c();
        r0.s = r7;
        r7 = r0.s;
        r8 = 2131756747; // 0x7f1006cb float:1.914441E38 double:1.053227774E-314;
        r7 = r7.findViewById(r8);
        r7 = (android.view.ViewGroup) r7;
        r0.t = r7;
        r7 = r0.t;
        r8 = new liz;
        r10 = r16;
        r8.<init>(r15, r10);
        r7.setOnClickListener(r8);
        r7 = r0.t;
        r8 = 2131756751; // 0x7f1006cf float:1.9144418E38 double:1.053227776E-314;
        r7 = r7.findViewById(r8);
        r8 = new ljc;
        r10 = r17;
        r8.<init>(r15, r10);
        r7.setOnClickListener(r8);
        r7 = r0.t;
        r8 = 2131756748; // 0x7f1006cc float:1.9144412E38 double:1.0532277745E-314;
        r7 = r7.findViewById(r8);
        r7 = (android.widget.TextView) r7;
        r0.d = r7;
        r7 = r0.t;
        r8 = 2131756750; // 0x7f1006ce float:1.9144416E38 double:1.0532277755E-314;
        r7 = r7.findViewById(r8);
        r7 = (android.widget.TextView) r7;
        r8 = new ljp;
        r8.<init>(r7);
        r0.e = r8;
        r7 = r0.t;
        r8 = 2131756464; // 0x7f1005b0 float:1.9143836E38 double:1.053227634E-314;
        r7 = r7.findViewById(r8);
        r7 = (android.view.ViewGroup) r7;
        r0.u = r7;
        r7 = r0.t;
        r8 = r7.getId();
        r10 = new java.lang.Object[r11];
        r10[r3] = r4;
        r10[r9] = r5;
        r7.setTag(r8, r10);
        r7 = defpackage.amqw.a(r13);
        r7 = (defpackage.lja) r7;
        r5.b = r7;
        r7 = r19;
        r7.a(r4);
        r7 = r18;
        r7.a(r5);
        r7 = r20;
        r5.a(r7);
        r4.b = r9;
        r7 = new wad;
        r8 = r21;
        r7.<init>(r15, r8);
        r4.a = r7;
        r2 = r4.a;
        r4 = r6.g;
        r2.a(r4);
        r2 = new xnz;
        r4 = r0.t;
        r7 = 2131755509; // 0x7f1001f5 float:1.91419E38 double:1.0532271623E-314;
        r4 = r4.findViewById(r7);
        r4 = (com.google.android.libraries.youtube.common.ui.YouTubeTextView) r4;
        r2.<init>(r4, r3);
        r0.v = r2;
        r5.d = r9;
        r5.c = r6;
        r2 = 0;
    L_0x01ab:
        r4 = r5.a;
        r7 = r4.b;
        if (r2 < r7) goto L_0x01cf;
    L_0x01b1:
        r7 = r26;
        r7.a(r13);
        r2 = java.lang.Boolean.valueOf(r3);
        r2 = defpackage.bdfg.b(r2);
        r0.h = r2;
        r2 = defpackage.bdfi.h();
        r0.i = r2;
        r1 = r24.Q();
        r1 = r1.d;
        r0.D = r1;
        return;
    L_0x01cf:
        r7 = r26;
        r4 = r4.a(r2);
        r4 = (defpackage.ahkx) r4;
        r6.a(r4);
        r2 = r2 + 1;
        goto L_0x01ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lja.<init>(bcaa, acvx, lck, lci, ahly, vwo, ahkx, vrk, lkm, zyw, ajam, xci, lkd):void");
    }

    public static int a(boolean z, boolean z2) {
        int i;
        if (z) {
            i = 1;
        } else if (z2) {
            return 4;
        } else {
            i = 2;
        }
        return i;
    }

    public final void a() {
        if (foh.x(this.c)) {
            this.y.a();
            this.y.a(this.B.a(this.x));
        } else {
            this.A.a(this.B);
        }
        this.A.a(this.C);
        Object obj = this.w;
        if (foh.x(obj.i)) {
            obj.k.a();
            obj.k.a(obj.a(obj.j));
        } else {
            obj.l.a(obj);
        }
        this.z.a(bctz.a(this.h, this.i, ljb.a).a(new lje(this), ljd.a));
        this.z.a(bctz.a(this.h, this.D, ljg.a).a(new ljf(this), lji.a));
    }

    public final void b() {
        if (foh.x(this.c)) {
            this.y.a();
        } else {
            this.A.b(this.B);
        }
        this.A.b(this.C);
        lkh lkh = this.w;
        if (foh.x(lkh.i)) {
            lkh.k.a();
        } else {
            lkh.l.b(lkh);
        }
        if (this.F || this.l) {
            this.d.removeCallbacks(this.g);
            this.d.setSelected(false);
        }
        this.z.a();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        if (!(TextUtils.isEmpty(charSequence) || TextUtils.equals(this.n, charSequence))) {
            this.n = charSequence;
            a(charSequence);
        }
        this.e.a(charSequence2);
    }

    public final void a(CharSequence charSequence) {
        if (this.F) {
            this.d.removeCallbacks(this.g);
            this.d.setSelected(false);
            this.d.postDelayed(this.g, q);
        }
        this.d.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            if (this.a == 1) {
                a(this.G);
            }
        }
    }

    public final void c() {
        if (this.a == 0) {
            a(this.n);
            this.e.a(this.o);
        }
    }

    public final void a(int i) {
        int i2 = this.a;
        if (i != i2) {
            if (i2 == 1) {
                this.G = null;
                this.p = null;
            }
            this.a = i;
            if (i != 0) {
                this.w.a(aicd.i);
                this.v.a(true, true);
                a(this.G);
                this.e.a(this.p);
                return;
            }
            this.w.a(aicd.a);
            this.v.a(false, true);
            c();
        }
    }

    public final void a(lla lla) {
        float o = lla.o();
        float p = lla.p();
        this.t.setAlpha(o);
        this.u.setAlpha(p);
        this.w.a(p * o);
        if (this.u.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.u.getLayoutParams();
            if (lja.a(this.c, this.s.getContext())) {
                marginLayoutParams.topMargin = lla.i().height();
                this.u.setLayoutParams(marginLayoutParams);
                return;
            }
            Rect i = lla.i();
            if (marginLayoutParams.getMarginStart() != i.width()) {
                marginLayoutParams.setMarginStart(i.width());
                this.u.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final View d() {
        return this.s;
    }

    public final void e() {
        this.t.sendAccessibilityEvent(8);
    }

    public final void f() {
        if (TextUtils.isEmpty(this.d.getText())) {
            bcaa bcaa = this.r;
            if (bcaa != null && ((aizy) bcaa.get()).p() != null) {
                boolean z;
                aizy aizy = (aizy) this.r.get();
                ajmq p = aizy.p();
                aakj b = p.b();
                if (b == null) {
                    z = false;
                } else {
                    this.w.a(p.d(), 0, TimeUnit.SECONDS.toMillis((long) b.h()), p.c());
                    a(b.c());
                    this.e.a(b.f());
                    z = b.d();
                }
                this.f.a(lja.a(aizy.c(), z));
            }
        }
    }

    public final void a(int i, int i2) {
        this.j.a(i, i2);
        this.k.a(i, i2);
        if (this.E) {
            boolean a = lrh.a(i);
            boolean a2 = lrh.a(i2);
            if (a && !a2) {
                this.f.a(1);
            }
        }
    }

    public final void a(lqz lqz, lqz lqz2) {
        if (this.E && lqz2 != null) {
            a(lqz2.a());
            this.e.a(lqz2.b());
        }
    }

    public static boolean a(zyw zyw, Context context) {
        return foh.o(zyw) && xss.a(context);
    }
}
