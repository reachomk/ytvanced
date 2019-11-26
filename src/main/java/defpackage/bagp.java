package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: bagp */
final class bagp implements Runnable {
    private final /* synthetic */ float a;
    private final /* synthetic */ bagn b;

    bagp(bagn bagn, float f) {
        this.b = bagn;
        this.a = f;
    }

    public final void run() {
        LayoutParams layoutParams = (LayoutParams) this.b.g.getLayoutParams();
        Context context = this.b.a;
        float f = this.a;
        if (VERSION.SDK_INT >= 23) {
            int dimension = (int) (((float) ((int) context.getResources().getDimension(R.dimen.alignment_marker_height))) * f);
            if (layoutParams.getRule(15) == -1) {
                layoutParams.width = dimension;
            } else {
                layoutParams.height = dimension;
            }
        }
        this.b.g.setLayoutParams(layoutParams);
    }
}
