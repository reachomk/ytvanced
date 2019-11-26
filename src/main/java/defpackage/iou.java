package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iou */
public final class iou implements OnClickListener {
    public final TextView a;
    public final View b;
    public final akvp c;
    public final zyw d;
    public final int e = this.a.getResources().getDimensionPixelSize(R.dimen.red_carpet_progress_button_roundness);
    public int f = -1;
    public aqvp g;
    private final aaas h;

    public iou(aaas aaas, akvp akvp, zyw zyw, TextView textView, View view) {
        this.h = aaas;
        this.c = akvp;
        this.a = textView;
        this.d = zyw;
        this.b = view;
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        aqvp aqvp = this.g;
        if (aqvp != null && (aqvp.a & 16) != 0) {
            aaas aaas = this.h;
            apxu apxu = aqvp.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, acwi.a(this.g, true));
        }
    }
}
