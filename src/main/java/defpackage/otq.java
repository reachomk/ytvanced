package defpackage;

/* renamed from: otq */
final class otq implements Comparable {
    public final otk a;
    private final int b;

    public otq(int i, otk otk) {
        this.b = i;
        this.a = otk;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((otq) obj).b;
    }
}
