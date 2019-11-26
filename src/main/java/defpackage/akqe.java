package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: akqe */
final /* synthetic */ class akqe implements Callback {
    private final akqf a;

    akqe(akqf akqf) {
        this.a = akqf;
    }

    public final boolean handleMessage(Message message) {
        akqs akqs;
        akqf akqf = this.a;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            akqs = akqf.b;
        } else if (i == 2) {
            akqs = akqf.c;
        } else if (i == 3) {
            akqs = akqf.d;
        } else if (i == 4) {
            akqs = akqf.e;
        } else if (i != 5) {
            z = false;
            return z;
        } else {
            akqs = akqf.f;
        }
        if (!akqf.a(akqs)) {
            akqf.a.post(new akql(akqf));
            return true;
        }
        return z;
    }
}
