package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: epp */
public abstract class epp implements akot {
    public final View a;
    public final TextView b = ((TextView) this.a.findViewById(R.id.channel_name));
    public final TextView c = ((TextView) this.a.findViewById(R.id.video_count));
    private final akkq d;
    private final TextView e = ((TextView) this.a.findViewById(R.id.subscriber_count));
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.channel_avatar));
    private final akko g;

    public epp(Context context, akkq akkq, int i) {
        amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.a = LayoutInflater.from(context).inflate(i, null);
        this.g = akkq.a().g().a((int) R.drawable.missing_avatar).a();
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        xpr.a(this.e, charSequence);
    }

    public final void a(aygk aygk) {
        this.d.a(this.f, aygk, this.g);
    }
}
