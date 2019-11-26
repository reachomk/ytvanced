package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: aww */
final class aww implements Runnable {
    private final List a;
    private final int b;

    aww(awx awx, int i) {
        this(Arrays.asList(new awx[]{(awx) aad.a((Object) awx, (Object) "initCallback cannot be null")}), i, (byte) 0);
    }

    aww(Collection collection, int i) {
        this(collection, i, (byte) 0);
    }

    aww(Collection collection, int i, byte b) {
        aad.a((Object) collection, (Object) "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.b = i;
    }

    public final void run() {
        int size = this.a.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((awx) this.a.get(i)).b();
                i++;
            }
            return;
        }
        while (i < size) {
            ((awx) this.a.get(i)).a();
            i++;
        }
    }
}
