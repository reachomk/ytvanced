package defpackage;

import java.util.Arrays;

/* renamed from: bble */
public final class bble {
    public static final bble a = new bble();

    private bble() {
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof bble);
    }

    public final int hashCode() {
        return Arrays.hashCode(new byte[]{(byte) 0});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(27);
        stringBuilder.append("TraceOptions{sampled=");
        stringBuilder.append(false);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
