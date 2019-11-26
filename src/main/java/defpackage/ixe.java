package defpackage;

/* renamed from: ixe */
public final class ixe {
    private final bcaa a;
    private final bcaa b;
    private final afpu c;

    public ixe(bcaa bcaa, bcaa bcaa2, afpu afpu) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (bcaa) amqw.a((Object) bcaa2);
        this.c = (afpu) amqw.a((Object) afpu);
    }

    public final abol a() {
        if (b()) {
            return (abol) this.a.get();
        }
        return (abol) this.b.get();
    }

    public final boolean b() {
        return this.c.a() ^ 1;
    }
}
