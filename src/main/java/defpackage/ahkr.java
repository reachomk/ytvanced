package defpackage;

import java.util.Arrays;

/* renamed from: ahkr */
public final class ahkr {
    public final int a;
    public final String b;

    public ahkr(int i) {
        this(i, null);
    }

    public ahkr(int i, String str) {
        boolean z;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        amqw.a(z);
        this.a = i;
        this.b = str;
    }

    public final boolean a() {
        int i = this.a;
        return i == 2 || i == 5 || i == 9;
    }

    public final boolean b() {
        int i = this.a;
        return i == 3 || i == 6 || i == 10;
    }

    public final boolean c() {
        int i = this.a;
        return i == 5 || i == 6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ahkr) && this.a == ((ahkr) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
