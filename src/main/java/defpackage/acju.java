package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acju */
public final class acju extends aqj {
    public final TextView p;
    public final TextView q;
    public arog r;

    public acju(View view, acjs acjs) {
        super(view);
        this.p = (TextView) view.findViewById(R.id.game_title_text);
        this.q = (TextView) view.findViewById(R.id.game_title_year);
        view.setOnClickListener(new acjx(this, acjs));
    }
}
