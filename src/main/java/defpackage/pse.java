package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: pse */
final class pse extends Handler {
    private final Context a;
    private final /* synthetic */ psf b;

    public pse(psf psf, Context context) {
        Looper myLooper;
        this.b = psf;
        if (Looper.myLooper() != null) {
            myLooper = Looper.myLooper();
        } else {
            myLooper = Looper.getMainLooper();
        }
        super(myLooper);
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i;
        if (message.what != 1) {
            i = message.what;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Don't know how to handle this message: ");
            stringBuilder.append(i);
            Log.w("GoogleApiAvailability", stringBuilder.toString());
            return;
        }
        i = this.b.c(this.a);
        if (psl.b(i)) {
            this.b.a(this.a, i);
        }
    }
}
