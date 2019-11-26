package defpackage;

import android.app.Notification.BigTextStyle;

/* renamed from: qh */
public final class qh extends qj {
    private CharSequence a;

    public final qh a(CharSequence charSequence) {
        this.a = qg.f(charSequence);
        return this;
    }

    public final void a(qd qdVar) {
        BigTextStyle bigText = new BigTextStyle(((qi) qdVar).a).setBigContentTitle(this.c).bigText(this.a);
        if (this.e) {
            bigText.setSummaryText(this.d);
        }
    }
}
