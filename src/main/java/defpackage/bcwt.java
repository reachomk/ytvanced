package defpackage;

/* renamed from: bcwt */
final class bcwt extends bcwn {
    public static final long serialVersionUID = 3776720187248809713L;

    public bcwt(bcup bcup) {
        super(bcup);
    }

    public final void e_(Object obj) {
        if (!this.a.c()) {
            this.a.e_(obj);
            long j;
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, -1 + j));
        }
    }
}
