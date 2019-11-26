package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wui */
public final class wui implements akot {
    public final View a;
    private final Context b;
    private final aaas c;
    private final akkq d;
    private final YouTubeTextView e = ((YouTubeTextView) this.a.findViewById(R.id.title));
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.icon));

    public wui(Context context, aaas aaas, akkq akkq) {
        this.b = context;
        this.c = aaas;
        this.d = akkq;
        this.a = LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badge_layout, null, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(axsx axsx) {
        arml arml;
        TextView textView = this.e;
        if ((axsx.a & 2) != 0) {
            arml = axsx.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.c, false));
        akkq akkq = this.d;
        ImageView imageView = this.f;
        aygk aygk = axsx.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((axsx) obj);
    }

    public final void a(int i) {
        xpr.a(this.a, true);
        this.a.setBackground(null);
        this.a.setAlpha(1.0f);
        if (i == 1) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.b.getResources().getDrawable(R.drawable.loyalty_badge_border);
            gradientDrawable.setColor(xwe.a(this.b, R.attr.ytGeneralBackgroundA, 0));
            gradientDrawable.setStroke(1, xwe.a(this.b, R.attr.ytGeneralBackgroundC, 0));
            this.a.setBackground(gradientDrawable);
        } else if (i == 2) {
            this.a.setAlpha(0.8f);
        } else if (i == 3) {
            xpr.a(this.a, false);
        }
    }
}
