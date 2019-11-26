package defpackage;

/* renamed from: amzg */
public final class amzg {
    public final amzz a;
    public final String b;

    public amzg(amzz amzz, String str) {
        this.a = (amzz) anad.a(amzz, "parser");
        this.b = (String) anad.a(str, "message");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amzg) {
            amzg amzg = (amzg) obj;
            if (this.a.equals(amzg.a) && this.b.equals(amzg.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
