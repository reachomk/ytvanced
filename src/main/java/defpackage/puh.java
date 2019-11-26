package defpackage;

/* renamed from: puh */
public final class puh {
    private final Object a;
    private final String b;

    public puh(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof puh) {
            puh puh = (puh) obj;
            return this.a == puh.a && this.b.equals(puh.b);
        }
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
