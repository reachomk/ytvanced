package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aduw */
final class aduw {
    public final TextView a;
    public final View b;

    aduw(View view, OnClickListener onClickListener) {
        this.a = (TextView) view.findViewById(R.id.name);
        this.b = view.findViewById(R.id.delete);
        this.b.setOnClickListener(onClickListener);
    }
}
