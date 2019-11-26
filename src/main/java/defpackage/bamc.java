package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamc */
public final class bamc {
    private final ByteBuffer a;
    private final int b;
    private int c = 0;

    public bamc(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.b = byteBuffer.position();
    }

    public final void a(int i, int i2) {
        ByteBuffer byteBuffer;
        int i3 = this.c;
        int i4 = 8 - (i3 % 8);
        int i5 = 1;
        if (i2 <= i4) {
            i3 = this.a.get(this.b + (i3 / 8));
            if (i3 < 0) {
                i3 += 256;
            }
            i3 += i << (i4 - i2);
            byteBuffer = this.a;
            i4 = this.b + (this.c / 8);
            if (i3 > 127) {
                i3 -= 256;
            }
            byteBuffer.put(i4, (byte) i3);
            this.c += i2;
        } else {
            i2 -= i4;
            a(i >> i2, i4);
            a(i & ((1 << i2) - 1), i2);
        }
        byteBuffer = this.a;
        i2 = this.b;
        i3 = this.c;
        i2 += i3 / 8;
        if (i3 % 8 <= 0) {
            i5 = 0;
        }
        byteBuffer.position(i2 + i5);
    }
}
