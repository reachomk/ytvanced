package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: hvi */
public final class hvi {
    public final View a;
    public final YouTubeTextView b;
    public boolean c;
    private final akkq d;
    private final TextView e;
    private final ImageView f;
    private final DurationBadgeView g;
    private final View h;
    private awfe i;

    hvi(View view, akkq akkq) {
        this.a = (View) amqw.a((Object) view);
        this.d = (akkq) amqw.a((Object) akkq);
        this.b = (YouTubeTextView) view.findViewById(R.id.video_title);
        this.e = (TextView) view.findViewById(R.id.byline);
        this.f = (ImageView) view.findViewById(R.id.thumbnail);
        this.g = (DurationBadgeView) view.findViewById(R.id.duration);
        this.h = view.findViewById(R.id.touch_area);
    }

    /* Access modifiers changed, original: final */
    public final void a(awfe awfe, boolean z) {
        this.i = awfe;
        this.c = false;
        if (z) {
            a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
        xpr.a(this.h, onClickListener != null);
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            awfe awfe = this.i;
            if (awfe != null) {
                arml arml;
                akkq akkq = this.d;
                ImageView imageView = this.f;
                aygk aygk = awfe.k;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk);
                YouTubeTextView youTubeTextView = this.b;
                awfe awfe2 = this.i;
                if ((awfe2.a & 2) != 0) {
                    arml = awfe2.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                youTubeTextView.setText(ajqy.a(arml));
                TextView textView = this.e;
                awfe2 = this.i;
                if ((awfe2.a & 4) != 0) {
                    arml = awfe2.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                exx.a(this.g, null, null, this.i.l, null);
                this.h.setContentDescription(this.b.getText());
            }
        }
    }
}
