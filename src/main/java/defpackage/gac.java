package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: gac */
public final class gac {
    public final avdd a;
    public final azem b;
    public final WeakReference c;
    private final WeakReference d;

    public final View a() {
        return (View) this.d.get();
    }

    public final gaf b() {
        return (gaf) this.c.get();
    }

    /* synthetic */ gac(View view, azem azem, gaf gaf) {
        avdd avdd;
        this.d = new WeakReference((View) amqw.a((Object) view));
        this.b = azem;
        azeq azeq = azem.p;
        if (azeq == null) {
            azeq = azeq.c;
        }
        if ((azeq.a & 1) != 0) {
            azeq = azem.p;
            if (azeq == null) {
                azeq = azeq.c;
            }
            avdd = azeq.b;
            if (avdd == null) {
                avdd = avdd.d;
            }
        } else {
            avdd = null;
        }
        this.a = avdd;
        if (azem.o.size() != 0) {
            for (ayfu ayfu : azem.o) {
                if ((ayfu.a & 8) != 0) {
                    break;
                }
            }
        }
        this.c = new WeakReference((gaf) amqw.a((Object) gaf));
    }
}
