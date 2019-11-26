package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: amew */
public final class amew implements amfa {
    private final ContentResolver a;

    public amew(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final String a() {
        return "file";
    }

    public final /* synthetic */ amev a(Uri uri, amex amex) {
        return new ameu(uri, this.a);
    }
}
