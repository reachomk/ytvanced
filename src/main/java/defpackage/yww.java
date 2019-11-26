package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yww */
public final class yww extends yzq {
    public final akkq a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public yww(View view, akkq akkq) {
        super(view, 0);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (View) amqw.a(view.findViewById(R.id.channel_bubble));
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.channel_title));
        this.d = (TextView) amqw.a((TextView) view.findViewById(R.id.channel_metadata));
        this.e = (ImageView) amqw.a((ImageView) view.findViewById(R.id.channel_thumbnail));
    }
}
