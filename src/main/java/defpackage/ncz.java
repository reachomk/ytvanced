package defpackage;

import android.os.RemoteException;

/* renamed from: ncz */
public final /* synthetic */ class ncz implements bcvk {
    private final String a;
    private final amle b;

    public ncz(String str, amle amle) {
        this.a = str;
        this.b = amle;
    }

    public final void a(Object obj) {
        String str = this.a;
        amle amle = this.b;
        ndi ndi = (ndi) obj;
        nhm a = nft.a(str);
        if (a != null) {
            ndi.a(a);
        }
        try {
            amle.a(a != null);
        } catch (RemoteException unused) {
            ammj.b("Problem sending setUri result to client.", new Object[0]);
        }
    }
}
