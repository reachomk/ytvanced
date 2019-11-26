package defpackage;

import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;

/* renamed from: ebq */
public final class ebq implements acxn, IdleHandler {
    public final xci a;
    public MessageQueue b;

    public ebq(xci xci) {
        this.a = xci;
    }

    public final boolean queueIdle() {
        return false;
    }

    public final void a() {
        this.a.c(new edd());
    }
}
