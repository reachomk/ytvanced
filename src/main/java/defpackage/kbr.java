package defpackage;

import android.os.Bundle;

/* renamed from: kbr */
public final class kbr extends egj {
    public avls a;

    public kbr(nn nnVar, exu exu) {
        super(nnVar, exu, "DismissalFollowUpDialogFragmentController");
    }

    public final void a(avls avls) {
        this.a = avls;
        super.f();
        if (e() == null) {
            kbp kbp = new kbp();
            Bundle bundle = new Bundle();
            bundle.putByteArray("notification_text_renderer", avls.toByteArray());
            kbp.f(bundle);
            amqw.b(true);
            a(kbp);
        }
    }
}
