package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* renamed from: dhp */
public final class dhp extends pee {
    private final /* synthetic */ AbstractAdViewAdapter a;

    public dhp(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.a = abstractAdViewAdapter;
    }

    public final void a() {
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        pbj pbj = abstractAdViewAdapter.a;
        if (pbj != null && abstractAdViewAdapter.b != null) {
            Bundle y;
            try {
                rlz rlz = pbj.a.e;
                if (rlz != null) {
                    y = rlz.y();
                    this.a.b.a(y);
                }
            } catch (RemoteException e) {
                qml.c("#008 Must be called on the main UI thread.", e);
            }
            y = new Bundle();
            this.a.b.a(y);
        }
    }
}
