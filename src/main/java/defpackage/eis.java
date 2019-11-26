package defpackage;

/* renamed from: eis */
public final class eis implements t, xcp {
    public boolean a = false;
    public airi b = airi.NEW;
    private final aell c;
    private final zzf d;
    private final xci e;
    private final ajam f;
    private final zyw g;
    private final bdfu h = new bdfu();

    public eis(aell aell, zzf zzf, xci xci, ajam ajam, zyw zyw) {
        this.c = aell;
        this.d = (zzf) amqw.a((Object) zzf);
        this.e = xci;
        this.f = ajam;
        this.g = zyw;
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
        if (eis.a(this.g)) {
            this.h.a();
            this.h.a(this.f.Q().a.f().a(emg.a(this.g, 65536, 1)).a(new eiv(this), eiu.a));
            return;
        }
        this.e.a((Object) this);
    }

    public final void C_() {
        if (eis.a(this.g)) {
            this.h.a();
        } else {
            this.e.b(this);
        }
    }

    /* JADX WARNING: Missing block: B:5:0x000d, code skipped:
            if (r0 != 9) goto L_0x0030;
     */
    public final void a(defpackage.ahkn r3) {
        /*
        r2 = this;
        r3 = r3.a;
        r0 = r3.ordinal();
        if (r0 == 0) goto L_0x0025;
    L_0x0008:
        r1 = 1;
        if (r0 == r1) goto L_0x0010;
    L_0x000b:
        r1 = 9;
        if (r0 == r1) goto L_0x0025;
    L_0x000f:
        goto L_0x0030;
    L_0x0010:
        r0 = r2.d;
        r0 = r0.t();
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001d;
    L_0x0019:
        r0 = r0.n;
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r0 = "vl";
        r2.a(r0);
    L_0x0022:
        r2.b = r3;
        return;
    L_0x0025:
        r0 = r2.a;
        if (r0 != 0) goto L_0x002e;
    L_0x0029:
        r0 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r2.a(r0);
    L_0x002e:
        r2.b = r3;
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eis.a(ahkn):void");
    }

    public final void a(long j) {
        aell aell = this.c;
        if (aell != null) {
            aell.a(j);
        }
    }

    public final void a(String str) {
        aell aell = this.c;
        if (aell != null) {
            aell.a(str);
        }
    }

    private static boolean a(zyw zyw) {
        if (!(zyw == null || zyw.a() == null)) {
            awde awde = zyw.a().s;
            if (awde == null) {
                awde = awde.s;
            }
            if (awde.g) {
                return true;
            }
        }
        return false;
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
