package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ipk */
public final class ipk extends fan {
    private TextView a;
    private TextView b;
    private TextView c;

    public ipk(ViewStub viewStub) {
        super(viewStub);
    }

    public ipk(View view) {
        super(view);
    }

    public final void a(apeb apeb) {
        if (apeb != null) {
            View b = super.b();
            this.a = (TextView) this.f.findViewById(R.id.red_badge_icon);
            this.b = (TextView) this.f.findViewById(R.id.red_badge_text);
            this.c = (TextView) this.f.findViewById(R.id.red_badge_label);
            this.f = b;
            this.f.setVisibility(0);
            xpr.a(this.a, apeb.b);
            xpr.a(this.b, apeb.c);
            TextView textView = this.c;
            arml arml = apeb.d;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView, ajqy.a(arml));
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
