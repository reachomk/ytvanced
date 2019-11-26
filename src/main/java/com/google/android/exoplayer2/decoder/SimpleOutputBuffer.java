package com.google.android.exoplayer2.decoder;

import defpackage.odl;
import defpackage.odm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SimpleOutputBuffer extends odm {
    public ByteBuffer data;
    public final odl owner;

    public SimpleOutputBuffer(odl odl) {
        this.owner = odl;
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void release() {
        this.owner.a((odm) this);
    }
}
