package defpackage;

import android.net.Uri;

/* renamed from: aiad */
abstract class aiad implements wxg {
    public final /* synthetic */ void a(Object obj, Exception exception) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 46);
        stringBuilder.append("Couldn't retrieve annotation image from [uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        xtl.d(stringBuilder.toString());
    }

    /* synthetic */ aiad() {
    }
}
