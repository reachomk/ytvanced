package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: erh */
public final class erh {
    public final akkq a;
    public final ImageView b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public erh(akkq akkq, ViewGroup viewGroup) {
        this.a = akkq;
        this.b = (ImageView) viewGroup.findViewById(R.id.creator_message_thumbnail);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_title);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.creator_message_description);
    }
}
