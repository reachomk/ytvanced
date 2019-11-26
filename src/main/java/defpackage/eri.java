package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: eri */
public final class eri {
    private final Context a;
    private final ProgressBar b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;

    public eri(Context context, ViewGroup viewGroup) {
        this.a = context;
        this.b = (ProgressBar) viewGroup.findViewById(R.id.progress_bar);
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.start_label);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.end_label);
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.amount_raised_label);
        this.f = (YouTubeTextView) viewGroup.findViewById(R.id.match_label);
    }

    public final void a(aqxj aqxj) {
        if ((aqxj.a & 8192) == 0) {
            this.b.setVisibility(0);
            this.b.setProgress((int) (aqxj.h * 100.0f));
            if (VERSION.SDK_INT >= 21) {
                this.b.setProgressTintList(ColorStateList.valueOf(xwe.a(this.a, R.attr.ytCallToAction, 0)));
            } else {
                Drawable mutate = this.b.getProgressDrawable().mutate();
                mutate.setColorFilter(xwe.a(this.a, R.attr.ytCallToAction, 0), Mode.SRC_IN);
                this.b.setProgressDrawable(mutate);
            }
        } else {
            this.b.setVisibility(8);
        }
        TextView textView = this.c;
        arml arml = aqxj.i;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        arml = aqxj.j;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        arml = aqxj.l;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.f;
        arml arml2 = aqxj.k;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
    }
}
