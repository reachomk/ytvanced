package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: advp */
final class advp {
    public final View a;
    public final TextView b;
    public final View c;
    public final TextView d;
    public final View e;

    advp(View view, OnClickListener onClickListener) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = view.findViewById(R.id.subtitle);
        this.d = (TextView) view.findViewById(R.id.action);
        this.d.setOnClickListener(onClickListener);
        this.e = view.findViewById(R.id.progress);
    }
}
