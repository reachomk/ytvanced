package defpackage;

/* renamed from: ffh */
public final class ffh implements fff {
    private final artk a;

    public ffh(artk artk) {
        this.a = artk;
    }

    public final arwf a() {
        artk artk = this.a;
        if (artk == null) {
            return null;
        }
        arwf arwf = artk.d;
        if (arwf == null) {
            arwf = arwf.c;
        }
        return arwf;
    }

    public final apxu b() {
        artk artk = this.a;
        if (artk == null) {
            return null;
        }
        apxu apxu;
        if (artk.b == 2) {
            apxu = (apxu) artk.c;
        } else {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final String c() {
        artk artk = this.a;
        if (artk == null || (artk.a & 8) == 0) {
            return null;
        }
        aodv aodv = artk.e;
        if (aodv == null) {
            aodv = aodv.c;
        }
        return aodv.b;
    }

    public final apxu d() {
        artk artk = this.a;
        if (artk == null) {
            return null;
        }
        apxu apxu;
        if (artk.b == 3) {
            apxu = (apxu) artk.c;
        } else {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final Object e() {
        return this.a;
    }
}
