package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gpp */
public final class gpp {
    private final ImageView a;
    private final TextView b;
    private final TextView c;
    private final akle d;

    public gpp(View view, akkq akkq) {
        this.a = (ImageView) view.findViewById(R.id.reel_vod_link_thumbnail);
        this.b = (TextView) view.findViewById(R.id.reel_vod_link_duration);
        this.c = (TextView) view.findViewById(R.id.reel_vod_link_title);
        this.d = new akle(akkq, new xna(), this.a, false);
    }

    public final void a(awyt awyt) {
        akle akle = this.d;
        aygk aygk = null;
        if (!(awyt == null || (awyt.a & 8) == 0)) {
            aygk = awyt.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        akle.a(aygk);
        boolean z = false;
        boolean z2 = (awyt == null || (awyt.a & 1) == 0) ? false : true;
        xpr.a(this.c, z2);
        if (z2) {
            TextView textView = this.c;
            arml arml = awyt.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        if (!(awyt == null || (awyt.a & 4) == 0)) {
            z = true;
        }
        xpr.a(this.b, z);
        if (z) {
            TextView textView2 = this.b;
            arml arml2 = awyt.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView2.setText(ajqy.a(arml2));
        }
    }
}
