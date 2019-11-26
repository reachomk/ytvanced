package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: pad */
public final class pad {
    public final WindowManager a;
    public final paf b;
    public final pag c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    public pad() {
        this(null);
    }

    public pad(Context context) {
        pag pag = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (ozp.a >= 17) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    pag = new pag(this, displayManager);
                }
            }
            this.c = pag;
            this.b = paf.b;
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    public final void a() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.d = j;
            this.e = (j * 80) / 100;
        }
    }

    public final boolean a(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }
}
