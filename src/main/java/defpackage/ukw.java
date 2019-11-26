package defpackage;

/* renamed from: ukw */
public final class ukw extends nlz {
    private long h = 0;

    public ukw(nne nne) {
        super(nne, nmg.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final nma h() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final long g() {
        return super.g() + this.h;
    }

    public final void a(int i, Object obj) {
        if (i == 1001) {
            this.h = ((Long) obj).longValue();
        } else {
            super.a(i, obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final long c(long j) {
        return Math.max(0, j - this.h);
    }
}
