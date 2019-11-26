package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akym */
final class akym {
    public final TextView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public akym(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (TextView) view.findViewById(R.id.list_item_text_secondary);
        this.d = (TextView) view.findViewById(R.id.list_item_text_secondary_separator);
    }
}
