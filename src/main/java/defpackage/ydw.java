package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ydw */
public final class ydw extends akpl implements akmz, ydo, ydu, zdz {
    private boolean A;
    private boolean B;
    private Object C;
    public final RecyclerView a;
    public aqir b;
    public final int c;
    public int d;
    private final Context e;
    private final aaas f;
    private final akvp g;
    private final akmx h;
    private final View i;
    private final TextView j = ((TextView) this.i.findViewById(R.id.title));
    private final TextView k = ((TextView) this.i.findViewById(R.id.link));
    private final ImageView l = ((ImageView) this.i.findViewById(R.id.dismiss_button));
    private final View m = this.i.findViewById(R.id.top_divider);
    private final View n = this.i.findViewById(R.id.bottom_divider);
    private final akpk o = new akpk();
    private final zeb p;
    private final zea q;
    private final Map r = new HashMap();
    private final Map s = new HashMap();
    private final Set t = new HashSet();
    private final Set u = new HashSet();
    private final Set v;
    private aqim w;
    private ycj x;
    private Uri y;
    private zeg z;

    public ydw(Context context, aaas aaas, alpa alpa, akmx akmx, bcaa bcaa, bcaa bcaa2, zeb zeb, zea zea, akpe akpe) {
        this.e = (Context) amqw.a((Object) context);
        this.f = (aaas) amqw.a((Object) aaas);
        this.g = (akvp) amqw.a((Object) alpa);
        this.h = (akmx) amqw.a((Object) akmx);
        this.p = (zeb) amqw.a((Object) zeb);
        this.q = (zea) amqw.a((Object) zea);
        this.i = View.inflate(context, R.layout.connection_shelf, null);
        aknw aknw = new aknw();
        aknw.a(aqin.class, new akpa(bcaa));
        aknw.a(aqim.class, new akpa(bcaa2));
        apa a = akpe.a(aknw);
        a.a(this.o);
        this.c = aknw.a(aqim.class);
        this.a = (RecyclerView) this.i.findViewById(R.id.connections_list);
        this.a.a(new ans(0, false));
        this.a.a(a);
        this.a.a(new ydx(this));
        this.a.a(new yea(this));
        this.l.setOnClickListener(new ydv(this, aaas));
        this.o.a(new ydt(this));
        this.o.a(new ydn(this));
        this.v = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void a(List list) {
        Object obj = !this.o.isEmpty() ? this.o.get(0) : null;
        for (zdy c : list) {
            Object c2 = c.c();
            if (c2 instanceof aqta) {
                aqta aqta = (aqta) c2;
                anxr access$000 = anxl.checkIsLite(aqjm.p);
                aqta.a(access$000);
                if (aqta.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(aqjm.p);
                    aqta.a(access$000);
                    Object b = aqta.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    String str = ((aqjm) b).b;
                    aqin aqin;
                    if (b(c2)) {
                        aqin = (aqin) this.r.get(str);
                        if (!(aqin == null || this.t.contains(str))) {
                            int size;
                            d();
                            int size2 = this.o.size() - 1;
                            Integer num = (Integer) this.s.get(aqin.b);
                            if (num == null) {
                                size = this.o.size();
                            } else {
                                int i = size2;
                                size2 = 0;
                                while (size2 <= i) {
                                    int i2 = (size2 + i) / 2;
                                    aqin aqin2 = (aqin) this.o.get(i2);
                                    Integer num2 = aqin2 != null ? (Integer) this.s.get(aqin2.b) : null;
                                    if (num2 == null) {
                                        size = this.o.size();
                                        break;
                                    } else if (num2.intValue() < num.intValue()) {
                                        size2 = i2 + 1;
                                    } else {
                                        i = i2 - 1;
                                    }
                                }
                                size = size2;
                            }
                            boolean canScrollHorizontally = this.a.canScrollHorizontally(1);
                            this.o.add(size, aqin);
                            this.t.add(aqin.b);
                            if ((canScrollHorizontally ^ 1) != 0 && size == this.o.size() - 1) {
                                this.a.post(new ydy(this, size));
                            }
                        }
                    } else {
                        aqin = (aqin) this.r.get(str);
                        if (aqin != null) {
                            this.o.remove(aqin);
                            this.t.remove(aqin.b);
                        }
                    }
                }
            }
        }
        if (!(this.o.isEmpty() || this.o.get(0) == obj)) {
            akpk akpk = this.o;
            akpk.a(akpk.get(0), this.o.get(0));
            if (obj != null) {
                this.o.a(obj, obj);
            }
        }
        if (this.o.isEmpty()) {
            if (this.w != null) {
                a(true);
            } else {
                c();
            }
        } else if (this.o.size() > 1) {
            d();
        }
    }

    public final View K_() {
        return this.i;
    }

    public final void a(akpb akpb) {
        this.h.a((akmz) this);
        zeg zeg = this.z;
        if (zeg != null) {
            this.q.a(zeg);
            this.z = null;
        }
        this.o.clear();
        this.A = false;
    }

    public final void a(aqin aqin, apxu apxu) {
        if (apxu != null) {
            Map hashMap = new HashMap();
            anxr access$000 = anxl.checkIsLite(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new ydz(this, aqin));
            } else {
                access$000 = anxl.checkIsLite(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    hashMap.put("EndpointUtil.FutureCallback", new yec(this, aqin));
                }
            }
            this.f.a(apxu, hashMap);
        }
        akmx akmx = this.h;
        Uri uri = this.y;
        ycj ycj = this.x;
        String str = aqin.b;
        ycj ycj2 = new ycj(ycj.a);
        ycj2.a.add(str);
        akmx.b(uri, ycj2);
        this.o.a();
    }

    public final boolean a(String str) {
        ycj ycj = this.x;
        return ycj != null && ycj.a.contains(str);
    }

    public final void a(Runnable runnable) {
        this.v.add(runnable);
    }

    public final void a(Uri uri, Uri uri2) {
        this.x = (ycj) this.h.a(uri);
        for (Runnable run : this.v) {
            run.run();
        }
    }

    public final boolean b() {
        return this.B;
    }

    private final void a(boolean z) {
        if (!this.A) {
            aqim aqim = this.w;
            if (aqim != null) {
                this.B = z;
                this.o.add(aqim);
                this.A = true;
            }
        }
    }

    private final void d() {
        if (this.A) {
            this.o.remove(this.w);
            this.A = false;
        }
    }

    public final void c() {
        Object obj = this.C;
        if (obj instanceof akuz) {
            aknh a = ((akuz) obj).a();
            if (a instanceof akpk) {
                ((akpk) a).remove(this.b);
            }
        }
    }

    private final boolean b(Object obj) {
        if (obj instanceof aqta) {
            aqta aqta = (aqta) obj;
            anxr access$000 = anxl.checkIsLite(aqjm.p);
            aqta.a(access$000);
            if (aqta.h.a(access$000.d)) {
                Set set = this.u;
                anxr access$0002 = anxl.checkIsLite(aqjm.p);
                aqta.a(access$0002);
                obj = aqta.h.b(access$0002.d);
                if (obj == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(obj);
                }
                obj = aqkr.a(((aqjm) obj).e);
                if (obj == null) {
                    obj = aqkr.CONTACT_STATE_UNKNOWN;
                }
                return set.contains(obj);
            }
        }
        return true;
    }

    public final void a(aqin aqin) {
        this.h.b(this.y, this.x.a(aqin.b));
    }

    public final void b(aqin aqin) {
        this.h.b(this.y, this.x.a(aqin.b));
        this.o.a((Object) aqin, (Object) aqin);
    }
}
