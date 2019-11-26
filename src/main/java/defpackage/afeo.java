package defpackage;

import android.os.Message;

/* renamed from: afeo */
final class afeo extends afes {
    private final /* synthetic */ afep a;

    afeo(afep afep, aeuy aeuy) {
        this.a = afep;
        super(aeuy);
    }

    public final boolean handleMessage(Message message) {
        int i;
        if (this.a.c) {
            i = message.what;
            if (i == 3) {
                this.a.a.n();
                this.a.z();
                return a(message);
            } else if (i == 4 || i == 7) {
                this.a.a.a(true);
                this.a.z();
                return a(message);
            }
        }
        if (this.a.d) {
            i = message.what;
            if (i == 2 || i == 4) {
                this.a.y();
                return a(message);
            } else if (i == 8) {
                if (((afif) message.obj).d()) {
                    this.a.y();
                    this.a.i = null;
                }
                return a(message);
            } else if (i == 11) {
                return a(message);
            }
        }
        if (!this.a.x()) {
            a(message);
        }
        return true;
    }
}
