package defpackage;

import android.view.ViewStub;
import android.widget.ProgressBar;

/* renamed from: fnk */
public final class fnk {
    public final ViewStub a;
    public ProgressBar b;
    private boolean c;

    public fnk(ViewStub viewStub) {
        this.a = (ViewStub) amqw.a((Object) viewStub);
    }

    public final void a(ayfq ayfq) {
        if (ayfq != null && ayfq.b > 0) {
            a();
            this.a.setVisibility(0);
            this.b.setVisibility(0);
            this.b.setProgress(ayfq.b);
            return;
        }
        this.a.setVisibility(8);
    }

    public final void a() {
        if (!this.c) {
            this.b = (ProgressBar) this.a.inflate();
            this.b.setMax(100);
            this.c = true;
        }
    }
}
