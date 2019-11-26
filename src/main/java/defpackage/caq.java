package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: caq */
public final class caq implements bzs, cas {
    private final ContentResolver a;

    public caq(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final void a() {
    }

    public final bzq a(bzy bzy) {
        return new can(this);
    }

    public final bsv a(Uri uri) {
        return new bsu(this.a, uri);
    }
}
