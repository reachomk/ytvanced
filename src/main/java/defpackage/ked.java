package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

/* renamed from: ked */
final /* synthetic */ class ked implements OnTouchListener {
    private final kdw a;
    private final int b;
    private final CharSequence c;
    private final ImageView d;

    ked(kdw kdw, int i, CharSequence charSequence, ImageView imageView) {
        this.a = kdw;
        this.b = i;
        this.c = charSequence;
        this.d = imageView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        kdw kdw = this.a;
        int i = this.b;
        CharSequence charSequence = this.c;
        ImageView imageView = this.d;
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            kdw.b(i);
            kdw.g.setText(charSequence);
        } else if (motionEvent.getAction() == 3) {
            kdw.b(kdw.i);
            kdw.g.setText(kdw.h);
        } else if (motionEvent.getAction() != 1) {
            z = false;
        } else {
            imageView.performClick();
            return false;
        }
        return z;
    }
}
