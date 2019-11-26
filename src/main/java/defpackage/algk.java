package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: algk */
final class algk {
    public final View a;
    public final TextView b;
    public final ImageView c;
    public final View d;

    algk(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.select_message);
        this.c = (ImageView) view.findViewById(R.id.icon);
        this.d = view.findViewById(R.id.select_message_shadow);
    }
}
