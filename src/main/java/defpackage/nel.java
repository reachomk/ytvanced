package defpackage;

/* renamed from: nel */
final class nel implements Runnable {
    private final /* synthetic */ ajji a;
    private final /* synthetic */ nei b;

    nel(nei nei, ajji ajji) {
        this.b = nei;
        this.a = ajji;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
