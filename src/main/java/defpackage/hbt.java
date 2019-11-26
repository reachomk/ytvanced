package defpackage;

/* renamed from: hbt */
final class hbt implements xcp {
    private final /* synthetic */ hbm a;

    hbt(hbm hbm) {
        this.a = hbm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    public final void a(defpackage.ahkf r9) {
        /*
        r8 = this;
        r0 = r9.e;
        r1 = r0 + -1;
        r2 = 0;
        if (r0 == 0) goto L_0x0107;
    L_0x0007:
        if (r1 == 0) goto L_0x0011;
    L_0x0009:
        r0 = 3;
        if (r1 == r0) goto L_0x0011;
    L_0x000c:
        r0 = 4;
        if (r1 == r0) goto L_0x0011;
    L_0x000f:
        goto L_0x0106;
    L_0x0011:
        r0 = r8.a;
        r0 = r0.a;
        r1 = defpackage.hbl.d();
        r3 = r0.g;
        r3 = r3.a();
        r3 = r3.a();
        r1 = r1.a(r3);
        r0.g = r1;
        r1 = 0;
        r0.a(r1);
        r0 = r8.a;
        r0 = r0.b;
        r0.b(r1);
        r0 = r8.a;
        r3 = r0.d;
        r3 = r3.a;
        r3 = r3.listIterator();
    L_0x003e:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x005f;
    L_0x0044:
        r4 = r3.next();
        r4 = (java.lang.ref.WeakReference) r4;
        r5 = r4.get();
        if (r5 == 0) goto L_0x003e;
    L_0x0050:
        r4 = r4.get();
        r4 = (defpackage.abql) r4;
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x003e;
    L_0x005c:
        r3.remove();
    L_0x005f:
        r0 = r8.a;
        r0.f = r1;
        r9 = r9.c;
        if (r9 == 0) goto L_0x008e;
    L_0x0067:
        r3 = r9.a;
        if (r3 == 0) goto L_0x008e;
    L_0x006b:
        r3 = r3.e;
        if (r3 == 0) goto L_0x008e;
    L_0x006f:
        r3 = r3.b;
        if (r3 == 0) goto L_0x008e;
    L_0x0073:
        r3 = r3.a;
        r4 = r3.length;
        r5 = 0;
    L_0x0077:
        if (r5 >= r4) goto L_0x008e;
    L_0x0079:
        r6 = r3[r5];
        if (r6 == 0) goto L_0x008b;
    L_0x007d:
        r7 = r6.a;
        r7 = r7 & 8;
        if (r7 != 0) goto L_0x0084;
    L_0x0083:
        goto L_0x008b;
    L_0x0084:
        r3 = r6.e;
        if (r3 != 0) goto L_0x008f;
    L_0x0088:
        r3 = defpackage.aweq.d;
        goto L_0x008f;
    L_0x008b:
        r5 = r5 + 1;
        goto L_0x0077;
    L_0x008e:
        r3 = r2;
    L_0x008f:
        if (r3 == 0) goto L_0x0106;
    L_0x0091:
        r4 = r3.c;
        if (r4 != 0) goto L_0x0097;
    L_0x0095:
        r4 = defpackage.aphj.d;
    L_0x0097:
        r4 = r4.a;
        r4 = r4 & 2;
        if (r4 == 0) goto L_0x0106;
    L_0x009d:
        r4 = r3.c;
        if (r4 != 0) goto L_0x00a3;
    L_0x00a1:
        r4 = defpackage.aphj.d;
    L_0x00a3:
        r4 = r4.c;
        if (r4 != 0) goto L_0x00a9;
    L_0x00a7:
        r4 = defpackage.aphv.s;
    L_0x00a9:
        r0.e = r4;
        r4 = r0.b;
        r5 = r0.e;
        r4.a(r5);
        r4 = r0.b;
        r5 = 1;
        r4.b(r5);
        r4 = r0.d;
        r4.a(r0);
        r4 = r3.a;
        r4 = r4 & r5;
        if (r4 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00d2;
    L_0x00c3:
        r4 = r0.c;
        r3 = r3.b;
        if (r3 != 0) goto L_0x00cb;
    L_0x00c9:
        r3 = defpackage.apxu.d;
    L_0x00cb:
        r5 = r0.c();
        r4.a(r3, r5);
    L_0x00d2:
        r3 = r9.f;
        if (r3 != 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00dd;
    L_0x00d7:
        r3 = r3.e;
        if (r3 == 0) goto L_0x00dd;
    L_0x00db:
        r2 = r3.a;
    L_0x00dd:
        if (r2 != 0) goto L_0x00f9;
    L_0x00df:
        r9 = r9.a;
        r9 = r9.l;
        r3 = r9.length;
    L_0x00e4:
        if (r1 >= r3) goto L_0x00f9;
    L_0x00e6:
        r4 = r9[r1];
        r4 = r4.a;
        if (r4 != 0) goto L_0x00ed;
    L_0x00ec:
        goto L_0x00f6;
    L_0x00ed:
        r4 = defpackage.hcm.a(r4);
        if (r4 == 0) goto L_0x00f6;
    L_0x00f3:
        r2 = r4.b;
        goto L_0x00f9;
    L_0x00f6:
        r1 = r1 + 1;
        goto L_0x00e4;
    L_0x00f9:
        if (r2 != 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0106;
    L_0x00fc:
        r9 = r0.a;
        r0 = r9.g;
        r0.a(r2);
        r9.m();
    L_0x0106:
        return;
    L_0x0107:
        goto L_0x0109;
    L_0x0108:
        throw r2;
    L_0x0109:
        goto L_0x0108;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbt.a(ahkf):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
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
