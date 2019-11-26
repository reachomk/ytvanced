package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yxe */
public final class yxe implements yyt {
    public yys a;
    private final akkq b;
    private final TextView c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.author_avatar));

    public yxe(akkq akkq, View view) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.author_name));
        this.d = (View) amqw.a(view.findViewById(R.id.author_avatar_container));
        this.e.setOnClickListener(new yxh(this));
    }

    public final void a(yys yys) {
        this.a = yys;
    }

    public final void a(CharSequence charSequence) {
        xpr.a(this.c, charSequence);
    }

    public final void a(aygk aygk, boolean z) {
        int i = 0;
        if (aygk == null) {
            View view = this.d;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            this.b.a(this.e);
            return;
        }
        this.d.setVisibility(0);
        this.b.a(this.e, aygk);
    }

    public final void a(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void b(boolean z) {
        throw new UnsupportedOperationException();
    }
}
