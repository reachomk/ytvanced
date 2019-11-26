package defpackage;

import android.net.Uri;

/* renamed from: agne */
public final class agne implements agmk {
    private final agmx a;

    public agne(agmx agmx) {
        this.a = agmx;
    }

    public final agmh a(String str, Uri uri) {
        return new agmy(this.a, str, uri);
    }

    public final agmh a(Uri uri) {
        return new agmy(this.a, uri);
    }
}
