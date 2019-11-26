package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kcd */
final class kcd implements OnClickListener {
    private final /* synthetic */ akor a;
    private final /* synthetic */ axec b;
    private final /* synthetic */ kca c;

    kcd(kca kca, akor akor, axec axec) {
        this.c = kca;
        this.a = akor;
        this.b = axec;
    }

    public final void onClick(View view) {
        jne jne = (jne) this.a.a("avatar_selection_listener");
        axec axec = this.b;
        if ((axec.d == 11 ? (axee) axec.e : axee.c).a != 60487319 || jne == null) {
            axec axec2 = this.b;
            if (axec2.d == 6) {
                this.c.a.a((apxu) axec2.e, null);
            }
            return;
        }
        axef axef = (axef) ((anxo) this.b.toBuilder());
        jne.a(axef);
        this.c.b = (axec) ((anxl) axef.build());
    }
}
