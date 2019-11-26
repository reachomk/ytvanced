package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zqx */
public final class zqx extends aqj {
    public final TextView p;
    public final TextView q;
    public final zqm r;
    public final zqy s;

    public zqx(View view, zqm zqm, zqy zqy) {
        super(view);
        this.p = (TextView) view.findViewById(R.id.location_search_item_title);
        this.q = (TextView) view.findViewById(R.id.location_search_item_subtitle);
        this.r = zqm;
        this.s = zqy;
    }
}
