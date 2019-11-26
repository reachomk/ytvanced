package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: ant */
final class ant {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public int k;
    public List l = null;
    public boolean m;

    ant() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a(aqh aqh) {
        int i = this.d;
        return i >= 0 && i < aqh.b();
    }

    /* Access modifiers changed, original: final */
    public final View a(apw apw) {
        List list = this.l;
        if (list != null) {
            View view;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                view = ((aqj) this.l.get(i)).a;
                apr apr = (apr) view.getLayoutParams();
                if (!apr.l_() && this.d == apr.c()) {
                    a(view);
                    break;
                }
            }
            view = null;
            return view;
        }
        View view2 = apw.a(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }

    public final void a() {
        a(null);
    }

    private final void a(View view) {
        int size = this.l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((aqj) this.l.get(i2)).a;
            apr apr = (apr) view3.getLayoutParams();
            if (!(view3 == view || apr.l_())) {
                int c = (apr.c() - this.d) * this.e;
                if (c >= 0 && c < i) {
                    if (c == 0) {
                        view2 = view3;
                        break;
                    } else {
                        view2 = view3;
                        i = c;
                    }
                }
            }
        }
        if (view2 != null) {
            this.d = ((apr) view2.getLayoutParams()).c();
        } else {
            this.d = -1;
        }
    }
}
