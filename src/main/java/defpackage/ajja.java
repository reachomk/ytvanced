package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ajja */
public final class ajja {
    public final List a;
    private final List b;

    public final synchronized ajiy a(long j) {
        int binarySearch = Collections.binarySearch(this.a, Long.valueOf(j));
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
            if (binarySearch < 0) {
                return null;
            }
            return (ajiy) this.b.get(binarySearch);
        }
        return (ajiy) this.b.get(binarySearch);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            stringBuilder.append("[");
            stringBuilder.append(this.a.get(i));
            stringBuilder.append(": ");
            stringBuilder.append(this.b.get(i));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    /* synthetic */ ajja(List list, List list2) {
        amqw.a((Object) list);
        amqw.a((Object) list2);
        amqw.b(list.size() == list2.size(), (Object) "startTimes and settings differ in size");
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }
}
