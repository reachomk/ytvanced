package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: ana */
final class ana extends apv {
    private final /* synthetic */ amy a;

    ana(amy amy) {
        this.a = amy;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        amy amy = this.a;
        i2 = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = amy.j.computeVerticalScrollRange();
        int i3 = amy.i;
        boolean z = computeVerticalScrollRange - i3 > 0 && i3 >= amy.a;
        amy.k = z;
        int computeHorizontalScrollRange = amy.j.computeHorizontalScrollRange();
        int i4 = amy.h;
        boolean z2 = computeHorizontalScrollRange - i4 > 0 && i4 >= amy.a;
        amy.l = z2;
        if (amy.k) {
            float f = (float) i3;
            amy.e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            amy.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z2) {
            if (amy.m != 0) {
                amy.a(0);
                return;
            }
        }
        if (amy.l) {
            float f2 = (float) i4;
            amy.g = (int) ((f2 * (((float) i2) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            amy.f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        computeVerticalScrollOffset = amy.m;
        if (computeVerticalScrollOffset == 0 || computeVerticalScrollOffset == 1) {
            amy.a(1);
        }
    }
}
