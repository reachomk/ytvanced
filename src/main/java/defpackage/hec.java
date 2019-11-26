package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: hec */
final class hec implements OnClickListener {
    private final /* synthetic */ hea a;

    public final void onClick(View view) {
        vrh vrh = ((aeca) this.a.b.get()).f;
        if (vrh == null || vrh == vrh.g) {
            afpc.a(1, afpf.ad, "Initiated a mdx skip ad request when callback is no-op", new Exception());
            this.a.c.d(new vqf());
            return;
        }
        vrh.a(-1, -1);
    }

    /* synthetic */ hec(hea hea) {
        this.a = hea;
    }
}
