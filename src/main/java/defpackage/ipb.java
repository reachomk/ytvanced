package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: ipb */
public final class ipb implements akot {
    private final RecyclerView a;
    private final akwz b;

    public ipb(Context context, akpe akpe, akvz akvz, acwa acwa) {
        this.a = new RecyclerView(context);
        this.a.setNestedScrollingEnabled(false);
        this.a.a(new ans(0, false));
        Resources resources = context.getResources();
        this.a.a(new ipd(resources));
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.red_carpet_shelf_left_padding);
        this.a.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset - resources.getDimensionPixelOffset(R.dimen.red_carpet_list_divider_width), 0);
        this.a.setClipToPadding(false);
        this.b = new ipa(this.a, akpe, akvz, acwa);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.b.a.clear();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajzm ajzm = (ajzm) obj;
        this.b.a.clear();
        this.b.a(ajzm.a);
    }
}
