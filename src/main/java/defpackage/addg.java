package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: addg */
final class addg extends Handler {
    private final adlv a;

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            addf addf = (addf) message.obj;
            adiy adiy = addf.c;
            addz addz = addf.d;
            adio adio = (adio) this.a.a(adiy);
            if (adio == null) {
                a(addf);
            } else {
                String str = adcz.a;
                String valueOf = String.valueOf(adio.br_());
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
                stringBuilder.append("Found screen with id: ");
                stringBuilder.append(valueOf);
                xtl.c(str, stringBuilder.toString());
                addg.a(addz, adio.g().a(adix.DIAL).b());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(addf addf) {
        addf addf2;
        if (addf.e < addf.a.length - 1) {
            addf2 = new addf(addf.e + 1, addf.c, addf.d);
        } else {
            addf2 = addf.b;
        }
        if (addf2 == addf.b) {
            addg.a(addf.d, null);
        } else {
            sendMessageDelayed(Message.obtain(this, 1, addf2), addf.a[addf2.e]);
        }
    }

    private static void a(addz addz, adio adio) {
        if (adio == null) {
            addz.a(3);
        } else {
            addz.a(adio);
        }
    }

    /* synthetic */ addg(Looper looper, adlv adlv) {
        super(looper);
        this.a = adlv;
    }
}
