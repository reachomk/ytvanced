package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ajjz */
public final class ajjz implements ajan, xcp {
    public volatile float a;
    private final aajk b;
    private final Set c = new HashSet();

    public ajjz(aajk aajk) {
        this.b = aajk;
    }

    public final long e() {
        return 1073741824;
    }

    public final boolean a() {
        return this.a <= 1.01f && this.a > 0.0f;
    }

    public final void a(ajkk ajkk) {
        if (ajkk != null) {
            this.c.add(ajkk);
        }
    }

    public final void b(ajkk ajkk) {
        if (ajkk != null) {
            this.c.remove(ajkk);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.a(ajkc.a, ajkb.a).a(ajcg.b(ajam.O(), 1073741824)).a(ajcg.a(ajam.O(), 1073741824, 1)).a(new ajke(this), ajkd.a), ajam.a(ajkg.a, ajkf.a).a(ajcg.b(ajam.O(), 1073741824)).a(ajcg.a(ajam.O(), 1073741824, 1)).a(new ajki(this), ajkh.a)};
    }

    public final void a(aetv aetv) {
        aahr aahr = aetv.b;
        if (aahr != null) {
            int f = aahr.f();
            int g = aetv.b.g();
            if (f >= 0 && g >= 0) {
                float f2;
                int I = aetv.b.I();
                awdg awdg = ((aajj) this.b.get()).c;
                float f3 = 0.0f;
                if ((awdg.b & 4) != 0) {
                    azfe azfe = awdg.v;
                    if (azfe == null) {
                        azfe = azfe.k;
                    }
                    f2 = azfe.j;
                } else {
                    f2 = 0.0f;
                }
                if ((I == 3 || I == 4 || I == 5) && f2 != 0.0f) {
                    f = (int) (((float) g) * f2);
                }
                if (g > 0 && f > 0) {
                    f3 = ((float) f) / ((float) g);
                }
                if (Math.abs(this.a - f3) >= 0.005f) {
                    this.a = f3;
                    for (ajkk a : this.c) {
                        a.a(f, g);
                    }
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aetv.class};
        } else if (i == 0) {
            a((aetv) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
