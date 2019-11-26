package defpackage;

import java.util.Arrays;

/* renamed from: axf */
final class axf {
    private int a = 1;
    private final axt b;
    private axt c;
    private axt d;
    private int e;
    private int f;
    private final boolean g;
    private final int[] h;

    axf(axt axt, boolean z, int[] iArr) {
        this.b = axt;
        this.c = axt;
        this.g = z;
        this.h = iArr;
    }

    private static boolean b(int i) {
        return i == 65039;
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        axt a = this.c.a(i);
        int i2 = 3;
        if (this.a != 2) {
            if (a == null) {
                i2 = d();
                this.e = i;
                return i2;
            }
            this.a = 2;
            this.c = a;
            this.f = 1;
        } else if (a == null) {
            if (i == 65038) {
                i2 = d();
            } else if (!axf.b(i)) {
                a = this.c;
                if (a.a == null) {
                    i2 = d();
                } else if (this.f != 1) {
                    this.d = a;
                    d();
                } else if (e()) {
                    this.d = this.c;
                    d();
                } else {
                    i2 = d();
                }
            }
            this.e = i;
            return i2;
        } else {
            this.c = a;
            this.f++;
        }
        i2 = 2;
        this.e = i;
        return i2;
    }

    private final int d() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final axa a() {
        return this.d.a;
    }

    /* Access modifiers changed, original: final */
    public final axa b() {
        return this.c.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        boolean z = false;
        if (this.a == 2 && this.c.a != null) {
            if (this.f > 1) {
                z = true;
            } else if (e()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private final boolean e() {
        bfc a = this.c.a.a();
        int a2 = a.a(6);
        if ((a2 != 0 && a.b.get(a2 + a.a) != (byte) 0) || axf.b(this.e)) {
            return true;
        }
        if (this.g) {
            if (this.h != null) {
                if (Arrays.binarySearch(this.h, this.c.a.a(0)) < 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
