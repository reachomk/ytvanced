package defpackage;

/* renamed from: ffe */
public final class ffe implements fff {
    private final aqkx a;

    public ffe(aqkx aqkx) {
        this.a = aqkx;
    }

    public final arwf a() {
        aqkx aqkx = this.a;
        if (aqkx == null) {
            return null;
        }
        arwf arwf = aqkx.d;
        if (arwf == null) {
            arwf = arwf.c;
        }
        return arwf;
    }

    public final apxu b() {
        aqkx aqkx = this.a;
        if (aqkx == null) {
            return null;
        }
        apxu apxu;
        if (aqkx.b == 2) {
            apxu = (apxu) aqkx.c;
        } else {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final String c() {
        aqkx aqkx = this.a;
        if (aqkx == null || (aqkx.a & 8) == 0) {
            return null;
        }
        aodv aodv = aqkx.e;
        if (aodv == null) {
            aodv = aodv.c;
        }
        return aodv.b;
    }

    public final apxu d() {
        aqkx aqkx = this.a;
        if (aqkx == null) {
            return null;
        }
        apxu apxu;
        if (aqkx.b == 3) {
            apxu = (apxu) aqkx.c;
        } else {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final Object e() {
        return this.a;
    }
}
