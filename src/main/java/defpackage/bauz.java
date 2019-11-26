package defpackage;

/* renamed from: bauz */
public final class bauz {
    public final int a;
    public final bavs b;
    public final bawg c;
    private final bavi d;

    public bauz(Integer num, bavs bavs, bawg bawg, bavi bavi) {
        this.a = ((Integer) amqw.a((Object) num, (Object) "defaultPort not set")).intValue();
        this.b = (bavs) amqw.a((Object) bavs, (Object) "proxyDetector not set");
        this.c = (bawg) amqw.a((Object) bawg, (Object) "syncContext not set");
        this.d = (bavi) amqw.a((Object) bavi, (Object) "serviceConfigParser not set");
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("defaultPort", this.a);
        a.a("proxyDetector", this.b);
        a.a("syncContext", this.c);
        a.a("serviceConfigParser", this.d);
        return a.toString();
    }
}
