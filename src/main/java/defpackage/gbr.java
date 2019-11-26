package defpackage;

import android.view.View;

/* renamed from: gbr */
public final class gbr implements zoq {
    private final View a;
    private final acvx b;
    private final acwc c;
    private final atst d;
    private boolean e;
    private boolean f = true;

    gbr(View view, acvx acvx, acwc acwc) {
        this.a = view;
        this.b = (acvx) amqw.a((Object) acvx);
        this.c = (acwc) amqw.a((Object) acwc);
        this.d = null;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.f = true;
        c();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.f = false;
        c();
    }

    private final void c() {
        View view = this.a;
        if (view != null) {
            int i = 0;
            boolean z = this.e && this.f;
            view.setEnabled(z);
            view = this.a;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public final /* synthetic */ void a(Object obj) {
        if (this.a != null) {
            if (!this.e) {
                this.b.b(this.c, null);
                this.e = true;
            }
            c();
        }
    }
}
