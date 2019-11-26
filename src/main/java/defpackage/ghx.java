package defpackage;

import android.util.TypedValue;
import android.widget.ImageButton;
import com.google.android.youtube.R;

/* renamed from: ghx */
final class ghx implements biw {
    private float a;
    private final /* synthetic */ ghn b;

    public final void a(int i) {
    }

    public final void a(int i, float f, int i2) {
    }

    public final void b(int i) {
        ghn ghn = this.b;
        if (ghn.as) {
            if (ghn.ao.b() == 0) {
                return;
            }
        } else if (ghn.aq == null) {
            return;
        }
        gil gil = (gil) this.b.ap.c(i);
        if (!gil.b) {
            this.b.g(true);
            this.b.d(i);
        }
        int i2 = 0;
        gil.c.c(0);
        if (!this.b.as) {
            if (this.a == 0.0f) {
                TypedValue typedValue = new TypedValue();
                this.b.q().getValue(R.dimen.sticker_catalog_page_selector_button_alpha, typedValue, true);
                this.a = typedValue.getFloat();
            }
            ImageButton[] imageButtonArr = this.b.aq;
            int length = imageButtonArr.length;
            while (i2 < length) {
                imageButtonArr[i2].setAlpha(this.a);
                i2++;
            }
            this.b.aq[i].setAlpha(1.0f);
        }
    }

    /* synthetic */ ghx(ghn ghn) {
        this.b = ghn;
    }
}
