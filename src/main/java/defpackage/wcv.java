package defpackage;

import android.content.Context;
import android.text.Spanned;
import java.util.Map;

/* renamed from: wcv */
public final class wcv {
    public final aaas a;
    private final Context b;
    private final albi c;

    public wcv(Context context, albi albi, aaas aaas) {
        this.b = context;
        this.c = albi;
        this.a = aaas;
    }

    public final void a(ajri ajri, Map map) {
        if (ajri != null) {
            Spanned a = ajqy.a(ajri.b);
            if (a != null && a.length() != 0) {
                aphg aphg;
                albk c = ((albk) this.c.b().b(a).c(-1)).c(false);
                aphj aphj = ajri.d;
                arml arml = null;
                if (aphj == null || (aphj.a & 1) == 0) {
                    aphg = null;
                } else {
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                if (aphg != null) {
                    if ((aphg.a & 128) != 0) {
                        arml = aphg.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    c.a(ajqy.a(arml), new wcy(this, aphg, map));
                }
                this.c.b(c.d());
            }
        }
    }

    public final void a(ajri ajri, Map map, int i) {
        if (ajri != null) {
            Spanned a = ajqy.a(ajri.b);
            if (a == null || a.length() == 0) {
                a(i);
                return;
            } else {
                a(ajri, map);
                return;
            }
        }
        a(i);
    }

    private final void a(int i) {
        this.c.b(((albk) this.c.b().b(this.b.getString(i)).c(-1)).c(false).d());
    }
}
