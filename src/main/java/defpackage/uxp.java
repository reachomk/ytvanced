package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: uxp */
public final class uxp implements akox {
    private final int a = R.layout.account_item;
    private final Context b;
    private final akkl c;
    private final acvx d;
    private final uxy e;

    public uxp(Context context, akkl akkl, acvx acvx, uxy uxy) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkl) amqw.a((Object) akkl);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = uxy;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new uxk(this.a, this.b, this.c, this.d, this.e);
    }
}
