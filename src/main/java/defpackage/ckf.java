package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: ckf */
public final class ckf extends bakp {
    public long a;
    public int b;
    public int c;
    public float d;
    public banj e = banj.h;
    public double f;
    public double g;
    private Date n;
    private Date o;
    private long p;

    public ckf() {
        super("tkhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (m() == 1 ? 36 : 24) + 60;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if (m() == 1) {
            this.n = banc.a(cio.f(byteBuffer));
            this.o = banc.a(cio.f(byteBuffer));
            this.a = cio.a(byteBuffer);
            cio.a(byteBuffer);
            long j = byteBuffer.getLong();
            this.p = j;
            if (j < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        }
        this.n = banc.a(cio.a(byteBuffer));
        this.o = banc.a(cio.a(byteBuffer));
        this.a = cio.a(byteBuffer);
        cio.a(byteBuffer);
        this.p = cio.a(byteBuffer);
        cio.a(byteBuffer);
        cio.a(byteBuffer);
        this.b = cio.c(byteBuffer);
        this.c = cio.c(byteBuffer);
        this.d = cio.i(byteBuffer);
        cio.c(byteBuffer);
        this.e = banj.a(byteBuffer);
        this.f = cio.g(byteBuffer);
        this.g = cio.g(byteBuffer);
    }

    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        if (m() == 1) {
            byteBuffer.putLong(banc.a(this.n));
            byteBuffer.putLong(banc.a(this.o));
            cin.a(byteBuffer, this.a);
            cin.a(byteBuffer, 0);
            byteBuffer.putLong(this.p);
        } else {
            cin.a(byteBuffer, banc.a(this.n));
            cin.a(byteBuffer, banc.a(this.o));
            cin.a(byteBuffer, this.a);
            cin.a(byteBuffer, 0);
            cin.a(byteBuffer, this.p);
        }
        cin.a(byteBuffer, 0);
        cin.a(byteBuffer, 0);
        cin.b(byteBuffer, this.b);
        cin.b(byteBuffer, this.c);
        cin.c(byteBuffer, (double) this.d);
        cin.b(byteBuffer, 0);
        this.e.b(byteBuffer);
        cin.a(byteBuffer, this.f);
        cin.a(byteBuffer, this.g);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackHeaderBox[creationTime=");
        stringBuilder.append(this.n);
        stringBuilder.append(";modificationTime=");
        stringBuilder.append(this.o);
        stringBuilder.append(";trackId=");
        stringBuilder.append(this.a);
        stringBuilder.append(";duration=");
        stringBuilder.append(this.p);
        stringBuilder.append(";layer=");
        stringBuilder.append(this.b);
        stringBuilder.append(";alternateGroup=");
        stringBuilder.append(this.c);
        stringBuilder.append(";volume=");
        stringBuilder.append(this.d);
        stringBuilder.append(";matrix=");
        stringBuilder.append(this.e);
        stringBuilder.append(";width=");
        stringBuilder.append(this.f);
        stringBuilder.append(";height=");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void a(Date date) {
        this.n = date;
        if (banc.a(date) >= 4294967296L) {
            this.l = 1;
        }
    }

    public final void b(Date date) {
        this.o = date;
        if (banc.a(date) >= 4294967296L) {
            this.l = 1;
        }
    }

    public final void a(long j) {
        this.p = j;
        if (j >= 4294967296L) {
            this.m = 1;
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.m = n() | 1;
        } else {
            this.m = n() & -2;
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.m = n() | 2;
        } else {
            this.m = n() & -3;
        }
    }
}
