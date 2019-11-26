package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: amet */
public final class amet implements amfa {
    private final ContentResolver a;

    public amet(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final String a() {
        return "content";
    }

    public final /* synthetic */ amev a(Uri uri, amex amex) {
        return new ameu(uri, this.a);
    }
}
