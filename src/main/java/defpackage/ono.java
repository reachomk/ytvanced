package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ono */
public abstract class ono implements ool {
    private final ArrayList b = new ArrayList(1);
    private Looper c;
    private oau d;
    private Object e;
    public final oop g_ = new oop();

    public abstract void a();

    public abstract void a(owt owt);

    public final void a(oau oau, Object obj) {
        this.d = oau;
        this.e = obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((oon) arrayList.get(i)).a(this, oau, obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final oop a(ook ook) {
        return this.g_.a(0, ook);
    }

    public final void a(Handler handler, oom oom) {
        oop oop = this.g_;
        boolean z = false;
        if (!(handler == null || oom == null)) {
            z = true;
        }
        oxz.a(z);
        oop.c.add(new ooz(handler, oom));
    }

    public final void a(oom oom) {
        oop oop = this.g_;
        Iterator it = oop.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            if (ooz.b == oom) {
                oop.c.remove(ooz);
            }
        }
    }

    public final void a(oon oon, owt owt) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.c;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        oxz.a(z);
        this.b.add(oon);
        if (this.c == null) {
            this.c = myLooper;
            a(owt);
            return;
        }
        oau oau = this.d;
        if (oau != null) {
            oon.a(this, oau, this.e);
        }
    }

    public final void a(oon oon) {
        this.b.remove(oon);
        if (this.b.isEmpty()) {
            this.c = null;
            this.d = null;
            this.e = null;
            a();
        }
    }
}
