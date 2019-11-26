package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: abvi */
public final class abvi implements akyw {
    public final Context a;
    public final akzb b;
    public final acvx c;
    public final akvz d;
    public final wre e;
    public View f;
    public TextView g;

    public abvi(Context context, akzb akzb, acwa acwa, akvz akvz, wre wre) {
        this.a = context;
        this.b = akzb;
        this.c = acwa.t();
        this.d = akvz;
        this.e = wre;
        akvz.a(ajxa.class);
    }

    public final void a(CharSequence charSequence) {
        this.g.setText(charSequence);
        this.g.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public final void a(aphf aphf) {
        a(null);
    }
}
