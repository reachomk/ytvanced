package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: erj */
public final class erj {
    public final Context a;
    public final aaas b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;

    public erj(Context context, aaas aaas, ViewGroup viewGroup) {
        this.a = context;
        this.b = aaas;
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_title_view);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.nonprofit_subtitle_view);
    }
}
