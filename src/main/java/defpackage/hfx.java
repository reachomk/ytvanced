package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hfx */
final class hfx implements OnClickListener {
    private final /* synthetic */ hfv a;

    public final void onClick(View view) {
        vrh vrh = ((aeca) this.a.c.get()).f;
        if (vrh == null || vrh == vrh.g) {
            afpc.a(1, afpf.ad, "Initiated a mdx skip ad request when callback is no-op", new Exception());
            this.a.b.d(new vqf());
            return;
        }
        vrh.a(-1, -1);
    }

    /* synthetic */ hfx(hfv hfv) {
        this.a = hfv;
    }
}
