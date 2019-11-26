package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upr */
public final class upr implements Runnable {
    private float a;
    private long b;
    private final /* synthetic */ VideoTrimView c;

    public final void a(float f) {
        float f2 = this.a;
        if (f2 != f) {
            if (f2 == 0.0f) {
                this.c.postOnAnimation(this);
                this.b = AnimationUtils.currentAnimationTimeMillis();
            }
            this.a = f;
        }
    }

    public final boolean a() {
        return this.a != 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Missing block: B:15:0x006b, code skipped:
            if ((r10 + r3) > r6) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:19:0x0087, code skipped:
            if ((r10 + r3) < r6) goto L_0x0089;
     */
    public final void run() {
        /*
        r16 = this;
        r0 = r16;
        r1 = r16.a();
        if (r1 != 0) goto L_0x002e;
    L_0x0008:
        r1 = r0.c;
        r2 = r1.t;
        r3 = defpackage.upu.Begin;
        if (r2 != r3) goto L_0x0018;
    L_0x0010:
        r2 = r1.f();
        r1.a(r2);
        goto L_0x0025;
    L_0x0018:
        r2 = r1.t;
        r3 = defpackage.upu.End;
        if (r2 != r3) goto L_0x0025;
    L_0x001e:
        r2 = r1.g();
        r1.b(r2);
    L_0x0025:
        r1.b();
        r1 = r0.c;
        r1.removeCallbacks(r0);
        return;
    L_0x002e:
        r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        r3 = r0.b;
        r5 = r0.c;
        r6 = r5.l;
        r3 = r1 - r3;
        r3 = (float) r3;
        r4 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r3 = r3 / r4;
        r6 = r6 * r3;
        r3 = r0.a;
        r6 = r6 * r3;
        r3 = r5.p;
        r3 = r3.a();
        if (r3 != 0) goto L_0x0120;
    L_0x004c:
        r6 = r6 * r4;
        r3 = (long) r6;
        r6 = r5.t;
        r7 = defpackage.upu.Begin;
        r8 = 0;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r6 != r7) goto L_0x006e;
    L_0x0058:
        r6 = r5.g();
        r10 = r5.h();
        r6 = r6 - r10;
        r10 = r5.p;
        r10 = r10.b(r9);
        r12 = r10 + r3;
        r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r14 <= 0) goto L_0x008b;
    L_0x006d:
        goto L_0x0089;
    L_0x006e:
        r6 = r5.t;
        r7 = defpackage.upu.End;
        if (r6 != r7) goto L_0x008b;
    L_0x0074:
        r6 = r5.f();
        r10 = r5.h();
        r6 = r6 + r10;
        r10 = r5.p;
        r10 = r10.b(r8);
        r12 = r10 + r3;
        r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r14 >= 0) goto L_0x008b;
    L_0x0089:
        r3 = r6 - r10;
    L_0x008b:
        r6 = r5.p;
        r7 = r6.c;
        defpackage.uhy.b(r7);
        r7 = r6.a();
        r7 = r7 ^ 1;
        defpackage.uhy.b(r7);
        r7 = r6.d;
        r7 = r7 instanceof defpackage.ujb;
        defpackage.uhy.b(r7);
        r7 = r6.d;
        r7 = (defpackage.ujb) r7;
        r10 = r7.a;
        r12 = r10 + r3;
        r14 = r7.b;
        r14 = r14 + r3;
        r3 = 0;
        r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1));
        if (r7 < 0) goto L_0x00be;
    L_0x00b3:
        r3 = r6.b;
        r7 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1));
        if (r7 <= 0) goto L_0x00bb;
    L_0x00b9:
        r3 = r3 - r14;
        goto L_0x00bf;
    L_0x00bb:
        r3 = 0;
        goto L_0x00bf;
    L_0x00be:
        r3 = -r12;
    L_0x00bf:
        r7 = new ujb;
        r12 = r12 + r3;
        r14 = r14 + r3;
        r7.<init>(r12, r14);
        r6.d = r7;
        r3 = r6.d;
        r3 = r3.a(r10);
        r6.b();
        r4 = r5.f;
        r6 = r5.o;
        r6 = r6.width();
        r6 = (float) r6;
        r3 = r3 * r6;
        r4 = r4 + r3;
        r5.f = r4;
        r3 = r5.s;
        r4 = r5.p;
        r6 = r4.b(r8);
        r4 = r5.p;
        r8 = r4.b(r9);
        r3.a(r6, r8);
        r3 = r5.n;
        r5.a(r3);
        r3 = r5.o;
        r3 = r3.left;
        r3 = (float) r3;
        r4 = r5.o;
        r4 = r4.right;
        r4 = (float) r4;
        r6 = r5.v;
        r4 = java.lang.Math.min(r4, r6);
        r3 = java.lang.Math.max(r3, r4);
        r3 = r5.a(r3);
        r6 = r5.t;
        r7 = defpackage.upu.Begin;
        if (r6 != r7) goto L_0x0117;
    L_0x0113:
        r5.a(r3);
        goto L_0x0120;
    L_0x0117:
        r6 = r5.t;
        r7 = defpackage.upu.End;
        if (r6 != r7) goto L_0x0120;
    L_0x011d:
        r5.b(r3);
    L_0x0120:
        r0.b = r1;
        r1 = r0.c;
        r1.postOnAnimation(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upr.run():void");
    }

    public /* synthetic */ upr(VideoTrimView videoTrimView) {
        this.c = videoTrimView;
    }
}
