package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ckr */
public final class ckr extends bakp {
    public int a;
    public ckn b;
    public final List c = new ArrayList();

    public ckr() {
        super("trun");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        int n = n();
        long j = (n & 1) == 0 ? 8 : 12;
        if ((n & 4) == 4) {
            j += 4;
        }
        long j2 = (n & 256) == 256 ? 4 : 0;
        if ((n & 512) == 512) {
            j2 += 4;
        }
        if ((n & 1024) == 1024) {
            j2 += 4;
        }
        if ((n & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * ((long) this.c.size()));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.c.size());
        int n = n();
        if ((n & 1) == 1) {
            cin.a(byteBuffer, (long) this.a);
        }
        if ((n & 4) == 4) {
            this.b.a(byteBuffer);
        }
        for (cku cku : this.c) {
            if ((n & 256) == 256) {
                cin.a(byteBuffer, cku.a);
            }
            if ((n & 512) == 512) {
                cin.a(byteBuffer, cku.b);
            }
            if ((n & 1024) == 1024) {
                cku.c.a(byteBuffer);
            }
            if ((n & 2048) == 2048) {
                if (m() != 0) {
                    byteBuffer.putInt((int) cku.d);
                } else {
                    cin.a(byteBuffer, cku.d);
                }
            }
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        long a = cio.a(byteBuffer);
        if ((n() & 1) == 1) {
            this.a = bana.a(cio.a(byteBuffer));
        } else {
            this.a = -1;
        }
        int i = 0;
        if ((n() & 4) == 4) {
            this.b = new ckn(byteBuffer);
        }
        while (((long) i) < a) {
            cku cku = new cku();
            if ((n() & 256) == 256) {
                cku.a = cio.a(byteBuffer);
            }
            if ((n() & 512) == 512) {
                cku.b = cio.a(byteBuffer);
            }
            if ((n() & 1024) == 1024) {
                cku.c = new ckn(byteBuffer);
            }
            if ((n() & 2048) == 2048) {
                if (m() == 0) {
                    cku.d = cio.a(byteBuffer);
                } else {
                    cku.d = (long) byteBuffer.getInt();
                }
            }
            this.c.add(cku);
            i++;
        }
    }

    public final long a() {
        return (long) this.c.size();
    }

    public final boolean g() {
        return (n() & 1) != 0;
    }

    public final boolean h() {
        return (n() & 512) == 512;
    }

    public final boolean i() {
        return (n() & 256) == 256;
    }

    public final boolean j() {
        return (n() & 1024) == 1024;
    }

    public final boolean k() {
        return (n() & 2048) == 2048;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackRunBox{sampleCount=");
        stringBuilder.append(this.c.size());
        stringBuilder.append(", dataOffset=");
        stringBuilder.append(this.a);
        stringBuilder.append(", dataOffsetPresent=");
        stringBuilder.append(g());
        stringBuilder.append(", sampleSizePresent=");
        stringBuilder.append(h());
        stringBuilder.append(", sampleDurationPresent=");
        stringBuilder.append(i());
        stringBuilder.append(", sampleFlagsPresentPresent=");
        stringBuilder.append(j());
        stringBuilder.append(", sampleCompositionTimeOffsetPresent=");
        stringBuilder.append(k());
        stringBuilder.append(", firstSampleFlags=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
