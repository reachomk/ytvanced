package defpackage;

import java.util.Comparator;

/* renamed from: anmq */
public final /* synthetic */ class anmq implements Comparator {
    public static final Comparator a = new anmq();

    private anmq() {
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str != null) {
            if (str2 != null) {
                return str.compareTo(str2);
            }
            i = 1;
        } else if (str2 == null) {
            return 0;
        } else {
            i = -1;
        }
        return i;
    }
}
