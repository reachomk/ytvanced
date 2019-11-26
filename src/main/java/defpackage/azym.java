package defpackage;

import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: azym */
final /* synthetic */ class azym implements Comparator {
    public static final Comparator a = new azym();

    private azym() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((String) ((Entry) obj).getKey()).compareTo((String) ((Entry) obj2).getKey());
    }
}
