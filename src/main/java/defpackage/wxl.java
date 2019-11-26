package defpackage;

import android.os.Handler;

/* renamed from: wxl */
public final class wxl extends wxs {
    private final Handler b;
    private final Thread c;

    private wxl(Handler handler, wxg wxg) {
        super(wxg);
        this.b = (Handler) amqw.a((Object) handler);
        this.c = handler.getLooper().getThread();
    }

    public static wxl a(Handler handler, wxg wxg) {
        return new wxl(handler, wxg);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Runnable runnable) {
        if (Thread.currentThread() != this.c) {
            this.b.post(runnable);
        } else {
            runnable.run();
        }
    }
}
