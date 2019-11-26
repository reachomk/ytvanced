package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ztz */
final class ztz extends aqj {
    public final ImageView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public ztz(View view) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.image);
        this.q = (TextView) view.findViewById(R.id.subscriber_count);
        this.r = (TextView) view.findViewById(R.id.channel_name);
        this.s = (TextView) view.findViewById(R.id.custom_text);
    }
}
