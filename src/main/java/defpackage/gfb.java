package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gfb */
public final class gfb extends aqj {
    public final View p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final TextView t;

    public gfb(View view) {
        super(view);
        this.p = view;
        this.q = (ImageView) view.findViewById(R.id.reel_create_new_playlist_button);
        this.t = (TextView) view.findViewById(R.id.reel_playlist_title);
        this.r = (ImageView) view.findViewById(R.id.reel_item_thumbnail);
        this.s = (ImageView) view.findViewById(R.id.reel_item_selected);
    }
}
