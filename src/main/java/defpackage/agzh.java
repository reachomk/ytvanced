package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* renamed from: agzh */
public final class agzh implements Runnable {
    private final /* synthetic */ agqz a;
    private final /* synthetic */ OfflineTransferService b;

    public agzh(OfflineTransferService offlineTransferService, agqz agqz) {
        this.b = offlineTransferService;
        this.a = agqz;
    }

    public final void run() {
        OfflineTransferService offlineTransferService = this.b;
        agqz agqz = this.a;
        ((agrq) offlineTransferService.m.get()).c(agqz);
        offlineTransferService.c(agqz);
    }
}
