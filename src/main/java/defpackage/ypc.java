package defpackage;

/* renamed from: ypc */
final /* synthetic */ class ypc implements ysa {
    private final yoz a;

    ypc(yoz yoz) {
        this.a = yoz;
    }

    public final void a() {
        yoz yoz = this.a;
        if (yoz.j.compareAndSet(false, true)) {
            yoz.i.a();
        }
    }
}
