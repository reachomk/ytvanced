package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wjo */
final class wjo {
    public final View a;
    public final View b;
    public final YouTubeTextView c;
    public final ImageView d;

    wjo(View view, Context context, boolean z) {
        this.a = view;
        this.b = view.findViewById(R.id.access_restriction_background);
        this.c = (YouTubeTextView) view.findViewById(R.id.access_restriction_text);
        this.d = (ImageView) view.findViewById(R.id.access_restriction_image);
        if (z) {
            this.c.setTextAppearance(context, R.style.f477TextAppearance.YouTube.Spec.Body2a);
            this.c.setTextColor(xwe.a(context, R.attr.ytTextSecondary, 0));
        }
    }
}
