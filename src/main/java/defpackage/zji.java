package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import android.media.MediaMetadataRetriever;
import android.net.Uri;

/* renamed from: zji */
public final class zji {
    private final bapu a;
    private final bapu b;
    private final Context c;
    private long d;

    zji(bapu bapu, bapu bapu2, Context context) {
        this.a = bapu;
        this.b = bapu2;
        this.c = context;
    }

    public final long a() {
        ((MediaActionSound) this.a.get()).play(2);
        long j = this.d;
        if (j > 0) {
            return j;
        }
        this.d = 500;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.b.get();
            mediaMetadataRetriever.setDataSource(this.c, Uri.parse("/system/media/audio/ui/VideoRecord.ogg"));
            this.d = Math.max(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) + 150, 500);
        } catch (RuntimeException unused) {
        }
        return this.d;
    }

    public final void b() {
        ((MediaActionSound) this.a.get()).play(0);
    }
}
