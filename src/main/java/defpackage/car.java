package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: car */
public final class car implements bzs, cas {
    private final ContentResolver a;

    public car(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final void a() {
    }

    public final bsv a(Uri uri) {
        return new bto(this.a, uri);
    }

    public final bzq a(bzy bzy) {
        return new can(this);
    }
}
