package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kxb */
public final class kxb implements akot {
    private final FrameLayout a;
    private final kxn b;

    public kxb(Context context, kxn kxn) {
        this.a = new FrameLayout(context);
        this.a.setLayoutParams(new LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.primetime_carousel_width), -2));
        this.b = kxn;
        this.a.addView(kxn.a);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.b.a(akpb);
    }

    public final /* bridge */ /* synthetic */ void a_(akor akor, Object obj) {
        this.b.a_(akor, (awnt) obj);
    }
}
