package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: uuz */
final class uuz extends apa {
    public int[] c;
    private final OnClickListener d;
    private final OnClickListener e;
    private final String f;
    private final String g;

    uuz(Context context, uuu uuu) {
        this.f = context.getResources().getString(R.string.use_password);
        this.g = context.getResources().getString(R.string.use_fingerprint);
        this.d = new uvc(uuu);
        this.e = new uvb(uuu);
    }

    public final int a() {
        int[] iArr = this.c;
        return iArr != null ? iArr.length : 0;
    }
}
