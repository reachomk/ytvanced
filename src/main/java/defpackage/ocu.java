package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ocu */
final class ocu extends ock {
    private static final int b = Float.floatToIntBits(Float.NaN);

    ocu() {
    }

    public final int c() {
        return 4;
    }

    public final boolean a(int i, int i2, int i3) {
        if (ozp.d(i3)) {
            return b(i, i2, i3);
        }
        throw new obp(i, i2, i3);
    }

    public final boolean a() {
        return ozp.d(this.e);
    }

    public final void a(ByteBuffer byteBuffer) {
        int i = this.e;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i != 1073741824) {
            i2 = (i2 / 3) << 2;
        }
        ByteBuffer a = a(i2);
        if (i == 1073741824) {
            while (position < limit) {
                ocu.a((((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8)) | ((byteBuffer.get(position + 2) & 255) << 16)) | ((byteBuffer.get(position + 3) & 255) << 24), a);
                position += 4;
            }
        } else {
            while (position < limit) {
                ocu.a((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16)) | ((byteBuffer.get(position + 2) & 255) << 24), a);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        i = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (i == b) {
            i = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(i);
    }
}
