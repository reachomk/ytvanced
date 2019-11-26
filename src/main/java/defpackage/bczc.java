package defpackage;

/* renamed from: bczc */
final class bczc implements bcuc {
    public final /* synthetic */ bcuc a;
    private final /* synthetic */ bczd b;

    bczc(bczd bczd, bcuc bcuc) {
        this.b = bczd;
        this.a = bcuc;
    }

    public final void a(long j) {
        if (this.b.c != Thread.currentThread()) {
            bczd bczd = this.b;
            if (bczd.a) {
                bczd.b.a(new bczf(this, j));
                return;
            }
        }
        this.a.a(j);
    }
}
