package defpackage;

import android.view.View;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;

/* renamed from: hcs */
public final class hcs implements adoi {
    public final bcaa a;
    public final adop b;
    public final adow c;
    private final adiw d;
    private final dvg e;
    private final albv f;
    private alcp g;

    public hcs(adow adow, adiw adiw, dvg dvg, bcaa bcaa, adop adop, albv albv) {
        this.c = adow;
        this.d = adiw;
        this.e = (dvg) amqw.a((Object) dvg);
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (adop) amqw.a((Object) adop);
        this.f = (albv) amqw.a((Object) albv);
    }

    public final adow a() {
        return this.c;
    }

    public final adiw b() {
        return this.d;
    }

    public final boolean c() {
        return this.a.get() != null;
    }

    public final void a(Runnable runnable) {
        xak.a();
        View view = (MediaRouteButton) this.a.get();
        if (view != null) {
            this.g = ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) ((alco) this.f.a()).a(view)).e(2)).d(3)).d(this.c.g)).d(this.e.getString(R.string.cast_icon_tooltip_text))).g(1)).c(this.d == adiw.WATCH ? 2900 : 9900)).a(new hcu(this, runnable))).a(new hcr(this)).a();
            this.f.a(this.g);
        }
    }

    public final void d() {
        this.f.b(this.g);
    }

    static {
        xtl.b("MDX.CastTooltip");
    }
}
