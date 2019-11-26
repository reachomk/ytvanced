package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;

/* renamed from: ncs */
public final /* synthetic */ class ncs implements bcvk {
    private final Bundle a;

    public ncs(Bundle bundle) {
        this.a = bundle;
    }

    public final void a(Object obj) {
        Bundle bundle = this.a;
        ndi ndi = (ndi) obj;
        if (bundle != null) {
            ndi.o = bundle.getBundle("saved_coordinator_state");
            ndi.b();
            if (bundle.getBoolean("has_simple_start_descriptor")) {
                ndi.n = nhm.a(bundle);
                try {
                    IEmbedFragmentService iEmbedFragmentService = ndi.g;
                    if (iEmbedFragmentService != null) {
                        iEmbedFragmentService.a(ndi.n);
                    }
                } catch (RemoteException unused) {
                    ammj.b("Problem setting playback description.", new Object[0]);
                }
            }
        }
    }
}
