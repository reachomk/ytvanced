package defpackage;

/* renamed from: ahmv */
public final /* synthetic */ class ahmv implements Runnable {
    private final ahmt a;
    private final long b;
    private final long c;

    public ahmv(ahmt ahmt, long j, long j2) {
        this.a = ahmt;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        ahmt ahmt = this.a;
        long j = this.b;
        long j2 = this.c;
        ahmw ahmw = ahmt.k;
        if (ahmw != null && !ahmw.isIndeterminate()) {
            ahmw.setMax((int) j2);
            ahmw.setProgress((int) j);
        }
    }
}
