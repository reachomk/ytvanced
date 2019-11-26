package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: sai */
final class sai implements Callback {
    private final /* synthetic */ saf a;

    public final boolean handleMessage(Message message) {
        saf saf = this.a;
        boolean z = message.what == 0;
        if (!z) {
            bbb bbb = saf.d;
            if (bbb != null) {
                bbb.a(saf.f);
            }
        } else if (!(saf.d == null || saf.f == null)) {
            saf.g();
            if (saf.c(32)) {
                saf.k();
            }
        }
        for (sbm a : saf.j) {
            a.a(z);
        }
        return true;
    }

    /* synthetic */ sai(saf saf) {
        this.a = saf;
    }
}
