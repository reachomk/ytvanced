package defpackage;

/* renamed from: anbs */
final class anbs {
    private final int a;
    private final int b = 0;

    anbs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof anbs) && this.a == ((anbs) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
