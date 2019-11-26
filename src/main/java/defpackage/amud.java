package defpackage;

/* renamed from: amud */
final class amud {
    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int a(Object obj) {
        return amud.a(obj != null ? obj.hashCode() : 0);
    }

    static int b(int i) {
        i = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(i);
        if (i > ((int) ((double) highestOneBit))) {
            highestOneBit += highestOneBit;
            if (highestOneBit <= 0) {
                return 1073741824;
            }
        }
        return highestOneBit;
    }
}
