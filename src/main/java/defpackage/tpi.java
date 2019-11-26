package defpackage;

import android.util.Log;

/* renamed from: tpi */
final class tpi implements tes {
    tpi() {
    }

    public final void a(teg teg) {
        String valueOf = String.valueOf(teg);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
        stringBuilder.append("Connection failed with result: ");
        stringBuilder.append(valueOf);
        Log.e("DefaultHerrevadReporter", stringBuilder.toString());
    }
}
