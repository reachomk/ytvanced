package defpackage;

/* renamed from: mnr */
final class mnr implements bcaa {
    private final bcaa a;

    private mnr(bcaa bcaa) {
        this.a = (bcaa) baqd.a(bcaa);
    }

    public static bcaa a(bcaa bcaa) {
        return new mnr(bcaa);
    }

    public final /* synthetic */ Object get() {
        return amqp.b(this.a.get());
    }
}
