package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ivv */
final class ivv {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;

    public ivv(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.top_name);
        this.c = (TextView) view.findViewById(R.id.top_result);
        this.d = (TextView) view.findViewById(R.id.bottom_name);
        this.e = (TextView) view.findViewById(R.id.bottom_result);
        this.f = (TextView) view.findViewById(R.id.event_description);
        this.g = (TextView) view.findViewById(R.id.additional_event_description);
        this.h = (TextView) view.findViewById(R.id.duration);
        this.i = (ImageView) view.findViewById(R.id.thumbnail);
    }
}
