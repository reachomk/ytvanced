package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: yq */
final class yq implements Callback {
    private final /* synthetic */ yr a;

    yq(yr yrVar) {
        this.a = yrVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            yr yrVar = this.a;
            synchronized (yrVar.a) {
                if (yrVar.c.hasMessages(1)) {
                } else {
                    yrVar.b.quit();
                    yrVar.b = null;
                    yrVar.c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            yr yrVar2 = this.a;
            ((Runnable) message.obj).run();
            synchronized (yrVar2.a) {
                yrVar2.c.removeMessages(0);
                Handler handler = yrVar2.c;
                handler.sendMessageDelayed(handler.obtainMessage(0), (long) yrVar2.d);
            }
            return true;
        }
    }
}
