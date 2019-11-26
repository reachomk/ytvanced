package defpackage;

/* renamed from: ywc */
public final class ywc {
    public final String a;
    public final aadw b;
    private final ywd c;
    private final aarh d;
    private final aaas e;
    private final ywg f;

    public ywc(String str, ywd ywd, ywg ywg, aadw aadw, aarh aarh, aaas aaas) {
        this.a = xvd.a(str);
        this.c = (ywd) amqw.a((Object) ywd);
        this.f = (ywg) amqw.a((Object) ywg);
        this.b = (aadw) amqw.a((Object) aadw);
        this.d = (aarh) amqw.a((Object) aarh);
        this.e = (aaas) amqw.a((Object) aaas);
    }

    public final void a(ylf ylf, String str) {
        a(2, 3, str);
        this.d.a(ylf.getHeartToken(), new ywb(this, ylf, str));
    }

    public final void b(ylf ylf, String str) {
        a(3, 3, str);
        this.d.a(ylf.getUnheartToken(), new ywe(this, ylf, str));
    }

    public final void a(ylf ylf, String str, ajuf ajuf, boolean z) {
        apxu[] apxuArr = ajuf.b;
        if (apxuArr != null) {
            this.e.a(apxuArr, null);
        }
        a(ylf, str, z);
    }

    public final void a(ylf ylf, String str, bqn bqn, boolean z) {
        a(ylf, str, z);
        this.c.a(z, bqn);
    }

