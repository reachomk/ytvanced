package defpackage;

import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;

/* renamed from: gaa */
final class gaa implements Callback {
    private final /* synthetic */ gab a;

    gaa(gab gab) {
        this.a = gab;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        if (!this.a.b.isEmpty()) {
            gab gab = this.a;
            gab.c.removeMessages(1);
            if (!gab.b.isEmpty()) {
                for (gac gac : gab.b.values()) {
                    View a = gac.a();
                    if (a != null) {
                        gab.a.put(a, gac);
                    }
                }
                gab.b.clear();
            }
            this.a.a();
        }
        return true;
    }
}
