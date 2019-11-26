package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* renamed from: uo */
final class uo implements Runnable {
    private final /* synthetic */ xo a;
    private final /* synthetic */ up b;

    uo(up upVar, xo xoVar) {
        this.b = upVar;
        this.a = xoVar;
    }

    public final void run() {
        Iterator it = this.b.a.d.values().iterator();
        while (it.hasNext()) {
            ub ubVar = (ub) it.next();
            try {
                vd vdVar = ubVar.d;
                ty tyVar = ubVar.f;
                vdVar.a(tyVar.a, this.a, tyVar.b);
            } catch (RemoteException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Connection for ");
                stringBuilder.append(ubVar.a);
                stringBuilder.append(" is no longer valid.");
                Log.w("MBServiceCompat", stringBuilder.toString());
                it.remove();
            }
        }
    }
}
