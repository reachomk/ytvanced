package defpackage;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

@Deprecated
/* renamed from: bz */
public final class bz extends Number implements Comparable {
    public static final long serialVersionUID = -4756200506571685661L;
    @Deprecated
    public final double a;
    @Deprecated
    public final int b;
    @Deprecated
    public final int c;
    @Deprecated
    public final long d;
    @Deprecated
    public final long e;
    @Deprecated
    public final long f;
    @Deprecated
    private final boolean g;

    @Deprecated
    private bz(double d, int i) {
        int round;
        if (i != 0) {
            double d2 = d < 0.0d ? -d : d;
            int pow = (int) Math.pow(10.0d, (double) i);
            double d3 = (double) pow;
            Double.isNaN(d3);
            round = (int) (Math.round(d2 * d3) % ((long) pow));
        } else {
            round = 0;
        }
        long j = (long) round;
        boolean z = d < 0.0d;
        this.g = z;
        this.a = z ? -d : d;
        this.b = i;
        this.d = j;
        this.f = d <= 1.0E18d ? (long) d : 1000000000000000000L;
        if (j == 0) {
            this.e = 0;
            this.c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.e = j;
            this.c = i2;
        }
        Math.pow(10.0d, (double) i);
    }

    @Deprecated
    public bz(double d) {
        int i = 0;
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            double d2 = d < 0.0d ? -d : d;
            int i2;
            if (d2 < 1.0E9d) {
                long j = ((long) (d2 * 1000000.0d)) % 1000000;
                int i3 = 6;
                i2 = 10;
                while (i3 > 0) {
                    if (j % ((long) i2) != 0) {
                        i = i3;
                        break;
                    } else {
                        i2 *= 10;
                        i3--;
                    }
                }
            } else {
                String format = String.format(Locale.ENGLISH, "%1.15e", new Object[]{Double.valueOf(d2)});
                int lastIndexOf = format.lastIndexOf(101);
                int i4 = lastIndexOf + 1;
                if (format.charAt(i4) == '+') {
                    i4++;
                }
                i2 = (lastIndexOf - 2) - Integer.parseInt(format.substring(i4));
                if (i2 >= 0) {
                    lastIndexOf--;
                    i = i2;
                    while (i > 0 && format.charAt(lastIndexOf) == '0') {
                        i--;
                        lastIndexOf--;
                    }
                }
            }
        }
        this(d, i);
    }

    @Deprecated
    public bz(String str) {
        double parseDouble = Double.parseDouble(str);
        str = str.trim();
        int indexOf = str.indexOf(46) + 1;
        this(parseDouble, indexOf != 0 ? str.length() - indexOf : 0);
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof bz) {
            bz bzVar = (bz) obj;
            return this.a == bzVar.a && this.b == bzVar.b && this.d == bzVar.d;
        }
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.d + ((long) ((this.b + ((int) (this.a * 37.0d))) * 37)));
    }

    @Deprecated
    public final String toString() {
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(14);
        stringBuilder.append("%.");
        stringBuilder.append(i);
        stringBuilder.append("f");
        return String.format(stringBuilder.toString(), new Object[]{Double.valueOf(this.a)});
    }

    @Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @Deprecated
    public final long longValue() {
        return this.f;
    }

    @Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @Deprecated
    public final double doubleValue() {
        return this.g ? -this.a : this.a;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A:{RETURN, PHI: r4 } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A:{RETURN, PHI: r4 } */
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r8) {
        /*
        r7 = this;
        r8 = (defpackage.bz) r8;
        r0 = r7.f;
        r2 = r8.f;
        r4 = 1;
        r5 = -1;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x0037;
    L_0x000c:
        r0 = r7.a;
        r2 = r8.a;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 != 0) goto L_0x0031;
    L_0x0014:
        r0 = r7.b;
        r1 = r8.b;
        if (r0 != r1) goto L_0x002d;
    L_0x001a:
        r0 = r7.d;
        r2 = r8.d;
        r0 = r0 - r2;
        r2 = 0;
        r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r8 == 0) goto L_0x002b;
    L_0x0025:
        r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r8 >= 0) goto L_0x002a;
    L_0x0029:
        return r5;
    L_0x002a:
        return r4;
    L_0x002b:
        r4 = 0;
        goto L_0x003b;
    L_0x002d:
        if (r0 < r1) goto L_0x0030;
    L_0x002f:
        goto L_0x003b;
    L_0x0030:
        return r5;
    L_0x0031:
        r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r8 < 0) goto L_0x0036;
    L_0x0035:
        goto L_0x003b;
    L_0x0036:
        return r5;
    L_0x0037:
        r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r8 < 0) goto L_0x003c;
    L_0x003b:
        return r4;
    L_0x003c:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.compareTo(java.lang.Object):int");
    }
}
