package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: lpf */
final class lpf extends lpp {
    private final Context h;
    private final int i;
    private int j;

    public lpf(Context context, int i, lla lla, lla lla2) {
        super(lla, lla2);
        this.h = context;
        this.i = i;
        a();
    }

    public final void b_(int i, int i2) {
        this.j = i2;
        a();
    }

    public final void a() {
        this.d.set(this.a.h());
        this.c.set(this.a.i());
        this.e.set(this.a.j());
        this.g.set(this.a.k());
        int i = this.i;
        int i2 = 0;
        if (i == 32 || i == 64) {
            i = this.h.getResources().getDimensionPixelOffset(R.dimen.watch_while_mini_player_dismiss_animation_distance);
            if (this.i == 32) {
                i = -i;
            }
            i2 = i;
        } else if (i == 16) {
            i = this.j - this.g.top;
            this.d.offset(i2, i);
            this.c.offset(i2, i);
            this.e.offset(i2, i);
            this.g.offset(i2, i);
        }
        i = 0;
        this.d.offset(i2, i);
        this.c.offset(i2, i);
        this.e.offset(i2, i);
        this.g.offset(i2, i);
    }
}
