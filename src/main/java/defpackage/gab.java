package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: gab */
public final class gab implements akov {
    public final WeakHashMap a = new WeakHashMap();
    public final WeakHashMap b = new WeakHashMap();
    public final Handler c = new Handler(Looper.getMainLooper(), new gaa(this));
    public final Set d = new HashSet();
    private gac e;
    private Rect f;
    private Rect g;

    public final void a(akot akot, Object obj) {
        if ((obj instanceof azem) && (akot instanceof gai)) {
            gaf b = ((gai) akot).b();
            azem azem = (azem) obj;
            View K_ = akot.K_();
            xak.a();
            this.b.put(K_, new gac(K_, azem, b));
            this.c.removeMessages(1);
            this.c.sendEmptyMessage(1);
        }
    }

    public final void a() {
        if (this.f == null) {
            this.f = new Rect();
        }
        if (this.g == null) {
            this.g = new Rect();
        }
        float f = 0.0f;
        gac gac = null;
        int i = 0;
        for (gac gac2 : this.a.values()) {
            View a = gac2.a();
            ImageView imageView = gac2.c.get() != null ? ((gaf) gac2.c.get()).b : null;
            if (a.getGlobalVisibleRect(this.f) && a.isShown() && imageView != null) {
                imageView.getGlobalVisibleRect(this.g);
                int abs = Math.abs((xss.g(a.getContext()) / 2) - this.g.centerY());
                float height = ((float) this.g.height()) / ((float) imageView.getMeasuredHeight());
                if (gab.a(gac2, this.e)) {
                    height += 0.1f;
                }
                if (height >= 0.5f) {
                    float abs2 = Math.abs(height - f);
                    if (height <= f) {
                        if (abs2 < 0.1f) {
                            if (abs >= i) {
                            }
                        }
                    }
                    gac = gac2;
                    i = abs;
                    f = height;
                }
            }
        }
        if (!gab.a(this.e, gac)) {
            for (gad a2 : this.d) {
                a2.a(gac);
            }
            this.e = gac;
        }
    }

    private static boolean a(gac gac, gac gac2) {
        if (gac == null && gac2 == null) {
            return true;
        }
        if ((gac != null || gac2 == null) && (gac == null || gac2 != null)) {
            return amqq.a(gac.b, gac2.b);
        }
        return false;
    }
}
