package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: uz */
final class uz implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ int b;
    private final /* synthetic */ String c;
    private final /* synthetic */ int d;
    private final /* synthetic */ ut e;

    uz(ut utVar, vd vdVar, int i, String str, int i2) {
        this.e = utVar;
        this.a = vdVar;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public final void run() {
        ub ubVar;
        Object obj;
        IBinder a = this.a.a();
        this.e.a.d.remove(a);
        Iterator it = this.e.a.c.iterator();
        ub ubVar2 = null;
        while (it.hasNext()) {
            ubVar = (ub) it.next();
            if (ubVar.c == this.b) {
                if (TextUtils.isEmpty(this.c) || this.d <= 0) {
                    ub ubVar3 = new ub(this.e.a, ubVar.a, ubVar.b, ubVar.c, this.a);
                }
                it.remove();
            }
        }
        if (ubVar2 == null) {
            ubVar = new ub(this.e.a, this.c, this.d, this.b, this.a);
        } else {
            obj = ubVar2;
        }
        this.e.a.d.put(a, obj);
        try {
            a.linkToDeath(obj, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
