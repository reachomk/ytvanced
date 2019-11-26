package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: dqv */
public final class dqv implements akvz {
    private final Context a;
    private final xoi b;
    private final acvx c;
    private final uxy d;
    private final uyb e;
    private final uyd f;
    private final akkq g;
    private akpb h;

    public dqv(Context context, xoi xoi, acvx acvx, akkq akkq, uxy uxy, uyb uyb, uyd uyd) {
        this.a = context;
        this.b = xoi;
        this.g = akkq;
        this.c = acvx;
        this.d = uxy;
        this.e = uyb;
        this.f = uyd;
    }

    public final void a(Class cls) {
        amqw.a(cls == aanw.class);
        this.h = new aknw();
        this.h.a(drc.class, new drd(this.a, this.f));
        this.h.a(uxs.class, new uxt(this.a));
        this.h.a(aoet.class, new uxr(this.a, R.layout.fusion_account_item_section_header, this.c));
        this.h.a(aanv.class, new drh(this.a, this.g, this.c, this.d));
        this.h.a(aanu.class, new uxl(this.a, this.b, this.e));
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.h;
    }
}
