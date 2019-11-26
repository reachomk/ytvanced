package defpackage;

import com.google.protos.youtube.api.innertube.AdPreviewRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;

/* renamed from: wad */
public final class wad extends vzs {
    public boolean a;
    private final acvx f;
    private final vrk g;
    private boolean h;
    private int i;

    public wad(acvx acvx, vrk vrk) {
        super(vyg.p().a());
        this.f = acvx;
        this.g = vrk;
    }

    public final void a() {
    }

    private static axoq a(vyg vyg) {
        if (vyg.a() != null) {
            anxp anxp = vyg.a().c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(SkipAdRendererOuterClass.skipButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = vyg.a().c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(SkipAdRendererOuterClass.skipButtonRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (axoq) b;
            }
        }
        return null;
    }

    private static aoiy b(vyg vyg) {
        if (vyg.a() != null) {
            anxp anxp = vyg.a().b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(AdPreviewRendererOuterClass.adPreviewRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = vyg.a().b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(AdPreviewRendererOuterClass.adPreviewRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return (aoiy) b;
            }
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:16:0x007e, code skipped:
            if (r4.i == r1.l) goto L_0x00a9;
     */
    public final /* synthetic */ void a(java.lang.Object r5, boolean r6) {
        /*
        r4 = this;
        r5 = (defpackage.vyg) r5;
        r0 = r5.i();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.i();
        if (r0 != r1) goto L_0x0011;
    L_0x0010:
        goto L_0x001a;
    L_0x0011:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = defpackage.vsm.POST_ROLL;
        r0.a(r1);
    L_0x001a:
        r0 = r5.c();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.c();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0038;
    L_0x002d:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.c();
        r0.a(r1);
    L_0x0038:
        r0 = r5.c();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.c();
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0055;
    L_0x004a:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.c();
        r0.a(r1);
    L_0x0055:
        r0 = r4.b;
        r0 = (defpackage.vyg) r0;
        r0 = r0.d();
        r1 = r5.d();
        if (r0 == r1) goto L_0x0064;
    L_0x0063:
        goto L_0x0080;
    L_0x0064:
        r0 = r4.b;
        r0 = (defpackage.vyg) r0;
        r0 = r0.e();
        r1 = r5.e();
        if (r0 != r1) goto L_0x0080;
    L_0x0072:
        r0 = r4.h;
        r1 = r4.g;
        r2 = r1.k;
        if (r0 != r2) goto L_0x0080;
    L_0x007a:
        r0 = r4.i;
        r1 = r1.l;
        if (r0 == r1) goto L_0x00a9;
    L_0x0080:
        r0 = r4.g;
        r1 = r0.k;
        r4.h = r1;
        r0 = r0.l;
        r4.i = r0;
        r2 = r4.c;
        r2 = (defpackage.vzk) r2;
        r2.a(r1, r0);
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.d();
        r2 = r4.a;
        r3 = 1;
        if (r2 != 0) goto L_0x00a6;
    L_0x009e:
        r2 = r5.e();
        if (r2 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        r3 = 0;
    L_0x00a6:
        r0.a(r1, r3);
    L_0x00a9:
        r0 = r5.g();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.g();
        r2 = -1;
        if (r0 != r1) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00cc;
    L_0x00b9:
        if (r0 == r2) goto L_0x00cc;
    L_0x00bb:
        r0 = r5.d();
        if (r0 != 0) goto L_0x00cc;
    L_0x00c1:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.g();
        r0.a(r1);
    L_0x00cc:
        r0 = r5.h();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.h();
        if (r0 != r1) goto L_0x00db;
    L_0x00da:
        goto L_0x00e8;
    L_0x00db:
        if (r0 == r2) goto L_0x00e8;
    L_0x00dd:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.h();
        r0.b(r1);
    L_0x00e8:
        r0 = r5.f();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.f();
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 != 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x0100;
    L_0x00f9:
        r1 = r4.c;
        r1 = (defpackage.vzk) r1;
        r1.a(r0);
    L_0x0100:
        r0 = defpackage.wad.a(r5);
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = defpackage.wad.a(r1);
        r1 = defpackage.amqq.a(r1, r0);
        if (r1 == 0) goto L_0x0113;
    L_0x0112:
        goto L_0x0127;
    L_0x0113:
        r1 = r4.c;
        r1 = (defpackage.vzk) r1;
        r1.a(r0);
        if (r0 == 0) goto L_0x0127;
    L_0x011c:
        r1 = r4.f;
        r0 = r0.e;
        r0 = r0.d();
        r1.a(r0);
    L_0x0127:
        r0 = defpackage.wad.b(r5);
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = defpackage.wad.b(r1);
        r1 = defpackage.amqq.a(r1, r0);
        if (r1 == 0) goto L_0x013a;
    L_0x0139:
        goto L_0x014e;
    L_0x013a:
        r1 = r4.c;
        r1 = (defpackage.vzk) r1;
        r1.a(r0);
        if (r0 == 0) goto L_0x014e;
    L_0x0143:
        r1 = r4.f;
        r0 = r0.f;
        r0 = r0.d();
        r1.a(r0);
    L_0x014e:
        r0 = r5.b();
        r1 = r4.b;
        r1 = (defpackage.vyg) r1;
        r1 = r1.b();
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0195;
    L_0x0160:
        r0 = r5.b();
        r1 = defpackage.vzc.a;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x016d;
    L_0x016c:
        goto L_0x0195;
    L_0x016d:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.b();
        r2 = r5.l();
        r3 = r4.g;
        r3 = r3.n;
        r0.a(r1, r2, r3);
        r0 = r5.m();
        if (r0 == 0) goto L_0x0195;
    L_0x0186:
        r0 = r4.c;
        r0 = (defpackage.vzk) r0;
        r1 = r5.n();
        r5 = r5.o();
        r0.a(r1, r5);
    L_0x0195:
        r5 = r4.d;
        if (r5 == r6) goto L_0x01a2;
    L_0x0199:
        if (r6 == 0) goto L_0x01a2;
    L_0x019b:
        r5 = r4.c;
        r5 = (defpackage.vzk) r5;
        r5.a();
    L_0x01a2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wad.a(java.lang.Object, boolean):void");
    }
}
