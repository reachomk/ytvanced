package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: jxx */
public abstract class jxx implements akot {
    public final Context a;
    public final akkq b;
    public final akvo c;
    public final View d;
    public final FixedAspectRatioFrameLayout e = ((FixedAspectRatioFrameLayout) this.d.findViewById(R.id.thumbnail_layout));
    public final ImageView f = ((ImageView) this.d.findViewById(R.id.thumbnail));
    public final View g = this.d.findViewById(R.id.contextual_menu_anchor);
    public final TextView h = ((TextView) this.d.findViewById(R.id.duration));
    public final TextView i = ((TextView) this.d.findViewById(R.id.title));
    public final TextView j = ((TextView) this.d.findViewById(R.id.subtitle));
    public final TextView k = ((TextView) this.d.findViewById(R.id.top_metadata));
    public final TextView l = ((TextView) this.d.findViewById(R.id.description));
    public final ViewGroup m = ((ViewGroup) this.d.findViewById(R.id.bottom_standalone_badges_container));

    public jxx(Context context, akkq akkq, akvo akvo) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (akvo) amqw.a((Object) akvo);
        this.d = LayoutInflater.from(context).inflate(R.layout.compact_movie_item, null);
    }
}
