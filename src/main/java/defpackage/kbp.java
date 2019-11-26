package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: kbp */
public final class kbp extends nd implements kbs {
    public kbq Z;
    private avls aa;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((kbo) xse.a(p())).a(this);
        this.Z.c = this;
        try {
            this.aa = (avls) anxl.parseFrom(avls.g, this.j.getByteArray("notification_text_renderer"), anxa.c());
        } catch (anyg e) {
            xtl.a("Unable to create dialog due to missing proto or invalid proto format", e);
            dismiss();
        }
    }

    public final LayoutInflater h(Bundle bundle) {
        LayoutInflater h = super.h(bundle);
        this.c.setCanceledOnTouchOutside(false);
        return h;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akor akor = new akor();
        akor.a("dismissal_follow_up_dialog", Boolean.valueOf(true));
        kbq kbq = this.Z;
        avls avls = this.aa;
        anxr access$000 = anxl.checkIsLite(avlq.b);
        avls.a(access$000);
        Object b = avls.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        kbq.a_(akor, (asnl) b);
        return this.Z.K_();
    }

    public final void W() {
        dismiss();
    }
}
