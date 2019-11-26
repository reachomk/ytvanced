package defpackage;

/* renamed from: twr */
public final class twr {
    public final String a;

    public twr(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static String a(twr twr) {
        return twr != null ? twr.a : null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof twr)) {
            return false;
        }
        return this.a.equals(((twr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
