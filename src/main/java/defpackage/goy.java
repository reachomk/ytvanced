package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;

/* renamed from: goy */
public final class goy {
    public final akle a;
    public final CircularImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final View g;
    public gph h;

    public goy(ViewGroup viewGroup, akkq akkq) {
        this.g = viewGroup.findViewById(R.id.reel_header_group);
        this.c = (TextView) viewGroup.findViewById(R.id.reel_top_title);
        this.d = (TextView) viewGroup.findViewById(R.id.reel_inline_title);
        this.e = (TextView) viewGroup.findViewById(R.id.reel_timestamp);
        this.f = viewGroup.findViewById(R.id.reel_timestamp_separator);
        this.b = (CircularImageView) viewGroup.findViewById(R.id.reel_channel_thumbnail);
        this.a = new akle(akkq, new xna(), this.b, false);
        this.b.setOnClickListener(new gox(this));
        this.g.setImportantForAccessibility(1);
    }
}
