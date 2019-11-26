package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.Theme;

/* renamed from: cqw */
public final class cqw {
    public Theme a;
    public final int[] b = new int[1];
    private Resources c;

    public cqw(cmg cmg) {
        this.c = cmg.b.getResources();
        this.a = cmg.b.getTheme();
        cqx cqx = cmg.i;
    }

    public final int a(float f) {
        return con.a(f * this.c.getDisplayMetrics().density);
    }

    public final int b(float f) {
        return con.a(f * this.c.getDisplayMetrics().scaledDensity);
    }

    public final void a() {
        this.c = null;
        this.a = null;
    }
}
