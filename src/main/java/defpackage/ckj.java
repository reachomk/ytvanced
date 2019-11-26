package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ckj */
public final class ckj extends cip {
    private int a = 0;
    private int[] b = new int[]{0, 0, 0};

    public ckj() {
        super("vmhd");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 12;
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.c(byteBuffer);
        this.b = new int[3];
        for (int i = 0; i < 3; i++) {
            this.b[i] = cio.c(byteBuffer);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.b(byteBuffer, this.a);
        for (int b : this.b) {
            cin.b(byteBuffer, b);
        }
    }

    public final String toString() {
        int i = this.a;
        int[] iArr = this.b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        StringBuilder stringBuilder = new StringBuilder(108);
        stringBuilder.append("VideoMediaHeaderBox[graphicsmode=");
        stringBuilder.append(i);
        stringBuilder.append(";opcolor0=");
        stringBuilder.append(i2);
        stringBuilder.append(";opcolor1=");
        stringBuilder.append(i3);
        stringBuilder.append(";opcolor2=");
        stringBuilder.append(i4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
