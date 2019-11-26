package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: baw */
final class baw extends Handler {
    private final /* synthetic */ ban a;

    baw(ban ban) {
        this.a = ban;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        ban ban;
        if (i == 1) {
            ban = this.a;
            ban.h = false;
            baq baq = ban.d;
            if (baq != null) {
                baq.a(ban, ban.g);
            }
        } else if (i == 2) {
            ban = this.a;
            ban.f = false;
            ban.b(ban.e);
        }
    }
}
