package defpackage;

import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;

/* renamed from: sdi */
public final class sdi implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ MiniController c;

    public sdi(MiniController miniController, int i, int i2) {
        this.c = miniController;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        this.c.d.setMax(this.a);
        this.c.d.setProgress(this.b);
    }
}
