package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: aagm */
public final class aagm {
    private static Random b = new Random();
    public final List a;

    private aagm(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amqq.a(this.a, ((aagm) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public static aagm a(int i, List list) {
        amqw.a((Object) list);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (i == 2) {
            if (b.nextBoolean()) {
                Collections.reverse(arrayList);
            }
        } else if (i == 1) {
            Collections.shuffle(arrayList, b);
        }
        return new aagm(arrayList);
    }
}
