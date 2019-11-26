package defpackage;

import android.util.Log;

/* renamed from: sjd */
final class sjd implements tes {
    sjd() {
    }

    public final void a(teg teg) {
        int a = teg.a();
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Failed to connect Phenotype GcoreGoogleApiClient: ");
        stringBuilder.append(a);
        Log.e("ClientWrapperGcoreImpl", stringBuilder.toString());
    }
}
