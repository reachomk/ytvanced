package defpackage;

import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: erf */
public final class erf {
    private final ImageView a;
    private final YouTubeTextView b;
    private final YouTubeTextView c;
    private final akkq d;

    public erf(ViewGroup viewGroup, boolean z, akkq akkq) {
        this.a = (ImageView) viewGroup.findViewById(R.id.campaign_image);
        this.b = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_title_view);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.campaign_subtitle_view);
        if (z) {
            this.b.setMaxLines(1);
            this.b.setEllipsize(TruncateAt.END);
            this.c.setMaxLines(1);
            this.c.setEllipsize(TruncateAt.END);
        }
        this.d = akkq;
    }

    public final void a(aqxj aqxj) {
        akkq akkq = this.d;
        ImageView imageView = this.a;
        aygk aygk = aqxj.e;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.b;
        arml arml = aqxj.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.c;
        arml arml2 = aqxj.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
    }
}
