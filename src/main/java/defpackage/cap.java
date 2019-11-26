package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: cap */
public final class cap implements bzs, cas {
    private final ContentResolver a;

    public cap(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final void a() {
    }

    public final bsv a(Uri uri) {
        return new btg(this.a, uri);
    }

    public final bzq a(bzy bzy) {
        return new can(this);
    }
}
