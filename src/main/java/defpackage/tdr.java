package defpackage;

/* renamed from: tdr */
public final class tdr implements tbs {
    public final pjr a = new pjr();

    tdr() {
    }

    public final void a(boolean z) {
        this.a.a = z;
    }

    public final boolean a() {
        return this.a.a;
    }

    public final String b() {
        return this.a.b;
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tdr)) {
            return false;
        }
        return this.a.equals(((tdr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
