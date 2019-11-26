package defpackage;

/* renamed from: nov */
public final class nov {
    public final nmx a;
    public final int b;
    public final int c;
    public final int d;
    public final nom e;
    public final nom[] f;

    public nov(nmx nmx, int i, nom nom) {
        this.a = nmx;
        this.d = i;
        this.e = nom;
        this.f = null;
        this.b = -1;
        this.c = -1;
    }

    public nov(nmx nmx, int i, nom[] nomArr, int i2, int i3) {
        this.a = nmx;
        this.d = i;
        this.f = nomArr;
        this.b = i2;
        this.c = i3;
        this.e = null;
    }

    public final boolean a() {
        return this.f != null;
    }
}
