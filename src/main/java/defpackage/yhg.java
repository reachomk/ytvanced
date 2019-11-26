package defpackage;

import android.content.Context;
import android.view.animation.Animation;

/* renamed from: yhg */
final class yhg extends xnj {
    private final /* synthetic */ yhe a;

    yhg(yhe yhe, Context context) {
        this.a = yhe;
        super(context);
    }

    public final boolean a() {
        yhe yhe = this.a;
        if (yhe.b != null) {
            ycv b = yhe.b();
            int a = yhe.b.a("position", -1);
            if (!(a == -1 || b == null)) {
                return b.a.contains(Integer.valueOf(a)) ^ 1;
            }
        }
        return true;
    }

    public final Animation b() {
        return a() ? super.b() : null;
    }
}
