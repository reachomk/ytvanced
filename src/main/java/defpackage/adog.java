package defpackage;

/* renamed from: adog */
final class adog {
    public final adow a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.a == ((adog) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* synthetic */ adog(adow adow, int i, int i2, int i3, int i4) {
        this.a = adow;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
