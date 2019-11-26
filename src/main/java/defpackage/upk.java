package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: upk */
public final class upk extends Drawable {
    public ujf a;
    public float b;
    public float c;
    private final Paint d = new Paint();

    public upk(Context context) {
        Resources resources = context.getResources();
        this.d.setColor(resources.getColor(R.color.video_trim_view_excluded_area_overlay));
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.a != null) {
            Rect bounds = getBounds();
            canvas.drawRect((float) bounds.left, (float) bounds.top, this.b, (float) bounds.bottom, this.d);
            canvas.drawRect(this.c, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.d);
        }
    }
}
