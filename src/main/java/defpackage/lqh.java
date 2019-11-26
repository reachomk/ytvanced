package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* renamed from: lqh */
public final class lqh implements loh {
    private final /* synthetic */ NextGenWatchLayout a;

    public final void a(int i, int i2, float f) {
        if (this.a.j != null) {
            i = lol.a(i);
            i2 = lol.a(i2);
            if (i == 2 && (i2 == 1 || i2 == 3)) {
                f = 1.0f - f;
                this.a.j.a(f);
            } else if ((i == 1 || i == 3) && i2 == 2) {
                this.a.j.a(f);
            } else if (i == 0 || i2 == 0) {
                f = this.a.d.a().m();
                this.a.j.b(f);
            } else {
                f = 0.0f;
            }
            this.a.l.a(f);
        }
    }

    public /* synthetic */ lqh(NextGenWatchLayout nextGenWatchLayout) {
        this.a = nextGenWatchLayout;
    }
}
