package defpackage;

/* renamed from: jlx */
final class jlx implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ jly b;

    jlx(jly jly, Object obj) {
        this.b = jly;
        this.a = obj;
    }

    /* JADX WARNING: Missing block: B:51:0x00d5, code skipped:
            if (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r0.d.a() - r0.e.getLong(defpackage.xay.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, 0)) >= ((long) r2.g)) goto L_0x00d7;
     */
    public final void run() {
        /*
        r11 = this;
        r0 = r11.b;
        r0 = r0.a;
        r0 = r0.b;
        r0 = r0.get();
        r0 = (defpackage.kza) r0;
        r1 = r11.b;
        r1 = r1.a;
        r1 = r1.e;
        defpackage.xak.a();
        r2 = r0.b;
        r8 = 0;
        r3 = "offline_button_poor_connectivity_tooltip_disabled";
        r2 = r2.getBoolean(r3, r8);
        if (r2 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0057;
    L_0x0021:
        r2 = r0.c;
        r9 = r2.iterator();
    L_0x0027:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x0057;
    L_0x002d:
        r2 = r9.next();
        r2 = (defpackage.kzc) r2;
        r4 = r2.j();
        if (r4 == 0) goto L_0x0027;
    L_0x0039:
        r3 = r4.isShown();
        if (r3 == 0) goto L_0x0027;
    L_0x003f:
        r5 = r2.e();
        if (r5 == 0) goto L_0x0027;
    L_0x0045:
        r10 = new kyz;
        r10.<init>(r0);
        r2 = r0.a;
        r3 = r5;
        r6 = r1;
        r7 = r10;
        r2.a(r3, r4, r5, r6, r7);
        r2 = r10.a;
        if (r2 == 0) goto L_0x0027;
    L_0x0056:
        return;
    L_0x0057:
        r0 = r11.b;
        r0 = r0.a;
        r0 = r0.c;
        r1 = r11.a;
        r1 = (defpackage.azdi) r1;
        defpackage.xak.a();
        r2 = defpackage.etm.a(r1);
        if (r2 == 0) goto L_0x0167;
    L_0x006a:
        r3 = r2.a;
        r3 = r3 & 1;
        if (r3 != 0) goto L_0x0072;
    L_0x0070:
        goto L_0x0167;
    L_0x0072:
        r3 = r2.c;
        if (r3 != 0) goto L_0x0078;
    L_0x0076:
        r3 = defpackage.aphj.d;
    L_0x0078:
        r3 = r3.b;
        if (r3 != 0) goto L_0x007e;
    L_0x007c:
        r3 = defpackage.aphg.s;
    L_0x007e:
        r3 = r3.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x0167;
    L_0x0084:
        r3 = r2.c;
        if (r3 != 0) goto L_0x008a;
    L_0x0088:
        r3 = defpackage.aphj.d;
    L_0x008a:
        r3 = r3.b;
        if (r3 != 0) goto L_0x0090;
    L_0x008e:
        r3 = defpackage.aphg.s;
    L_0x0090:
        r3 = r3.a;
        r3 = r3 & 128;
        r4 = 0;
        if (r3 != 0) goto L_0x0099;
    L_0x0097:
        r2 = r4;
        goto L_0x00ab;
    L_0x0099:
        r2 = r2.c;
        if (r2 != 0) goto L_0x009f;
    L_0x009d:
        r2 = defpackage.aphj.d;
    L_0x009f:
        r2 = r2.b;
        if (r2 != 0) goto L_0x00a5;
    L_0x00a3:
        r2 = defpackage.aphg.s;
    L_0x00a5:
        r2 = r2.g;
        if (r2 != 0) goto L_0x00ab;
    L_0x00a9:
        r2 = defpackage.arml.f;
    L_0x00ab:
        r2 = defpackage.ajqy.a(r2);
        if (r2 == 0) goto L_0x0167;
    L_0x00b1:
        r2 = r1.b;
        if (r2 != 0) goto L_0x00b7;
    L_0x00b5:
        r2 = defpackage.azdm.h;
    L_0x00b7:
        if (r2 == 0) goto L_0x00d7;
    L_0x00b9:
        r3 = r0.d;
        r5 = r3.a();
        r3 = r0.e;
        r9 = 0;
        r7 = "video_quality_promo_last_displayed";
        r9 = r3.getLong(r7, r9);
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r5 = r5 - r9;
        r5 = r3.toSeconds(r5);
        r2 = r2.g;
        r2 = (long) r2;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 < 0) goto L_0x0167;
    L_0x00d7:
        r2 = r0.c;
        r2 = r2.g();
        if (r2 == 0) goto L_0x00e7;
    L_0x00df:
        r2 = defpackage.azdn.CELLULAR;
        r2 = defpackage.etm.a(r1, r2);
        if (r2 != 0) goto L_0x00f7;
    L_0x00e7:
        r2 = r0.c;
        r2 = r2.e();
        if (r2 == 0) goto L_0x0167;
    L_0x00ef:
        r2 = defpackage.azdn.WIFI;
        r2 = defpackage.etm.a(r1, r2);
        if (r2 == 0) goto L_0x0167;
    L_0x00f7:
        r2 = defpackage.etm.a(r1);
        r2 = defpackage.amqw.a(r2);
        r2 = (defpackage.avkh) r2;
        r3 = new eto;
        r3.<init>(r0, r1, r2);
        r1 = r0.f;
        r5 = r1.b();
        r6 = r2.a;
        r6 = r6 & 1;
        if (r6 == 0) goto L_0x0119;
    L_0x0112:
        r6 = r2.b;
        if (r6 != 0) goto L_0x011a;
    L_0x0116:
        r6 = defpackage.arml.f;
        goto L_0x011a;
    L_0x0119:
        r6 = r4;
    L_0x011a:
        r6 = defpackage.ajqy.a(r6);
        r5 = r5.b(r6);
        r6 = r2.c;
        if (r6 != 0) goto L_0x0128;
    L_0x0126:
        r6 = defpackage.aphj.d;
    L_0x0128:
        r6 = r6.b;
        if (r6 != 0) goto L_0x012e;
    L_0x012c:
        r6 = defpackage.aphg.s;
    L_0x012e:
        r6 = r6.a;
        r6 = r6 & 128;
        if (r6 != 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0147;
    L_0x0135:
        r4 = r2.c;
        if (r4 != 0) goto L_0x013b;
    L_0x0139:
        r4 = defpackage.aphj.d;
    L_0x013b:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0141;
    L_0x013f:
        r4 = defpackage.aphg.s;
    L_0x0141:
        r4 = r4.g;
        if (r4 != 0) goto L_0x0147;
    L_0x0145:
        r4 = defpackage.arml.f;
    L_0x0147:
        r4 = defpackage.ajqy.a(r4);
        r4 = r4.toString();
        r6 = new etl;
        r6.<init>(r0, r2);
        r0 = r5.a(r4, r6);
        r0 = r0.a(r3);
        r0 = r0.c(r8);
        r0 = r0.d();
        r1.b(r0);
    L_0x0167:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlx.run():void");
    }
}
