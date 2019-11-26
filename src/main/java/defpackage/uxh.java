package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: uxh */
public final class uxh implements akot {
    public aanu a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.name));
    private final TextView d = ((TextView) this.b.findViewById(R.id.byline));
    private final Resources e;
    private final xoi f;

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aanu aanu = (aanu) obj;
        this.a = aanu;
        if (aanu.a()) {
            this.c.setText(this.e.getString(R.string.account_switcher_error_credentials_title));
            this.d.setText(this.e.getString(R.string.account_switcher_error_credentials_byline));
            return;
        }
        CharSequence a;
        Throwable th = aanu.b;
        if (th != null) {
            a = this.f.a(th);
        } else {
            a = this.e.getString(R.string.account_switcher_error_general_title);
        }
        this.c.setText(a);
        this.d.setText(this.e.getString(R.string.account_switcher_error_general_byline));
    }

    /* synthetic */ uxh(int i, int i2, Context context, xoi xoi, uyb uyb) {
        amqw.a((Object) uyb);
        this.f = (xoi) amqw.a((Object) xoi);
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from.inflate(i, null);
        this.e = from.getContext().getResources();
        Drawable mutate = ((Drawable) amqw.a(ra.a(context, i2))).mutate();
        TextView textView = this.c;
        TextView textView2 = this.d;
        amqp c = xwe.c(context, R.attr.ytTextPrimary);
        textView.getClass();
        textView.setTextColor((ColorStateList) c.a(new uxg(textView)));
        amqp c2 = xwe.c(context, R.attr.ytTextSecondary);
        textView2.getClass();
        textView2.setTextColor((ColorStateList) c2.a(new uxj(textView2)));
        st.a(mutate, xwe.a(context, R.attr.ytIconInactive, -7829368));
        st.a(mutate, Mode.SRC_IN);
        ((ImageView) this.b.findViewById(R.id.thumbnail)).setImageDrawable(mutate);
        this.b.setOnClickListener(new uxi(this, uyb));
    }
}
