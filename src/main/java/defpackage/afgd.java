package defpackage;

/* renamed from: afgd */
final class afgd implements Runnable {
    private final /* synthetic */ byte[] a;
    private final /* synthetic */ long b;
    private final /* synthetic */ afga c;

    afgd(afga afga, byte[] bArr, long j) {
        this.c = afga;
        this.a = bArr;
        this.b = j;
    }

    public final void run() {
        this.c.c.a(this.a, this.b);
    }
}
