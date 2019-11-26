package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ufh */
final class ufh {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;

    public ufh(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
    }
}
