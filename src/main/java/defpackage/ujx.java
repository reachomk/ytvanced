package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.Date;

/* renamed from: ujx */
public final class ujx implements ujp {
    public Exception a;
    private final OutputStream b;
    private final ByteArrayOutputStream c = new ByteArrayOutputStream();
    private final Date d;
    private final uka e;

    public ujx(OutputStream outputStream, Date date, uka uka) {
        this.e = uka;
        this.b = (OutputStream) uhy.a((Object) outputStream);
        this.d = (Date) uhy.a((Object) date);
    }

    private static long a(long j, int i, int i2) {
        return (j << i) | ((-1 >>> (64 - i)) & ((long) i2));
    }

    public final void a(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (byteBuffer.remaining() > 0) {
            StringBuilder stringBuilder;
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[7];
            long a = ujx.a(ujx.a(ujx.a(ujx.a(ujx.a(0, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
            switch (i3) {
                case 7350:
                    i3 = 12;
                    break;
                case 8000:
                    i3 = 11;
                    break;
                case 11025:
                    i3 = 10;
                    break;
                case 12000:
                    i3 = 9;
                    break;
                case 16000:
                    i3 = 8;
                    break;
                case 22050:
                    i3 = 7;
                    break;
                case 24000:
                    i3 = 6;
                    break;
                case 32000:
                    i3 = 5;
                    break;
                case 44100:
                    i3 = 4;
                    break;
                case 48000:
                    i3 = 3;
                    break;
                case 64000:
                    i3 = 2;
                    break;
                case 88200:
                    i3 = 1;
                    break;
                case 96000:
                    i3 = 0;
                    break;
                default:
                    stringBuilder = new StringBuilder(32);
                    stringBuilder.append("Invalid sample rate: ");
                    stringBuilder.append(i3);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            a = ujx.a(ujx.a(a, 4, i3), 1, 0);
            switch (i4) {
                case 1:
                    i3 = 1;
                    break;
                case 2:
                    i3 = 2;
                    break;
                case 3:
                    i3 = 3;
                    break;
                case 4:
                    i3 = 4;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 6:
                    i3 = 6;
                    break;
                case 8:
                    i3 = 7;
                    break;
                default:
                    stringBuilder = new StringBuilder(34);
                    stringBuilder.append("Invalid channel count: ");
                    stringBuilder.append(i4);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            long a2 = ujx.a(ujx.a(ujx.a(ujx.a(ujx.a(ujx.a(ujx.a(ujx.a(a, 3, i3), 1, 0), 1, 0), 1, 0), 1, 0), 13, remaining + 7), 11, 2047), 2, 0);
            bArr[0] = (byte) ((int) ((a2 >>> 48) & 255));
            bArr[1] = (byte) ((int) ((a2 >>> 40) & 255));
            bArr[2] = (byte) ((int) ((a2 >>> 32) & 255));
            bArr[3] = (byte) ((int) ((a2 >>> 24) & 255));
            bArr[4] = (byte) ((int) ((a2 >>> 16) & 255));
            bArr[5] = (byte) ((int) ((a2 >>> 8) & 255));
            bArr[6] = (byte) ((int) a2);
            this.c.write(bArr, 0, 7);
            if (byteBuffer.isDirect()) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                this.c.write(bArr2, 0, bArr2.length);
                return;
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            this.c.write(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
        }
    }

    public final void a() {
        try {
            byte[] toByteArray = this.c.toByteArray();
            this.c.close();
            if (toByteArray.length > 0) {
                ball ball = new ball(new baks(toByteArray));
                bakx bakx = new bakx();
                bakx.a(ball);
                bakx.c = this.d;
                bakx.b = this.d;
                new bala().a(bakx).b(Channels.newChannel(this.b));
            } else {
                ujo.a("No audio data to write!");
            }
        } catch (IOException e) {
            this.a = e;
        }
        this.e.a(this);
    }
}
