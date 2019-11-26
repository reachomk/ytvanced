package defpackage;

import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: albz */
final /* synthetic */ class albz implements akyw {
    private final OnClickListener a;
    private final TextView b;
    private final alcg c;
    private final int d;

    albz(OnClickListener onClickListener, TextView textView, alcg alcg, int i) {
        this.a = onClickListener;
        this.b = textView;
        this.c = alcg;
        this.d = i;
    }

    public final void a(aphf aphf) {
        OnClickListener onClickListener = this.a;
        TextView textView = this.b;
        alcg alcg = this.c;
        int i = this.d;
        if (onClickListener != null) {
            onClickListener.onClick(textView);
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        alcg.a(i2);
    }
}
