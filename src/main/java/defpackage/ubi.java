package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: ubi */
public final class ubi {
    public static void a(ubu ubu, ubu ubu2) {
        ubw b = ubu.b();
        while (b.a()) {
            ((ubb) b.b).n = false;
        }
        b = ubu2.b();
        while (b.a()) {
            ((uax) b.b).n = false;
        }
    }

    public static void a(ubl ubl, ubn ubn) {
        ubi.a(ubl, ubn.b, ubn.a, ubi.a(ubn.c), new ubh());
    }

    public static void a(ubl ubl, ubu ubu, ubu ubu2, Deque deque, ubj ubj) {
        while (!deque.isEmpty()) {
            ubb ubb = (ubb) deque.removeFirst();
            int a = ubb.a(ubl);
            for (int i = 0; i < a; i++) {
                int a2 = ubb.a(ubl, i);
                ubb ubb2 = (ubb) ubu.b(a2);
                if (ubb2 == null) {
                    ubb2 = (ubb) ubu2.b(a2);
                }
                if (ubb2 != null) {
                    if (!(ubb2.n || ubb.b(ubb2) || ubb.a(ubb2))) {
                        deque.addLast(ubb2);
                    }
                    ubb2.n = true;
                    ubj.a(ubb, ubb2);
                }
            }
        }
    }

    public static Deque a(List list) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (ubb ubb : list) {
            if (!ubb.a(ubb)) {
                arrayDeque.addLast(ubb);
            }
        }
        return arrayDeque;
    }
}
