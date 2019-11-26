package defpackage;

import android.net.Uri;

/* renamed from: afri */
abstract class afri implements afsk {
    private final afsk a;

    public afri(afsk afsk) {
        this.a = afsk;
    }

    public abstract String a();

    public abstract void a(Uri uri, wxg wxg);

    /* renamed from: b */
    public void a(Uri uri, wxg wxg) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals(a())) {
            afsk afsk = this.a;
            if (afsk != null) {
                afsk.a(uri, wxg);
            }
            return;
        }
        a(uri, wxg);
    }
}
