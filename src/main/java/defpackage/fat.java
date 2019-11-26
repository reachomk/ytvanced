package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: fat */
public abstract class fat implements albc {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static final long b = TimeUnit.SECONDS.toMillis(5);
    private final fbp c;
    private final Handler d;
    private final fav e;
    private final bcaa f;
    private final Set g = new CopyOnWriteArraySet();
    private albf h;

    fat(fbp fbp, Handler handler, bcaa bcaa, fav fav) {
        this.c = fbp;
        this.d = handler;
        this.e = fav;
        this.f = bcaa;
    }

    public abstract fbt a(BottomUiContainer bottomUiContainer);

    /* Access modifiers changed, original: protected */
    public boolean c(albf albf) {
        return true;
    }

    public final albe a() {
        return (albe) this.f.get();
    }

    public final void a(albf albf) {
        BottomUiContainer bottomUiContainer = this.c.e;
        if (!(bottomUiContainer == null || albf == null || !c(albf))) {
            fbr a = this.e.a(albf);
            if (a != null) {
                fbp fbp = this.c;
                int q = a.q();
                Object obj = null;
                Object obj2 = (q != 1 && fbp.b() == 1) ? null : 1;
                if (a.a() && !fbp.a.a()) {
                    obj = 1;
                }
                boolean n = fbp.b.c().n();
                if (!(q == 0 || obj2 == null || obj != null || n)) {
                    fbn a2 = BottomUiContainer.a((albc) this, (Object) albf);
                    if (albf.c()) {
                        a2.a();
                        a2.a(3);
                        return;
                    }
                    this.c.b(a);
                    bottomUiContainer.a(a, a(bottomUiContainer), a2);
                }
            }
        }
    }

    public final void b(albf albf) {
        a(albf, 3);
    }

    public final void a(albf albf, int i) {
        if (this.c.e != null && albf != null && albf.equals(this.h)) {
            this.c.e.b(i);
        }
    }
}
