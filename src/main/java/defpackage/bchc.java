package defpackage;

import android.media.MediaCodec.BufferInfo;

/* renamed from: bchc */
final class bchc {
    public final bchb a;
    public final int b;
    public final long c;
    public final int d;

    /* synthetic */ bchc(bchb bchb, int i, BufferInfo bufferInfo) {
        this.a = bchb;
        this.b = i;
        this.c = bufferInfo.presentationTimeUs;
        this.d = bufferInfo.flags;
    }
}
