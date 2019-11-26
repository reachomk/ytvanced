package defpackage;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kvw */
final class kvw {
    public final View a;
    public final TextView b = ((TextView) this.a.findViewById(R.id.title));
    public final TextView c = ((TextView) this.a.findViewById(R.id.duration));
    public final TextView d = ((TextView) this.a.findViewById(R.id.channel_name));
    public final TextView e = ((TextView) this.a.findViewById(R.id.description));
    public final ImageView f = ((ImageView) this.a.findViewById(R.id.thumbnail));
    public final ImageView g = ((ImageView) this.a.findViewById(R.id.channel_thumbnail));
    public final TextView h = ((TextView) this.a.findViewById(R.id.call_to_action));
    public final View i = this.a.findViewById(R.id.contextual_menu_anchor);
    public final /* synthetic */ kvx j;
    private eza k;
    private final TypedValue l = new TypedValue();
    private final boolean m;

    public kvw(kvx kvx, int i) {
        this.j = kvx;
        Drawable drawable = null;
        this.a = View.inflate(kvx.a, i, null);
        boolean resolveAttribute = kvx.a.getTheme().resolveAttribute(R.attr.selectableItemBackground, this.l, true);
        this.m = resolveAttribute;
        if (resolveAttribute) {
            drawable = ra.a(kvx.a, this.l.resourceId);
        }
        this.k = new eza(drawable, xwe.a(kvx.a, R.attr.adSeparator1, 0), kvx.b.getDimensionPixelSize(R.dimen.line_separator_height));
        xpv.a(this.a, this.k);
        this.a.setOnClickListener(new kvz(this));
        this.g.setOnClickListener(new kvy(this));
        this.h.setOnClickListener(new kwb(this));
    }

    public final eza a(int i) {
        this.k = new eza(this.m ? ra.a(this.j.a, this.l.resourceId) : null, xwe.a(this.j.a, R.attr.adSeparator1, 0), i);
        xpv.a(this.a, this.k);
        return this.k;
    }
}
