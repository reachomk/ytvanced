package defpackage;

/* renamed from: uie */
final class uie implements uic {
    private long a = 0;

    uie() {
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    public final anrq a() {
        anrt anrt = (anrt) anrq.c.createBuilder();
        long j = this.a;
        anrt.copyOnWrite();
        anrq anrq = (anrq) anrt.instance;
        anrq.a = 1;
        anrq.b = Long.valueOf(j);
        return (anrq) ((anxl) anrt.build());
    }

    public final /* synthetic */ void a(Object obj) {
        this.a += ((Long) obj).longValue();
    }
}
