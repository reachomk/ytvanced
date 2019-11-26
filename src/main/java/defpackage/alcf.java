package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alcf */
public final class alcf {
    public int a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public alch e;
    public OnClickListener f;
    public CharSequence g;
    public alch h;
    public OnClickListener i;
    public int j;
    public boolean k;
    private final View l;
    private int m;

    public alcf(View view) {
        this.l = view;
    }

    public final alcf a() {
        this.m = 2;
        return this;
    }

    public final albo b() {
        albo albo;
        View inflate = View.inflate(this.l.getContext(), R.layout.tooltip_content_view, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
        View view = (TextView) inflate.findViewById(R.id.action_button);
        View view2 = (TextView) inflate.findViewById(R.id.dismiss_button);
        alcf.a(view, this.e);
        alcf.a(view2, this.h);
        xpr.a(textView, this.b);
        xpr.a(textView2, this.c);
        xpr.a((TextView) view, this.d);
        xpr.a((TextView) view2, this.g);
        xpr.a(view, view.getBackground());
        xpr.a(view2, view2.getBackground());
        if (textView.getVisibility() == 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) textView2.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            textView2.setLayoutParams(marginLayoutParams);
        }
        if (this.k) {
            albo albo2 = new albo(inflate, this.a, this.l, this.m, this.j);
        } else {
            albo = new albo(inflate, this.a, this.l, this.m);
        }
        alcf.a(view, this.f, albo);
        alcf.a(view2, this.i, albo);
        return albo;
    }

    private static void a(TextView textView, alch alch) {
        if (alch != null) {
            Resources resources = textView.getResources();
            textView.setTextColor(alch.a(resources));
            xpr.a((View) textView, alch.b(resources));
        }
    }

    private static void a(View view, OnClickListener onClickListener, albo albo) {
        view.setOnClickListener(new alce(onClickListener, albo));
    }
}
