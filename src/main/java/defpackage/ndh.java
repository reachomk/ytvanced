package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;

/* renamed from: ndh */
final /* synthetic */ class ndh implements bcvq {
    private final IEmbedFragmentServiceFactoryService a;

    ndh(IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService) {
        this.a = iEmbedFragmentServiceFactoryService;
    }

    public final Object a(Object obj) {
        ndi ndi = (ndi) obj;
        try {
            ndi.g = this.a.a(ndi.f, ndi.d.e());
            ndi.l = ndi.g.c();
            return ndi;
        } catch (RemoteException e) {
            throw bcva.a(e);
        }
    }
}
