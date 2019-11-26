package defpackage;

import com.google.android.youtube.R;

/* renamed from: yqg */
final /* synthetic */ class yqg implements yxw {
    private final yqd a;

    yqg(yqd yqd) {
        this.a = yqd;
    }

    public final void a() {
        yqd yqd = this.a;
        if (yqd.j != null) {
            yqd.f.a(yqd.e_.getString(R.string.chat_pending_members_reminder_sent));
            yqd.f.b(false);
            yqd.g.b(yqd.j.a);
        }
    }
}
