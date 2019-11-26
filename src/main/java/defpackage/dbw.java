package defpackage;

/* renamed from: dbw */
final class dbw implements dbr {
    dbw() {
    }

    public final void a(int i, int i2, int i3, dbv dbv) {
        if (i > 0) {
            Object obj = null;
            int i4 = 1;
            Object obj2 = (i2 >= 0 && i2 < i) ? 1 : null;
            if (i3 >= 0 && i3 < i) {
                obj = 1;
            }
            if (obj2 == null && obj == null) {
                i2 = (i - 1) >> 1;
            } else if (obj2 == null) {
                i2 = i3;
            } else if (obj != null) {
                i2 = (i2 + i3) / 2;
            }
            if (dbv.a(i2)) {
                while (true) {
                    i3 = i2 - i4;
                    int i5 = i2 + i4;
                    if (i3 < 0 && i5 >= i) {
                        return;
                    }
                    if (i3 >= 0 && !dbv.a(i3)) {
                        return;
                    }
                    if (i5 >= i || dbv.a(i5)) {
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
