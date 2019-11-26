package defpackage;

import android.media.session.MediaSession.Token;
import android.os.Bundle;

/* renamed from: uf */
final class uf implements Runnable {
    private final /* synthetic */ xo a;
    private final /* synthetic */ uc b;

    uf(uc ucVar, xo xoVar) {
        this.b = ucVar;
        this.a = xoVar;
    }

    public final void run() {
        if (!this.b.a.isEmpty()) {
            vy vyVar = this.a.b;
            if (vyVar != null) {
                for (Bundle putBinder : this.b.a) {
                    putBinder.putBinder("extra_session_binder", vyVar.asBinder());
                }
            }
            this.b.a.clear();
        }
        this.b.b.setSessionToken((Token) this.a.a);
    }
}
