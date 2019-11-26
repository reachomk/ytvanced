package defpackage;

/* renamed from: gmo */
public final class gmo implements t, xcp {
    private final aizy a;
    private final acum b;
    private final aepu c;
    private final xci d;
    private final ajam e;
    private final zyw f;
    private final bdfu g = new bdfu();
    private String h;
    private String i;

    public gmo(aizy aizy, acum acum, aepu aepu, xci xci, ajam ajam, zyw zyw) {
        this.a = aizy;
        this.b = acum;
        this.c = aepu;
        this.d = xci;
        this.e = ajam;
        this.f = zyw;
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
        if (foh.x(this.f)) {
            this.g.a(this.e.Q().a.f().a(emg.a(this.f, 33554432, 1)).a(new gmn(this), gmq.a));
        } else {
            this.d.a((Object) this);
        }
    }

    public final void d() {
        if (foh.x(this.f)) {
            this.g.a();
        } else {
            this.d.b(this);
        }
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.ordinal() == 7) {
            this.i = ahkn.b.b();
            this.h = ahkn.e;
        }
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

    public final void a(int i) {
        String str = this.i;
        str = (str == null || this.h == null || !str.equals(this.a.k())) ? "" : this.h;
        a(str, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    public final void a(java.lang.String r7, int r8) {
        /*
        r6 = this;
        r0 = defpackage.awxt.g;
        r0 = r0.createBuilder();
        r0 = (defpackage.awxw) r0;
        r1 = r6.a;
        r1 = r1.l();
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.awxt) r2;
        r3 = r2.a;
        r4 = 4;
        r3 = r3 | r4;
        r2.a = r3;
        r2.d = r1;
        r1 = r6.c;
        r2 = 2;
        r3 = 1;
        if (r1 != 0) goto L_0x0025;
    L_0x0023:
        r4 = 1;
        goto L_0x003b;
    L_0x0025:
        r1 = r1.e;
        if (r1 == 0) goto L_0x0023;
    L_0x0029:
        r1 = r6.c;
        r1 = r1.e;
        r1 = r1.ordinal();
        if (r1 == 0) goto L_0x003b;
    L_0x0033:
        if (r1 == r3) goto L_0x003a;
    L_0x0035:
        if (r1 == r2) goto L_0x0038;
    L_0x0037:
        goto L_0x0023;
    L_0x0038:
        r4 = 6;
        goto L_0x003b;
    L_0x003a:
        r4 = 5;
    L_0x003b:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.awxt) r1;
        r5 = r1.a;
        r5 = r5 | 16;
        r1.a = r5;
        r4 = r4 + -1;
        r1.f = r4;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.awxt) r1;
        if (r7 == 0) goto L_0x00eb;
    L_0x0055:
        r4 = r1.a;
        r4 = r4 | 8;
        r1.a = r4;
        r1.e = r7;
        r7 = r6.a;
        r7 = r7.k();
        if (r7 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0074;
    L_0x0066:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.awxt) r1;
        r4 = r1.a;
        r4 = r4 | r3;
        r1.a = r4;
        r1.b = r7;
    L_0x0074:
        r7 = r6.a;
        r7 = r7.m();
        if (r7 == 0) goto L_0x008a;
    L_0x007c:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.awxt) r1;
        r4 = r1.a;
        r4 = r4 | r2;
        r1.a = r4;
        r1.c = r7;
    L_0x008a:
        r7 = defpackage.awxv.d;
        r7 = r7.createBuilder();
        r7 = (defpackage.awxy) r7;
        r7.copyOnWrite();
        r1 = r7.instance;
        r1 = (defpackage.awxv) r1;
        r4 = r1.a;
        r2 = r2 | r4;
        r1.a = r2;
        r8 = r8 + -1;
        r1.c = r8;
        r7.copyOnWrite();
        r8 = r7.instance;
        r8 = (defpackage.awxv) r8;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.awxt) r0;
        r8.b = r0;
        r0 = r8.a;
        r0 = r0 | r3;
        r8.a = r0;
        r7 = r7.build();
        r7 = (defpackage.anxl) r7;
        r7 = (defpackage.awxv) r7;
        r8 = defpackage.asmw.f;
        r8 = r8.createBuilder();
        r8 = (defpackage.asmz) r8;
        r8.copyOnWrite();
        r0 = r8.instance;
        r0 = (defpackage.asmw) r0;
        if (r7 == 0) goto L_0x00e5;
    L_0x00d1:
        r0.c = r7;
        r7 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r0.b = r7;
        r7 = r8.build();
        r7 = (defpackage.anxl) r7;
        r7 = (defpackage.asmw) r7;
        r8 = r6.b;
        r8.a(r7);
        return;
    L_0x00e5:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        throw r7;
    L_0x00eb:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        goto L_0x00f2;
    L_0x00f1:
        throw r7;
    L_0x00f2:
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmo.a(java.lang.String, int):void");
    }
}
