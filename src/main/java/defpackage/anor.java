package defpackage;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;

/* renamed from: anor */
final /* synthetic */ class anor implements Callback {
    private final anos a;

    anor(anos anos) {
        this.a = anos;
    }

    public final boolean handleMessage(Message message) {
        anos anos = this.a;
        int i = message.arg1;
        synchronized (anos) {
            anox anox = (anox) anos.e.get(i);
            if (anox == null) {
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Received response for unknown request: ");
                stringBuilder.append(i);
                Log.w("MessengerIpcClient", stringBuilder.toString());
            } else {
                anos.e.remove(i);
                anos.a();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    anox.a(new anpa(4, "Not supported by GmsCore"));
                } else {
                    anox.a(data);
                }
            }
        }
        return true;
    }
}
