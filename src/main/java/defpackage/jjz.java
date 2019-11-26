package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;

/* renamed from: jjz */
public final class jjz extends aqj {
    public final View p;
    public final ImageView q;
    public final TextView r;
    public final YouTubeButton s;

    public jjz(View view) {
        super(view);
        this.p = view;
        this.q = (ImageView) view.findViewById(R.id.multi_reel_dismissal_channel_avatar);
        this.r = (TextView) view.findViewById(R.id.multi_reel_dismissal_channel_title);
        this.s = (YouTubeButton) view.findViewById(R.id.multi_reel_dismissal_undo_button);
    }
}
