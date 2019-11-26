package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yzv */
public final class yzv extends yzq implements zat {
    private final akkq a;
    private final ImageView b;
    private final TextView c;
    private final View d;

    public yzv(akkq akkq, View view) {
        super(view, 0);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (ImageView) amqw.a((ImageView) view.findViewById(R.id.video_thumbnail));
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.video_title));
        this.d = (View) amqw.a(view.findViewById(R.id.incept_button));
    }

    public final void a(zaw zaw) {
        this.b.setOnClickListener(new yzu(zaw));
        this.d.setOnClickListener(new yzx(zaw));
    }

    public final void a(aygk aygk) {
        this.a.a(this.b, aygk);
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
