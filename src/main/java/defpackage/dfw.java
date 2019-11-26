package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: dfw */
public final class dfw extends dfq {
    private final Context a;

    public dfw(Context context) {
        this.a = context;
    }

    public final void a(String str, long j) {
        try {
            Context context = this.a;
            dgg dgg = new dgg();
            dgg.a = str;
            dgg.b = true;
            dgg.f = true;
            dgg.e = TimeUnit.MILLISECONDS.toSeconds(j);
            dfq.a(context, dgg);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
