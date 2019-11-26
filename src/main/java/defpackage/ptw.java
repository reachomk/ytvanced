package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: ptw */
public final class ptw extends Handler {
    public ptw() {
        super(Looper.getMainLooper());
    }

    public ptw(Looper looper) {
        super(looper);
    }

    public final void a(ptm ptm, ptn ptn) {
        sendMessage(obtainMessage(1, new Pair(ptm, ptn)));
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            ptm ptm = (ptm) pair.first;
            ptn ptn = (ptn) pair.second;
            try {
                ptm.a(ptn);
            } catch (RuntimeException e) {
                BasePendingResult.b(ptn);
                throw e;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("Don't know how to handle message: ");
            stringBuilder.append(i2);
            Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).c(Status.d);
        }
    }
}
