package defpackage;

/* renamed from: dj */
public final class dj extends dh {
    public float a = -1.0f;
    public int af = 0;
    private df ag = this.m;
    public int b = -1;
    public int c = -1;

    public dj() {
        di diVar = new di();
        this.q.clear();
        this.q.add(this.ag);
    }

    public final void h(int i) {
        if (this.af != i) {
            this.af = i;
            this.q.clear();
            if (this.af == 1) {
                this.ag = this.l;
            } else {
                this.ag = this.m;
            }
            this.q.add(this.ag);
        }
    }

    public final void a(db dbVar) {
        dg dgVar = (dg) this.r;
        if (dgVar != null) {
            Object e = dgVar.e(2);
            Object e2 = dgVar.e(4);
            if (this.af == 0) {
                e = dgVar.e(3);
                e2 = dgVar.e(5);
            }
            if (this.b != -1) {
                dbVar.a(db.a(dbVar, dbVar.a(this.ag), dbVar.a(e), this.b, false));
            } else if (this.c != -1) {
                dbVar.a(db.a(dbVar, dbVar.a(this.ag), dbVar.a(e2), -this.c, false));
            } else if (this.a != -1.0f) {
                dbVar.a(db.a(dbVar, dbVar.a(this.ag), dbVar.a(e), dbVar.a(e2), this.a));
            }
        }
    }

    public final void n() {
        if (this.r != null) {
            int b = db.b(this.ag);
            if (this.af != 1) {
                this.w = 0;
                this.x = b;
                a(this.r.d());
                b(0);
                return;
            }
            this.w = b;
            this.x = 0;
            b(this.r.g());
            a(0);
        }
    }

    /* JADX WARNING: Missing block: B:7:0x000c, code skipped:
            if (r3 != 4) goto L_0x001d;
     */
    public final defpackage.df e(int r3) {
        /*
        r2 = this;
        r3 = r3 + -1;
        r0 = 1;
        if (r3 == r0) goto L_0x0016;
    L_0x0005:
        r1 = 2;
        if (r3 == r1) goto L_0x000f;
    L_0x0008:
        r1 = 3;
        if (r3 == r1) goto L_0x0016;
    L_0x000b:
        r0 = 4;
        if (r3 == r0) goto L_0x000f;
    L_0x000e:
        goto L_0x001d;
    L_0x000f:
        r3 = r2.af;
        if (r3 != 0) goto L_0x001d;
    L_0x0013:
        r3 = r2.ag;
        return r3;
    L_0x0016:
        r3 = r2.af;
        if (r3 != r0) goto L_0x001d;
    L_0x001a:
        r3 = r2.ag;
        return r3;
    L_0x001d:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.e(int):df");
    }
}
