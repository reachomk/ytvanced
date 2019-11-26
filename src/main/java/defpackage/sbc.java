package defpackage;

import android.content.Intent;
import android.view.KeyEvent;

/* renamed from: sbc */
final class sbc extends wv {
    private final /* synthetic */ sap c;

    sbc(sap sap) {
        this.c = sap;
    }

    public final boolean a(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
            o();
        }
        return true;
    }

    public final void f() {
        o();
    }

    public final void i() {
        o();
    }

    private final void o() {
        try {
            this.c.G();
        } catch (sbq | sbt | sbv e) {
            sdf.a(sap.r, "MediaSessionCompat.Callback(): Failed to toggle playback", e);
        }
    }
}
