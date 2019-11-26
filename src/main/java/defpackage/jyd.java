package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jyd */
final /* synthetic */ class jyd implements OnClickListener {
    private final jya a;
    private final apxu b;

    jyd(jya jya, apxu apxu) {
        this.a = jya;
        this.b = apxu;
    }

    public final void onClick(View view) {
        jya jya = this.a;
        jya.b.a(this.b, null);
    }
}
