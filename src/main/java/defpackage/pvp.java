package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: pvp */
final class pvp extends Handler {
    private final /* synthetic */ pvk a;

    pvp(pvk pvk, Looper looper) {
        this.a = pvk;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            pvk pvk = this.a;
            pvk.b.lock();
            try {
                if (pvk.j()) {
                    pvk.h();
                }
                pvk.b.unlock();
            } catch (Throwable th) {
                pvk.b.unlock();
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GoogleApiClientImpl", stringBuilder.toString());
        } else {
            this.a.i();
        }
    }
}
