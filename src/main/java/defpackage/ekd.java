package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ekd */
public final class ekd implements OnClickListener {
    private final eki a;
    private final ahcd b;
    private final String c;
    private final avsj d;
    private final bcaa e;
    private final bcaa f;
    private final acvx g;

    public ekd(eki eki, ahcd ahcd, String str, avsj avsj, bcaa bcaa, bcaa bcaa2, acvx acvx) {
        this.a = eki;
        this.b = ahcd;
        this.c = str;
        this.d = avsj;
        this.e = bcaa;
        this.f = bcaa2;
        this.g = acvx;
    }

    public final void onClick(View view) {
        if (!TextUtils.isEmpty(this.c)) {
            if (!this.a.a(this.c)) {
                this.b.a(this.c, this.d, this.g);
            } else if (((Boolean) this.e.get()).booleanValue()) {
                this.b.a(this.c);
            } else if (((Boolean) this.f.get()).booleanValue()) {
                this.b.b(this.c);
            } else {
                this.b.a(this.c, ahbv.a(true));
            }
        }
    }
}
