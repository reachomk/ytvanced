package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bckd */
public final class bckd {
    public final String a;
    public final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public bckd(boolean z, int i, int i2, String str, boolean z2) {
        this.c = z;
        this.d = i;
        this.e = i2;
        if (str == null) {
            str = "";
        }
        this.a = str;
        this.b = z2;
    }

    public final int a() {
        return this.c ? NetworkChangeNotifierAutoDetect.a(this.d, this.e) : 6;
    }

    public final int b() {
        if (!this.c) {
            return 1;
        }
        int i = this.d;
        if (i != 0) {
            if (i == 1 || i == 6 || i == 7 || i != 9) {
            }
            return 0;
        }
        switch (this.e) {
            case 1:
                return 7;
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 5;
            case 5:
                return 10;
            case 6:
                return 11;
            case 7:
                return 6;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 12;
            case 11:
                return 4;
            case 12:
                return 13;
            case 13:
                return 18;
            case 14:
                return 16;
            case 15:
                return 17;
            default:
                return 0;
        }
    }
}
