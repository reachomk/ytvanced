package defpackage;

import android.os.SystemClock;
import android.view.MenuItem;

/* renamed from: aiq */
final class aiq implements aoi {
    public final /* synthetic */ ail a;

    aiq(ail ail) {
        this.a = ail;
    }

    public final void a(aiw aiw, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(aiw);
    }

    public final void b(aiw aiw, MenuItem menuItem) {
        air air = null;
        this.a.a.removeCallbacksAndMessages(null);
        int size = this.a.b.size();
        int i = 0;
        while (i < size) {
            if (aiw == ((air) this.a.b.get(i)).b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            i++;
            if (i < this.a.b.size()) {
                air = (air) this.a.b.get(i);
            }
            this.a.a.postAtTime(new aip(this, air, menuItem, aiw), aiw, SystemClock.uptimeMillis() + 200);
        }
    }
}
