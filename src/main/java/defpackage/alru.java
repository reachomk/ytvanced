package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/* renamed from: alru */
final class alru {
    private static final Random a = new Random();

    public static alrc a(Collection collection) {
        if (collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection);
        Collections.shuffle(arrayList, a);
        Collections.sort(arrayList, alrx.a);
        alrc alrc = (alrc) arrayList.get(0);
        if (alrc.a() || alrc.b()) {
            return alrc;
        }
        return null;
    }

    public static int a(alrc alrc) {
        if (alrc.a() && alrc.c()) {
            return 5;
        }
        if (alrc.a()) {
            return 4;
        }
        if (alrc.b() && alrc.c()) {
            return 3;
        }
        return !alrc.b() ? 1 : 2;
    }
}
