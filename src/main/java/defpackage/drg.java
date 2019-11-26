package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: drg */
public final class drg extends akpl {
    public apxu a;
    private final View b;

    public drg(Context context, aaas aaas) {
        amqw.a((Object) context);
        amqw.a((Object) aaas);
        this.b = View.inflate(context, R.layout.sign_in_promo, null);
        this.b.setOnClickListener(new drj(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu = ((axnh) obj).b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.a = apxu;
    }
}
