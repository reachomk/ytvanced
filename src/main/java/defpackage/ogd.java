package defpackage;

import android.util.Pair;
import java.util.Collections;

/* renamed from: ogd */
final class ogd extends oge {
    private static final int[] b = new int[]{5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public ogd(ofy ofy) {
        super(ofy);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza) {
        if (this.c) {
            oza.d(1);
        } else {
            int d = oza.d();
            int i = (d >> 4) & 15;
            this.e = i;
            if (i == 2) {
                this.a.a(nzw.a(null, "audio/mpeg", -1, -1, 1, b[(d >> 2) & 3], null, null, null));
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.a.a(nzw.a(null, i != 7 ? "audio/g711-mlaw" : "audio/g711-alaw", -1, -1, 1, 8000, (d & 1) == 0 ? 3 : 2, null, null, 0, null));
                this.d = true;
            } else if (i != 10) {
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Audio format not supported: ");
                stringBuilder.append(i);
                throw new ogh(stringBuilder.toString());
            }
            this.c = true;
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(oza oza, long j) {
        if (this.e == 2) {
            int b = oza.b();
            this.a.a(oza, b);
            this.a.a(j, 1, b, 0, null);
        } else {
            int d = oza.d();
            if (d == 0 && !this.d) {
                byte[] bArr = new byte[oza.b()];
                oza.a(bArr, 0, bArr.length);
                Pair a = oyd.a(bArr);
                this.a.a(nzw.a(null, "audio/mp4a-latm", -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, null));
                this.d = true;
            } else if (this.e != 10 || d == 1) {
                int b2 = oza.b();
                this.a.a(oza, b2);
                this.a.a(j, 1, b2, 0, null);
            }
        }
    }
}
