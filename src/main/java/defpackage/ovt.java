package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: ovt */
public final class ovt implements owf {
    private final int a;

    public ovt() {
        this(-1);
    }

    public ovt(int i) {
        this.a = i;
    }

    public final long a(IOException iOException) {
        if (!(iOException instanceof owd)) {
            return -9223372036854775807L;
        }
        int i = ((owd) iOException).a;
        if (i == 404 || i == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public final long a(IOException iOException, int i) {
        return ((iOException instanceof oae) || (iOException instanceof FileNotFoundException) || (iOException instanceof own)) ? -9223372036854775807L : (long) Math.min((i - 1) * 1000, 5000);
    }

    public final int a(int i) {
        int i2 = this.a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        } else {
            return i2;
        }
    }
}
