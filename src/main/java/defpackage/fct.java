package defpackage;

/* renamed from: fct */
final class fct implements ajan, xcp {
    private final /* synthetic */ fcs a;

    fct(fcs fcs) {
        this.a = fcs;
    }

    public final long e() {
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    public final void a(defpackage.ahkn r5) {
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.a;
        r5 = r5.b;
        if (r5 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0039;
    L_0x0009:
        r5 = r5.v();
        r1 = 0;
    L_0x000e:
        r2 = r5.length;
        if (r1 >= r2) goto L_0x0027;
    L_0x0011:
        r2 = r5[r1];
        r3 = r2.a;
        r3 = r3 & 1;
        if (r3 != 0) goto L_0x001c;
    L_0x0019:
        r1 = r1 + 1;
        goto L_0x000e;
    L_0x001c:
        r5 = r2.b;
        if (r5 != 0) goto L_0x0022;
    L_0x0020:
        r5 = defpackage.auuc.p;
    L_0x0022:
        r5 = r0.a(r5);
        goto L_0x002c;
    L_0x0027:
        r5 = 0;
        r5 = r0.a(r5);
    L_0x002c:
        if (r5 == 0) goto L_0x0039;
    L_0x002e:
        r5 = r4.a;
        r0 = r5.a;
        r0 = r0.a;
        r1 = r5.c;
        r5.a(r0, r1);
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fct.a(ahkn):void");
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.a.f, 4194304, 1)).a(new fcw(this), fcv.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
