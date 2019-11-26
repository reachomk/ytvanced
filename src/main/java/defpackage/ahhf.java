package defpackage;

import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;

/* renamed from: ahhf */
public final /* synthetic */ class ahhf implements Runnable {
    private final BackgroundPlayerService a;

    public ahhf(BackgroundPlayerService backgroundPlayerService) {
        this.a = backgroundPlayerService;
    }

    public final void run() {
        BackgroundPlayerService backgroundPlayerService = this.a;
        if (!backgroundPlayerService.n) {
            backgroundPlayerService.stopForeground(false);
        }
    }
}
