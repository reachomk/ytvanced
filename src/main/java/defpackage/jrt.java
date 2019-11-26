package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jrt */
final class jrt {
    public final akkq a;
    public final View b;
    public final TextView c = ((TextView) this.b.findViewById(R.id.description));
    public final TextView d = ((TextView) this.b.findViewById(R.id.price));
    public final ImageView e = ((ImageView) this.b.findViewById(R.id.thumbnail));

    protected jrt(Context context, View view, akkq akkq) {
        this.b = LayoutInflater.from(context).inflate(R.layout.shopping_companion_product_view, (ViewGroup) view, false);
        this.a = akkq;
    }
}
