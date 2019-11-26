package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: uxz */
public final class uxz implements akvz {
    private final Context a;
    private final xoi b;
    private final acvx c;
    private final uxy d;
    private final uyb e;
    private final uyd f;
    private final akkl g;
    private akpb h;

    public uxz(Context context, xoi xoi, acvx acvx, akkl akkl, uxy uxy, uyb uyb, uyd uyd) {
        this.a = context;
        this.b = xoi;
        this.g = akkl;
        this.c = acvx;
        this.d = uxy;
        this.e = uyb;
        this.f = uyd;
    }

    public final void a(Class cls) {
        this.h = new aknw();
        amqw.a(cls == aanw.class);
        this.h.a(uxs.class, new uxt(this.a));
        this.h.a(aoet.class, new uxr(this.a, R.layout.account_item_section_header, this.c));
        this.h.a(aanv.class, new uxp(this.a, this.g, this.c, this.d));
        this.h.a(aanu.class, new uxl(this.a, this.b, this.e));
        this.h.a(uxw.class, new uxx(this.a, this.f));
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.h;
    }
}
