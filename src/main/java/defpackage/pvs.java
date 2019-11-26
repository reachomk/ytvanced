package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: pvs */
final class pvs extends Handler {
    private final /* synthetic */ pvq a;

    pvs(pvq pvq, Looper looper) {
        this.a = pvq;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            pvt pvt = (pvt) message.obj;
            pvq pvq = this.a;
            pvq.a.lock();
            try {
                if (pvq.k == pvt.a) {
                    pvt.a();
                } else {
                    pvq.a.unlock();
                }
            } finally {
                pvq.a.unlock();
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GACStateManager", stringBuilder.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
