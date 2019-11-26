package defpackage;

/* renamed from: fme */
final class fme implements Comparable {
    public int a;
    public int b;
    public final long c;

    fme(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((fme) obj).b;
    }
}
