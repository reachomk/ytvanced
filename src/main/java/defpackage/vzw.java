package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;

/* renamed from: vzw */
final class vzw extends xnd {
    private final /* synthetic */ CharSequence a;
    private final /* synthetic */ vzt b;

    vzw(vzt vzt, CharSequence charSequence) {
        this.b = vzt;
        this.a = charSequence;
    }

    public final void a(ImageView imageView) {
        if (!TextUtils.isEmpty(this.a)) {
            imageView.setContentDescription(this.a);
        }
        ((vzv) this.b.c).a.a(0);
    }
}
