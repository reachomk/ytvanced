package defpackage;

import android.os.Message;

/* renamed from: ibj */
final class ibj extends xwc {
    public ibj(ibf ibf) {
        super(ibf);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj, Message message) {
        if (message.what == 1) {
            ((Runnable) message.obj).run();
        }
    }
}
