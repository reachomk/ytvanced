package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jlw */
public final class jlw implements OnClickListener {
    public final View a;
    public String b;
    public Uri c;
    public apxu d;
    private final Context e;
    private final aaas f;

    public jlw(Context context, View view, aaas aaas) {
        this.e = (Context) amqw.a((Object) context);
        this.a = (View) amqw.a((Object) view);
        this.f = aaas;
    }

    public final void onClick(View view) {
        apxu apxu = this.d;
        if (apxu != null) {
            this.f.a(apxu, null);
        } else {
            xuz.c(this.e, this.b, this.c);
        }
    }
}
