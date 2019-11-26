package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: pyk */
public final class pyk implements ServiceConnection {
    private final int a;
    private final /* synthetic */ pyd b;

    public pyk(pyd pyd, int i) {
        this.b = pyd;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            synchronized (this.b.B) {
                pyz pzf;
                pyd pyd = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof pyz)) {
                    pzf = new pzf(iBinder);
                } else {
                    pzf = (pyz) queryLocalInterface;
                }
                pyd.C = pzf;
            }
            this.b.a(0, this.a);
            return;
        }
        int i;
        int i2;
        pyd pyd2 = this.b;
        synchronized (pyd2.A) {
            i = pyd2.F;
        }
        if (i == 3) {
            pyd2.J = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = pyd2.z;
        handler.sendMessage(handler.obtainMessage(i2, pyd2.L.get(), 16));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.B) {
            this.b.C = null;
        }
        Handler handler = this.b.z;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
