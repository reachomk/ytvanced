package defpackage;

import android.net.Uri;

/* renamed from: afqu */
final class afqu implements Runnable {
    private final /* synthetic */ bqk a;
    private final /* synthetic */ Uri b;

    afqu(bqk bqk, Uri uri) {
        this.a = bqk;
        this.b = uri;
    }

    public final void run() {
        bqk bqk = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 12);
        stringBuilder.append("Invalid URI ");
        stringBuilder.append(valueOf);
        bqk.a(new afqi(stringBuilder.toString()));
    }
}