    private final void a(ylf ylf, String str, boolean z) {
        int a = a();
        int i = a - 1;
        if (a != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (z) {
                        b(ylf, str);
                        return;
                    }
                    a(1, 2, str);
                    this.f.a();
                    return;
                }
            } else if (z) {
                a(1, 1, str);
                this.f.a();
            } else {
                a(ylf, str);
                return;
            }
            return;
        }
        throw null;
    }

    public final int a() {
        ymh ymh = (ymh) this.b.c(this.a).a("technodrome_metadata", ymh.d.getParserForType());
        if (ymh == null || (ymh.a & 1) == 0) {
            return 1;
        }
        int a = ymj.a(ymh.b);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* JADX WARNING: Missing block: B:9:0x0036, code skipped:
            if (r4 != r9) goto L_0x003a;
     */
    public final void a(int r9, int r10, java.lang.String r11) {
        /*
        r8 = this;
        r0 = r8.b;
        r1 = r8.a;
        r0 = r0.c(r1);
        r1 = defpackage.ymh.d;
        r1 = r1.getParserForType();
        r2 = "technodrome_metadata";
        r0 = r0.a(r2, r1);
        r0 = (defpackage.ymh) r0;
        r1 = r8.b;
        r3 = r8.a;
        r1 = r1.a(r3);
        r1 = (defpackage.ylf) r1;
        if (r1 != 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0039;
    L_0x0023:
        r3 = 1;
        if (r0 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x003a;
    L_0x0027:
        r4 = r0.a;
        r4 = r4 & r3;
        if (r4 == 0) goto L_0x003a;
    L_0x002c:
        r4 = r0.b;
        r4 = defpackage.ymj.a(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0036;
    L_0x0035:
        r4 = 1;
    L_0x0036:
        if (r4 == r9) goto L_0x0039;
    L_0x0038:
        goto L_0x003a;
    L_0x0039:
        return;
    L_0x003a:
        r4 = r1.getEmotions();
        if (r4 == 0) goto L_0x004a;
    L_0x0040:
        r4 = new java.util.ArrayList;
        r5 = r1.getEmotions();
        r4.<init>(r5);
        goto L_0x004f;
    L_0x004a:
        r4 = new java.util.ArrayList;
        r4.<init>();
    L_0x004f:
        r10 = r10 + -1;
        if (r10 == 0) goto L_0x008f;
    L_0x0053:
        if (r10 == r3) goto L_0x0057;
    L_0x0055:
        goto L_0x0103;
    L_0x0057:
        r10 = r4.iterator();
    L_0x005b:
        r5 = r10.hasNext();
        if (r5 == 0) goto L_0x0103;
    L_0x0061:
        r5 = r10.next();
        r5 = (defpackage.apru) r5;
        r6 = r5.a;
        if (r6 != r3) goto L_0x0070;
    L_0x006b:
        r6 = r5.b;
        r6 = (defpackage.apry) r6;
        goto L_0x0072;
    L_0x0070:
        r6 = defpackage.apry.c;
    L_0x0072:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x005b;
    L_0x0077:
        r6 = r5.a;
        if (r6 != r3) goto L_0x0080;
    L_0x007b:
        r5 = r5.b;
        r5 = (defpackage.apry) r5;
        goto L_0x0082;
    L_0x0080:
        r5 = defpackage.apry.c;
    L_0x0082:
        r5 = r5.b;
        r5 = android.text.TextUtils.equals(r5, r11);
        if (r5 == 0) goto L_0x005b;
    L_0x008a:
        r10.remove();
        goto L_0x0103;
    L_0x008f:
        r10 = r4.size();
        r5 = 0;
    L_0x0094:
        if (r5 < r10) goto L_0x00d9;
    L_0x0096:
        r10 = defpackage.apru.c;
        r10 = r10.createBuilder();
        r10 = (defpackage.aprx) r10;
        r5 = defpackage.apry.c;
        r5 = r5.createBuilder();
        r5 = (defpackage.apsb) r5;
        r5.copyOnWrite();
        r6 = r5.instance;
        r6 = (defpackage.apry) r6;
        if (r11 == 0) goto L_0x00d3;
    L_0x00af:
        r7 = r6.a;
        r7 = r7 | r3;
        r6.a = r7;
        r6.b = r11;
        r10.copyOnWrite();
        r11 = r10.instance;
        r11 = (defpackage.apru) r11;
        r5 = r5.build();
        r5 = (defpackage.anxl) r5;
        r11.b = r5;
        r11.a = r3;
        r10 = r10.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.apru) r10;
        r4.add(r10);
        goto L_0x0103;
    L_0x00d3:
        r9 = new java.lang.NullPointerException;
        r9.<init>();
        throw r9;
    L_0x00d9:
        r6 = r4.get(r5);
        r6 = (defpackage.apru) r6;
        r7 = r6.a;
        if (r7 != r3) goto L_0x00e8;
    L_0x00e3:
        r7 = r6.b;
        r7 = (defpackage.apry) r7;
        goto L_0x00ea;
    L_0x00e8:
        r7 = defpackage.apry.c;
    L_0x00ea:
        r7 = r7.a;
        r7 = r7 & r3;
        if (r7 != 0) goto L_0x00f0;
    L_0x00ef:
        goto L_0x014c;
    L_0x00f0:
        r7 = r6.a;
        if (r7 != r3) goto L_0x00f9;
    L_0x00f4:
        r6 = r6.b;
        r6 = (defpackage.apry) r6;
        goto L_0x00fb;
    L_0x00f9:
        r6 = defpackage.apry.c;
    L_0x00fb:
        r6 = r6.b;
        r6 = android.text.TextUtils.equals(r6, r11);
        if (r6 == 0) goto L_0x014c;
    L_0x0103:
        r10 = r8.b;
        r10 = r10.b();
        r11 = r1.f();
        r11.e = r4;
        r1 = r8.b;
        r11 = r11.a(r1);
        r11 = (defpackage.yie) r11;
        if (r0 == 0) goto L_0x0122;
    L_0x0119:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.ymk) r0;
        goto L_0x012a;
    L_0x0122:
        r0 = defpackage.ymh.d;
        r0 = r0.createBuilder();
        r0 = (defpackage.ymk) r0;
    L_0x012a:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.ymh) r1;
        r4 = r1.a;
        r3 = r3 | r4;
        r1.a = r3;
        r9 = r9 + -1;
        r1.b = r9;
        r9 = r0.build();
        r9 = (defpackage.anxl) r9;
        r9 = defpackage.aadu.a(r2, r9);
        r9 = r10.a(r11, r9);
        r9.a();
        return;
    L_0x014c:
        r5 = r5 + 1;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywc.a(int, int, java.lang.String):void");
    }
}
