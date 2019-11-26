package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iws */
final class iws extends iwo {
    public iws(Context context, aaas aaas, akkq akkq, alax alax, akzb akzb, akvp akvp, est est, eur eur, ViewGroup viewGroup) {
        super(context, aaas, akkq, alax, akzb, akvp, est, eur, R.layout.watch_card_rich_header_vertical_layout, viewGroup);
    }

    public final void a(aziq aziq) {
        arml arml;
        TextView textView = this.b;
        if ((aziq.a & 4) != 0) {
            arml = aziq.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
    }
}
