package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zak */
public final class zak extends yzq {
    public final akkq a;
    public final View b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView g;

    public zak(View view, akkq akkq) {
        super(view, 0);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (View) amqw.a(view.findViewById(R.id.playlist_bubble));
        this.c = (ImageView) amqw.a((ImageView) view.findViewById(R.id.playlist_thumbnail));
        this.d = (TextView) amqw.a((TextView) view.findViewById(R.id.playlist_title));
        this.e = (TextView) amqw.a((TextView) view.findViewById(R.id.playlist_metadata_count));
        this.g = (TextView) amqw.a((TextView) view.findViewById(R.id.playlist_metadata_author));
    }
}
