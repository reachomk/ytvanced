package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kec */
final /* synthetic */ class kec implements OnClickListener {
    private final kdw a;
    private final arht b;
    private final int c;
    private final CharSequence d;

    kec(kdw kdw, arht arht, int i, CharSequence charSequence) {
        this.a = kdw;
        this.b = arht;
        this.c = i;
        this.d = charSequence;
    }

    public final void onClick(View view) {
        this.a.a(this.b, this.c, this.d);
    }
}
