package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cik */
final class cik extends ThreadLocal {
    cik() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
