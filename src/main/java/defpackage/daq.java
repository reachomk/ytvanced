package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: daq */
final class daq implements cnd {
    private final /* synthetic */ cyl a;
    private final /* synthetic */ dad b;

    daq(dad dad, cyl cyl) {
        this.b = dad;
        this.a = cyl;
    }

    public final void a(int i, int i2) {
        if (this.a.h() != i2) {
            this.a.a(i2);
            if (this.b.x == null || this.a.h() > this.b.x.b) {
                synchronized (this.b) {
                    dad dad = this.b;
                    if (dad.x != null) {
                        int size = dad.b.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            int h = ((cyl) dad.b.get(i4)).h();
                            if (h > i3) {
                                i3 = h;
                            }
                        }
                        if (i3 != dad.x.b) {
                            i = Math.max(dad.e.a(MeasureSpec.getSize(dad.s), MeasureSpec.getSize(dad.t), i, i3), 1);
                            dad.x.b = i3;
                            dad.x.a = i;
                        }
                    }
                }
                this.b.i();
            }
        }
    }
}
