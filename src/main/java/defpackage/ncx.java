package defpackage;

import android.os.RemoteException;

/* renamed from: ncx */
public final /* synthetic */ class ncx implements bcvk {
    private final amle a;

    public ncx(amle amle) {
        this.a = amle;
    }

    public final void a(Object obj) {
        amle amle = this.a;
        myz myz = ((ndi) obj).k;
        if (myz == null) {
            try {
                amle.a(0);
                return;
            } catch (RemoteException unused) {
                ammj.b("Problem sending getDuration result.", new Object[0]);
                return;
            }
        }
        myz.a(amle);
    }
}
