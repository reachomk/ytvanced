package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zan */
public final class zan {
    public final ViewGroup a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final akkq e;
    public final ImageView f;

    public zan(akkq akkq, ViewGroup viewGroup) {
        this.a = (ViewGroup) amqw.a((Object) viewGroup);
        this.b = (TextView) viewGroup.findViewById(R.id.related_video_replies_title);
        this.c = (TextView) viewGroup.findViewById(R.id.related_video_replies_view_count);
        this.d = (TextView) viewGroup.findViewById(R.id.video_duration);
        this.e = akkq;
        this.f = (ImageView) viewGroup.findViewById(R.id.related_video_replies_thumbnail);
    }
}
