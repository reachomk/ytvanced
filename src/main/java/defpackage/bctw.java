package defpackage;

/* renamed from: bctw */
public final class bctw {
    public final Throwable a = null;
    private final int b = 3;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append('[');
        stringBuilder.append(super.toString());
        stringBuilder.append(' ');
        int i = this.b;
        Object obj = i != 1 ? i != 2 ? i != 3 ? "null" : "OnCompleted" : "OnError" : "OnNext";
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            return obj.getClass() == getClass() && ((bctw) obj).b == this.b;
        } else {
            return true;
        }
    }

    static {
        bctw bctw = new bctw();
    }

    private bctw() {
    }
}
