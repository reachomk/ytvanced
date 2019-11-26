package defpackage;

/* renamed from: adpa */
final class adpa implements Cloneable {
    private final long a;
    private final long b;

    public adpa(long j, long j2) {
        amqw.a(j <= j2);
        this.a = j;
        this.b = j2;
    }

    public final boolean a(long j) {
        return j >= this.a && j <= this.b;
    }

    private final adpa a() {
        try {
            return (adpa) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final /* synthetic */ Object clone() {
        return a();
    }
}
