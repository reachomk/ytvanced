package defpackage;

import android.util.Log;

/* renamed from: sje */
final class sje implements tes {
    sje() {
    }

    public final void a(teg teg) {
        int a = teg.a();
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("Failed to connect People GcoreGoogleApiClient: ");
        stringBuilder.append(a);
        Log.e("ClientWrapperGcoreImpl", stringBuilder.toString());
    }
}
