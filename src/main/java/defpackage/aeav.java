package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* renamed from: aeav */
final class aeav implements aeat {
    private final /* synthetic */ aeaw a;

    aeav(aeaw aeaw) {
        this.a = aeaw;
    }

    public final void a() {
        this.a.p().finish();
    }

    public final void a(String str) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", 2);
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError", str);
        nn p = this.a.p();
        if (p != null) {
            p.setResult(-1, intent);
            p.finish();
        }
    }

    public final void b() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountName", aeaw.b);
        adbt.a((TvSignInActivity) this.a.p(), TvSignInActivity.class, 1, bundle);
    }

    public final String c() {
        return ((TvSignInActivity) this.a.p()).g;
    }
}
