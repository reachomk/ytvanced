package defpackage;

/* renamed from: qsq */
final class qsq implements Runnable {
    private final /* synthetic */ qsn a;

    qsq(qsn qsn) {
        this.a = qsn;
    }

    public final void run() {
        if (this.a.d == null) {
            synchronized (qsn.b) {
                if (this.a.d != null) {
                    return;
                }
                boolean booleanValue = ((Boolean) rlj.d().a(roe.d)).booleanValue();
                if (booleanValue) {
                    try {
                        qsn.c = new rkn(this.a.a.a, "ADSHIELD");
                    } catch (Throwable unused) {
                        booleanValue = false;
                    }
                }
                this.a.d = Boolean.valueOf(booleanValue);
                qsn.b.open();
            }
        }
    }
}
