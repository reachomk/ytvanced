package defpackage;

/* renamed from: qch */
public final class qch {
    public final String a;

    public qch(String str) {
        this.a = str;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj instanceof qch ? this.a.equals(((qch) obj).a) : false;
        } else {
            return true;
        }
    }
}
