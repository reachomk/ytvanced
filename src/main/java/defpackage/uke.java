package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* renamed from: uke */
final class uke {
    public MediaFormat a;
    public final MediaCodec b;
    public int c = 1;

    public uke(MediaFormat mediaFormat) {
        this.b = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b.configure(mediaFormat, null, null, 1);
        this.b.start();
    }
}
