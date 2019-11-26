package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jhw */
public final class jhw implements akuc {
    private final Resources a;
    private final int b;

    public final aknz a(int i, List list, int i2, int i3) {
        int i4 = this.b;
        if (i4 == 4) {
            return new aknq(i, list, i2, i3);
        }
        if (i4 == 3) {
            aknl a = akni.a();
            a.a = i;
            a.b = list;
            i = this.a.getDimensionPixelSize(R.dimen.grid_row_extra_horizontal_padding);
            int dimensionPixelSize = this.a.getDimensionPixelSize(R.dimen.grid_row_extra_vertical_padding);
            a.e = i;
            a.f = i;
            if (i2 == 0) {
                a.c = dimensionPixelSize;
            } else if (i2 == i3 - 1) {
                a.d = dimensionPixelSize;
            }
            return a.a();
        }
        aknl a2 = akni.a();
        a2.a = i;
        a2.b = list;
        return a2.a();
    }

    public jhw(Context context, int i) {
        this.a = context.getResources();
        this.b = i;
    }
}
