package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akyl */
final class akyl {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;

    public akyl(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
    }
}
