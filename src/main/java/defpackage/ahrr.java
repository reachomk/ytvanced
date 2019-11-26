package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: ahrr */
final /* synthetic */ class ahrr implements Callback {
    private final ahro a;

    ahrr(ahro ahro) {
        this.a = ahro;
    }

    public final boolean handleMessage(Message message) {
        ahro ahro = this.a;
        if (message.what == 3) {
            afkj afkj = ahro.f;
            if (afkj != null) {
                afkj.e();
                return true;
            }
        }
        return false;
    }
}
