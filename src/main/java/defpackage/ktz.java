package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ktz */
public final class ktz extends krf {
    private final TextView f;
    private boolean g;

    public ktz(akkq akkq, akvp akvp, akvo akvo, View view, View view2, boolean z) {
        super(akkq, akvp, akvo, view, view2, z);
        this.f = (TextView) view2.findViewById(R.id.website);
    }

    public final void a(acvx acvx, Object obj, ajyq ajyq, aviq aviq) {
        a(acvx, obj, ajyq, aviq, null);
        a(ajqy.a(ajyq.g));
    }

    public final void a(acvx acvx, Object obj, ajyq ajyq, aviq aviq, Integer num) {
        super.a(acvx, obj, ajyq, aviq, num);
        a(ajqy.a(ajyq.g));
    }

    private final void a(Spanned spanned) {
        xpr.a(this.f, (CharSequence) spanned);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        super.a();
        a(2, 1);
        this.g = true;
        a(Integer.valueOf(16));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        super.b();
        if (this.g) {
            a(1, 2);
            this.g = false;
        }
        c();
    }

    private final void a(int i, int i2) {
        krf.a(this.c, i);
        krf.a(this.d, i2);
        krf.a(this.f, i2);
    }
}
