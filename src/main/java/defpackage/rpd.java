package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.WeakHashMap;

@qlp
/* renamed from: rpd */
public final class rpd implements pcn {
    private static WeakHashMap b = new WeakHashMap();
    public final rpb a;

    private rpd(rpb rpb) {
        Context context;
        String str = "";
        pbl pbl = new pbl();
        this.a = rpb;
        try {
            context = (Context) qct.a(rpb.b());
        } catch (RemoteException | NullPointerException e) {
            qml.a(str, e);
            context = null;
        }
        if (context != null) {
            try {
                this.a.a(qct.a(new pcb(context)));
            } catch (RemoteException e2) {
                qml.a(str, e2);
            }
        }
    }

    public static rpd a(rpb rpb) {
        synchronized (b) {
            rpd rpd = (rpd) b.get(rpb.asBinder());
            if (rpd != null) {
                return rpd;
            }
            rpd = new rpd(rpb);
            b.put(rpb.asBinder(), rpd);
            return rpd;
        }
    }
}
