package defpackage;

/* renamed from: aadg */
public final class aadg {
    private final aadw a;
    private final aadd b;
    private final amqp c;
    private final amqp d;
    private final amqp e;
    private final aaep f;

    public aadg(aadw aadw, amqp amqp, aadd aadd, amqp amqp2, amqp amqp3, aaep aaep) {
        this.a = (aadw) amqw.a((Object) aadw);
        this.e = (amqp) amqw.a((Object) amqp);
        this.b = (aadd) amqw.a((Object) aadd);
        this.c = (amqp) amqw.a((Object) amqp2);
        this.d = (amqp) amqw.a((Object) amqp3);
        this.f = aaep;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0114 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:37|38|65) */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r4 = r8.f;
            r2 = java.lang.String.valueOf(r2.c().getClass());
            r6 = new java.lang.StringBuilder(r2.length() + 27);
            r6.append("Entity ");
            r6.append(r2);
            r6.append(" is not serializable");
            r4.a(r3, r6.toString());
     */
    public final void a(defpackage.arfm r9, int r10) {
        /*
        r8 = this;
        defpackage.amqw.a(r9);
        r0 = r8.a;
        r0 = r0.b();
        r10 = r0.a(r10);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r8.f;
        r2 = r9.a;
        r2 = r2.size();
        r3 = new java.lang.StringBuilder;
        r4 = 47;
        r3.<init>(r4);
        r4 = "Processing response with mutations: ";
        r3.append(r4);
        r3.append(r2);
        r2 = r3.toString();
        r3 = "EMP";
        r1.a(r3, r2);
        r9 = r9.a;
        r9 = r9.iterator();
    L_0x0038:
        r1 = r9.hasNext();
        if (r1 == 0) goto L_0x016e;
    L_0x003e:
        r1 = r9.next();
        r1 = (defpackage.arfo) r1;
        r2 = r8.c;	 Catch:{ RuntimeException -> 0x0145 }
        r4 = defpackage.aadj.a;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.a(r4);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = (defpackage.aadm) r2;	 Catch:{ RuntimeException -> 0x0145 }
        r4 = r8.b;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.a(r4, r1);	 Catch:{ RuntimeException -> 0x0145 }
        r0.add(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r4 = r2.a();	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r2.d();	 Catch:{ RuntimeException -> 0x0145 }
        r6 = r5 + -1;
        if (r5 == 0) goto L_0x0143;
    L_0x0063:
        r5 = 1;
        if (r6 == r5) goto L_0x00ca;
    L_0x0066:
        r5 = 2;
        if (r6 == r5) goto L_0x00a8;
    L_0x0069:
        r5 = r8.f;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.d();	 Catch:{ RuntimeException -> 0x0145 }
        if (r2 == 0) goto L_0x0076;
    L_0x0071:
        r2 = defpackage.arga.b(r2);	 Catch:{ RuntimeException -> 0x0145 }
        goto L_0x0078;
    L_0x0076:
        r2 = "null";
    L_0x0078:
        r2 = java.lang.String.valueOf(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r6 = r2.length();	 Catch:{ RuntimeException -> 0x0145 }
        r6 = r6 + 46;
        r7 = java.lang.String.valueOf(r4);	 Catch:{ RuntimeException -> 0x0145 }
        r7 = r7.length();	 Catch:{ RuntimeException -> 0x0145 }
        r6 = r6 + r7;
        r7 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0145 }
        r7.<init>(r6);	 Catch:{ RuntimeException -> 0x0145 }
        r6 = "Invalid mutation type ";
        r7.append(r6);	 Catch:{ RuntimeException -> 0x0145 }
        r7.append(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = " for mutation with key: ";
        r7.append(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r7.append(r4);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r7.toString();	 Catch:{ RuntimeException -> 0x0145 }
        r5.a(r3, r2);	 Catch:{ RuntimeException -> 0x0145 }
        goto L_0x0038;
    L_0x00a8:
        r10.a(r4);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r8.e;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.a();	 Catch:{ RuntimeException -> 0x0145 }
        if (r2 == 0) goto L_0x0038;
    L_0x00b3:
        r2 = r8.e;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2 instanceof defpackage.aacr;	 Catch:{ RuntimeException -> 0x0145 }
        if (r2 != 0) goto L_0x0038;
    L_0x00bd:
        r2 = r8.e;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.b();	 Catch:{ RuntimeException -> 0x0145 }
        r2 = (defpackage.swm) r2;	 Catch:{ RuntimeException -> 0x0145 }
        r2.a(r4);	 Catch:{ RuntimeException -> 0x0145 }
        goto L_0x0038;
    L_0x00ca:
        r6 = r2.b();	 Catch:{ RuntimeException -> 0x0145 }
        r7 = android.text.TextUtils.isEmpty(r6);	 Catch:{ RuntimeException -> 0x0145 }
        if (r7 != 0) goto L_0x00d7;
    L_0x00d4:
        r10.a(r6);	 Catch:{ RuntimeException -> 0x0145 }
    L_0x00d7:
        r6 = r2.c();	 Catch:{ RuntimeException -> 0x0145 }
        r7 = r1.e;	 Catch:{ RuntimeException -> 0x0145 }
        if (r7 != 0) goto L_0x00e1;
    L_0x00df:
        r7 = defpackage.arfw.c;	 Catch:{ RuntimeException -> 0x0145 }
    L_0x00e1:
        r7 = r7.b;	 Catch:{ RuntimeException -> 0x0145 }
        r7 = defpackage.argc.a(r7);	 Catch:{ RuntimeException -> 0x0145 }
        if (r7 == 0) goto L_0x00ea;
    L_0x00e9:
        r5 = r7;
    L_0x00ea:
        r10.b(r6, r5);	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r8.e;	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r5.a();	 Catch:{ RuntimeException -> 0x0145 }
        if (r5 == 0) goto L_0x0038;
    L_0x00f5:
        r5 = r8.e;	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r5.b();	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r5 instanceof defpackage.aacr;	 Catch:{ RuntimeException -> 0x0145 }
        if (r5 != 0) goto L_0x0038;
    L_0x00ff:
        r5 = r8.e;	 Catch:{ UnsupportedOperationException -> 0x0114 }
        r5 = r5.b();	 Catch:{ UnsupportedOperationException -> 0x0114 }
        r5 = (defpackage.swm) r5;	 Catch:{ UnsupportedOperationException -> 0x0114 }
        r6 = r2.c();	 Catch:{ UnsupportedOperationException -> 0x0114 }
        r6 = r6.c();	 Catch:{ UnsupportedOperationException -> 0x0114 }
        r5.a(r4, r6);	 Catch:{ UnsupportedOperationException -> 0x0114 }
        goto L_0x0038;
    L_0x0114:
        r4 = r8.f;	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.c();	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r2.getClass();	 Catch:{ RuntimeException -> 0x0145 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r2.length();	 Catch:{ RuntimeException -> 0x0145 }
        r5 = r5 + 27;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0145 }
        r6.<init>(r5);	 Catch:{ RuntimeException -> 0x0145 }
        r5 = "Entity ";
        r6.append(r5);	 Catch:{ RuntimeException -> 0x0145 }
        r6.append(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = " is not serializable";
        r6.append(r2);	 Catch:{ RuntimeException -> 0x0145 }
        r2 = r6.toString();	 Catch:{ RuntimeException -> 0x0145 }
        r4.a(r3, r2);	 Catch:{ RuntimeException -> 0x0145 }
        goto L_0x0038;
    L_0x0143:
        r2 = 0;
        throw r2;	 Catch:{ RuntimeException -> 0x0145 }
    L_0x0145:
        r2 = move-exception;
        r4 = r2.getCause();
        r4 = r4 instanceof defpackage.anyg;
        if (r4 == 0) goto L_0x016d;
    L_0x014e:
        r2 = r8.f;
        r1 = r1.b;
        r1 = java.lang.String.valueOf(r1);
        r4 = "Error while parsing payload extension for key ";
        r5 = r1.length();
        if (r5 != 0) goto L_0x0164;
    L_0x015e:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x0168;
    L_0x0164:
        r1 = r4.concat(r1);
    L_0x0168:
        r2.a(r3, r1);
        goto L_0x0038;
    L_0x016d:
        throw r2;
    L_0x016e:
        r9 = r10.a();
        r10 = new bbpk;
        r10.<init>();
        r9.a(r10);
        r10.b();
        r9 = r0.size();
        r10 = 0;
    L_0x0182:
        if (r10 >= r9) goto L_0x019a;
    L_0x0184:
        r1 = r0.get(r10);
        r1 = (defpackage.aadk) r1;
        r2 = r8.d;
        r3 = defpackage.aadi.a;
        r2 = r2.a(r3);
        r2 = (defpackage.aadl) r2;
        r2.a(r1);
        r10 = r10 + 1;
        goto L_0x0182;
    L_0x019a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadg.a(arfm, int):void");
    }
}
