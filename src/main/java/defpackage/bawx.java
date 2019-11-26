package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bawx */
final class bawx implements bbhy {
    bawx() {
    }

    public final bbhv a(int i) {
        return new bawy(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }
}
