package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/* renamed from: eyy */
public final class eyy extends eyt {
    public int b;
    public boolean w = true;

    public eyy(Context context) {
    }

    public final void d(RecyclerView recyclerView) {
        this.b = 0;
    }

    public final int b(int i, apw apw, aqh aqh) {
        i = super.b(i, apw, aqh);
        this.b += i;
        return i;
    }

    public final void a(RecyclerView recyclerView, int i) {
        aqc ezb = new ezb(this, recyclerView.getContext(), Math.abs(i - q()) <= 2);
        ezb.b = i;
        a(ezb);
    }

    public final boolean l() {
        return this.w && super.l();
    }
}
