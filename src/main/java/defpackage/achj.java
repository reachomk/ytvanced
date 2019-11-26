package defpackage;

import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;

/* renamed from: achj */
final class achj implements OnScanCompletedListener {
    private final /* synthetic */ acht a;

    achj(acht acht) {
        this.a = acht;
    }

    public final void onScanCompleted(String str, Uri uri) {
        this.a.a(uri);
    }
}
