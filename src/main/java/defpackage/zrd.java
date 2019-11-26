package defpackage;

/* renamed from: zrd */
public final class zrd implements uit {
    public atst a;
    private final acvx b;

    public zrd(acvx acvx) {
        this.b = acvx;
    }

    public final void a(String str) {
        if ("trim_handle_interaction".equals(str)) {
            this.b.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_TRIM_VIEW), this.a);
            return;
        }
        zjr a = zjr.a(this.b, str);
        atss atss = (atss) ((anxo) a.b.toBuilder());
        atst atst = this.a;
        if (atst != null) {
            atss.mergeFrom(atst);
        }
        this.b.c(a.a, (atst) ((anxl) atss.build()));
    }
}
