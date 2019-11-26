package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zve */
final class zve extends aqj {
    public final ImageView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public zve(View view) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.image);
        this.q = (TextView) view.findViewById(R.id.domain);
        this.r = (TextView) view.findViewById(R.id.title);
        this.s = (TextView) view.findViewById(R.id.call_to_action);
    }
}
