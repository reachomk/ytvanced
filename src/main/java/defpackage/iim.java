package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iim */
public final class iim {
    public final akvp a;
    public final Context b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final akyu f;
    public final acvx g;
    public final aaas h;
    public final fmx i;
    public final int j;

    public iim(Context context, acvx acvx, aaas aaas, akvp akvp, fmx fmx, akyz akyz, zyw zyw, ViewGroup viewGroup) {
        this.b = context;
        this.g = acvx;
        this.a = akvp;
        this.h = aaas;
        this.i = fmx;
        this.c = LayoutInflater.from(context).inflate(!foh.d(zyw) ? R.layout.fullscreen_engagement_action_bar_button : R.layout.fullscreen_engagement_action_bar_button_performance, viewGroup, false);
        this.d = (ImageView) this.c.findViewById(R.id.button_icon);
        this.e = (TextView) this.c.findViewById(R.id.button_text);
        this.f = akyz.a(this.c);
        this.j = xwe.a(context, R.attr.ytOverlayIconActiveOther, 0);
    }
}
