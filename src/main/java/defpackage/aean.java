package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: aean */
public final class aean implements aeao {
    public final aeag a;
    public final acwa b;
    public albl c;
    private final Context d;
    private final albi e;

    public aean(Context context, aeag aeag, albi albi, acwa acwa) {
        this.d = context;
        this.e = albi;
        this.a = aeag;
        this.b = acwa;
    }

    public final void a() {
        a(this.d.getString(R.string.mdx_tv_signin_retry_snackbar_message), acwc.MDX_TV_SIGN_IN_SNACKBAR_RETRY, this.d.getString(R.string.mdx_tv_signin_retry_snackbar_action), new aeaq(this));
    }

    public final void b() {
        a(this.d.getString(R.string.mdx_tv_signin_connecting_snackbar_message), acwc.MDX_TV_SIGN_IN_SNACKBAR_CONNECTING, null, null);
    }

    public final void c() {
        a(this.d.getString(R.string.mdx_tv_signin_cancel_snackbar_message), acwc.MDX_TV_SIGN_IN_SNACKBAR_CANCELED, null, null);
    }

    public final void a(String str) {
        a(str, acwc.MDX_TV_SIGN_IN_SNACKBAR_ERROR, null, null);
    }

    private final void a(String str, acwc acwc, String str2, OnClickListener onClickListener) {
        albi albi = this.e;
        albi.b(albi.b().b(str).a(str2, onClickListener).a(new aeap(this, acwc)).c(false).d());
    }

    public final void d() {
        albl albl = this.c;
        if (albl != null) {
            this.e.a(albl);
        }
    }
}
