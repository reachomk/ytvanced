package defpackage;

/* renamed from: nyq */
public final class nyq {
    public final oah a;

    public nyq(oah oah) {
        this.a = oah;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj == null || getClass() != obj.getClass()) ? false : this.a.equals(((nyq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
