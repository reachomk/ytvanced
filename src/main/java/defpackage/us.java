package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: us */
final class us implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ ut e;

    us(ut utVar, vd vdVar, String str, int i, int i2) {
        this.e = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final void run() {
        IBinder a = this.a.a();
        this.e.a.d.remove(a);
        ub ubVar = new ub(this.e.a, this.b, this.c, this.d, this.a);
        tv tvVar = this.e.a;
        tvVar.e = ubVar;
        ubVar.f = tvVar.a();
        tvVar = this.e.a;
        tvVar.e = null;
        String str = "MBServiceCompat";
        if (ubVar.f == null) {
            getClass().getName();
            try {
                this.a.b();
            } catch (RemoteException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                stringBuilder.append(this.b);
                Log.w(str, stringBuilder.toString());
                return;
            }
        }
        try {
            tvVar.d.put(a, ubVar);
            a.linkToDeath(ubVar, 0);
            xo xoVar = this.e.a.g;
            if (xoVar != null) {
                vd vdVar = this.a;
                ty tyVar = ubVar.f;
                vdVar.a(tyVar.a, xoVar, tyVar.b);
            }
        } catch (RemoteException unused2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
            stringBuilder2.append(this.b);
            Log.w(str, stringBuilder2.toString());
            this.e.a.d.remove(a);
        }
    }
}
