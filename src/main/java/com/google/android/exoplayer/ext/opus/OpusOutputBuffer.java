package com.google.android.exoplayer.ext.opus;

import defpackage.nxj;
import java.nio.ByteBuffer;

public final class OpusOutputBuffer extends nxj {
    public ByteBuffer data;
    public final OpusDecoder owner;

    OpusOutputBuffer(OpusDecoder opusDecoder) {
        this.owner = opusDecoder;
    }

    /* Access modifiers changed, original: final */
    public final void init(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i);
        }
        this.data.position(0);
        this.data.limit(i);
    }

    public final void reset() {
        super.reset();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void release() {
        this.owner.a(this);
    }
}
