package defpackage;

/* renamed from: bcqj */
public abstract class bcqj implements bcqe {
    protected bcqj() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcqe) {
            bcqe bcqe = (bcqe) obj;
            return a() == bcqe.a() && bcrr.a(b(), bcqe.b());
        }
    }

    public final int hashCode() {
        return ((int) (a() ^ (a() >>> 32))) + b().hashCode();
    }

    public String toString() {
        return bctb.a.a((bcqe) this);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        obj = (bcqe) obj;
        int i = 0;
        if (this != obj) {
            long a = obj.a();
            long a2 = a();
            if (a2 != a) {
                if (a2 < a) {
                    return -1;
                }
                i = 1;
            }
        }
        return i;
    }
}
