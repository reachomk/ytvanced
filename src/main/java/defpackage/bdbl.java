package defpackage;

/* renamed from: bdbl */
final class bdbl implements bcvl {
    private final bcvl a;
    private final bcue b;
    private final long c;

    public bdbl(bcvl bcvl, bcue bcue, long j) {
        this.a = bcvl;
        this.b = bcue;
        this.c = j;
    }

    public final void a() {
        if (!this.b.c()) {
            long currentTimeMillis = this.c - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                try {
                    Thread.sleep(currentTimeMillis);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bcva.a(e);
                }
            }
            if (!this.b.c()) {
                this.a.a();
            }
        }
    }
}
