package defpackage;

/* renamed from: alus */
final /* synthetic */ class alus implements anij {
    private final aluo a;
    private final amqv b;

    alus(aluo aluo, amqv amqv) {
        this.a = aluo;
        this.b = amqv;
    }

    public final anjv a() {
        aluo aluo = this.a;
        amqv amqv = this.b;
        for (Object a : aluo.d.a().keySet()) {
            if (amqv.a(a)) {
                return anjf.a(null);
            }
        }
        return anjf.a(null);
    }
}
