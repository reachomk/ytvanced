package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* renamed from: agzg */
public final class agzg implements Runnable {
    private final /* synthetic */ agqz a;
    private final /* synthetic */ OfflineTransferService b;

    public agzg(OfflineTransferService offlineTransferService, agqz agqz) {
        this.b = offlineTransferService;
        this.a = agqz;
    }

    public final void run() {
        OfflineTransferService offlineTransferService = this.b;
        agqz agqz = this.a;
        if (((agvs) offlineTransferService.n.get()).a(agqz)) {
            if (agqz.b == agrc.COMPLETED) {
                ((agrq) offlineTransferService.m.get()).a(agqz);
            } else if (agqz.b == agrc.FAILED) {
                ((agrq) offlineTransferService.m.get()).b(agqz);
            } else if (agqz.b == agrc.PENDING && agxj.a(agqz)) {
                offlineTransferService.b(agqz, false);
                if ((agqz.c & 256) != 0) {
                    offlineTransferService.c(agqz);
                }
            }
        }
    }
}
