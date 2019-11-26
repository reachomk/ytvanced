package defpackage;

import android.text.TextUtils;

/* renamed from: yqf */
final /* synthetic */ class yqf implements xsd {
    private final yqd a;

    yqf(yqd yqd) {
        this.a = yqd;
    }

    public final void a(Object obj) {
        yqd yqd = this.a;
        yqd.i = (ykd) obj;
        amul participants = yqd.i.getParticipants();
        if (participants.size() == 2) {
            amxn amxn = (amxn) participants.listIterator();
            apre apre = null;
            while (amxn.hasNext()) {
                apre apre2 = (apre) amxn.next();
                if (!TextUtils.equals(yqd.i.getViewerKey(), apre2.b)) {
                    apre = apre2;
                }
            }
            if (apre != null && TextUtils.equals(yqd.i.getViewerKey(), apre.c)) {
                yqd.h = yqd.e.a(apre.b, new yqi(yqd), false, yqd.c);
                return;
            }
        }
        yqd.f.a(false);
    }
}
