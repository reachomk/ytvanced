package defpackage;

/* renamed from: bazl */
final class bazl implements Runnable {
    private final long a;
    private final /* synthetic */ baze b;

    bazl(baze baze, long j) {
        this.b = baze;
        this.a = j;
    }

    public final void run() {
        this.b.f.b(bavx.e.b(String.format("deadline exceeded after %dns", new Object[]{Long.valueOf(this.a)})));
    }
}
