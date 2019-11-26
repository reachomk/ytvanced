package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oyk */
public final class oyk {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, Object obj) {
        boolean z = false;
        if (!(handler == null || obj == null)) {
            z = true;
        }
        oxz.a(z);
        a(obj);
        this.a.add(new oym(handler, obj));
    }

    public final void a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            oym oym = (oym) it.next();
            if (oym.b == obj) {
                oym.c = true;
                this.a.remove(oym);
            }
        }
    }

    public final void a(oyj oyj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            oym oym = (oym) it.next();
            oym.a.post(new oyl(oym, oyj));
        }
    }
}
