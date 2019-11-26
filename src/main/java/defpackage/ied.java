package defpackage;

import android.content.ContentResolver;

/* renamed from: ied */
final /* synthetic */ class ied implements bcvo {
    private final ContentResolver a;
    private final ieb b;

    ied(ContentResolver contentResolver, ieb ieb) {
        this.a = contentResolver;
        this.b = ieb;
    }

    public final void a() {
        this.a.unregisterContentObserver(this.b);
    }
}
