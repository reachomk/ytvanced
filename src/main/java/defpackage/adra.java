package defpackage;

import android.os.Handler;

/* renamed from: adra */
final class adra extends bbe {
    private final /* synthetic */ adqx a;

    adra(adqx adqx) {
        this.a = adqx;
    }

    public final void a(bbb bbb, bbs bbs) {
        Handler handler = this.a.e;
        handler.sendMessage(handler.obtainMessage(2, bbs));
    }
}
