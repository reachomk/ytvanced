package defpackage;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;

/* renamed from: qij */
final /* synthetic */ class qij implements Callback {
    private final qik a;

    qij(qik qik) {
        this.a = qik;
    }

    public final boolean handleMessage(Message message) {
        qik qik = this.a;
        int i = message.arg1;
        synchronized (qik) {
            qiq qiq = (qiq) qik.e.get(i);
            if (qiq == null) {
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Received response for unknown request: ");
                stringBuilder.append(i);
                Log.w("MessengerIpcClient", stringBuilder.toString());
            } else {
                qik.e.remove(i);
                qik.a();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    qiq.a(new qip(4, "Not supported by GmsCore"));
                } else {
                    qiq.a(data);
                }
            }
        }
        return true;
    }
}
