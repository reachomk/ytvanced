package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;

/* renamed from: kfz */
final /* synthetic */ class kfz implements Runnable {
    private final TextView a;
    private final int b;
    private final View c;

    kfz(TextView textView, int i, View view) {
        this.a = textView;
        this.b = i;
        this.c = view;
    }

    public final void run() {
        TextView textView = this.a;
        int i = this.b;
        View view = this.c;
        Rect rect = new Rect();
        textView.getHitRect(rect);
        if (rect.height() < i) {
            i = (i - rect.height()) / 2;
            rect.top -= i;
            rect.bottom += i;
            view.setTouchDelegate(new TouchDelegate(rect, textView));
        }
    }
}
