package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: ols */
public final class ols implements olk {
    public final olj a(olp olp) {
        ByteBuffer byteBuffer = olp.b;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        oza oza = new oza(array, limit);
        String str = (String) oxz.a(oza.r());
        String str2 = (String) oxz.a(oza.r());
        long i = oza.i();
        long i2 = oza.i();
        if (i2 != 0) {
            StringBuilder stringBuilder = new StringBuilder(63);
            stringBuilder.append("Ignoring non-zero presentation_time_delta: ");
            stringBuilder.append(i2);
            oyp.a("EventMessageDecoder", stringBuilder.toString());
        }
        long b = ozp.b(oza.i(), 1000, i);
        long i3 = oza.i();
        byte[] copyOfRange = Arrays.copyOfRange(array, oza.b, limit);
        return new olj(new olq(str, str2, b, i3, copyOfRange));
    }
}
