package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* renamed from: agzf */
public final class agzf implements Runnable {
    private final /* synthetic */ agqz a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ OfflineTransferService c;

    public agzf(OfflineTransferService offlineTransferService, agqz agqz, boolean z) {
        this.c = offlineTransferService;
        this.a = agqz;
        this.b = z;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
