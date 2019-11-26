package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kch */
public final class kch implements akot {
    public apxu a;
    private final Context b;
    private final TextView c;
    private final ImageView d;
    private final eza e;
    private final akou f;
    private final OnClickListener g;

    public kch(Context context, flu flu, aaas aaas) {
        this.b = (Context) amqw.a((Object) context);
        this.f = (akou) amqw.a((Object) flu);
        amqw.a((Object) aaas);
        View inflate = View.inflate(context, R.layout.expand_button_down, null);
        this.c = (TextView) inflate.findViewById(R.id.link_text);
        this.d = (ImageView) inflate.findViewById(R.id.link_icon);
        this.g = new kcg(this, aaas);
        this.e = new eza(inflate.getBackground(), xwe.a(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        inflate.setBackground(this.e);
        flu.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.f.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akvg akvg = (akvg) obj;
        this.a = akvg.d;
        akou akou = this.f;
        OnClickListener onClickListener = akvg.c;
        if (onClickListener == null) {
            onClickListener = this.g;
        }
        akou.a(onClickListener);
        CharSequence charSequence = akvg.a;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.b.getString(R.string.load_more_label);
        }
        this.c.setText(charSequence);
        this.d.setContentDescription(charSequence);
        boolean z = akvg.b;
        xpr.a(this.d, z);
        xpr.a(this.c, z ^ 1);
        this.f.a(akor);
    }
}
