package defpackage;

import android.view.View;
import android.widget.RatingBar;
import com.google.android.youtube.R;

/* renamed from: jsr */
public final class jsr {
    private final RatingBar a;
    private final RatingBar b;

    public jsr(View view) {
        this.a = (RatingBar) view.findViewById(R.id.rating_gray);
        this.b = (RatingBar) view.findViewById(R.id.rating_white);
    }

    public final void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }

    public final void a(float f, int i) {
        a();
        if (Float.compare(f, 0.0f) > 0) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0 || i2 == 1) {
                    this.a.setRating(f);
                    this.a.setVisibility(0);
                } else if (i2 == 2) {
                    this.b.setRating(f);
                    this.b.setVisibility(0);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
