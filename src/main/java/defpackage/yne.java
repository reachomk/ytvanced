package defpackage;

import java.util.Locale;

/* renamed from: yne */
final class yne extends bbze {
    private final /* synthetic */ yna a;

    yne(yna yna) {
        this.a = yna;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yna yna = this.a;
        yke yke = (yke) aadz.c();
        if (yke != null) {
            yww yww = yna.d_;
            yww.d.setText(String.format(Locale.getDefault(), "%d", new Object[]{((aplo) yke.getEntity()).getSubscriberCount()}));
            yww = yna.d_;
            yww.a.a(yww.e, yke.getAvatar());
            yww = yna.d_;
            yww.c.setText(yke.getTitle());
            yna.d_.b.setOnClickListener(new ywv(new ynb(yna, yke)));
        }
    }
}
