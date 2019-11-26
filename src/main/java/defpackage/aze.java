package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: aze */
final class aze extends Handler {
    private final /* synthetic */ azf a;

    aze(azf azf) {
        this.a = azf;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b((List) message.obj);
        }
    }
}
