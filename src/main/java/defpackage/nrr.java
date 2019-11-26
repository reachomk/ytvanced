package defpackage;

import android.util.Pair;
import java.util.Collections;

/* renamed from: nrr */
final class nrr extends nrw {
    private static final int[] c = new int[]{5500, 11000, 22000, 44000};
    private boolean d;
    private boolean e;

    public nrr(nrs nrs) {
        super(nrs);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nwz nwz) {
        if (this.d) {
            nwz.d(1);
        } else {
            int d = nwz.d();
            int i = (d >> 4) & 15;
            d = (d >> 2) & 3;
            StringBuilder stringBuilder;
            if (d >= c.length) {
                stringBuilder = new StringBuilder(38);
                stringBuilder.append("Invalid sample rate index: ");
                stringBuilder.append(d);
                throw new nrv(stringBuilder.toString());
            } else if (i == 10) {
                this.d = true;
            } else {
                stringBuilder = new StringBuilder(39);
                stringBuilder.append("Audio format not supported: ");
                stringBuilder.append(i);
                throw new nrv(stringBuilder.toString());
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nwz nwz, long j) {
        int d = nwz.d();
        if (d == 0) {
            if (!this.e) {
                byte[] bArr = new byte[nwz.b()];
                nwz.a(bArr, 0, bArr.length);
                Pair a = nwh.a(bArr);
                this.a.a(nmx.a(null, "audio/mp4a-latm", -1, -1, this.b, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null));
                this.e = true;
            }
        } else if (d == 1) {
            int b = nwz.b();
            this.a.a(nwz, b);
            this.a.a(j, 1, b, 0, null);
        }
    }
}
