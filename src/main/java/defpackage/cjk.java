package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: cjk */
public final class cjk extends bakp {
    public Date a = new Date();
    public Date b = new Date();
    public long c;
    public long d;
    public String e = "eng";

    public cjk() {
        super("mdhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (m() == 1 ? 32 : 20) + 4;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if (m() == 1) {
            this.a = banc.a(cio.f(byteBuffer));
            this.b = banc.a(cio.f(byteBuffer));
            this.c = cio.a(byteBuffer);
            this.d = cio.f(byteBuffer);
        } else {
            this.a = banc.a(cio.a(byteBuffer));
            this.b = banc.a(cio.a(byteBuffer));
            this.c = cio.a(byteBuffer);
            this.d = cio.a(byteBuffer);
        }
        int c = cio.c(byteBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append((char) (((c >> ((2 - i) * 5)) & 31) + 96));
        }
        this.e = stringBuilder.toString();
        cio.c(byteBuffer);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaHeaderBox[creationTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(";modificationTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(";timescale=");
        stringBuilder.append(this.c);
        stringBuilder.append(";duration=");
        stringBuilder.append(this.d);
        stringBuilder.append(";language=");
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
            byteBuffer.putLong(this.d);
        } else {
            cin.a(byteBuffer, banc.a(this.a));
            cin.a(byteBuffer, banc.a(this.b));
            cin.a(byteBuffer, this.c);
            cin.a(byteBuffer, this.d);
        }
        String str = this.e;
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            cin.b(byteBuffer, i);
            cin.b(byteBuffer, 0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + 51);
        stringBuilder.append("\"");
        stringBuilder.append(str);
        stringBuilder.append("\" language string isn't exactly 3 characters long!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
