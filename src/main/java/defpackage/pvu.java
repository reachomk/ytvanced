package defpackage;

import android.os.Handler;

/* renamed from: pvu */
final class pvu implements ptt {
    private final /* synthetic */ pty a;

    pvu(pty pty) {
        this.a = pty;
    }

    public final void a(boolean z) {
        Handler handler = this.a.m;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
