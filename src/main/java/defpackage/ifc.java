package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* renamed from: ifc */
final class ifc {
    public final LinearLayout a;
    public final xqc b;
    public final View c;
    public final TouchImageView d;
    public final TouchImageView e;
    public final TouchImageView f;
    public final TouchImageView g;
    public final TouchImageView h;
    public final ImageView i;

    ifc(View view) {
        this.b = new xnz((TextView) view.findViewById(R.id.player_video_title_view));
        this.a = (LinearLayout) view.findViewById(R.id.player_additional_view_container);
        this.g = (TouchImageView) view.findViewById(R.id.player_addto_button);
        this.h = (TouchImageView) view.findViewById(R.id.player_share_button);
        this.e = (TouchImageView) view.findViewById(R.id.player_collapse_button);
        this.f = (TouchImageView) view.findViewById(R.id.player_overflow_button);
        this.d = (TouchImageView) view.findViewById(R.id.live_chat_overlay_button);
        this.i = (ImageView) view.findViewById(R.id.player_engagement_button);
        this.c = view.findViewById(R.id.title_anchor);
    }
}
