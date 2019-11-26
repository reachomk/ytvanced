package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kcv */
public final class kcv implements akot {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akou d;
    private final akvo e;
    private final akvp f;
    private final FrameLayout g;
    private kcu h;
    private kcu i;

    public kcv(Context context, akkq akkq, aaas aaas, flu flu, akvo akvo, akvp akvp) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (akou) amqw.a((Object) flu);
        this.e = (akvo) amqw.a((Object) akvo);
        this.f = akvp;
        this.g = new FrameLayout(context);
        flu.a(this.g);
        flu.a(true);
    }

    public final View K_() {
        return this.d.a();
    }

    public final void a(akpb akpb) {
        kcu kcu = this.i;
        if (kcu != null) {
            kcu.a(akpb);
        }
        kcu = this.h;
        if (kcu != null) {
            kcu.a(akpb);
        }
    }

    private final kcu a(int i) {
        return new kcu(this.a, this.b, this.c, this.e, i, this.d, this.f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARNING: Missing block: B:23:0x0056, code skipped:
            if (r0 != 9) goto L_0x0062;
     */
    public final /* synthetic */ void a_(defpackage.akor r9, java.lang.Object r10) {
        /*
        r8 = this;
        r10 = (defpackage.arsa) r10;
        r0 = r9.a;
        r1 = r10.o;
        r1 = r1.d();
        r2 = 0;
        r0.a(r1, r2);
        r0 = r8.g;
        r0.removeAllViews();
        r0 = defpackage.etj.a(r9);
        r1 = 8;
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        goto L_0x0092;
    L_0x001d:
        r0 = r10.n;
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        r0 = defpackage.auma.c;
    L_0x0023:
        r0 = defpackage.kcz.a(r0);
        if (r0 != 0) goto L_0x0092;
    L_0x0029:
        r0 = r8.h;
        if (r0 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x006b;
    L_0x002e:
        r0 = r10.a;
        r0 = r0 & 8192;
        if (r0 == 0) goto L_0x0062;
    L_0x0034:
        r0 = r10.n;
        if (r0 != 0) goto L_0x003a;
    L_0x0038:
        r0 = defpackage.auma.c;
    L_0x003a:
        r0 = r0.b;
        r0 = defpackage.aumc.a(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0042:
        if (r0 != r1) goto L_0x0045;
    L_0x0044:
        goto L_0x0058;
    L_0x0045:
        r0 = r10.n;
        if (r0 != 0) goto L_0x004b;
    L_0x0049:
        r0 = defpackage.auma.c;
    L_0x004b:
        r0 = r0.b;
        r0 = defpackage.aumc.a(r0);
        if (r0 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0062;
    L_0x0054:
        r3 = 9;
        if (r0 != r3) goto L_0x0062;
    L_0x0058:
        r0 = 2131035501; // 0x7f05056d float:1.768155E38 double:1.052871431E-314;
        r0 = r8.a(r0);
        r8.h = r0;
        goto L_0x006b;
    L_0x0062:
        r0 = 2131034387; // 0x7f050113 float:1.767929E38 double:1.0528708807E-314;
        r0 = r8.a(r0);
        r8.h = r0;
    L_0x006b:
        r0 = r8.h;
        r3 = r0.e;
        r4 = r3.getLayoutParams();
        r5 = r0.c;
        r6 = 2131756159; // 0x7f10047f float:1.9143218E38 double:1.0532274835E-314;
        r5 = r5.findViewById(r6);
        r5 = (android.widget.RelativeLayout) r5;
        if (r4 == 0) goto L_0x00a1;
    L_0x0080:
        r4 = r0.a;
        r4 = r4.getResources();
        r6 = r10.n;
        if (r6 != 0) goto L_0x008c;
    L_0x008a:
        r6 = defpackage.auma.c;
    L_0x008c:
        r7 = r0.d;
        defpackage.kcz.a(r4, r6, r3, r5, r7);
        goto L_0x00a1;
    L_0x0092:
        r0 = r8.i;
        if (r0 != 0) goto L_0x009f;
    L_0x0096:
        r0 = 2131034654; // 0x7f05021e float:1.7679832E38 double:1.0528710126E-314;
        r0 = r8.a(r0);
        r8.i = r0;
    L_0x009f:
        r0 = r8.i;
    L_0x00a1:
        r3 = r8.g;
        r4 = r0.c;
        r3.addView(r4);
        r3 = r10.a;
        r1 = r1 & r3;
        if (r1 == 0) goto L_0x00b4;
    L_0x00ad:
        r1 = r10.d;
        if (r1 != 0) goto L_0x00b5;
    L_0x00b1:
        r1 = defpackage.arml.f;
        goto L_0x00b5;
    L_0x00b4:
        r1 = r2;
    L_0x00b5:
        r1 = defpackage.ajqy.a(r1);
        r0.a(r1);
        r1 = r10.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x00c9;
    L_0x00c2:
        r1 = r10.f;
        if (r1 != 0) goto L_0x00ca;
    L_0x00c6:
        r1 = defpackage.arml.f;
        goto L_0x00ca;
    L_0x00c9:
        r1 = r2;
    L_0x00ca:
        r1 = defpackage.ajqy.a(r1);
        r0.b(r1);
        r1 = r10.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x00de;
    L_0x00d7:
        r1 = r10.h;
        if (r1 != 0) goto L_0x00df;
    L_0x00db:
        r1 = defpackage.arml.f;
        goto L_0x00df;
    L_0x00de:
        r1 = r2;
    L_0x00df:
        r1 = defpackage.ajqy.a(r1);
        r0.c(r1);
        r1 = r10.b;
        if (r1 != 0) goto L_0x00ec;
    L_0x00ea:
        r1 = defpackage.awkv.d;
    L_0x00ec:
        r3 = r10.c;
        if (r3 != 0) goto L_0x00f2;
    L_0x00f0:
        r3 = defpackage.aygk.f;
    L_0x00f2:
        r0.a(r1, r3);
        r1 = r10.q;
        r1 = r1.size();
        if (r1 <= 0) goto L_0x0103;
    L_0x00fd:
        r1 = r10.q;
        r0.b(r1);
        goto L_0x0128;
    L_0x0103:
        r1 = r10.a;
        r1 = r1 & 256;
        if (r1 == 0) goto L_0x0110;
    L_0x0109:
        r1 = r10.i;
        if (r1 != 0) goto L_0x0111;
    L_0x010d:
        r1 = defpackage.arml.f;
        goto L_0x0111;
    L_0x0110:
        r1 = r2;
    L_0x0111:
        r1 = defpackage.ajqy.a(r1);
        r3 = r10.a;
        r3 = r3 & 128;
        if (r3 == 0) goto L_0x0121;
    L_0x011b:
        r2 = r10.h;
        if (r2 != 0) goto L_0x0121;
    L_0x011f:
        r2 = defpackage.arml.f;
    L_0x0121:
        r2 = defpackage.ajqy.a(r2);
        r0.a(r1, r2);
    L_0x0128:
        r0.a_(r9, r10);
        r1 = r8.d;
        r1 = r1.a();
        r2 = r10.m;
        if (r2 != 0) goto L_0x0137;
    L_0x0135:
        r2 = defpackage.auvr.c;
    L_0x0137:
        r3 = r9.a;
        r0.a(r1, r2, r10, r3);
        r10 = r8.d;
        r10.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcv.a_(akor, java.lang.Object):void");
    }
}
