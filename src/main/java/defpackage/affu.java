package defpackage;

import android.os.Handler;

/* renamed from: affu */
public class affu extends noc {
    private final npz d;

    public affu(nok nok, nlx nlx, int i, Handler handler, noh noh, int i2, int i3, npz npz) {
        super(nok, nlx, i, handler, noh, i2, i3);
        this.d = npz;
    }

    public int a(int i, long j, nmz nmz, nnb nnb) {
        i = super.a(i, j, nmz, nnb);
        if (i == -4) {
            npz npz = this.d;
            if (npz != null) {
                npz.a(nmz.b);
                return -4;
            }
        }
        return i;
    }
}
