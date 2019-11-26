package defpackage;

import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: ajep */
final class ajep implements ajev {
    private final afmi a;
    private int b = -1;
    private final /* synthetic */ ajee c;

    ajep(ajee ajee, afmi afmi) {
        this.c = ajee;
        this.a = afmi;
    }

    public final int a() {
        int i = this.b;
        if (i == -1) {
            int i2 = 10;
            for (Entry entry : this.a.b().entrySet()) {
                i2 += (((String) entry.getKey()).length() + 2) + ((String) entry.getValue()).length();
            }
            this.b = i2;
            i = i2;
        }
        i += 20;
        ajee ajee = this.c;
        int i3 = 0;
        i += ajee.y > 0.0f ? 12 : 0;
        if (ajee.o > 0) {
            i3 = 8;
        }
        return i + i3;
    }

    public final void a(ajeu ajeu) {
        for (Entry entry : this.a.b().entrySet()) {
            ajeu.c((String) entry.getKey(), (String) entry.getValue());
        }
        String f = this.c.f();
        int k = this.c.c.k();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 12);
        stringBuilder.append(f);
        stringBuilder.append(":");
        stringBuilder.append(k);
        ajeu.a("conn", stringBuilder.toString());
        if (this.c.y > 0.0f) {
            ajeu.a("preload", String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(this.c.y)}));
        }
        int i = this.c.o;
        if (i > 0) {
            ajeu.a("fmt", String.valueOf(i));
        }
        ajee ajee = this.c;
        k = ajee.B;
        ajee.B = k + 1;
        ajeu.c("seq", String.valueOf(k));
    }
}
