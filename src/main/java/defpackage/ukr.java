package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.nio.ByteBuffer;

/* renamed from: ukr */
public final class ukr implements uks {
    private final MediaExtractor a;

    public ukr(MediaExtractor mediaExtractor) {
        uhy.b(true);
        this.a = mediaExtractor;
    }

    public final void a(Context context, Uri uri) {
        this.a.setDataSource(context, uri, null);
    }

    public final void a() {
        this.a.release();
    }

    public final int b() {
        return this.a.getTrackCount();
    }

    public final MediaFormat a(int i) {
        return this.a.getTrackFormat(i);
    }

    public final void b(int i) {
        this.a.selectTrack(i);
    }

    public final void a(long j) {
        this.a.seekTo(j, 2);
    }

    public final boolean c() {
        return this.a.advance();
    }

    public final int a(ByteBuffer byteBuffer) {
        return this.a.readSampleData(byteBuffer, 0);
    }

    public final long d() {
        return this.a.getSampleTime();
    }
}
