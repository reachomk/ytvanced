package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kjq */
public final class kjq implements akot {
    private final eza a;
    private final View b;

    public kjq(Context context) {
        this.a = new eza(xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.a.a(16);
        this.a.a(true);
        this.b = LayoutInflater.from(context).inflate(R.layout.separator_with_padding, null, false);
        xpv.a(this.b, this.a);
    }

    public final void a(akpb akpb) {
    }

    public final /* bridge */ /* synthetic */ void a_(akor akor, Object obj) {
    }

    public final View K_() {
        return this.b;
    }
}
