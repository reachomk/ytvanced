package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text.ColorChip;

/* renamed from: gkj */
public final class gkj implements OnClickListener, OnTouchListener {
    public final gkh a;
    public final gkr b;
    public Activity c;
    public ViewGroup d;
    public EditText e;
    public ColorChip f;
    public gkn g;
    public boolean h;
    private final acwa i;

    public gkj(acwa acwa, gkh gkh, gkr gkr) {
        this.i = acwa;
        this.a = gkh;
        this.b = gkr;
    }

    public final void onClick(View view) {
        a((ColorChip) view);
    }

    public final ColorChip a(gko gko) {
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = ((ViewGroup) this.d.getChildAt(i)).getChildAt(0);
            if (childAt instanceof ColorChip) {
                ColorChip colorChip = (ColorChip) childAt;
                if (gko.a(colorChip)) {
                    return colorChip;
                }
            }
        }
        return null;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.d) {
            return false;
        }
        ColorChip a = a(new gkm(new Rect(), motionEvent));
        if (a != null) {
            this.i.t().a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_TEXT_COLOR_BUTTON), null);
            a(a);
        }
        return true;
    }

    public final void a(ColorChip colorChip) {
        if (colorChip != null) {
            int i;
            colorChip.setScaleX(1.33f);
            colorChip.setScaleY(1.33f);
            ColorChip colorChip2 = this.f;
            if (!(colorChip2 == null || colorChip.equals(colorChip2))) {
                gkn gkn = this.g;
                if (gkn != null) {
                    gkn.a();
                }
                this.f.setScaleX(1.0f);
                this.f.setScaleY(1.0f);
            }
            this.f = colorChip;
            gkr gkr = this.b;
            EditText editText = this.e;
            int i2 = gkr.b;
            if (i2 == 0) {
                i2 = colorChip.a;
                i = 0;
            } else if (i2 == 1) {
                i2 = colorChip.b;
                i = colorChip.a;
            } else if (i2 == 2) {
                i2 = colorChip.d;
                i = Color.argb(128, Color.red(colorChip.c), Color.green(colorChip.c), Color.blue(colorChip.c));
            } else {
                throw new RuntimeException("Unknown background state");
            }
            editText.setTextColor(i2);
            editText.setBackgroundColor(i);
        }
    }
}
