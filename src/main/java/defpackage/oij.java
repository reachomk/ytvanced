package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: oij */
final class oij extends oii {
    private static final int a = ozp.f("Opus");
    private static final byte[] o = new byte[]{(byte) 79, (byte) 112, (byte) 117, (byte) 115, (byte) 72, (byte) 101, (byte) 97, (byte) 100};
    private boolean p;

    oij() {
    }

    public static boolean b(oza oza) {
        int b = oza.b();
        byte[] bArr = o;
        if (b < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        oza.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, o);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.p = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final long a(oza oza) {
        byte[] bArr = oza.a;
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (!(i2 == 1 || i2 == 2)) {
            i3 = bArr[1] & 63;
        }
        i >>= 3;
        i2 = i & 3;
        int i4 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 != 3 ? 10000 << i2 : 60000;
        return b(((long) i3) * ((long) i4));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza, long j, oil oil) {
        boolean z = true;
        if (this.p) {
            if (oza.k() != a) {
                z = false;
            }
            oza.c(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(oza.a, oza.c);
        byte b = copyOf[9];
        byte b2 = copyOf[11];
        byte b3 = copyOf[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        oij.a(arrayList, ((b2 & 255) << 8) | (b3 & 255));
        oij.a(arrayList, 3840);
        oil.a = nzw.a(null, "audio/opus", -1, -1, b & 255, 48000, arrayList, null, null);
        this.p = true;
        return true;
    }

    private static void a(List list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
