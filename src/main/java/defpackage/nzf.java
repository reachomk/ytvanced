package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: nzf */
final class nzf extends Handler {
    private final /* synthetic */ nyz a;

    nzf(nyz nyz, Looper looper) {
        this.a = nyz;
        super(looper);
    }

    public final void handleMessage(Message message) {
        nyz nyz = this.a;
        int i = message.what;
        boolean z = true;
        if (i == 0) {
            oad oad = (oad) message.obj;
            i = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            int i2 = message.arg2;
            int i3 = nyz.e - i;
            nyz.e = i3;
            if (i3 == 0) {
                oad a = oad.d == -9223372036854775807L ? oad.a(oad.c, 0, oad.e, oad.l) : oad;
                if (!nyz.i.a.c() && a.a.c()) {
                    nyz.k = 0;
                    nyz.j = 0;
                    nyz.l = 0;
                }
                int i4 = !nyz.f ? 2 : 0;
                boolean z2 = nyz.g;
                nyz.f = false;
                nyz.g = false;
                nyz.a(a, z, i2, i4, z2);
            }
        } else if (i == 1) {
            oag oag = (oag) message.obj;
            if (!nyz.h.equals(oag)) {
                nyz.h = oag;
                nyz.a(new nze(oag));
            }
        } else if (i == 2) {
            nyz.a(new nzd((nyy) message.obj));
        } else {
            throw new IllegalStateException();
        }
    }
}
