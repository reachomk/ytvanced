package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: ffl */
public final class ffl {
    public final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();

    public final boolean a(fff fff) {
        return b(fff) != -1;
    }

    public final int b(fff fff) {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((fff) it.next()) == fff) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
