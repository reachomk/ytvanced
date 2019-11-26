package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: anau */
final class anau {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    private final boolean[] h;

    anau(String str, char[] cArr) {
        this.a = (String) amqw.a((Object) str);
        this.b = (char[]) amqw.a((Object) cArr);
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            String str2 = "x";
            int i = 0;
            if (length > 0) {
                int numberOfLeadingZeros;
                int numberOfLeadingZeros2;
                switch (angy.a[roundingMode.ordinal()]) {
                    case 1:
                        angx.a(((length + -1) & length) == 0);
                        break;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + (((-1257966797 >>> numberOfLeadingZeros2) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                this.d = numberOfLeadingZeros;
                numberOfLeadingZeros2 = Math.min(8, Integer.lowestOneBit(numberOfLeadingZeros));
                try {
                    this.e = 8 / numberOfLeadingZeros2;
                    this.f = this.d / numberOfLeadingZeros2;
                    this.c = length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c = cArr[i2];
                        amqw.a(c < 128, "Non-ASCII character: %s", c);
                        amqw.a(bArr[c] == (byte) -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i2;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    while (i < this.f) {
                        zArr[angv.a(i << 3, this.d, RoundingMode.CEILING)] = true;
                        i++;
                    }
                    this.h = zArr;
                    return;
                } catch (ArithmeticException e) {
                    str2 = new String(cArr);
                    String str3 = "Illegal alphabet ";
                    throw new IllegalArgumentException(str2.length() == 0 ? new String(str3) : str3.concat(str2), e);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(str2.length() + 26);
            stringBuilder.append(str2);
            stringBuilder.append(" (");
            stringBuilder.append(0);
            stringBuilder.append(") must be > 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder stringBuilder2 = new StringBuilder(35);
            stringBuilder2.append("Illegal alphabet length ");
            stringBuilder2.append(length2);
            throw new IllegalArgumentException(stringBuilder2.toString(), e2);
        }
    }

    /* Access modifiers changed, original: final */
    public final char a(int i) {
        return this.b[i];
    }

    /* Access modifiers changed, original: final */
    public final boolean b(int i) {
        return this.h[i % this.e];
    }

    /* Access modifiers changed, original: final */
    public final int a(char c) {
        String str = "Unrecognized character: 0x";
        String valueOf;
        if (c > 127) {
            valueOf = String.valueOf(Integer.toHexString(c));
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new anav(valueOf);
        }
        byte b = this.g[c];
        if (b != (byte) -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            valueOf = String.valueOf(Integer.toHexString(c));
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new anav(valueOf);
        }
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Unrecognized character: ");
        stringBuilder.append(c);
        throw new anav(stringBuilder.toString());
    }

    public final String toString() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anau)) {
            return false;
        }
        return Arrays.equals(this.b, ((anau) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}
