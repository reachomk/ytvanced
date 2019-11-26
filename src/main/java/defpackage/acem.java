package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: acem */
final class acem extends Handler {
    private final /* synthetic */ acek a;

    acem(acek acek, Looper looper) {
        this.a = acek;
        super(looper);
    }

    public final void handleMessage(Message message) {
        xak.a();
        switch (message.what) {
            case 1000:
                acek acek = this.a;
                acek.a(acek.a, false, false, false);
                break;
            case 1001:
                this.a.a(message.arg1, true, false, true);
                return;
            case 1002:
                this.a.a(message.arg1, true, false, false);
                return;
            case 1003:
                this.a.a(message.arg1, false, true, false);
                return;
        }
    }
}
