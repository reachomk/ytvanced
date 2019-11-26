package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: iny */
public final class iny implements akot {
    private final View a;
    private final LinearLayout b = ((LinearLayout) this.a.findViewById(R.id.row_content));
    private final Resources c;
    private final ioa d;

    public iny(Context context, akvz akvz, ViewGroup viewGroup) {
        this.c = context.getResources();
        this.d = new ioa(context, (akpb) akvz.get());
        this.a = LayoutInflater.from(context).inflate(R.layout.details_grid_row, viewGroup, false);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.d.a(this.b);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aknq aknq = (aknq) obj;
        this.b.removeAllViews();
        int i = aknq.a;
        int dimensionPixelSize = this.c.getDimensionPixelSize(R.dimen.grid_row_details_page_child_padding);
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = null;
            if (i2 >= 0 && i2 < aknq.b.size()) {
                obj2 = aknq.b.get(i2);
            }
            ioa ioa = this.d;
            View a = ioa.a(ioa.a(akor), obj2);
            a.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.b.addView(a);
            i2++;
        }
        int i3 = aknq.c;
        int i4 = aknq.d;
        if (i3 == 0) {
            i3 = this.c.getDimensionPixelSize(R.dimen.grid_row_details_page_top_bottom_padding);
        } else if (i3 != i4 - 1) {
            i3 = this.c.getDimensionPixelSize(R.dimen.grid_row_details_page_vertical_padding);
        } else {
            i3 = this.c.getDimensionPixelSize(R.dimen.grid_row_details_page_vertical_padding);
            i4 = this.c.getDimensionPixelSize(R.dimen.grid_row_details_page_top_bottom_padding);
            this.b.setPadding(0, i3, 0, i4);
        }
        i4 = 0;
        this.b.setPadding(0, i3, 0, i4);
    }
}
