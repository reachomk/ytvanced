package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: cjo */
public final class cjo extends bakp {
    public Date a;
    public Date b;
    public long c;
    public banj d = banj.h;
    public long e;
    private long f;
    private double g = 1.0d;
    private float n = 1.0f;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    public cjo() {
        super("mvhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (m() == 1 ? 32 : 20) + 80;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if (m() == 1) {
            this.a = banc.a(cio.f(byteBuffer));
            this.b = banc.a(cio.f(byteBuffer));
            this.c = cio.a(byteBuffer);
            this.f = cio.f(byteBuffer);
        } else {
            this.a = banc.a(cio.a(byteBuffer));
            this.b = banc.a(cio.a(byteBuffer));
            this.c = cio.a(byteBuffer);
            this.f = cio.a(byteBuffer);
        }
        this.g = cio.g(byteBuffer);
        this.n = cio.i(byteBuffer);
        cio.c(byteBuffer);
        cio.a(byteBuffer);
        cio.a(byteBuffer);
        this.d = banj.a(byteBuffer);
        this.o = byteBuffer.getInt();
        this.p = byteBuffer.getInt();
        this.q = byteBuffer.getInt();
        this.r = byteBuffer.getInt();
        this.s = byteBuffer.getInt();
        this.t = byteBuffer.getInt();
        this.e = cio.a(byteBuffer);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MovieHeaderBox[creationTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(";modificationTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(";timescale=");
        stringBuilder.append(this.c);
        stringBuilder.append(";duration=");
        stringBuilder.append(this.f);
        stringBuilder.append(";rate=");
        stringBuilder.append(this.g);
        stringBuilder.append(";volume=");
        stringBuilder.append(this.n);
        stringBuilder.append(";matrix=");
        stringBuilder.append(this.d);
        stringBuilder.append(";nextTrackId=");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        if (m() == 1) {
            byteBuffer.putLong(banc.a(this.a));
            byteBuffer.putLong(banc.a(this.b));
            cin.a(byteBuffer, this.c);
            byteBuffer.putLong(this.f);
        } else {
            cin.a(byteBuffer, banc.a(this.a));
            cin.a(byteBuffer, banc.a(this.b));
            cin.a(byteBuffer, this.c);
            cin.a(byteBuffer, this.f);
        }
        cin.a(byteBuffer, this.g);
        cin.c(byteBuffer, (double) this.n);
        cin.b(byteBuffer, 0);
        cin.a(byteBuffer, 0);
        cin.a(byteBuffer, 0);
        this.d.b(byteBuffer);
        byteBuffer.putInt(this.o);
        byteBuffer.putInt(this.p);
        byteBuffer.putInt(this.q);
        byteBuffer.putInt(this.r);
        byteBuffer.putInt(this.s);
        byteBuffer.putInt(this.t);
        cin.a(byteBuffer, this.e);
    }

    public final void a(Date date) {
        this.a = date;
        if (banc.a(date) >= 4294967296L) {
            this.l = 1;
        }
    }

    public final void b(Date date) {
        this.b = date;
        if (banc.a(date) >= 4294967296L) {
            this.l = 1;
        }
    }

    public final void a(long j) {
        this.f = j;
        if (j >= 4294967296L) {
            this.l = 1;
        }
    }
}
