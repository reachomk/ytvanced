package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.concurrent.Executor;

/* renamed from: gmd */
public final class gmd {
    public final goq a;
    public final gor b;
    public final Executor c;
    public final Context d;
    public gas e;
    public gme f;
    public gno g;
    public int h;
    public int i = -1;
    public int j = 0;
    public RecyclerView k;
    public View l;
    public float m;
    private final gml n;
    private final aizy o;
    private final zzl p;
    private gmm q;

    public gmd(Context context, aizy aizy, goq goq, gor gor, gml gml, zzl zzl, Executor executor) {
        this.d = context;
        this.o = aizy;
        this.a = goq;
        this.b = gor;
        this.n = gml;
        this.p = zzl;
        this.c = executor;
        this.e = new gas(amul.g());
    }

    public final boolean a() {
        amqw.a(this.e);
        return true;
    }

    public final void b() {
        if (this.e != null) {
            int i = this.i;
            if (i != -1) {
                gmj gmj = (gmj) this.f.c.get(i);
                gmm gmm = gmj.c;
                if (gmm != null && (this.h != i || gmm.u().getChildAt(0) != this.l)) {
                    Object obj;
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = gmj.a;
                    gmm.p.f.a();
                    gmm gmm2 = this.q;
                    int i2 = 4;
                    if (!(gmm2 == null || gmm2 == gmm)) {
                        gmj gmj2 = gmm2.q;
                        gpa gpa = gmm2.p;
                        if (gmj2 != null) {
                            ajzq ajzq = gmj2.b;
                            if (ajzq != null) {
                                gpa.a(ajzq);
                            }
                            gpa.h.clearAnimation();
                            gpa.i.clearAnimation();
                            gpa.h.setVisibility(4);
                            gpa.i.setVisibility(4);
                            gpa.f.a();
                            gpa.c.b();
                            gpa.k.a();
                        }
                    }
                    if (reelWatchEndpointOuterClass$ReelWatchEndpoint.c.equals(this.o.m())) {
                        obj = null;
                    } else {
                        this.o.b();
                        obj = 1;
                    }
                    ((ViewGroup) this.l.getParent()).removeView(this.l);
                    gmm.u().addView(this.l, 0);
                    goy goy = gmm.p.a;
                    Context context = goy.g.getContext();
                    if (xrn.c(context)) {
                        CharSequence text = goy.c.getText();
                        CharSequence text2 = goy.d.getText();
                        Object[] objArr = new Object[2];
                        String str = "";
                        if (text == null) {
                            text = str;
                        }
                        objArr[0] = text;
                        if (text2 == null) {
                            text2 = str;
                        }
                        objArr[1] = text2;
                        xrn.a(context, goy.g, context.getString(R.string.reel_accessibility_story_announcement, objArr));
                    }
                    int i3 = i - this.h;
                    this.h = i;
                    if (obj != null) {
                        if (i3 != 0) {
                            i = this.j;
                            if (i == 1) {
                                i2 = i3 < 0 ? 1 : 2;
                            } else if (i == 2 && i3 > 0) {
                                i2 = 5;
                            } else if (i3 < 0) {
                                i2 = 3;
                            }
                            this.n.a(i2, 3, reelWatchEndpointOuterClass$ReelWatchEndpoint.b);
                        }
                        this.n.c(reelWatchEndpointOuterClass$ReelWatchEndpoint.b);
                        apxx apxx = (apxx) apxu.d.createBuilder();
                        apxx.a(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, reelWatchEndpointOuterClass$ReelWatchEndpoint);
                        apxu apxu = (apxu) ((anxl) apxx.build());
                        this.g.a(apxu);
                        int i4 = this.j;
                        aiqs a = aiqq.a();
                        a.a = apxu;
                        aiqq b = a.b();
                        if (i3 < 0) {
                            b = ggf.a(b, acwc.LIGHTWEIGHT_PLAYER_PREVIOUS_REEL_BUTTON.dU);
                        } else if (i3 > 0) {
                            int i5 = acwc.LIGHTWEIGHT_PLAYER_NEXT_REEL_BUTTON.dU;
                            if (i4 == 2) {
                                i5 = acwc.LIGHTWEIGHT_PLAYER_AUTOPLAY_REEL_NAV.dU;
                            }
                            b = ggf.a(b, i5);
                        }
                        arvt b2 = this.p.b();
                        if (!(b2 == null || (b2.a & aocf.UNSET_ENUM_VALUE) == 0)) {
                            awxk awxk = b2.v;
                            if (awxk == null) {
                                awxk = awxk.f;
                            }
                            if (awxk.d) {
                                this.o.b(new aizl(aizn.JUMP, b, this.n.a()));
                                gmm.p.c.a();
                                this.o.a();
                                this.j = 0;
                            }
                        }
                        this.o.b(new aizl(aizn.JUMP, b));
                        gmm.p.c.a();
                        this.o.a();
                        this.j = 0;
                    }
                    this.q = gmm;
                }
            }
        }
    }

    public final gmj a(String str) {
        if (str != null) {
            gas gas = this.e;
            if (gas != null) {
                int a = gas.a(str);
                if (a >= 0) {
                    return (gmj) this.f.c.get(a);
                }
            }
        }
        return null;
    }

    public final void a(apxu apxu, ajzq ajzq) {
        if (apxu != null && ajzq != null && this.e != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                gmj a = a(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b).c);
                if (a != null && a.b == null) {
                    a.b = ajzq;
                    gmm gmm = a.c;
                    if (gmm != null) {
                        gpa gpa = gmm.p;
                        gpa.a(ajzq);
                        gpa.c.b();
                    }
                }
            }
        }
    }

    public final void a(apxu apxu) {
        Object obj = null;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                anxr access$0002 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                apxu.a(access$0002);
                Object b = apxu.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                obj = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) b;
            }
        }
        if (this.e != null && obj != null) {
            gmj a = a(obj.c);
            if (a != null) {
                a.a = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) amqw.a(obj);
            }
        }
    }
}
