package defpackage;

import android.net.Uri;

/* renamed from: akkt */
public final class akkt extends Exception {
    public final String a;
    private final String b;

    akkt(Throwable th, Uri uri) {
        this(th, uri, "Default");
    }

    public akkt(Throwable th, Uri uri, String str) {
        String str2;
        if (uri == null) {
            str2 = "NONE";
        } else {
            str2 = uri.toString();
        }
        this.b = str2;
        this.a = str;
        initCause(th);
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.b);
        String str = "Error loading url: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
