package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamd */
public final class bamd {
    private final ByteBuffer a;
    private final int b;
    private int c;

    public bamd(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.position();
    }

    public final int a(int i) {
        int i2 = this.a.get(this.b + (this.c / 8));
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = this.c;
        int i4 = i3 % 8;
        int i5 = 8 - i4;
        if (i <= i5) {
            i2 = ((i2 << i4) & 255) >> (i4 + (i5 - i));
            this.c = i3 + i;
        } else {
            i -= i5;
            i2 = (a(i5) << i) + a(i);
        }
        ByteBuffer byteBuffer = this.a;
        i3 = this.b;
        double d = (double) this.c;
        Double.isNaN(d);
        byteBuffer.position(i3 + ((int) Math.ceil(d / 8.0d)));
        return i2;
    }

    public final int a() {
        return (this.a.limit() << 3) - this.c;
    }
}
