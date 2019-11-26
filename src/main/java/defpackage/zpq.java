package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zpq */
final /* synthetic */ class zpq implements Runnable {
    private final zpo a;
    private final View b;

    zpq(zpo zpo, View view) {
        this.a = zpo;
        this.b = view;
    }

    public final void run() {
        zpo zpo = this.a;
        View view = this.b;
        if (zpo.F_()) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                int i;
                Paint paint;
                float f;
                Canvas canvas;
                int dimensionPixelSize = zpo.q().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
                int dimensionPixelSize2 = zpo.q().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
                int i2 = 1;
                dimensionPixelSize = Math.max(1, width / dimensionPixelSize);
                int i3 = width / dimensionPixelSize;
                int max = Math.max(1, height / i3);
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Paint paint2 = new Paint();
                paint2.setColor(ra.c(zpo.M_(), R.color.gallery_thumb_zero_state_grid_divider_color));
                paint2.setStyle(Style.FILL);
                paint2.setStrokeWidth((float) dimensionPixelSize2);
                int i4 = 1;
                while (i4 < dimensionPixelSize) {
                    float f2 = (float) (i4 * i3);
                    i = i4;
                    paint = paint2;
                    f = f2;
                    canvas = canvas2;
                    canvas2.drawLine(f2, 0.0f, f, (float) height, paint);
                    i4 = i + 1;
                    canvas2 = canvas;
                    paint2 = paint;
                }
                paint = paint2;
                canvas = canvas2;
                dimensionPixelSize2 /= 2;
                int i5 = 0;
                while (i5 <= max) {
                    f = (float) ((i5 * i3) + dimensionPixelSize2);
                    i = i5;
                    canvas.drawLine(0.0f, f, (float) width, f, paint);
                    i5 = i + 1;
                }
                zpo.Z.setImageBitmap(createBitmap);
                TextView textView = (TextView) view.findViewById(R.id.media_grid_zero_state_grid_text_primary);
                TextView textView2 = (TextView) view.findViewById(R.id.media_grid_zero_state_grid_text_secondary);
                int i6 = zpo.a;
                if (i6 == 0) {
                    textView.setText(zpo.q().getText(R.string.gallery_thumb_zero_state_text_primary));
                    textView2.setText(zpo.q().getText(R.string.gallery_thumb_zero_state_text_secondary));
                } else if (i6 != 3) {
                    textView.setText(zpo.q().getText(R.string.gallery_thumb_images_zero_state_text_primary));
                    textView2.setText(zpo.q().getText(R.string.gallery_thumb_images_zero_state_text_secondary));
                } else {
                    textView.setText(zpo.q().getText(R.string.gallery_thumb_videos_images_zero_state_text_primary));
                    textView2.setText(zpo.q().getText(R.string.gallery_thumb_videos_images_zero_state_text_secondary));
                }
                view = view.findViewById(R.id.media_grid_zero_state_grid_text_container);
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (max <= 2) {
                    i2 = 0;
                }
                layoutParams.topMargin = ((dimensionPixelSize2 + (i2 * i3)) + (i3 / 2)) - (view.getHeight() / 2);
                view.setLayoutParams(layoutParams);
                zpo.aa.setVisibility(0);
            }
        }
    }
}
