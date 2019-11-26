package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: pym */
public final class pym extends pyg {
    private final IBinder c;
    private final /* synthetic */ pyd d;

    public pym(pyd pyd, int i, IBinder iBinder, Bundle bundle) {
        this.d = pyd;
        super(pyd, i, bundle);
        this.c = iBinder;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(psa psa) {
        pyf pyf = this.d.H;
        if (pyf != null) {
            pyf.a(psa);
        }
        this.d.a(psa);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        String str = "GmsClient";
        try {
            String interfaceDescriptor = this.c.getInterfaceDescriptor();
            if (this.d.b().equals(interfaceDescriptor)) {
                IInterface a = this.d.a(this.c);
                if (a == null || (!this.d.a(2, 4, a) && !this.d.a(3, 4, a))) {
                    return false;
                }
                pyd pyd = this.d;
                pyd.I = null;
                Bundle f = pyd.f();
                pyc pyc = this.d.G;
                if (pyc != null) {
                    pyc.a(f);
                }
                return true;
            }
            String b = this.d.b();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 34) + String.valueOf(interfaceDescriptor).length());
            stringBuilder.append("service descriptor mismatch: ");
            stringBuilder.append(b);
            stringBuilder.append(" vs. ");
            stringBuilder.append(interfaceDescriptor);
            Log.e(str, stringBuilder.toString());
            return false;
        } catch (RemoteException unused) {
            Log.w(str, "service probably died");
            return false;
        }
    }
}
