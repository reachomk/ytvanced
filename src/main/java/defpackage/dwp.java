package defpackage;

/* renamed from: dwp */
public final class dwp extends ekk implements ajan, xcp {
    public final dwz a;
    public final dwv b;
    public final dwo c;
    public boolean d;
    public aakj e;
    private final xci f;
    private final ajam g;
    private final zyw h;
    private final bdfu i = new bdfu();
    private final acvx j;

    public dwp(elm elm, xci xci, ajam ajam, zyw zyw, dwz dwz, dwv dwv, dwo dwo, acvx acvx) {
        super(elm);
        this.f = xci;
        this.g = ajam;
        this.h = zyw;
        this.a = dwz;
        this.b = dwv;
        this.c = dwo;
        this.j = acvx;
        this.d = false;
    }

    public final long e() {
        return 1;
    }

    /* JADX WARNING: Missing block: B:13:0x003f, code skipped:
            if (r2 >= defpackage.dwv.a.b) goto L_0x01f2;
     */
    /* JADX WARNING: Missing block: B:26:0x0069, code skipped:
            if (r2 < r9) goto L_0x006b;
     */
    public final void A_() {
        /*
        r12 = this;
        r0 = r12.h;
        r0 = defpackage.foh.x(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r12.i;
        r1 = r12.g;
        r1 = r12.a(r1);
        r0.a(r1);
        goto L_0x0019;
    L_0x0014:
        r0 = r12.f;
        r0.a(r12);
    L_0x0019:
        r0 = r12.d;
        r1 = 0;
        if (r0 != 0) goto L_0x01f2;
    L_0x001e:
        r0 = r12.b;
        r2 = r0.f;
        r2 = r2.a();
        r4 = r0.i;
        r2 = r2 - r4;
        r4 = r0.r;
        r5 = r4 + -1;
        r6 = 0;
        if (r4 == 0) goto L_0x01f1;
    L_0x0030:
        r4 = 3;
        r7 = 2;
        r8 = 1;
        if (r5 == r8) goto L_0x0043;
    L_0x0035:
        if (r5 == r7) goto L_0x0043;
    L_0x0037:
        if (r5 == r4) goto L_0x0043;
    L_0x0039:
        r5 = defpackage.dwv.a;
        r9 = r5.b;
        r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r5 < 0) goto L_0x006b;
    L_0x0041:
        goto L_0x01f2;
    L_0x0043:
        r5 = r0.g;
        r5 = r5.b();
        r9 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        if (r5 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0067;
    L_0x004e:
        r11 = r5.u;
        if (r11 != 0) goto L_0x0054;
    L_0x0052:
        r11 = defpackage.awwh.c;
    L_0x0054:
        r11 = r11.b;
        if (r11 <= 0) goto L_0x0067;
    L_0x0058:
        r9 = java.util.concurrent.TimeUnit.SECONDS;
        r5 = r5.u;
        if (r5 != 0) goto L_0x0060;
    L_0x005e:
        r5 = defpackage.awwh.c;
    L_0x0060:
        r5 = r5.b;
        r10 = (long) r5;
        r9 = r9.toMillis(r10);
    L_0x0067:
        r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r5 >= 0) goto L_0x01f2;
    L_0x006b:
        r2 = r0.r;
        r3 = r2 + -1;
        if (r2 == 0) goto L_0x01f0;
    L_0x0071:
        r2 = 4;
        if (r3 == r8) goto L_0x00ee;
    L_0x0074:
        if (r3 == r7) goto L_0x00df;
    L_0x0076:
        if (r3 == r4) goto L_0x00d0;
    L_0x0078:
        if (r3 == r2) goto L_0x007c;
    L_0x007a:
        goto L_0x01f2;
    L_0x007c:
        r2 = r0.h;
        r2 = r2.a();
        if (r2 == 0) goto L_0x01f2;
    L_0x0084:
        r3 = r2.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x01f2;
    L_0x008a:
        r2 = r2.e;
        if (r2 != 0) goto L_0x0090;
    L_0x008e:
        r2 = defpackage.aulu.bw;
    L_0x0090:
        r2 = r2.bt;
        if (r2 == 0) goto L_0x01f2;
    L_0x0094:
        r2 = r0.j;
        if (r2 != 0) goto L_0x01f2;
    L_0x0098:
        r2 = defpackage.fde.h();
        r3 = r0.m;
        r3 = r3.b;
        if (r3 != 0) goto L_0x00a4;
    L_0x00a2:
        r3 = defpackage.arml.f;
    L_0x00a4:
        r3 = defpackage.ajqy.a(r3);
        r2 = r2.b(r3);
        r2 = (defpackage.fdd) r2;
        r3 = -1;
        r2 = r2.c(r3);
        r2 = (defpackage.fdd) r2;
        r2 = r2.d();
        r2 = (defpackage.fde) r2;
        r3 = r0.d;
        r3.a(r2);
        r2 = new acvs;
        r3 = r0.m;
        r3 = r3.e;
        r2.<init>(r3);
        r0 = r0.n;
        r0.a(r2, r6);
        goto L_0x01f2;
    L_0x00d0:
        r2 = r0.j;
        if (r2 != 0) goto L_0x01f2;
    L_0x00d4:
        r2 = r0.e;
        r3 = r0.k;
        r0 = r0.n;
        r2.a(r3, r0, r6, r6);
        goto L_0x01f2;
    L_0x00df:
        r2 = r0.j;
        if (r2 != 0) goto L_0x01f2;
    L_0x00e3:
        r2 = r0.e;
        r3 = r0.l;
        r0 = r0.n;
        r2.a(r3, r0, r6, r6);
        goto L_0x01f2;
    L_0x00ee:
        r3 = defpackage.xy.b();
        if (r3 == 0) goto L_0x00fc;
    L_0x00f4:
        r3 = r0.b;
        r3 = r3.isInPictureInPictureMode();
        if (r3 != 0) goto L_0x01f2;
    L_0x00fc:
        r3 = r0.c;
        r3 = r3.d();
        if (r3 == 0) goto L_0x01f2;
    L_0x0104:
        r3 = r0.q;
        if (r3 != 0) goto L_0x015d;
    L_0x0108:
        r2 = r0.o;
        if (r2 != 0) goto L_0x0151;
    L_0x010c:
        r2 = new dwy;
        r2.<init>(r0);
        r3 = new android.app.AlertDialog$Builder;
        r4 = r0.b;
        r3.<init>(r4);
        r4 = 2131951915; // 0x7f13012b float:1.9540258E38 double:1.0533242E-314;
        r3 = r3.setTitle(r4);
        r4 = r0.b;
        r5 = new java.lang.Object[r8];
        r7 = r0.g;
        r7 = defpackage.foh.a(r7, r4);
        r5[r1] = r7;
        r7 = 2131951917; // 0x7f13012d float:1.9540262E38 double:1.053324201E-314;
        r4 = r4.getString(r7, r5);
        r3 = r3.setMessage(r4);
        r4 = 2131953619; // 0x7f1307d3 float:1.9543714E38 double:1.0533250417E-314;
        r3 = r3.setNegativeButton(r4, r2);
        r4 = 2131952307; // 0x7f1302b3 float:1.9541053E38 double:1.0533243935E-314;
        r2 = r3.setNegativeButton(r4, r2);
        r3 = 2131953068; // 0x7f1305ac float:1.9542597E38 double:1.0533247694E-314;
        r2 = r2.setPositiveButton(r3, r6);
        r2 = r2.create();
        r0.o = r2;
    L_0x0151:
        r2 = r0.o;
        r2.show();
        r0 = r0.c;
        r0.e();
        goto L_0x01f2;
    L_0x015d:
        r3 = r0.p;
        if (r3 != 0) goto L_0x01e5;
    L_0x0161:
        r3 = new android.app.AlertDialog$Builder;
        r4 = r0.b;
        r3.<init>(r4);
        r4 = r0.q;
        r5 = r4.a;
        r5 = r5 & r8;
        if (r5 == 0) goto L_0x0176;
    L_0x016f:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0177;
    L_0x0173:
        r4 = defpackage.arml.f;
        goto L_0x0177;
    L_0x0176:
        r4 = r6;
    L_0x0177:
        r4 = defpackage.ajqy.a(r4);
        r3 = r3.setTitle(r4);
        r4 = r0.q;
        r5 = r4.a;
        r5 = r5 & r7;
        if (r5 == 0) goto L_0x018d;
    L_0x0186:
        r4 = r4.c;
        if (r4 != 0) goto L_0x018e;
    L_0x018a:
        r4 = defpackage.arml.f;
        goto L_0x018e;
    L_0x018d:
        r4 = r6;
    L_0x018e:
        r4 = defpackage.ajqy.a(r4);
        r3 = r3.setMessage(r4);
        r4 = r0.q;
        r5 = r4.a;
        r2 = r2 & r5;
        if (r2 == 0) goto L_0x01a4;
    L_0x019d:
        r2 = r4.d;
        if (r2 != 0) goto L_0x01a5;
    L_0x01a1:
        r2 = defpackage.arml.f;
        goto L_0x01a5;
    L_0x01a4:
        r2 = r6;
    L_0x01a5:
        r2 = defpackage.ajqy.a(r2);
        r4 = new dwx;
        r4.<init>(r0);
        r2 = r3.setNegativeButton(r2, r4);
        r3 = r0.q;
        r3 = r3.f;
        if (r3 != 0) goto L_0x01ba;
    L_0x01b8:
        r3 = defpackage.aphj.d;
    L_0x01ba:
        if (r3 == 0) goto L_0x01da;
    L_0x01bc:
        r4 = r3.b;
        if (r4 != 0) goto L_0x01c2;
    L_0x01c0:
        r4 = defpackage.aphg.s;
    L_0x01c2:
        r4 = r4.a;
        r4 = r4 & 128;
        if (r4 != 0) goto L_0x01c9;
    L_0x01c8:
        goto L_0x01da;
    L_0x01c9:
        r3 = r3.b;
        if (r3 != 0) goto L_0x01cf;
    L_0x01cd:
        r3 = defpackage.aphg.s;
    L_0x01cf:
        r3 = r3.g;
        if (r3 != 0) goto L_0x01d5;
    L_0x01d3:
        r3 = defpackage.arml.f;
    L_0x01d5:
        r3 = defpackage.ajqy.a(r3);
        goto L_0x01db;
    L_0x01da:
        r3 = r6;
    L_0x01db:
        r2 = r2.setPositiveButton(r3, r6);
        r2 = r2.create();
        r0.p = r2;
    L_0x01e5:
        r2 = r0.p;
        r2.show();
        r0 = r0.c;
        r0.e();
        goto L_0x01f2;
    L_0x01f0:
        throw r6;
    L_0x01f1:
        throw r6;
    L_0x01f2:
        r12.d = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwp.A_():void");
    }

    public final void ar_() {
        if (foh.x(this.h)) {
            this.i.a();
        } else {
            this.f.b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    public final boolean a(defpackage.apao r11) {
        /*
        r10 = this;
        r0 = r10.e;
        r1 = 0;
        if (r0 == 0) goto L_0x0204;
    L_0x0005:
        r0 = defpackage.amqp.c(r0);
        r2 = defpackage.dww.a;
        r0 = r0.a(r2);
        r2 = r0.a();
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x0049;
    L_0x0017:
        r2 = r0.b();
        r2 = (defpackage.ajxu) r2;
        r2 = r2.z;
        if (r2 == 0) goto L_0x0049;
    L_0x0021:
        r2 = r0.b();
        r2 = (defpackage.ajxu) r2;
        r2 = r2.z;
        r2 = r2.b;
        if (r2 != 0) goto L_0x002f;
    L_0x002d:
        r2 = defpackage.aozw.c;
    L_0x002f:
        r2 = r2.a;
        r2 = r2 & r4;
        if (r2 == 0) goto L_0x0049;
    L_0x0034:
        r0 = r0.b();
        r0 = (defpackage.ajxu) r0;
        r0 = r0.z;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0042;
    L_0x0040:
        r0 = defpackage.aozw.c;
    L_0x0042:
        r0 = r0.b;
        if (r0 != 0) goto L_0x004a;
    L_0x0046:
        r0 = defpackage.ayvi.r;
        goto L_0x004a;
    L_0x0049:
        r0 = r3;
    L_0x004a:
        r2 = 2;
        if (r0 == 0) goto L_0x006d;
    L_0x004d:
        r5 = r0.p;
        if (r5 != 0) goto L_0x0053;
    L_0x0051:
        r5 = defpackage.ayvk.c;
    L_0x0053:
        r6 = r5.a;
        r6 = r6 & r4;
        if (r6 == 0) goto L_0x007f;
    L_0x0058:
        r5 = r5.b;
        if (r5 != 0) goto L_0x005e;
    L_0x005c:
        r5 = defpackage.ayvg.c;
    L_0x005e:
        r5 = r5.b;
        r5 = defpackage.ayve.a(r5);
        if (r5 == 0) goto L_0x007f;
    L_0x0066:
        if (r5 != r2) goto L_0x007f;
    L_0x0068:
        r0 = defpackage.amqp.b(r0);
        goto L_0x0081;
    L_0x006d:
        if (r11 == 0) goto L_0x007f;
    L_0x006f:
        r0 = r11.a;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x007f;
    L_0x0074:
        r0 = r11.c;
        if (r0 != 0) goto L_0x007a;
    L_0x0078:
        r0 = defpackage.ayvi.r;
    L_0x007a:
        r0 = defpackage.amqp.b(r0);
        goto L_0x0081;
    L_0x007f:
        r0 = defpackage.ampo.a;
    L_0x0081:
        r2 = r0.a();
        if (r2 == 0) goto L_0x00a9;
    L_0x0087:
        r11 = r10.b;
        r2 = r0.b();
        r2 = (defpackage.ayvi) r2;
        r5 = r10.j;
        r6 = r11.k;
        if (r6 == r2) goto L_0x0097;
    L_0x0095:
        r6 = 1;
        goto L_0x0098;
    L_0x0097:
        r6 = 0;
    L_0x0098:
        r7 = 4;
        r11.a(r7, r6, r5);
        r11.k = r2;
        r11 = r0.b();
        r11 = (defpackage.anze) r11;
        r11 = defpackage.amqp.b(r11);
        goto L_0x00d4;
    L_0x00a9:
        if (r11 == 0) goto L_0x00d2;
    L_0x00ab:
        r0 = r11.a;
        r0 = r0 & r4;
        if (r0 == 0) goto L_0x00d2;
    L_0x00b0:
        r0 = r10.b;
        r2 = r11.b;
        if (r2 != 0) goto L_0x00b8;
    L_0x00b6:
        r2 = defpackage.aqwx.g;
    L_0x00b8:
        r5 = r10.j;
        r6 = r0.l;
        if (r6 == r2) goto L_0x00c0;
    L_0x00be:
        r6 = 1;
        goto L_0x00c1;
    L_0x00c0:
        r6 = 0;
    L_0x00c1:
        r7 = 3;
        r0.a(r7, r6, r5);
        r0.l = r2;
        r11 = r11.b;
        if (r11 != 0) goto L_0x00cd;
    L_0x00cb:
        r11 = defpackage.aqwx.g;
    L_0x00cd:
        r11 = defpackage.amqp.b(r11);
        goto L_0x00d4;
    L_0x00d2:
        r11 = defpackage.ampo.a;
    L_0x00d4:
        r0 = r11.a();
        if (r0 == 0) goto L_0x01c8;
    L_0x00da:
        r0 = r10.c;
        r2 = r10.e;
        r2 = r2.b();
        r5 = r10.e;
        r5 = r5.c();
        r6 = r10.e;
        r6 = r6.g();
        r11 = r11.b();
        r11 = (defpackage.anze) r11;
        r0.g = r2;
        r0.a();
        r0.k = r4;
        r7 = r11 instanceof defpackage.aqwx;
        if (r7 != 0) goto L_0x0106;
    L_0x00ff:
        r11 = "background message doesn't contain dismissable_dialog_renderer";
        defpackage.xtl.c(r11);
        goto L_0x01c7;
    L_0x0106:
        r11 = (defpackage.aqwx) r11;
        r7 = r0.i;
        if (r7 != 0) goto L_0x0154;
    L_0x010c:
        r7 = new qg;
        r8 = r0.a;
        r7.<init>(r8);
        r0.i = r7;
        r7 = r0.i;
        defpackage.xlr.a(r7);
        r7 = r0.a;
        r7 = defpackage.ebl.a(r7);
        r8 = "background_failed_dismissible_dialog";
        r7 = r7.putExtra(r8, r4);
        r8 = r0.i;
        r8.d(r3);
        r3 = 2130838380; // 0x7f02036c float:1.728174E38 double:1.0527740404E-314;
        r8.a(r3);
        r8.a(r1);
        r8.b(r4);
        r3 = r0.b;
        r9 = 2131558540; // 0x7f0d008c float:1.8742399E38 double:1.0531298467E-314;
        r3 = r3.getColor(r9);
        r8.t = r3;
        r3 = r0.a;
        r9 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r1 = android.app.PendingIntent.getActivity(r3, r1, r7, r9);
        r8.f = r1;
        r8.c();
        r1 = r0.i;
        defpackage.xlr.a(r1);
    L_0x0154:
        r1 = new qh;
        r1.<init>();
        r3 = r11.d;
        r1.a(r3);
        r3 = r0.i;
        r7 = r11.d;
        r3.b(r7);
        r3.a(r5);
        r11 = r11.d;
        r3.e(r11);
        r3.a(r1);
        r7 = java.lang.System.currentTimeMillis();
        r3.a(r7);
        r11 = r0.h;
        r11 = r2.equals(r11);
        if (r11 != 0) goto L_0x018d;
    L_0x017f:
        r11 = r0.i;
        r1 = r0.b;
        r2 = 2130838379; // 0x7f02036b float:1.7281739E38 double:1.05277404E-314;
        r1 = android.graphics.BitmapFactory.decodeResource(r1, r2);
        r11.a(r1);
    L_0x018d:
        r11 = r0.d;
        r1 = 1005; // 0x3ed float:1.408E-42 double:4.965E-321;
        r2 = r0.i;
        r2 = r2.e();
        r11.notify(r1, r2);
        r11 = r0.g;
        if (r6 == 0) goto L_0x01c7;
    L_0x019e:
        r1 = r0.h;
        r1 = android.text.TextUtils.equals(r11, r1);
        if (r1 != 0) goto L_0x01c7;
    L_0x01a6:
        r1 = r0.f;
        if (r1 != 0) goto L_0x01b5;
    L_0x01aa:
        r1 = r0.b;
        r2 = 2131625946; // 0x7f0e07da float:1.8879114E38 double:1.0531631497E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r0.f = r1;
    L_0x01b5:
        r1 = r6.a(r1, r1);
        r2 = r0.c;
        r1 = r1.a();
        r3 = new dwn;
        r3.<init>(r0, r11);
        r2.b(r1, r3);
    L_0x01c7:
        return r4;
    L_0x01c8:
        r11 = r10.e;
        r11 = r11.l();
        r11 = defpackage.aiqr.e(r11);
        if (r11 != 0) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01e6;
    L_0x01d5:
        r0 = r11.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x01e6;
    L_0x01db:
        r11 = r11.e;
        if (r11 != 0) goto L_0x01e1;
    L_0x01df:
        r11 = defpackage.avls.g;
    L_0x01e1:
        r11 = defpackage.amqp.b(r11);
        goto L_0x01e8;
    L_0x01e6:
        r11 = defpackage.ampo.a;
    L_0x01e8:
        r0 = r11.a();
        if (r0 == 0) goto L_0x0204;
    L_0x01ee:
        r0 = r10.b;
        r11 = r11.b();
        r11 = (defpackage.avls) r11;
        r2 = r10.j;
        r3 = r0.m;
        if (r3 == r11) goto L_0x01fd;
    L_0x01fc:
        r1 = 1;
    L_0x01fd:
        r3 = 5;
        r0.a(r3, r1, r2);
        r0.m = r11;
        return r4;
    L_0x0204:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwp.a(apao):boolean");
    }

    public final void c() {
        this.b.c();
    }

    public final void a(ahkf ahkf) {
        this.e = ahkf.b;
    }

    public final void d() {
        this.e = null;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().f().a(emg.a(this.h, 1099511627776L, 1)).a(new dws(this), dwr.a), ajam.n().f().a(emg.a(this.h, 1099511627776L, 0)).a(new dwu(this), dwt.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkd.class, ahkf.class};
        } else if (i == 0) {
            d();
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
