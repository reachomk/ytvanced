package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.media.MediaMetadataRetriever;

/* renamed from: ggd */
public final class ggd {
    public final MediaMetadataRetriever a = new MediaMetadataRetriever();
    public final ContentResolver b;

    public ggd(Context context) {
        this.b = context.getContentResolver();
    }

    public final void a() {
        try {
            this.a.release();
        } catch (RuntimeException unused) {
        }
    }
}
