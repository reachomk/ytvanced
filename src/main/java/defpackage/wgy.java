package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: wgy */
final class wgy extends apa {
    public final Context c;
    public final anm d;
    public final agv e = new agv(wga.class, this.f, new whc(this));
    public final wgz f;
    public final apv g = new wgx(this);
    public final whe h;
    public final int i;

    wgy(Context context, anm anm, whe whe, int i) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (anm) amqw.a((Object) anm);
        this.h = (whe) amqw.a((Object) whe);
        this.i = i;
        this.f = new wgz(context.getContentResolver());
    }

    public final int a() {
        return this.e.i;
    }

    public final /* synthetic */ void a(aqj aqj) {
        ImageView u = ((whb) aqj).u();
        u.setImageBitmap(null);
        u.setOnClickListener(null);
    }
}
