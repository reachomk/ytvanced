package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: zpz */
final class zpz extends FrameLayout {
    private static final long e = TimeUnit.SECONDS.toMillis(1);
    public final ImageView a = ((ImageView) findViewById(R.id.thumb_image_view));
    public final ImageView b = ((ImageView) findViewById(R.id.thumb_image_view_placeholder));
    public final int c;
    public zpx d;
    private final ImageView f = ((ImageView) findViewById(R.id.thumb_image_view_scrim));
    private final YouTubeTextView g = ((YouTubeTextView) findViewById(R.id.duration_text_view));
    private final int h;
    private final boolean i;

    zpz(Context context, boolean z) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.media_grid_thumb_view, this, true);
        this.h = ra.c(context, R.color.gallery_thumb_background);
        this.c = ra.c(context, R.color.gallery_thumb_background_no_thumb);
        this.i = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.i) {
            i2 = MeasureSpec.getSize(i);
            int i3 = (int) (((float) i2) * 1.7777778f);
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
            setMeasuredDimension(i2, i3);
            return;
        }
        super.onMeasure(i, i);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    /* Access modifiers changed, original: final */
    public final void a(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        long j2 = e;
        CharSequence charSequence = "";
        if (j >= j2) {
            YouTubeTextView youTubeTextView = this.g;
            if (j >= j2) {
                charSequence = xvd.b(((long) ((int) j)) / j2);
            }
            youTubeTextView.setText(charSequence);
            this.g.setContentDescription(uix.a(getContext(), j));
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        } else if (this.i && j > 0) {
            this.g.setText("0:00");
            this.g.setContentDescription(uix.a(getContext(), j));
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        } else {
            this.g.setVisibility(8);
            this.g.setText(charSequence);
            this.g.setContentDescription(charSequence);
            this.f.setVisibility(4);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a.setBackgroundColor(this.h);
        this.b.setVisibility(8);
    }
}
