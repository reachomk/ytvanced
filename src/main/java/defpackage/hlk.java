package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* renamed from: hlk */
public class hlk implements hlp {
    public final hlo a;
    private final eki b;
    private final bcaa c;
    private final int d;
    private final String e;

    public hlk(eki eki, bcaa bcaa, int i, String str, OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        this.b = eki;
        this.c = bcaa;
        this.d = i;
        this.e = str;
        if (offlineArrowView != null) {
            this.a = new hlo(offlineArrowView, onClickListener);
            return;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }

    public void a() {
        if (b()) {
            int i = this.d;
            if (i == 0) {
                xvd.a(this.e);
                a(hks.a(((agwc) this.c.get()).b().k().a(this.e)));
                return;
            } else if (i == 1) {
                xvd.a(this.e);
                a(hks.a(((agwc) this.c.get()).b().n().f(this.e)));
                return;
            } else if (i == 2) {
                xvd.a(this.e);
                a(hks.a(((agwc) this.c.get()).b().o().f(this.e)));
                return;
            } else if (i != 3) {
                if (i == 4) {
                    a(hks.a(((agwc) this.c.get()).b().k().g()));
                }
                return;
            } else {
                a(hks.a(((agwc) this.c.get()).b().k().f()));
                return;
            }
        }
        this.a.b();
    }

    public void a(hks hks) {
        amqw.a((Object) hks);
        if (!b() || hks.a) {
            this.a.b();
        } else if (hks.b) {
            this.a.a(c());
        } else {
            hlo hlo = this.a;
            int i = hks.e;
            boolean z = hks.c;
            boolean z2 = hks.d;
            hlo.c();
            if (z) {
                if (z2) {
                    hlo.a.a();
                } else {
                    hlo.a.c();
                }
                hlo.a.c(i);
            } else {
                hlo.a.b();
                hlo.a.e();
            }
            hlo.b(R.string.accessibility_offline_button_cancel);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        int i = this.d;
        if (i == 1) {
            return this.b.d();
        }
        if (i == 2) {
            return this.b.e();
        }
        if (i == 3) {
            return this.b.c();
        }
        if (!this.b.b() || this.b.g()) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return this.d != 0 ? R.string.accessibility_offline_button_remove_playlist : R.string.accessibility_offline_button_remove_video;
    }
}
