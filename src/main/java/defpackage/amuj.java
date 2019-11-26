package defpackage;

/* renamed from: amuj */
public abstract class amuj {
    static int a(int i, int i2) {
        i = (i + (i >> 1)) + 1;
        if (i < i2) {
            i = Integer.highestOneBit(i2 - 1);
            i += i;
        }
        return i < 0 ? Integer.MAX_VALUE : i;
    }

    public abstract amuj a(Object obj);

    amuj() {
    }
}
