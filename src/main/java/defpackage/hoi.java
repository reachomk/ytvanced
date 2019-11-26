package defpackage;

import android.content.Context;

/* renamed from: hoi */
public final class hoi extends hnn {
    private final Context a;
    private final bcaa b;
    private final zyw c;

    public hoi(Context context, bcaa bcaa, zyw zyw) {
        super(agqy.class, aqgs.class);
        this.a = context;
        this.b = bcaa;
        this.c = zyw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x029c  */
    public final /* synthetic */ java.lang.Object a(java.lang.Object r13, defpackage.amur r14) {
        /*
        r12 = this;
        r13 = (defpackage.agqy) r13;
        r0 = "downloads_page_item_index";
        r1 = defpackage.hnn.a(r14, r0);
        defpackage.amqw.a(r1);
        r1 = "downloads_page_item_ve_type";
        r2 = defpackage.hnn.a(r14, r1);
        defpackage.amqw.a(r2);
        r2 = r12.b;
        r2 = r2.get();
        r2 = (defpackage.hoc) r2;
        r3 = 1;
        r4 = 0;
        if (r14 == 0) goto L_0x0035;
    L_0x0020:
        r5 = java.lang.Boolean.valueOf(r4);
        r6 = "is_candidate_video";
        r5 = r14.getOrDefault(r6, r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r5 = 1;
        goto L_0x0036;
    L_0x0035:
        r5 = 0;
    L_0x0036:
        r6 = r12.c;
        r6 = defpackage.foh.M(r6);
        if (r6 != 0) goto L_0x0040;
    L_0x003e:
        r6 = 0;
        goto L_0x0044;
    L_0x0040:
        if (r5 == 0) goto L_0x0043;
    L_0x0042:
        goto L_0x003e;
    L_0x0043:
        r6 = 1;
    L_0x0044:
        r0 = r14.get(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r14 = r14.get(r1);
        r14 = (defpackage.acwc) r14;
        r1 = new hol;
        r1.<init>(r4);
        r7 = r12.a;
        r7 = r13.a(r7);
        r8 = new java.lang.String[r3];
        r8[r4] = r7;
        r7 = defpackage.ajqy.a(r8);
        r1.a = r7;
        r7 = r13.c();
        r8 = new java.lang.String[r3];
        r8[r4] = r7;
        r7 = defpackage.ajqy.a(r8);
        r1.c = r7;
        r7 = r13.e();
        r1.d = r7;
        r7 = 0;
        if (r5 != 0) goto L_0x00a0;
    L_0x0080:
        r5 = "PPSV";
        if (r6 != 0) goto L_0x008d;
    L_0x0084:
        r8 = r13.a();
        r5 = defpackage.aiqo.a(r8, r5, r4);
        goto L_0x00a9;
    L_0x008d:
        r8 = r13.b();
        r10 = r13.h;
        r8 = defpackage.hsz.b(r8, r10);
        r9 = r13.a();
        r5 = defpackage.aiqo.a(r9, r5, r4, r8);
        goto L_0x00a9;
    L_0x00a0:
        r5 = r13.a();
        r8 = 0;
        r5 = defpackage.airn.a(r5, r7, r4, r8);
    L_0x00a9:
        r8 = defpackage.avjf.h;
        r8 = r8.createBuilder();
        r8 = (defpackage.avjh) r8;
        r8.b(r0);
        r14 = r14.dU;
        r8.a(r14);
        r14 = r8.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.avjf) r14;
        r0 = r5.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.apxx) r0;
        r5 = defpackage.avjd.b;
        r0.a(r5, r14);
        r14 = r0.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.apxu) r14;
        r1.f = r14;
        r14 = r2.a(r13, r7);
        r0 = r1.g;
        if (r0 != 0) goto L_0x00e7;
    L_0x00e0:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1.g = r0;
    L_0x00e7:
        r0 = r1.g;
        r2 = defpackage.auvj.j;
        r2 = r2.createBuilder();
        r2 = (defpackage.auvm) r2;
        r2.a(r14);
        r14 = r2.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.auvj) r14;
        r0.add(r14);
        r14 = r13.a();
        r0 = defpackage.ayym.c;
        r0 = r0.createBuilder();
        r0 = (defpackage.ayyl) r0;
        r0.a(r14);
        r14 = r0.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.ayym) r14;
        r1.h = r14;
        r14 = defpackage.ayfo.a;
        r0 = r1.i;
        if (r0 != 0) goto L_0x0125;
    L_0x011e:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1.i = r0;
    L_0x0125:
        r0 = r1.i;
        r2 = defpackage.ayfu.q;
        r2 = r2.createBuilder();
        r2 = (defpackage.ayft) r2;
        r2.a(r14);
        r14 = r2.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.ayfu) r14;
        r0.add(r14);
        if (r6 != 0) goto L_0x0140;
    L_0x013f:
        goto L_0x0180;
    L_0x0140:
        r5 = r13.b();
        r7 = r13.h;
        r14 = defpackage.hsz.a(r5, r7);
        r0 = defpackage.ayfq.c;
        r0 = r0.createBuilder();
        r0 = (defpackage.ayfp) r0;
        r0.a(r14);
        r14 = r0.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.ayfq) r14;
        r0 = r1.i;
        if (r0 != 0) goto L_0x0168;
    L_0x0161:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1.i = r0;
    L_0x0168:
        r0 = r1.i;
        r2 = defpackage.ayfu.q;
        r2 = r2.createBuilder();
        r2 = (defpackage.ayft) r2;
        r2.a(r14);
        r14 = r2.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.ayfu) r14;
        r0.add(r14);
    L_0x0180:
        r13 = r13.d();
        if (r13 == 0) goto L_0x019a;
    L_0x0186:
        r14 = r13.b;
        r0 = new java.lang.String[r3];
        r0[r4] = r14;
        r14 = defpackage.ajqy.a(r0);
        r1.b = r14;
        r13 = r13.c;
        r13 = r13.d();
        r1.e = r13;
    L_0x019a:
        r13 = defpackage.aqgs.H;
        r13 = r13.createBuilder();
        r13 = (defpackage.aqgv) r13;
        r14 = r1.a;
        if (r14 != 0) goto L_0x01a7;
    L_0x01a6:
        goto L_0x01b6;
    L_0x01a7:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.e = r14;
        r14 = r0.a;
        r14 = r14 | 4;
        r0.a = r14;
    L_0x01b6:
        r14 = r1.b;
        if (r14 != 0) goto L_0x01bb;
    L_0x01ba:
        goto L_0x01ca;
    L_0x01bb:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.g = r14;
        r14 = r0.a;
        r14 = r14 | 16;
        r0.a = r14;
    L_0x01ca:
        r14 = r1.c;
        if (r14 != 0) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01de;
    L_0x01cf:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.n = r14;
        r14 = r0.a;
        r14 = r14 | 2048;
        r0.a = r14;
    L_0x01de:
        r14 = r1.d;
        if (r14 != 0) goto L_0x01e3;
    L_0x01e2:
        goto L_0x01f2;
    L_0x01e3:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.d = r14;
        r14 = r0.a;
        r14 = r14 | 2;
        r0.a = r14;
    L_0x01f2:
        r14 = r1.e;
        if (r14 != 0) goto L_0x01f7;
    L_0x01f6:
        goto L_0x0206;
    L_0x01f7:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.j = r14;
        r14 = r0.a;
        r14 = r14 | 64;
        r0.a = r14;
    L_0x0206:
        r14 = r1.f;
        if (r14 != 0) goto L_0x020b;
    L_0x020a:
        goto L_0x021a;
    L_0x020b:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.o = r14;
        r14 = r0.a;
        r14 = r14 | 4096;
        r0.a = r14;
    L_0x021a:
        r14 = r1.g;
        if (r14 == 0) goto L_0x026c;
    L_0x021e:
        r14 = r14.isEmpty();
        if (r14 == 0) goto L_0x0225;
    L_0x0224:
        goto L_0x026c;
    L_0x0225:
        r14 = defpackage.auvr.c;
        r14 = r14.createBuilder();
        r14 = (defpackage.auvu) r14;
        r0 = r1.g;
        if (r0 == 0) goto L_0x0239;
    L_0x0231:
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0238;
    L_0x0237:
        goto L_0x0239;
    L_0x0238:
        r4 = 1;
    L_0x0239:
        defpackage.amqw.b(r4);
        r0 = defpackage.auvn.l;
        r0 = r0.createBuilder();
        r0 = (defpackage.auvq) r0;
        r2 = r1.g;
        r0.a(r2);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.auvn) r0;
        r14.a(r0);
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r14 = r14.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.auvr) r14;
        r0.z = r14;
        r14 = r0.a;
        r2 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r14 = r14 | r2;
        r0.a = r14;
    L_0x026c:
        r14 = r1.h;
        if (r14 != 0) goto L_0x0271;
    L_0x0270:
        goto L_0x0281;
    L_0x0271:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r0.x = r14;
        r14 = r0.a;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r14 = r14 | r2;
        r0.a = r14;
    L_0x0281:
        r14 = r1.i;
        if (r14 == 0) goto L_0x02a9;
    L_0x0285:
        r14 = r14.isEmpty();
        if (r14 != 0) goto L_0x02a9;
    L_0x028b:
        r14 = r1.i;
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.aqgs) r0;
        r1 = r0.B;
        r1 = r1.a();
        if (r1 != 0) goto L_0x02a4;
    L_0x029c:
        r1 = r0.B;
        r1 = defpackage.anxl.mutableCopy(r1);
        r0.B = r1;
    L_0x02a4:
        r0 = r0.B;
        defpackage.anvf.addAll(r14, r0);
    L_0x02a9:
        r13 = r13.build();
        r13 = (defpackage.anxl) r13;
        r13 = (defpackage.aqgs) r13;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoi.a(java.lang.Object, amur):java.lang.Object");
    }
}
