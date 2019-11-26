package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jsk */
final class jsk {
    public final akkq a;
    public final DisplayMetrics b;
    public final View c;
    public final ImageView d = ((ImageView) this.c.findViewById(R.id.image));
    public final TextView e = ((TextView) this.c.findViewById(R.id.description));
    public final TextView f = ((TextView) this.c.findViewById(R.id.subtitle));
    public final TextView g = ((TextView) this.c.findViewById(R.id.side_description));
    public final TextView h = ((TextView) this.c.findViewById(R.id.side_subtitle));

    /* synthetic */ jsk(ViewGroup viewGroup, Context context, akkq akkq) {
        this.c = LayoutInflater.from(context).inflate(R.layout.companion_item, viewGroup, false);
        this.a = akkq;
        this.b = context.getResources().getDisplayMetrics();
    }
}
