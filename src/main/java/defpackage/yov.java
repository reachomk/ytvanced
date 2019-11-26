package defpackage;

import java.util.EnumSet;

/* renamed from: yov */
final class yov extends bbze {
    private final /* synthetic */ yor a;

    yov(yor yor) {
        this.a = yor;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yor yor = this.a;
        ykv ykv = (ykv) aadz.c();
        if (ykv == null || EnumSet.of(aqkt.CONTACT_STATUS_BLOCKED, aqkt.CONTACT_STATUS_BLOCKER).contains(ykv.getStatus())) {
            yor.f.a(false);
        } else {
            yor.f.a(true);
        }
    }
}
