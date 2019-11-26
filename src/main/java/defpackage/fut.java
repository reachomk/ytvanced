package defpackage;

/* renamed from: fut */
final /* synthetic */ class fut implements aawu {
    private final bcaa a;

    fut(bcaa bcaa) {
        this.a = bcaa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    public final void a(defpackage.asob r9, java.lang.Object r10) {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = r9.c;
        r1 = r1.size();
        r2 = 0;
        r3 = 0;
        if (r1 <= 0) goto L_0x003c;
    L_0x000c:
        r1 = r9.c;
        r1 = r1.get(r2);
        r1 = (defpackage.asnv) r1;
        r1 = r1.c;
        if (r1 != 0) goto L_0x001a;
    L_0x0018:
        r1 = defpackage.asnx.c;
    L_0x001a:
        r1 = r1.a;
        r4 = 84469086; // 0x508e55e float:6.4368174E-36 double:4.17332735E-316;
        if (r1 == r4) goto L_0x0022;
    L_0x0021:
        goto L_0x003c;
    L_0x0022:
        r9 = r9.c;
        r9 = r9.get(r2);
        r9 = (defpackage.asnv) r9;
        r9 = r9.c;
        if (r9 != 0) goto L_0x0030;
    L_0x002e:
        r9 = defpackage.asnx.c;
    L_0x0030:
        r1 = r9.a;
        if (r1 != r4) goto L_0x0039;
    L_0x0034:
        r9 = r9.b;
        r9 = (defpackage.ayao) r9;
        goto L_0x003d;
    L_0x0039:
        r9 = defpackage.ayao.n;
        goto L_0x003d;
    L_0x003c:
        r9 = r3;
    L_0x003d:
        if (r9 == 0) goto L_0x0194;
    L_0x003f:
        r0 = r0.get();
        r0 = (defpackage.jno) r0;
        r1 = r0.f;
        if (r1 == 0) goto L_0x0051;
    L_0x0049:
        r1 = r1.isShowing();
        if (r1 == 0) goto L_0x0051;
    L_0x004f:
        goto L_0x0194;
    L_0x0051:
        r1 = r0.a;
        r1 = android.view.LayoutInflater.from(r1);
        r4 = 2131035348; // 0x7f0504d4 float:1.768124E38 double:1.0528713555E-314;
        r1 = r1.inflate(r4, r3);
        r0.d = r1;
        r1 = r0.d;
        r4 = 2131757983; // 0x7f100b9f float:1.9146917E38 double:1.0532283846E-314;
        r1 = r1.findViewById(r4);
        r1 = (android.widget.RadioGroup) r1;
        r0.e = r1;
        r1 = r9.j;
        r1 = r1.iterator();
    L_0x0073:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x00fe;
    L_0x0079:
        r4 = r1.next();
        r4 = (defpackage.ayas) r4;
        r5 = new android.widget.RadioButton;
        r6 = r0.a;
        r5.<init>(r6);
        r6 = r4.a;
        r7 = 84469192; // 0x508e5c8 float:6.4368934E-36 double:4.1733326E-316;
        if (r6 != r7) goto L_0x00c0;
    L_0x008d:
        r6 = r4.b;
        r6 = (defpackage.ayam) r6;
        r5.setTag(r6);
        r6 = r4.a;
        if (r6 != r7) goto L_0x009d;
    L_0x0098:
        r6 = r4.b;
        r6 = (defpackage.ayam) r6;
        goto L_0x009f;
    L_0x009d:
        r6 = defpackage.ayam.e;
    L_0x009f:
        r6 = r6.a;
        r6 = r6 & 2;
        if (r6 == 0) goto L_0x00b7;
    L_0x00a5:
        r6 = r4.a;
        if (r6 != r7) goto L_0x00ae;
    L_0x00a9:
        r4 = r4.b;
        r4 = (defpackage.ayam) r4;
        goto L_0x00b0;
    L_0x00ae:
        r4 = defpackage.ayam.e;
    L_0x00b0:
        r4 = r4.c;
        if (r4 != 0) goto L_0x00b8;
    L_0x00b4:
        r4 = defpackage.arml.f;
        goto L_0x00b8;
    L_0x00b7:
        r4 = r3;
    L_0x00b8:
        r4 = defpackage.ajqy.a(r4);
        r5.setText(r4);
        goto L_0x00f7;
    L_0x00c0:
        r7 = 131108496; // 0x7d08e90 float:3.1380152E-34 double:6.47762038E-316;
        if (r6 != r7) goto L_0x00f7;
    L_0x00c5:
        r6 = r4.b;
        r6 = (defpackage.ayac) r6;
        r5.setTag(r6);
        r6 = r4.a;
        if (r6 != r7) goto L_0x00d5;
    L_0x00d0:
        r6 = r4.b;
        r6 = (defpackage.ayac) r6;
        goto L_0x00d7;
    L_0x00d5:
        r6 = defpackage.ayac.d;
    L_0x00d7:
        r6 = r6.a;
        r6 = r6 & 1;
        if (r6 == 0) goto L_0x00ef;
    L_0x00dd:
        r6 = r4.a;
        if (r6 != r7) goto L_0x00e6;
    L_0x00e1:
        r4 = r4.b;
        r4 = (defpackage.ayac) r4;
        goto L_0x00e8;
    L_0x00e6:
        r4 = defpackage.ayac.d;
    L_0x00e8:
        r4 = r4.b;
        if (r4 != 0) goto L_0x00f0;
    L_0x00ec:
        r4 = defpackage.arml.f;
        goto L_0x00f0;
    L_0x00ef:
        r4 = r3;
    L_0x00f0:
        r4 = defpackage.ajqy.a(r4);
        r5.setText(r4);
    L_0x00f7:
        r4 = r0.e;
        r4.addView(r5);
        goto L_0x0073;
    L_0x00fe:
        r1 = r0.a;
        r1 = android.view.LayoutInflater.from(r1);
        r4 = 2131035349; // 0x7f0504d5 float:1.7681241E38 double:1.052871356E-314;
        r1 = r1.inflate(r4, r3);
        r1 = (android.widget.TextView) r1;
        r4 = r9.a;
        r4 = r4 & 2;
        if (r4 == 0) goto L_0x011a;
    L_0x0113:
        r4 = r9.d;
        if (r4 != 0) goto L_0x011b;
    L_0x0117:
        r4 = defpackage.arml.f;
        goto L_0x011b;
    L_0x011a:
        r4 = r3;
    L_0x011b:
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r1, r4);
        r4 = new android.app.AlertDialog$Builder;
        r5 = r0.a;
        r4.<init>(r5);
        r1 = r4.setCustomTitle(r1);
        r4 = r0.d;
        r1 = r1.setView(r4);
        r4 = r9.h;
        if (r4 != 0) goto L_0x0139;
    L_0x0137:
        r4 = defpackage.aphj.d;
    L_0x0139:
        r4 = r4.b;
        if (r4 != 0) goto L_0x013f;
    L_0x013d:
        r4 = defpackage.aphg.s;
    L_0x013f:
        r4 = r4.g;
        if (r4 != 0) goto L_0x0145;
    L_0x0143:
        r4 = defpackage.arml.f;
    L_0x0145:
        r4 = defpackage.ajqy.a(r4);
        r1 = r1.setPositiveButton(r4, r3);
        r9 = r9.g;
        if (r9 != 0) goto L_0x0153;
    L_0x0151:
        r9 = defpackage.aphj.d;
    L_0x0153:
        r9 = r9.b;
        if (r9 != 0) goto L_0x0159;
    L_0x0157:
        r9 = defpackage.aphg.s;
    L_0x0159:
        r9 = r9.g;
        if (r9 != 0) goto L_0x015f;
    L_0x015d:
        r9 = defpackage.arml.f;
    L_0x015f:
        r9 = defpackage.ajqy.a(r9);
        r9 = r1.setNegativeButton(r9, r3);
        r9 = r9.create();
        r1 = r0.e;
        r3 = new jnq;
        r3.<init>(r9);
        r1.setOnCheckedChangeListener(r3);
        r0.f = r9;
        r9 = r0.f;
        r9.show();
        r9 = r0.f;
        r1 = -1;
        r9 = r9.getButton(r1);
        r9.setEnabled(r2);
        r9 = r0.f;
        r9 = r9.getButton(r1);
        r1 = new jnn;
        r1.<init>(r0, r10);
        r9.setOnClickListener(r1);
    L_0x0194:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fut.a(asob, java.lang.Object):void");
    }
}
