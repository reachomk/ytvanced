package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kcx */
public final class kcx implements akot {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvo d;
    private final akoj e;
    private final akvp f;
    private final akou g;
    private final FrameLayout h;
    private kcw i;
    private kcw j;

    public kcx(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.g = (akou) amqw.a((Object) flu);
        this.d = (akvo) amqw.a((Object) akvo);
        this.f = akvp;
        this.h = new FrameLayout(context);
        flu.a(this.h);
        this.e = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.g.a();
    }

    public final void a(akpb akpb) {
        this.e.a();
    }

    private final kcw a(int i) {
        return new kcw(this.a, this.b, this.c, this.d, i, this.g, this.f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARNING: Missing block: B:24:0x0056, code skipped:
            if (r0 != 9) goto L_0x0063;
     */
    public final /* synthetic */ void a_(defpackage.akor r8, java.lang.Object r9) {
        /*
        r7 = this;
        r9 = (defpackage.arsg) r9;
        r0 = r8.a;
        r1 = r9.m;
        r1 = r1.d();
        r2 = 0;
        r0.a(r1, r2);
        r0 = r7.h;
        r0.removeAllViews();
        r0 = defpackage.etj.a(r8);
        if (r0 == 0) goto L_0x001b;
    L_0x0019:
        goto L_0x0093;
    L_0x001b:
        r0 = r9.l;
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r0 = defpackage.auma.c;
    L_0x0021:
        r0 = defpackage.kcz.a(r0);
        if (r0 != 0) goto L_0x0093;
    L_0x0027:
        r0 = r7.i;
        if (r0 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x006c;
    L_0x002c:
        r0 = r9.a;
        r0 = r0 & 16384;
        if (r0 == 0) goto L_0x0063;
    L_0x0032:
        r0 = r9.l;
        if (r0 != 0) goto L_0x0038;
    L_0x0036:
        r0 = defpackage.auma.c;
    L_0x0038:
        r0 = r0.b;
        r0 = defpackage.aumc.a(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0040:
        r1 = 8;
        if (r0 != r1) goto L_0x0045;
    L_0x0044:
        goto L_0x0059;
    L_0x0045:
        r0 = r9.l;
        if (r0 != 0) goto L_0x004b;
    L_0x0049:
        r0 = defpackage.auma.c;
    L_0x004b:
        r0 = r0.b;
        r0 = defpackage.aumc.a(r0);
        if (r0 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0063;
    L_0x0054:
        r1 = 9;
        if (r0 == r1) goto L_0x0059;
    L_0x0058:
        goto L_0x0063;
    L_0x0059:
        r0 = 2131035502; // 0x7f05056e float:1.7681552E38 double:1.0528714316E-314;
        r0 = r7.a(r0);
        r7.i = r0;
        goto L_0x006c;
    L_0x0063:
        r0 = 2131034392; // 0x7f050118 float:1.76793E38 double:1.052870883E-314;
        r0 = r7.a(r0);
        r7.i = r0;
    L_0x006c:
        r0 = r7.i;
        r1 = r0.e;
        r3 = r1.getLayoutParams();
        r4 = r0.c;
        r5 = 2131756159; // 0x7f10047f float:1.9143218E38 double:1.0532274835E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.widget.RelativeLayout) r4;
        if (r3 == 0) goto L_0x00a2;
    L_0x0081:
        r3 = r0.a;
        r3 = r3.getResources();
        r5 = r9.l;
        if (r5 != 0) goto L_0x008d;
    L_0x008b:
        r5 = defpackage.auma.c;
    L_0x008d:
        r6 = r0.d;
        defpackage.kcz.a(r3, r5, r1, r4, r6);
        goto L_0x00a2;
    L_0x0093:
        r0 = r7.j;
        if (r0 != 0) goto L_0x00a0;
    L_0x0097:
        r0 = 2131034655; // 0x7f05021f float:1.7679834E38 double:1.052871013E-314;
        r0 = r7.a(r0);
        r7.j = r0;
    L_0x00a0:
        r0 = r7.j;
    L_0x00a2:
        r1 = r7.h;
        r3 = r0.c;
        r1.addView(r3);
        r1 = r9.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x00b6;
    L_0x00af:
        r1 = r9.c;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b3:
        r1 = defpackage.arml.f;
        goto L_0x00b7;
    L_0x00b6:
        r1 = r2;
    L_0x00b7:
        r1 = defpackage.ajqy.a(r1);
        r0.a(r1);
        r1 = r9.a;
        r1 = r1 & 2048;
        if (r1 == 0) goto L_0x00cb;
    L_0x00c4:
        r1 = r9.j;
        if (r1 != 0) goto L_0x00cc;
    L_0x00c8:
        r1 = defpackage.arml.f;
        goto L_0x00cc;
    L_0x00cb:
        r1 = r2;
    L_0x00cc:
        r1 = defpackage.ajqy.a(r1);
        r0.b(r1);
        r1 = r9.b;
        if (r1 != 0) goto L_0x00d9;
    L_0x00d7:
        r1 = defpackage.aygk.f;
    L_0x00d9:
        r0.a(r1);
        r1 = r9.o;
        r1 = r1.size();
        if (r1 <= 0) goto L_0x00ea;
    L_0x00e4:
        r1 = r9.o;
        r0.b(r1);
        goto L_0x010f;
    L_0x00ea:
        r1 = r9.a;
        r1 = r1 & 1024;
        if (r1 == 0) goto L_0x00f7;
    L_0x00f0:
        r1 = r9.i;
        if (r1 != 0) goto L_0x00f8;
    L_0x00f4:
        r1 = defpackage.arml.f;
        goto L_0x00f8;
    L_0x00f7:
        r1 = r2;
    L_0x00f8:
        r1 = defpackage.ajqy.a(r1);
        r3 = r9.a;
        r3 = r3 & 512;
        if (r3 == 0) goto L_0x0108;
    L_0x0102:
        r2 = r9.h;
        if (r2 != 0) goto L_0x0108;
    L_0x0106:
        r2 = defpackage.arml.f;
    L_0x0108:
        r2 = defpackage.ajqy.a(r2);
        r0.a(r1, r2);
    L_0x010f:
        r0.a_(r8, r9);
        r1 = r7.g;
        r1 = r1.a();
        r2 = r9.g;
        if (r2 != 0) goto L_0x011e;
    L_0x011c:
        r2 = defpackage.auvr.c;
    L_0x011e:
        r3 = r8.a;
        r0.a(r1, r2, r9, r3);
        r9 = r7.g;
        r9.a(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcx.a_(akor, java.lang.Object):void");
    }
}
