package defpackage;

/* renamed from: orz */
final class orz extends orn implements Comparable {
    public long e;

    private orz() {
    }

    public final /* synthetic */ int compareTo(Object obj) {
        orz orz = (orz) obj;
        int i = 1;
        if (isEndOfStream() == orz.isEndOfStream()) {
            long j = this.c - orz.c;
            if (j == 0) {
                j = this.e - orz.e;
                if (j == 0) {
                    i = 0;
                }
            }
            return j > 0 ? 1 : -1;
        } else if (isEndOfStream()) {
            return i;
        } else {
            return -1;
        }
        return i;
    }

    /* synthetic */ orz(byte b) {
    }
}
