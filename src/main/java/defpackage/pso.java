package defpackage;

/* renamed from: pso */
public final class pso {
    public final String a;
    private final psq b;
    private final psv c;

    public pso(String str, psq psq, psv psv) {
        pzr.a((Object) psq, (Object) "Cannot construct an Api with a null ClientBuilder");
        pzr.a((Object) psv, (Object) "Cannot construct an Api with a null ClientKey");
        this.a = str;
        this.b = psq;
        this.c = psv;
    }

    public final psq a() {
        pzr.a(this.b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.b;
    }

    public final pss b() {
        psv psv = this.c;
        if (psv != null) {
            return psv;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
