package defpackage;

import android.text.TextUtils;

/* renamed from: yqs */
final /* synthetic */ class yqs implements xsd {
    private final yqp a;

    yqs(yqp yqp) {
        this.a = yqp;
    }

    public final void a(Object obj) {
        yqp yqp = this.a;
        ykp ykp = (ykp) obj;
        CharSequence text = ykp.getText();
        boolean equals = TextUtils.equals(text, yqp.j);
        yqp.j = ykp.getText();
        yqp.k = ykp.getConversationId();
        boolean z = true;
        if ((equals ^ 1) != 0) {
            yqp.f.a(text);
        }
        ykn attachment = ykp.getAttachment();
        yqp.f.a(attachment != null);
        aygk aygk = null;
        yqp.f.b(attachment != null ? ajqy.a(attachment.c()) : null);
        yxy yxy = yqp.f;
        if (attachment != null) {
            aygk = attachment.a();
        }
        yxy.a(aygk);
        yqp.f.b(attachment == null);
        yxy = yqp.f;
        if (TextUtils.isEmpty(text) && attachment == null) {
            z = false;
        }
        yxy.c(z);
        yqp.a(ykp.getAuthorKey(), new yqr(yqp));
    }
}
