package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;

/* renamed from: acja */
final class acja {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public long h;
    public byte[] i;
    public ByteBuffer j;
    public ByteArrayInputStream k;
    public DataInputStream l;

    private acja() {
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        long j = this.h;
        boolean z = this.f;
        int i6 = this.g;
        byte[] bArr = this.i;
        int length = bArr != null ? bArr.length : 0;
        StringBuilder stringBuilder = new StringBuilder(233);
        stringBuilder.append("[ chunkStreamId=");
        stringBuilder.append(i);
        stringBuilder.append(", length=");
        stringBuilder.append(i2);
        stringBuilder.append(", messageType=");
        stringBuilder.append(i3);
        stringBuilder.append(", messageStreamId=");
        stringBuilder.append(i4);
        stringBuilder.append(", timestampDelta=");
        stringBuilder.append(i5);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(j);
        stringBuilder.append(", isAborting=");
        stringBuilder.append(z);
        stringBuilder.append(", mesgBytesPending=");
        stringBuilder.append(i6);
        stringBuilder.append(", dataSize=");
        stringBuilder.append(length);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    /* synthetic */ acja(byte b) {
    }
}
