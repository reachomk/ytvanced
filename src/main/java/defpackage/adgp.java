package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: adgp */
public final class adgp extends Observable implements xcp {
    private static final String g = xtl.b("MDX.MediaRouteButtonController");
    public final xci a;
    public final bcaa b;
    public final bcaa c;
    public final adgr d;
    public acwa e;
    public List f;
    private final bae h;
    private final Set i;
    private final bcaa j;
    private final adgl k;
    private boolean l;
    private final Map m;
    private final adfh n = new adgo(this);

    public adgp(xci xci, bcaa bcaa, bcaa bcaa2, bae bae, bcaa bcaa3, adgl adgl) {
        this.a = (xci) amqw.a((Object) xci);
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.b = (bcaa) amqw.a((Object) bcaa2);
        this.h = (bae) amqw.a((Object) bae);
        this.j = (bcaa) amqw.a((Object) bcaa3);
        this.k = (adgl) amqw.a((Object) adgl);
        this.d = new adgr(this);
        this.i = Collections.newSetFromMap(new WeakHashMap());
        this.m = new HashMap();
        this.m.put(acwc.MEDIA_ROUTE_BUTTON, Boolean.valueOf(false));
    }

    public final void a(MediaRouteButton mediaRouteButton) {
        mediaRouteButton.a((baz) this.b.get());
        mediaRouteButton.a(this.h);
        this.i.add(mediaRouteButton);
        if (mediaRouteButton instanceof adez) {
            adez adez = (adez) mediaRouteButton;
            adez.a((adgm) this.j.get());
            adgp.a(c(), adez.a());
            this.a.a((Object) mediaRouteButton);
        }
        if (mediaRouteButton instanceof MdxMediaRouteButton) {
            MdxMediaRouteButton mdxMediaRouteButton = (MdxMediaRouteButton) mediaRouteButton;
            adfh adfh = this.n;
            xak.a();
            mdxMediaRouteButton.d = adfh;
            adgl adgl = this.k;
            xak.a();
            mdxMediaRouteButton.c = adgl;
        }
        adgp.a(c(), acwc.MEDIA_ROUTE_BUTTON);
        d();
    }

    public final void b(MediaRouteButton mediaRouteButton) {
        this.i.remove(mediaRouteButton);
        this.a.b(mediaRouteButton);
    }

    public final boolean a() {
        return this.l && this.i.size() > 0;
    }

    public final void b() {
        this.c.get();
        boolean a = bbb.a((baz) this.b.get(), 1);
        if (this.l != a) {
            this.l = a;
            String str = g;
            boolean z = this.l;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Media route button available: ");
            stringBuilder.append(z);
            xtl.c(str, stringBuilder.toString());
            if (this.l) {
                this.a.a((Object) this);
            } else {
                this.a.b(this);
            }
            d();
            setChanged();
            notifyObservers();
        }
    }

    private final void d() {
        if (this.i.size() != 0) {
            for (MediaRouteButton mediaRouteButton : this.i) {
                mediaRouteButton.setVisibility(!this.l ? 8 : 0);
                mediaRouteButton.setEnabled(this.l);
                if (mediaRouteButton instanceof adez) {
                    b(c(), ((adez) mediaRouteButton).a());
                }
            }
            b(c(), acwc.MEDIA_ROUTE_BUTTON);
        }
    }

    private static void a(acvx acvx, acwc acwc) {
        if (acwc != null) {
            acvx.a(new acvs(acwc));
        }
    }

    private final void b(acvx acvx, acwc acwc) {
        if (acwc != null) {
            Object obj;
            if (acvx.c() == null || acvx.c().e == null) {
                obj = null;
            } else {
                obj = acvx.c().e;
            }
            if (a() && this.m.containsKey(acwc) && !((Boolean) this.m.get(acwc)).booleanValue()) {
                List list = this.f;
                if (list != null && list.contains(obj)) {
                    acvx.a(new acvs(acwc), null);
                    this.m.put(acwc, Boolean.valueOf(true));
                }
            }
        }
    }

    public final acvx c() {
        acwa acwa = this.e;
        if (acwa == null || acwa.t() == null) {
            return acvx.g;
        }
        return this.e.t();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{acwm.class};
        } else if (i == 0) {
            acwm acwm = (acwm) obj;
            for (Entry entry : this.m.entrySet()) {
                entry.setValue(Boolean.valueOf(false));
                adgp.a(acwm.a, (acwc) entry.getKey());
                b(acwm.a, (acwc) entry.getKey());
            }
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
