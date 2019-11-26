package defpackage;

/* renamed from: afbe */
final class afbe implements aepr {
    private final /* synthetic */ afbf a;

    public final void a(aeps aeps) {
        afbf afbf = this.a;
        afbf.c = true;
        afbf.j = aeps.h();
        if (this.a.c) {
            long j = this.a.i;
            if (j != 0) {
                aeps.a(j);
            }
            afbf afbf2 = this.a;
            afbf2.a(afbf2.l);
            if (this.a.g) {
                this.a.h();
            }
        }
    }

    public final void a(aeps aeps, int i, int i2) {
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code skipped:
            if (r1 == 100) goto L_0x0010;
     */
    public final void b(int r3) {
        /*
        r2 = this;
        r0 = 100;
        r1 = 90;
        if (r3 <= r1) goto L_0x000f;
    L_0x0006:
        r1 = r2.a;
        r1 = r1.k;
        if (r1 != r3) goto L_0x000d;
    L_0x000c:
        goto L_0x0010;
    L_0x000d:
        if (r1 == r0) goto L_0x0010;
    L_0x000f:
        r0 = r3;
    L_0x0010:
        r3 = r2.a;
        r3.k = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbe.b(int):void");
    }

    public final void j() {
        if (this.a.f) {
            afbf afbf = this.a;
            afbf.f = false;
            if (!afbf.e) {
                if (this.a.d) {
                    this.a.b.c();
                } else {
                    this.a.b.d();
                }
            }
        }
    }

    public final void i() {
        afbf afbf = this.a;
        afbf.i = 0;
        afbf.d = false;
        afbf.b.f();
    }

    public final boolean b(int i, int i2) {
        String str = !this.a.c ? "prepare" : "playback";
        StringBuilder stringBuilder = new StringBuilder(str.length() + 63);
        stringBuilder.append("MediaPlayer error during ");
        stringBuilder.append(str);
        stringBuilder.append(" [what=");
        stringBuilder.append(i);
        stringBuilder.append(", extra=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        xtl.d(stringBuilder.toString());
        afif[] a = afdj.a(i, i2, false, this.a.a.c(), this.a.o(), this.a.h);
        this.a.b(true);
        for (afif a2 : a) {
            this.a.b.a(a2);
        }
        return true;
    }

    public final boolean a(int i, int i2) {
        String toHexString = Integer.toHexString(i);
        String toHexString2 = Integer.toHexString(i2);
        String.valueOf(toHexString).length();
        String.valueOf(toHexString2).length();
        if (i == 701) {
            String.valueOf(this.a.h).length();
            this.a.c(true);
        } else if (i == 702) {
            this.a.c(false);
        }
        return false;
    }

    /* synthetic */ afbe(afbf afbf) {
        this.a = afbf;
    }
}
