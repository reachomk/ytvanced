package defpackage;

import android.os.Handler;

/* renamed from: aevt */
final class aevt extends nnx {
    private final /* synthetic */ aevp a;

    aevt(aevp aevp, nrc nrc) {
        this.a = aevp;
        super(nrc);
    }

    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        aevp aevp = this.a;
        if (aevp.i) {
            Long l = aevp.h;
            if (l != null) {
                long longValue = l.longValue();
                Handler handler = aevp.b;
                if (!(handler == null || aevp.c == null)) {
                    handler.post(new aevr(aevp, longValue, j));
                }
                this.a.i = false;
            }
        }
        aevx aevx = this.a.k;
        if (aevx.p < 0) {
            aevx.p = j;
        }
        aevx.q = j;
        this.a.b(j);
        super.a(j, i, i2, i3, bArr);
    }
}
