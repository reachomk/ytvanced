package defpackage;

import com.google.android.youtube.R;

/* renamed from: yqi */
final class yqi extends bbze {
    private final /* synthetic */ yqd a;

    yqi(yqd yqd) {
        this.a = yqd;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yqd yqd = this.a;
        ykv ykv = (ykv) aadz.c();
        if (ykv != null) {
            ykd ykd = yqd.i;
            if (ykd != null && ykd.getParticipants().size() == 2) {
                yqd.j = ykv;
                yqd.f.a(true);
                yxu yxu = yqd.f;
                yxu.a.setText(yqd.e_.getString(R.string.chat_pending_members, new Object[]{ykv.getName()}));
                yqd.f.a(yqd.e_.getString(R.string.chat_pending_members_send_reminder));
                yqd.f.b(true);
                return;
            }
        }
        yqd.f.a(false);
    }
}
