package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zvf */
final class zvf extends aqj {
    public final ImageView p;
    public final TextView q;
    public final View r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;

    public zvf(View view) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.image);
        this.q = (TextView) view.findViewById(R.id.custom_message);
        this.r = view.findViewById(R.id.custom_message_divider);
        this.s = (TextView) view.findViewById(R.id.duration);
        this.t = (TextView) view.findViewById(R.id.badge);
        this.u = (TextView) view.findViewById(R.id.title);
        this.v = (TextView) view.findViewById(R.id.author);
        this.w = (TextView) view.findViewById(R.id.details);
    }
}
