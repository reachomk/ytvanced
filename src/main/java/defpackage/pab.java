package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;

/* renamed from: pab */
final class pab implements OnFrameRenderedListener {
    private final /* synthetic */ ozz a;

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        ozz ozz = this.a;
        if (this == ozz.e) {
            ozz.e(j);
        }
    }

    /* synthetic */ pab(ozz ozz, MediaCodec mediaCodec) {
        this.a = ozz;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }
}
