package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zuj */
final class zuj extends aqj {
    public final ImageView p;
    public final TextView q;
    public final TextView r;
    public final zwr s;

    public zuj(View view, boolean z) {
        super(view);
        this.p = (ImageView) view.findViewById(R.id.movie_poster);
        this.q = (TextView) view.findViewById(R.id.movie_title);
        this.r = (TextView) view.findViewById(R.id.custom_text);
        this.s = new zwr((ViewStub) view.findViewById(R.id.paygate_badge));
        if (z) {
            this.s.a();
        }
    }
}
