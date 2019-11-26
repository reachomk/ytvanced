package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cks */
public final class cks extends bakp {
    public long a;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public ckn e;
    private long f;
    private boolean g;
    private boolean n;

    public cks() {
        super("tfhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        int n = n();
        long j = (n & 1) == 0 ? 8 : 16;
        if ((n & 2) == 2) {
            j += 4;
        }
        if ((n & 8) == 8) {
            j += 4;
        }
        if ((n & 16) == 16) {
            j += 4;
        }
        return (n & 32) == 32 ? j + 4 : j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, this.a);
        if ((n() & 1) == 1) {
            byteBuffer.putLong(this.b);
        }
        if ((n() & 2) == 2) {
            cin.a(byteBuffer, this.f);
        }
        if ((n() & 8) == 8) {
            cin.a(byteBuffer, this.c);
        }
        if ((n() & 16) == 16) {
            cin.a(byteBuffer, this.d);
        }
        if ((n() & 32) == 32) {
            this.e.a(byteBuffer);
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.a(byteBuffer);
        if ((n() & 1) == 1) {
            this.b = cio.f(byteBuffer);
        }
        if ((n() & 2) == 2) {
            this.f = cio.a(byteBuffer);
        }
        if ((n() & 8) == 8) {
            this.c = cio.a(byteBuffer);
        }
        if ((n() & 16) == 16) {
            this.d = cio.a(byteBuffer);
        }
        if ((n() & 32) == 32) {
            this.e = new ckn(byteBuffer);
        }
        if ((n() & 65536) == 65536) {
            this.g = true;
        }
        if ((n() & 131072) == 131072) {
            this.n = true;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackFragmentHeaderBox{trackId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", baseDataOffset=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sampleDescriptionIndex=");
        stringBuilder.append(this.f);
        stringBuilder.append(", defaultSampleDuration=");
        stringBuilder.append(this.c);
        stringBuilder.append(", defaultSampleSize=");
        stringBuilder.append(this.d);
        stringBuilder.append(", defaultSampleFlags=");
        stringBuilder.append(this.e);
        stringBuilder.append(", durationIsEmpty=");
        stringBuilder.append(this.g);
        stringBuilder.append(", defaultBaseIsMoof=");
        stringBuilder.append(this.n);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
