package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.baj;
import defpackage.bak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OverlayListView extends ListView {
    public final List a = new ArrayList();

    public OverlayListView(Context context) {
        super(context);
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                bak bak = (bak) it.next();
                BitmapDrawable bitmapDrawable = bak.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (!bak.l) {
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - bak.j)) / ((float) bak.e)));
                    if (!bak.k) {
                        max = 0.0f;
                    }
                    Interpolator interpolator = bak.d;
                    float interpolation = interpolator != null ? interpolator.getInterpolation(max) : max;
                    int i = (int) (((float) bak.g) * interpolation);
                    bak.c.top = bak.f.top + i;
                    bak.c.bottom = bak.f.bottom + i;
                    float f = bak.h;
                    f += (bak.i - f) * interpolation;
                    bak.b = f;
                    BitmapDrawable bitmapDrawable2 = bak.a;
                    if (!(bitmapDrawable2 == null || bak.c == null)) {
                        bitmapDrawable2.setAlpha((int) (f * 255.0f));
                        bak.a.setBounds(bak.c);
                    }
                    if (bak.k && max >= 1.0f) {
                        bak.l = true;
                        baj baj = bak.m;
                        if (baj != null) {
                            baj.a();
                        }
                    }
                    if ((bak.l ^ 1) != 0) {
                    }
                }
                it.remove();
            }
        }
    }
}
