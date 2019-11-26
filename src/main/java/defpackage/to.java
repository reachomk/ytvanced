package defpackage;

import java.util.Arrays;

/* renamed from: to */
public final class to implements ti {
    private final int a = 0;
    private final int b = 0;
    private final int c = 0;
    private int d = -1;

    to() {
    }

    to(int i) {
        this.d = i;
    }

    public final int hashCode() {
        r0 = new Object[4];
        Integer valueOf = Integer.valueOf(0);
        r0[0] = valueOf;
        r0[1] = valueOf;
        r0[2] = valueOf;
        r0[3] = Integer.valueOf(this.d);
        return Arrays.hashCode(r0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof to) {
            to toVar = (to) obj;
            int i = toVar.d;
            if (i == -1) {
                i = tg.a(0, 0);
            }
            i = i == 6 ? 4 : i != 7 ? 0 : 1;
            if ((i & 273) == 0 && this.d == toVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            stringBuilder.append(" stream=");
            stringBuilder.append(this.d);
            stringBuilder.append(" derived");
        }
        stringBuilder.append(" usage=");
        stringBuilder.append(tg.a(0));
        stringBuilder.append(" content=");
        stringBuilder.append(0);
        stringBuilder.append(" flags=0x");
        stringBuilder.append(Integer.toHexString(0).toUpperCase());
        return stringBuilder.toString();
    }
}
