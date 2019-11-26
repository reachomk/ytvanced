package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yyo */
public final class yyo implements yyt {
    public yys a;
    private final akkq b;
    private final TextView c;
    private final ImageView d;
    private final View e;
    private final View f;

    public yyo(akkq akkq, View view) {
        view.setOnClickListener(new yyr(this));
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.name));
        this.d = (ImageView) view.findViewById(R.id.avatar);
        this.e = (View) amqw.a(view.findViewById(R.id.invite_button));
        this.e.setOnClickListener(new yyq(this));
        this.f = (View) amqw.a(view.findViewById(R.id.invited_label));
    }

    public final void a(yys yys) {
        this.a = yys;
    }

    public final void a(CharSequence charSequence) {
        xpr.a(this.c, charSequence);
    }

    public final void a(aygk aygk, boolean z) {
        if (!z) {
            throw new IllegalArgumentException("This implementation always shows the placeholder!");
        } else if (aygk != null) {
            this.b.a(this.d, aygk);
        } else {
            this.b.a(this.d);
        }
    }

    public final void a(boolean z) {
        xpr.a(this.e, z);
    }

    public final void b(boolean z) {
        xpr.a(this.f, z);
    }
}
