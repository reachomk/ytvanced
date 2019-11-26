package defpackage;

/* renamed from: bdcm */
final class bdcm implements bcun {
    private final bcuf a;
    private final Object b;

    bdcm(bcuf bcuf, Object obj) {
        this.a = bcuf;
        this.b = obj;
    }

    public final /* synthetic */ void a(Object obj) {
        bcum bcum = (bcum) obj;
        bcuo a = this.a.a();
        bcum.a(a);
        a.a(new bdcp(bcum, this.b));
    }
}
