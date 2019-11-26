package defpackage;

/* renamed from: abph */
final /* synthetic */ class abph implements Runnable {
    private final abpe a;
    private final augx b;
    private final long c;

    abph(abpe abpe, augx augx, long j) {
        this.a = abpe;
        this.b = augx;
        this.c = j;
    }

    public final void run() {
        abpe abpe = this.a;
        augx augx = this.b;
        long j = this.c;
        int i = augx.a;
        if (i == 132600952) {
            augz augz = (augz) augx.b;
            abpe.a(augz.b, augz, j);
        } else if (i != 132600924) {
            if (i == 201730354) {
                augv augv = (augv) augx.b;
                abpe.a(augv.b, augv, j);
            }
        } else {
            auhb auhb = (auhb) augx.b;
            abpe.a(auhb.b, auhb, j);
        }
    }
}
