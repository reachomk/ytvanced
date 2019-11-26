package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: ocj */
final class ocj extends ock {
    public int[] b;
    private boolean g;
    private int[] h;

    ocj() {
    }

    public final boolean a(int i, int i2, int i3) {
        int equals = Arrays.equals(this.b, this.h) ^ 1;
        this.h = this.b;
        int[] iArr = this.h;
        if (iArr == null) {
            this.g = false;
            return equals;
        } else if (i3 != 2) {
            throw new obp(i, i2, i3);
        } else if (equals == 0 && !b(i, i2, 2)) {
            return false;
        } else {
            this.g = i2 != iArr.length;
            i3 = 0;
            while (i3 < iArr.length) {
                equals = iArr[i3];
                if (equals < i2) {
                    this.g = (equals != i3 ? 1 : 0) | this.g;
                    i3++;
                } else {
                    throw new obp(i, i2, 2);
                }
            }
            return true;
        }
    }

    public final boolean a() {
        return this.g;
    }

    public final int b() {
        int[] iArr = this.h;
        return iArr != null ? iArr.length : this.d;
    }

    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) oxz.a(this.h);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.d;
        int length = ((limit - position) / (i + i)) * iArr.length;
        ByteBuffer a = a(length + length);
        while (position < limit) {
            for (int i2 : iArr) {
                a.putShort(byteBuffer.getShort((i2 + i2) + position));
            }
            length = this.d;
            position += length + length;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.h = null;
        this.b = null;
        this.g = false;
    }
}
