package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: hyy */
public final class hyy extends ails {
    public View a;
    public int b;
    private final int i;
    private final int j;
    private final bcaa k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private hza p;
    private View q;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A:{SYNTHETIC, RETURN} */
    public hyy(android.content.Context r10, defpackage.aims r11, defpackage.akkq r12, defpackage.aaas r13, defpackage.acvx r14, defpackage.akpe r15, defpackage.bcaa r16, defpackage.zyw r17) {
        /*
        r9 = this;
        r8 = r9;
        r0 = defpackage.foh.c(r17);
        if (r0 != 0) goto L_0x000e;
    L_0x0007:
        r0 = 2131034190; // 0x7f05004e float:1.767889E38 double:1.0528707834E-314;
        r7 = 2131034190; // 0x7f05004e float:1.767889E38 double:1.0528707834E-314;
        goto L_0x0014;
    L_0x000e:
        r0 = 2131034191; // 0x7f05004f float:1.7678893E38 double:1.052870784E-314;
        r7 = 2131034191; // 0x7f05004f float:1.7678893E38 double:1.052870784E-314;
    L_0x0014:
        r0 = r9;
        r1 = r10;
        r2 = r11;
        r3 = r14;
        r4 = r15;
        r5 = r12;
        r6 = r13;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r0 = defpackage.amqw.a(r16);
        r0 = (defpackage.bcaa) r0;
        r8.k = r0;
        r0 = r17.a();
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x003b;
    L_0x002e:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0034;
    L_0x0032:
        r0 = defpackage.aulu.bw;
    L_0x0034:
        r0 = r0.be;
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r0 = 1;
        goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        r8.m = r0;
        r0 = r17.a();
        if (r0 == 0) goto L_0x0051;
    L_0x0044:
        r0 = r0.e;
        if (r0 != 0) goto L_0x004a;
    L_0x0048:
        r0 = defpackage.aulu.bw;
    L_0x004a:
        r0 = r0.bd;
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r0 = 1;
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        r8.l = r0;
        r0 = r17.a();
        if (r0 == 0) goto L_0x0066;
    L_0x005a:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0060;
    L_0x005e:
        r0 = defpackage.aulu.bw;
    L_0x0060:
        r0 = r0.at;
        if (r0 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0066;
    L_0x0065:
        r2 = 1;
    L_0x0066:
        r8.n = r2;
        r0 = defpackage.foh.c(r17);
        r8.o = r0;
        r0 = r10.getResources();
        r1 = 2131626662; // 0x7f0e0aa6 float:1.8880567E38 double:1.0531635035E-314;
        r0 = r0.getDimensionPixelSize(r1);
        r1 = r10.getResources();
        r2 = 2131624094; // 0x7f0e009e float:1.8875358E38 double:1.0531622347E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r10.getResources();
        r3 = 2131624097; // 0x7f0e00a1 float:1.8875364E38 double:1.053162236E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r8.i = r2;
        r8.j = r1;
        r1 = r1 - r0;
        r8.b = r1;
        r0 = r8.o;
        if (r0 != 0) goto L_0x009d;
    L_0x009a:
        r9.g();
    L_0x009d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyy.<init>(android.content.Context, aims, akkq, aaas, acvx, akpe, bcaa, zyw):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.related_endscreen_results);
        boolean z = this.o;
        if (z) {
            recyclerView.r = true;
        }
        if (this.m) {
            if (z) {
                this.q = ((ViewStub) findViewById(R.id.related_endscreen_more_entrypoint_stub)).inflate();
            } else {
                this.q = findViewById(R.id.related_endscreen_more_entrypoint);
            }
            if (this.n) {
                this.q.setOnClickListener(new hzb(this));
            }
        } else if (this.l) {
            this.q = findViewById(R.id.related_endscreen_handle_entrypoint);
        } else if (this.n) {
            this.a = findViewById(R.id.engagement_button);
            hzf hzf = (hzf) this.k.get();
            hzf.a = (View) amqw.a(this.a);
            hzf.a(hzf.b);
            hzf.a(hzf.c);
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(0);
        }
        this.p = new hza(this);
        recyclerView.addOnLayoutChangeListener(this.p);
    }

    /* Access modifiers changed, original: protected|final */
    public final akpb a(akkq akkq, aaas aaas) {
        aknw aknw = new aknw();
        aknw.a(arej.class, new hyw(getContext(), akkq, aaas, this.o));
        aknw.a(areh.class, new hyv(getContext(), akkq, aaas, this.o));
        return aknw;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return this.b + this.h;
    }

    public final int c() {
        return (this.l || this.m) ? 0 : this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return this.j + this.h;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (this.a != null) {
            acvx acvx = this.c;
            this.k.get();
            acvx.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_TAP_ENTRYPOINT));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        if (!(this.a == null || this.d.c())) {
            acvx acvx = this.c;
            this.k.get();
            acvx.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_TAP_ENTRYPOINT), null);
        }
        super.f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(float f) {
        super.a(f);
        if (this.q != null) {
            f = e(f);
            float a = th.a(1.0f - (f / 0.75f));
            this.q.setTranslationY(f * ((float) this.i));
            this.q.setAlpha(a);
            if (a == 0.0f) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
        }
    }
}
