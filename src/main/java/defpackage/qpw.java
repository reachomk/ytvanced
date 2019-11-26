package defpackage;

/* renamed from: qpw */
public final class qpw implements Runnable {
    private final /* synthetic */ qqa a;
    private final /* synthetic */ long b;
    private final /* synthetic */ qpr c;

    public qpw(qpr qpr, qqa qqa, long j) {
        this.c = qpr;
        this.a = qqa;
        this.b = j;
    }

    public final void run() {
        qqa qqa = this.a;
        qqb qqb = this.c.a;
        qqb.getClass();
        long j = this.b;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("getResults timeout: ");
        stringBuilder.append(j);
        stringBuilder.append(" ms");
        qqa.c(new qqe(qqb, stringBuilder.toString()));
    }
}
