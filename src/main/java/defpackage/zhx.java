package defpackage;

import java.util.TimerTask;

/* renamed from: zhx */
final class zhx extends TimerTask {
    private final /* synthetic */ zhu a;

    zhx(zhu zhu) {
        this.a = zhu;
    }

    public final void run() {
        this.a.ao.obtainMessage(1).sendToTarget();
    }
}
