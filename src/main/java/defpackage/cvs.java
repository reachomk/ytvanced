package defpackage;

/* renamed from: cvs */
public final class cvs extends cvu {
    public final cvl a;

    private cvs(cvl cvl) {
        super(cvr.a);
        this.a = cvl;
    }

    public final int hashCode() {
        cvl cvl = this.a;
        return cvl != null ? cvl.hashCode() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cvs) {
            if (this.a == ((cvs) obj).a) {
                return true;
            }
        }
        return false;
    }

    public static cvu a(cvl cvl) {
        return new cvs(cvl);
    }
}
