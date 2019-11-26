package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;

/* renamed from: mvd */
final /* synthetic */ class mvd implements bcvq {
    private final IApiPlayerFactoryService a;

    mvd(IApiPlayerFactoryService iApiPlayerFactoryService) {
        this.a = iApiPlayerFactoryService;
    }

    public final Object a(Object obj) {
        IApiPlayerFactoryService iApiPlayerFactoryService = this.a;
        mvb mvb = (mvb) obj;
        try {
            ndt ndt = mvb.b;
            ndy ndy = new ndy(ndt);
            nbi nbi = ndt.d;
            nen nen = ndt.e;
            nfa nfa = ndt.f;
            ndt ndt2 = ndt;
            IApiPlayerService a = iApiPlayerFactoryService.a(ndy, nbi, nen, null, ndt.g, ndt.h, ndt.i, ndt.j, ndt.k, ndt.l, ndt.m, ndt.n, ndt.o, ndt.r, ndt.s, false);
            ndt ndt3 = ndt2;
            ndt3.a = a;
            ndt3.c = ndt3.a.s();
            ndt3.b = ndt3.a.r();
            ndt3.v.post(new ndv(ndt3));
            return mvb;
        } catch (RemoteException e) {
            throw bcva.a(e);
        }
    }
}
