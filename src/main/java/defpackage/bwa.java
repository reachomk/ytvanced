package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: bwa */
final class bwa implements Callback {
    bwa() {
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((bvw) message.obj).d();
        return true;
    }
}
