package defpackage;

/* renamed from: riq */
public final class riq implements Cloneable {
    public static final rip a = new rip();
    public boolean b;
    public int[] c;
    public rip[] d;
    public int e;

    riq() {
        this(10);
    }

    private riq(int i) {
        this.b = false;
        i = riq.b(i);
        this.c = new int[i];
        this.d = new rip[i];
        this.e = 0;
    }

    public final boolean a() {
        return this.e == 0;
    }

    /* Access modifiers changed, original: final */
    public final rip a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof riq) {
            riq riq = (riq) obj;
            int i = this.e;
            if (i == riq.e) {
                int[] iArr = this.c;
                int[] iArr2 = riq.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                }
                rip[] ripArr = this.d;
                rip[] ripArr2 = riq.d;
                int i3 = this.e;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!ripArr[i4].equals(ripArr2[i4])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }

    public static int b(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    public final int c(int i) {
        int i2 = this.e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.e;
        riq riq = new riq(i);
        int i2 = 0;
        System.arraycopy(this.c, 0, riq.c, 0, i);
        while (i2 < i) {
            rip rip = this.d[i2];
            if (rip != null) {
                riq.d[i2] = rip.clone();
            }
            i2++;
        }
        riq.e = i;
        return riq;
    }
}
