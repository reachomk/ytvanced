package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cjg */
public final class cjg extends bakn {
    private byte[] a;

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) this.a.length;
    }

    public cjg() {
        super("skip");
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }

    public final String toString() {
        int length = this.a.length;
        String str = this.h;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append("FreeSpaceBox[size=");
        stringBuilder.append(length);
        stringBuilder.append(";type=");
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
