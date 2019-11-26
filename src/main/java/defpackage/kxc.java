package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;

/* renamed from: kxc */
final class kxc {
    public final RecyclerView a;
    public final akpd b;
    public final akpk c = new akpk();
    public final akod d;
    public final acwa e;

    kxc(RecyclerView recyclerView, Context context, akpe akpe, akvz akvz, acwa acwa) {
        this.a = recyclerView;
        this.e = acwa;
        this.b = akpe.a((akpb) akvz.get());
        this.b.a(this.c);
        this.d = new akod();
        this.b.a(this.d);
        this.a.a(this.b);
        this.a.setNestedScrollingEnabled(false);
        this.a.a(new ans(0, false));
        Drawable a = ra.a(context, (int) R.drawable.carousel_separator);
        Resources resources = context.getResources();
        this.a.a(new kxd(a, resources.getDimensionPixelSize(R.dimen.primetime_carousel_separator_width), resources.getDimensionPixelSize(R.dimen.primetime_carousel_separator_height)));
    }
}
