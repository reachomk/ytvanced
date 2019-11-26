package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jxs */
final class jxs {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final akyu e;
    public final TextView f;
    public final akyu g;
    public final ImageView h;
    public final ImageView i;
    public final akkq j;
    public final int k;
    public final /* synthetic */ jxt l;

    public jxs(jxt jxt, View view, akkq akkq, int i) {
        this.l = jxt;
        this.a = view;
        this.j = akkq;
        this.k = i;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = (TextView) view.findViewById(R.id.body_text);
        this.d = (TextView) view.findViewById(R.id.button);
        this.e = jxt.b.a(this.d);
        this.f = (TextView) view.findViewById(R.id.secondary_button);
        this.g = jxt.b.a(this.f);
        this.h = (ImageView) view.findViewById(R.id.icon);
        this.i = (ImageView) view.findViewById(R.id.thumbnail);
    }

    public final void a() {
        b(this.l.a.getResources().getDimensionPixelSize(R.dimen.background_promo_default_body_text_top_padding));
        a(this.l.a.getResources().getDimensionPixelSize(R.dimen.background_promo_default_padding));
    }

    public final void a(int i) {
        View view = this.a;
        view.setPadding(view.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), i);
    }

    public final void b(int i) {
        TextView textView = this.c;
        textView.setPadding(textView.getPaddingLeft(), i, this.c.getPaddingRight(), this.c.getPaddingBottom());
    }
}
