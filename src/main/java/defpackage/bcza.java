package defpackage;

/* renamed from: bcza */
public final class bcza implements bcty {
    private final bcuf a;
    private final bctz b;
    private final boolean c;

    public bcza(bctz bctz, bcuf bcuf, boolean z) {
        this.a = bcuf;
        this.b = bctz;
        this.c = z;
    }

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        bcuo a = this.a.a();
        bcuo bczd = new bczd(bcup, this.c, a, this.b);
        bcup.a(bczd);
        bcup.a(a);
        a.a(bczd);
    }
}
