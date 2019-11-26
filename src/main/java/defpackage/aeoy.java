package defpackage;

/* renamed from: aeoy */
public final class aeoy extends Exception {
    private final int a;

    aeoy(int i, String str) {
        super(str);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof aeoy) {
                return this.a == ((aeoy) obj).a ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
