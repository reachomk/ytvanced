package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: adzx */
final class adzx implements adzv {
    private final /* synthetic */ adzu a;

    adzx(adzu adzu) {
        this.a = adzu;
    }

    public final void a(boolean z) {
        a(z ^ 1, null);
    }

    public final void a() {
        a(2, this.a.M_().getString(R.string.mdx_tv_signin_error_snackbar_message));
    }

    private final void a(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError", str);
        }
        nn p = this.a.p();
        if (p != null) {
            p.setResult(-1, intent);
            p.finish();
        }
    }
}
