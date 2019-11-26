package defpackage;

/* renamed from: bcka */
final class bcka implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ int b;
    private final /* synthetic */ bcjy c;

    bcka(bcjy bcjy, long j, int i) {
        this.c = bcjy;
        this.a = j;
        this.b = i;
    }

    public final void run() {
        this.c.b.c.a(this.a, this.b);
    }
}
