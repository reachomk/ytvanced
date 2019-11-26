package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yza */
public final class yza implements yxy {
    public final TextView a;
    public final float b;
    public final float c;
    public yyb d;
    private final View e;
    private final View f;
    private final TextView g = ((TextView) amqw.a((TextView) this.f.findViewById(R.id.attachment_title)));
    private final ImageView h = ((ImageView) amqw.a((ImageView) this.f.findViewById(R.id.attachment_thumbnail)));
    private final View i;
    private final View j;
    private final akkq k;
    private final TextWatcher l;

    public yza(View view, akkq akkq) {
        this.e = (View) amqw.a((Object) view);
        this.a = (TextView) amqw.a((TextView) view.findViewById(R.id.text));
        this.f = (View) amqw.a(view.findViewById(R.id.attachment));
        View view2 = (View) amqw.a(this.f.findViewById(R.id.remove_attachment_button));
        this.i = (View) amqw.a(view.findViewById(R.id.attachment_button));
        this.j = (View) amqw.a(view.findViewById(R.id.send_button));
        this.k = (akkq) amqw.a((Object) akkq);
        this.d = new yzh();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        this.b = xss.a(displayMetrics, 8.0f);
        this.c = xss.a(displayMetrics, -10.0f);
        this.l = new yze(this);
        this.a.addTextChangedListener(this.l);
        this.i.setOnClickListener(new yzd(this));
        view2.setOnClickListener(new yzc(this));
        this.j.setOnClickListener(new yzf(this));
    }

    public final void a(yyb yyb) {
        this.d = yyb;
    }

    public final void a(CharSequence charSequence) {
        this.a.removeTextChangedListener(this.l);
        if (TextUtils.isEmpty(charSequence)) {
            this.a.setText(null);
        } else {
            this.a.setTextKeepState(charSequence);
        }
        this.a.addTextChangedListener(this.l);
    }

    public final void a(boolean z) {
        xpr.a(this.f, z);
    }

    public final void b(CharSequence charSequence) {
        xpr.a(this.g, charSequence);
    }

    public final void a(aygk aygk) {
        this.k.a(this.h, aygk);
    }

    public final void b(boolean z) {
        xpr.a(this.i, z);
    }

    public final void c(boolean z) {
        xpr.a(this.j, z);
    }

    public final void d(boolean z) {
        xpr.a(this.e, z);
    }

    public final void a() {
        xpr.a(this.a);
    }
}
