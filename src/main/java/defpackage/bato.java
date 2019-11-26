package defpackage;

/* renamed from: bato */
public final class bato {
    public String a;
    public batn b;
    public batt c;
    private Long d;

    public final bato a(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    public final batl a() {
        amqw.a(this.a, (Object) "description");
        amqw.a(this.b, (Object) "severity");
        amqw.a(this.d, (Object) "timestampNanos");
        amqw.b(true, (Object) "at least one of channelRef and subchannelRef must be null");
        return new batl(this.a, this.b, this.d.longValue(), this.c);
    }
}
