package defpackage;

import java.util.Comparator;

/* renamed from: jkk */
final /* synthetic */ class jkk implements Comparator {
    public static final Comparator a = new jkk();

    private jkk() {
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        obj = (amea) obj;
        obj2 = (amea) obj2;
        amqw.a(obj);
        amqw.a(obj2);
        long j = obj.e;
        long j2 = obj2.e;
        if (j > j2) {
            i = -1;
        } else if (j == j2) {
            return 0;
        } else {
            i = 1;
        }
        return i;
    }
}
