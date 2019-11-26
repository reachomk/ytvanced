package defpackage;

/* renamed from: aeym */
final class aeym {
    public final ool a;
    public long b = 0;
    public onq c;
    public boolean d;
    public oau e;
    public long f = -1;

    aeym(ool ool) {
        this.a = ool;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        long j = this.f;
        return j != -1 ? j * 1000 : Long.MIN_VALUE;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j) {
        amqw.a(j >= 0);
        if (this.b != j) {
            this.b = j;
            if (this.e != null) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(long j) {
        boolean z = j > 0 || j == -1;
        amqw.a(z);
        if (this.f != j) {
            this.f = j;
            onq onq = this.c;
            if (onq != null) {
                long a = a();
                onq.b = 0;
                onq.c = a;
                return true;
            }
        }
        return false;
    }
}
