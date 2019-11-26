package defpackage;

import android.util.Log;

/* renamed from: sji */
final class sji implements tex {
    sji() {
    }

    public final /* synthetic */ void a(teu teu) {
        tew tew = (tew) teu;
        if (!tew.b()) {
            String valueOf = String.valueOf(tew.c());
            String str = "Failed to register for experiment flags: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.w("ClientWrapperGcoreImpl", valueOf);
        }
    }
}
