package defpackage;

/* renamed from: aekl */
public final class aekl extends Exception {
    public final int a;

    public aekl(int i, String str) {
        super(str);
        this.a = i;
    }

    public aekl(String str, Exception exception) {
        super(str, exception);
        this.a = 5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aekl) && this.a == ((aekl) obj).a;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
