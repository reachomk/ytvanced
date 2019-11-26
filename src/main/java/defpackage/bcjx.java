package defpackage;

/* renamed from: bcjx */
final class bcjx implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ int b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ bcjy d;

    bcjx(bcjy bcjy, long j, int i, boolean z) {
        this.d = bcjy;
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final void run() {
        this.d.b.c.a(this.a, this.b);
        if (this.c) {
            this.d.b.c.a(this.b);
            this.d.b.c.a(new long[]{this.a});
        }
    }
}
