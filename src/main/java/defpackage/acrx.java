package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acrx */
final class acrx {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    acrx(View view) {
        this.a = (ImageView) amqw.a((ImageView) view.findViewById(R.id.icon));
        this.b = (TextView) amqw.a((TextView) view.findViewById(R.id.title));
        this.c = (TextView) amqw.a((TextView) view.findViewById(R.id.subtitle));
    }
}
