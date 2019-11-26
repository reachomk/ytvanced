package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: we */
final class we extends Handler {
    public boolean a = false;
    private final /* synthetic */ wc b;

    we(wc wcVar, Looper looper) {
        this.b = wcVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.a) {
            Object obj;
            switch (message.what) {
                case 1:
                    wq.a(message.getData());
                    obj = message.obj;
                    break;
                case 2:
                    this.b.a((xs) message.obj);
                    return;
                case 3:
                    this.b.a((vj) message.obj);
                    return;
                case 4:
                    obj = message.obj;
                    return;
                case 5:
                    obj = message.obj;
                    return;
                case 6:
                    obj = message.obj;
                    return;
                case 7:
                    wq.a((Bundle) message.obj);
                    return;
                case 8:
                    this.b.a();
                    return;
                case 9:
                    ((Integer) message.obj).intValue();
                    return;
                case 11:
                    ((Boolean) message.obj).booleanValue();
                    return;
                case 12:
                    ((Integer) message.obj).intValue();
                    return;
                case 13:
                    return;
            }
        }
    }
}
