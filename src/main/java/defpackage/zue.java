package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zue */
final class zue extends aqj {
    public final ImageView p;
    public final TextView q;
    public final TextView r;
    public final zwr s;

    public zue(View view, boolean z) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.image);
        this.q = (TextView) view.findViewById(R.id.title);
        this.r = (TextView) view.findViewById(R.id.meta_info);
        this.s = new zwr((ViewStub) view.findViewById(R.id.paygate_badge));
        if (z) {
            this.s.a();
        }
    }
}
