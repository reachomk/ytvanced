package defpackage;

/* renamed from: ahpf */
final /* synthetic */ class ahpf implements Runnable {
    private final ahpa a;
    private final boolean b;

    ahpf(ahpa ahpa, boolean z) {
        this.a = ahpa;
        this.b = z;
    }

    public final void run() {
        this.a.k.setVisibility(!this.b ? 0 : 8);
    }
}
