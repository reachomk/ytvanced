package defpackage;

/* renamed from: axl */
final class axl implements Runnable {
    private final /* synthetic */ awy a;
    private final /* synthetic */ axi b;

    axl(axi axi, awy awy) {
        this.b = axi;
        this.a = awy;
    }

    public final void run() {
        axi axi = this.b;
        axi.c = this.a;
        axi.a();
    }
}
