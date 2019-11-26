package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zuw */
final class zuw extends aqj {
    public final boolean p;
    public final TextView q;
    public final ViewGroup r;

    public zuw(View view, boolean z) {
        super(view);
        this.q = (TextView) view.findViewById(R.id.question);
        this.r = (ViewGroup) view.findViewById(R.id.poll_choices);
        this.p = z;
    }
}
