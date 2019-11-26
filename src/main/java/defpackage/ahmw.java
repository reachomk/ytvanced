package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: ahmw */
public final class ahmw extends ProgressBar {
    private final ahqm a;

    public ahmw(Context context, ahqm ahqm, int i, boolean z, int i2) {
        super(context, null, i2);
        this.a = ahqm;
        setIndeterminate(z);
        setLayoutParams(new LayoutParams(i, i));
        if (z) {
            getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        } else {
            setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_circle));
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        canvas = this.a.e();
        if (canvas != null) {
            super.onDraw(canvas);
            this.a.g();
        }
    }
}
