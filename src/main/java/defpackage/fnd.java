package defpackage;

/* renamed from: fnd */
public final class fnd implements ejc, t, xcp {
    public String a;
    public String b;
    private final alcb c;
    private final xci d;
    private final ajam e;
    private final zyw f;
    private final bdfu g = new bdfu();

    public fnd(alcb alcb, xci xci, ajam ajam, zyw zyw) {
        this.c = alcb;
        this.d = xci;
        this.e = ajam;
        this.f = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.f)) {
            this.g.a();
            this.g.a(this.e.Q().a.f().a(emg.a(this.f, 131072, 1)).a(new fnf(this), fne.a));
            return;
        }
        this.d.a((Object) this);
    }

    public final void C_() {
        if (foh.x(this.f)) {
            this.g.a();
        } else {
            this.d.b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    public final void a(defpackage.ahkn r7) {
        /*
        r6 = this;
        r0 = r7.b;
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        r0 = r0.a;
        goto L_0x0009;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        r2 = r7.a;
        r3 = defpackage.airi.NEW;
        if (r2 != r3) goto L_0x0051;
    L_0x000f:
        if (r0 == 0) goto L_0x0051;
    L_0x0011:
        r7 = r7.e;
        if (r7 == 0) goto L_0x001d;
    L_0x0015:
        r2 = r6.a;
        r2 = r7.equals(r2);
        if (r2 == 0) goto L_0x0020;
    L_0x001d:
        r6.f();
    L_0x0020:
        r6.a = r7;
        r0 = r0.s;
        r2 = r0.length;
        r3 = 0;
    L_0x0026:
        if (r3 >= r2) goto L_0x003d;
    L_0x0028:
        r4 = r0[r3];
        if (r4 != 0) goto L_0x002d;
    L_0x002c:
        goto L_0x003a;
    L_0x002d:
        r5 = r4.a;
        r5 = r5 & 4;
        if (r5 == 0) goto L_0x003a;
    L_0x0033:
        r0 = r4.d;
        if (r0 != 0) goto L_0x003e;
    L_0x0037:
        r0 = defpackage.ayhz.n;
        goto L_0x003e;
    L_0x003a:
        r3 = r3 + 1;
        goto L_0x0026;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        if (r0 != 0) goto L_0x0043;
    L_0x0040:
        r6.b = r1;
        return;
    L_0x0043:
        r1 = r6.c;
        r2 = new fnc;
        r2.<init>(r6, r7);
        r1.a(r0, r2);
        r7 = r0.c;
        r6.b = r7;
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnd.a(ahkn):void");
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 == ejd.NONE && this.b != null) {
            f();
        }
    }

    private final void f() {
        this.c.a(this.b);
        this.b = null;
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
