package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.youtube.R;

/* renamed from: fmf */
public final class fmf {
    public final RecyclerView a;
    public final apa b;
    public final ViewGroup c = ((ViewGroup) this.a.getParent());
    public final fmb d;
    public final fmc e;
    public final apv f = new fmp(this);
    public final float g = ((float) this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.expansion_start));
    public final fmr h = new fmr(this.a.getContext());
    public View i;
    public long j;
    public boolean k;
    public apk l;
    public View m;
    private float n;
    private View o;
    private boolean p;

    public fmf(StickyHeaderContainer stickyHeaderContainer, apa apa, fmc fmc) {
        this.b = (apa) amqw.a((Object) apa);
        this.e = (fmc) amqw.a((Object) fmc);
        this.a = ((StickyHeaderContainer) amqw.a((Object) stickyHeaderContainer)).a;
        this.d = new fmb(apa, fmc);
        this.d.b = new fmh(this);
        this.d.i();
    }

    private static boolean a(int i) {
        return (i & 28) == 28;
    }

    public final void a() {
        if (this.i != null) {
            d();
        }
        this.a.b(this.f);
        this.d.b();
        if (this.l != null) {
            this.a.post(new fmg(this));
        }
        e();
        g();
        this.m = null;
    }

    /* JADX WARNING: Missing block: B:17:0x0057, code skipped:
            if (r5 == -1) goto L_0x0059;
     */
    public final void b() {
        /*
        r10 = this;
        r0 = r10.a;
        r0 = r0.n;
        r1 = r10.d;
        r1 = r1.g();
        r3 = r10.d;
        r4 = r10.a;
        r4 = r4.n;
        r5 = r4 instanceof defpackage.ans;
        r6 = 0;
        if (r5 == 0) goto L_0x001c;
    L_0x0015:
        r4 = (defpackage.ans) r4;
        r4 = r4.p();
        goto L_0x0024;
    L_0x001c:
        r4 = "StickyHeaders";
        r5 = "A LinearLayoutManager is required for sticky headers to work";
        android.util.Log.w(r4, r5);
        r4 = 0;
    L_0x0024:
        r5 = r3.d;
        r7 = -1;
        if (r4 == r5) goto L_0x0107;
    L_0x0029:
        r3.d = r4;
        r8 = r3.a(r4);
        r9 = r3.a;
        r9 = r9.size();
        r9 = r9 + r7;
        r8 = java.lang.Math.min(r8, r9);
        if (r8 < 0) goto L_0x0057;
    L_0x003c:
        r9 = r3.a;
        r9 = r9.get(r8);
        r9 = (defpackage.fme) r9;
        r9 = r9.b;
        if (r9 > r4) goto L_0x004a;
    L_0x0048:
        r4 = r8;
        goto L_0x0050;
    L_0x004a:
        if (r8 <= 0) goto L_0x004f;
    L_0x004c:
        r4 = r8 + -1;
        goto L_0x0050;
    L_0x004f:
        r4 = -1;
    L_0x0050:
        r8 = r3.c;
        if (r4 == r8) goto L_0x0057;
    L_0x0054:
        r3.c = r4;
        goto L_0x0059;
    L_0x0057:
        if (r5 != r7) goto L_0x0107;
    L_0x0059:
        r10.e();
        r3 = r10.l;
        if (r3 == 0) goto L_0x006a;
    L_0x0060:
        r3 = r10.a;
        r4 = new fmj;
        r4.<init>(r10);
        r3.post(r4);
    L_0x006a:
        r3 = r10.d;
        r3 = r3.f();
        r4 = defpackage.fma.a(r3);
        if (r4 == 0) goto L_0x00b1;
    L_0x0076:
        r3 = r10.i;
        if (r3 == 0) goto L_0x00ec;
    L_0x007a:
        r3 = r10.d;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x00ad;
    L_0x0086:
        r4 = r3.h();
        if (r4 == 0) goto L_0x00ad;
    L_0x008c:
        r3 = r3.a;
        r3 = r3.get(r6);
        r3 = (defpackage.fme) r3;
        r3 = r3.c;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x00ad;
    L_0x009a:
        r1 = r10.d;
        r1 = r1.e();
        r1 = r0.c(r1);
        if (r1 == 0) goto L_0x00ad;
    L_0x00a6:
        r2 = r10.e;
        r3 = r10.i;
        r2.a(r3, r1);
    L_0x00ad:
        r10.d();
        goto L_0x00ec;
    L_0x00b1:
        r1 = defpackage.fma.b(r3);
        if (r1 == 0) goto L_0x00ec;
    L_0x00b7:
        r1 = r10.i;
        if (r1 == 0) goto L_0x00c7;
    L_0x00bb:
        r1 = r10.j;
        r3 = r10.d;
        r3 = r3.g();
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x00ec;
    L_0x00c7:
        r1 = r10.d;
        r2 = r1.c;
        if (r2 == r7) goto L_0x00d8;
    L_0x00cd:
        r1 = r1.a;
        r1 = r1.get(r2);
        r1 = (defpackage.fme) r1;
        r1 = r1.b;
        goto L_0x00d9;
    L_0x00d8:
        r1 = -1;
    L_0x00d9:
        r2 = r10.i;
        r3 = r10.k;
        if (r3 != 0) goto L_0x00ec;
    L_0x00df:
        r3 = 1;
        r10.k = r3;
        r3 = r10.c;
        r4 = new fmi;
        r4.<init>(r10, r2, r1, r0);
        r3.post(r4);
    L_0x00ec:
        r1 = r10.d;
        r1 = r1.d();
        r2 = 8;
        r2 = defpackage.fma.a(r1, r2);
        if (r2 == 0) goto L_0x0104;
    L_0x00fa:
        r1 = defpackage.fmf.a(r1);
        if (r1 != 0) goto L_0x0107;
    L_0x0100:
        r10.f();
        goto L_0x0107;
    L_0x0104:
        r10.g();
    L_0x0107:
        r1 = r10.i;
        r2 = 0;
        if (r1 == 0) goto L_0x0174;
    L_0x010c:
        r1 = r10.d;
        r1 = r1.d();
        r1 = defpackage.fma.c(r1);
        if (r1 == 0) goto L_0x0134;
    L_0x0118:
        r1 = r10.a(r0);
        if (r1 == 0) goto L_0x0134;
    L_0x011e:
        r3 = r10.i;
        r1 = r1.getTop();
        r4 = r10.i;
        r4 = r4.getHeight();
        r1 = r1 - r4;
        r1 = java.lang.Math.min(r6, r1);
        r1 = (float) r1;
        r3.setTranslationY(r1);
        goto L_0x0174;
    L_0x0134:
        r1 = r10.i;
        r3 = r10.d;
        r4 = r3.h();
        if (r4 == 0) goto L_0x0170;
    L_0x013e:
        r4 = r3.a;
        r4 = r4.size();
        r4 = r4 + r7;
        r5 = r3.a;
        r5 = r5.get(r4);
        r5 = (defpackage.fme) r5;
        r6 = r3.c;
        if (r6 != r4) goto L_0x0159;
    L_0x0151:
        r4 = r5.a;
        r4 = defpackage.fma.b(r4);
        if (r4 != 0) goto L_0x0170;
    L_0x0159:
        r3 = r3.d;
        r4 = r5.b;
        if (r3 < r4) goto L_0x0170;
    L_0x015f:
        r3 = r5.a;
        r3 = defpackage.fma.c(r3);
        if (r3 == 0) goto L_0x0170;
    L_0x0167:
        r3 = r10.i;
        r3 = r3.getHeight();
        r3 = -r3;
        r3 = (float) r3;
        goto L_0x0171;
    L_0x0170:
        r3 = 0;
    L_0x0171:
        r1.setTranslationY(r3);
    L_0x0174:
        r1 = r10.d;
        r1 = r1.d();
        r3 = 20;
        r3 = defpackage.fma.a(r1, r3);
        if (r3 == 0) goto L_0x01c7;
    L_0x0182:
        r0 = r10.a(r0);
        if (r0 != 0) goto L_0x0189;
    L_0x0188:
        goto L_0x01c7;
    L_0x0189:
        r3 = 4;
        r3 = defpackage.fma.a(r1, r3);
        if (r3 == 0) goto L_0x019a;
    L_0x0190:
        r3 = r10.a;
        r4 = new fmk;
        r4.<init>(r10, r0);
        r3.post(r4);
    L_0x019a:
        r3 = r10.g;
        r3 = defpackage.fmf.a(r0, r3);
        r4 = 16;
        r4 = defpackage.fma.a(r1, r4);
        if (r4 == 0) goto L_0x01b6;
    L_0x01a8:
        r10.e();
        r4 = r0.getAlpha();
        r10.n = r4;
        r10.o = r0;
        r0.setAlpha(r3);
    L_0x01b6:
        r0 = defpackage.fmf.a(r1);
        if (r0 == 0) goto L_0x01c7;
    L_0x01bc:
        r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x01c4;
    L_0x01c0:
        r10.g();
        goto L_0x01c7;
    L_0x01c4:
        r10.f();
    L_0x01c7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmf.b():void");
    }

    private final void d() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.c.post(new fml(this, this.i));
            this.i = null;
            this.j = 0;
        }
    }

    private final void e() {
        View view = this.o;
        if (view != null) {
            view.setAlpha(this.n);
            this.o = null;
        }
    }

    public final void c() {
        apk apk = this.l;
        if (apk != null) {
            this.a.b(apk);
            this.l = null;
        }
    }

    private final void f() {
        if (!this.p) {
            this.a.a(fmn.a);
            this.p = true;
        }
    }

    private final void g() {
        if (this.p) {
            this.a.a(null);
            this.p = false;
        }
    }

    public static float a(View view, float f) {
        return 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) view.getTop()) / f));
    }

    public final View a(apn apn) {
        if (apn != null) {
            fmb fmb = this.d;
            int i = fmb.c;
            if (i != -1 ? i < fmb.a.size() - 1 : fmb.h()) {
                return apn.c(this.d.c());
            }
        }
        return null;
    }
}
