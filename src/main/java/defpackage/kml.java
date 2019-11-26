package defpackage;

/* renamed from: kml */
final class kml extends ann {
    private final int a;

    public kml(int i) {
        this.a = i;
    }

    public final int a(int i) {
        return i == 0 ? this.a : 1;
    }

    public final int a(int i, int i2) {
        return i != 0 ? (i - 1) % i2 : 0;
    }

    public final int b(int i, int i2) {
        return i != 0 ? ((i - 1) / i2) + 1 : 0;
    }
}
