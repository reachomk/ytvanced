package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService;

/* renamed from: nfs */
public final class nfs extends nas {
    public final nhv a;
    private final Handler b;
    private final SparseArray c = new SparseArray();
    private IUiElementRegistrarService d;

    public nfs(Integer[] numArr, Handler handler, nhv nhv) {
        this.b = handler;
        this.a = nhv;
        for (Integer intValue : numArr) {
            int intValue2 = intValue.intValue();
            Runnable nfr = new nfr(this, intValue2);
            this.c.put(intValue2, nfr);
            nhv.a(intValue2, nfr);
        }
    }

    public final synchronized void a(int i) {
        IUiElementRegistrarService iUiElementRegistrarService = this.d;
        if (iUiElementRegistrarService != null) {
            try {
                iUiElementRegistrarService.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void a(IUiElementRegistrarService iUiElementRegistrarService) {
        this.d = iUiElementRegistrarService;
    }

    public final void a(int i, boolean z) {
        this.b.post(new nfu(this, i, z));
    }

    public final synchronized void a() {
        this.d = null;
        for (int i = 0; i < this.c.size(); i++) {
            nhv nhv = this.a;
            Runnable runnable = (Runnable) this.c.valueAt(i);
            nia nia = (nia) nhv.a.get(this.c.keyAt(i));
            if (nia != null) {
                nia.a.remove(runnable);
            }
        }
        this.c.clear();
    }
}
