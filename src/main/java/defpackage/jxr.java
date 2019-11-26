package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.HashMap;

/* renamed from: jxr */
public final class jxr implements akot, fgz, xcp {
    public final FrameLayout a;
    public boolean b;
    private final Context c;
    private final akkq d;
    private final eid e;
    private final aaas f;
    private final gal g;
    private final elv h;
    private final ffw i;
    private final hdd j;
    private final int k;
    private jxq l;
    private jxq m;
    private jxq n;
    private foq o;

    public jxr(Context context, xci xci, akkq akkq, eid eid, aaas aaas, elv elv, ffw ffw, hdd hdd, gal gal) {
        this(context, xci, akkq, eid, aaas, elv, ffw, hdd, gal, R.layout.inline_metadata_full);
    }

    public final fhc b() {
        return null;
    }

    public jxr(Context context, xci xci, akkq akkq, eid eid, aaas aaas, elv elv, ffw ffw, hdd hdd, gal gal, int i) {
        this.c = (Context) amqw.a((Object) context);
        amqw.a((Object) xci);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = (eid) amqw.a((Object) eid);
        this.f = (aaas) amqw.a((Object) aaas);
        this.h = (elv) amqw.a((Object) elv);
        this.i = (ffw) amqw.a((Object) ffw);
        this.j = (hdd) amqw.a((Object) hdd);
        this.k = i;
        this.g = (gal) amqw.a((Object) gal);
        this.a = new FrameLayout(context);
        xci.a((Object) this);
        this.o = foq.a;
    }

    public final View K_() {
        return this.a;
    }

    public final void a_(akor akor, Object obj) {
        foq b = fod.b(obj);
        if (b == null) {
            b = foq.a;
        }
        this.o = b;
        this.a.removeAllViews();
        boolean z = false;
        if (akor.a("inlineFullscreen", false)) {
            if (this.m == null) {
                this.m = a(new akpn(), a((int) R.layout.inline_video_fullscreen), this.f);
            }
            this.n = this.m;
        } else {
            if (this.l == null) {
                akou flu = new flu(this.c);
                View a = a((int) R.layout.inline_video);
                aaas aaas = this.f;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", Integer.valueOf(8));
                this.l = a(flu, a, new fug(aaas, hashMap));
                Resources resources = this.c.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height);
                this.l.a.addOnLayoutChangeListener(new jvk(new Rect(0, 0, 0, (resources.getDimensionPixelSize(R.dimen.inline_time_bar_size) - dimensionPixelSize) / 2)));
            }
            this.n = this.l;
        }
        this.a.addView(this.n.K_());
        this.n.a_(akor, this.o.b);
        this.n.a(this.i.a() ^ 1);
        jxq jxq = this.n;
        if (this.j.a.c() != null) {
            z = true;
        }
        jxq.a(z, this.j);
    }

    public final void a(akpb akpb) {
        jxq jxq = this.l;
        if (jxq != null) {
            jxq.a(akpb);
        }
        jxq = this.m;
        if (jxq != null) {
            jxq.a(akpb);
        }
    }

    public final View a() {
        jxq jxq = this.n;
        return jxq != null ? jxq.a : null;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    private final void a(jxq jxq, foq foq) {
        if (a(jxq)) {
            jxq.a(foq.b);
        }
    }

    private final void a(jxq jxq, boolean z) {
        if (a(jxq)) {
            jxq.a(z);
        }
    }

    private final boolean a(jxq jxq) {
        return jxq != null && xpr.a(this.a, jxq.K_());
    }

    private final jxq a(akou akou, View view, aaas aaas) {
        return new jxq(this.c, this.d, this.e, akou, view, aaas, this.g, this.h);
    }

    private final View a(int i) {
        View inflate = View.inflate(this.c, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (viewStub != null) {
            int i2 = this.k;
            if (i2 != 0) {
                viewStub.setLayoutResource(i2);
                viewStub.inflate();
            }
        }
        return inflate;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = false;
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{elx.class, ffz.class, fid.class, adqk.class};
        } else if (i == 0) {
            elx elx = (elx) obj;
            if (this.o != foq.a && TextUtils.equals(this.o.b(), elx.a)) {
                a(this.l, this.o);
                a(this.m, this.o);
                return null;
            }
        } else if (i == 1) {
            boolean z2 = ((ffz) obj).a ^ 1;
            a(this.l, z2);
            a(this.m, z2);
        } else if (i == 2) {
            fid fid = (fid) obj;
            if (this.o != foq.a) {
                aryd aryd = (aryd) ((anxo) fod.a(this.o.b).toBuilder());
                if (TextUtils.equals(this.o.b(), fid.a) && aryd != null) {
                    arye arye = (arye) aryd.instance;
                    if ((arye.a & 64) != 0) {
                        anxl anxl = arye.g;
                        if (anxl == null) {
                            anxl = atzt.c;
                        }
                        atzs atzs = (atzs) ((anxo) anxl.toBuilder());
                        atzq atzq = (atzq) ((anxo) atzs.a().toBuilder());
                        atzq.a(fid.b);
                        atzs.a(atzq);
                        aryd.copyOnWrite();
                        arye arye2 = (arye) aryd.instance;
                        arye2.g = (atzt) ((anxl) atzs.build());
                        arye2.a |= 64;
                    }
                }
                aryh aryh = (aryh) ((anxo) this.o.b.toBuilder());
                anxl anxl2 = this.o.b.f;
                if (anxl2 == null) {
                    anxl2 = aryg.c;
                }
                aryf aryf = (aryf) ((anxo) anxl2.toBuilder());
                aryf.copyOnWrite();
                aryg aryg = (aryg) aryf.instance;
                aryg.b = (arye) ((anxl) aryd.build());
                aryg.a |= 1;
                aryh.copyOnWrite();
                aryi aryi = (aryi) aryh.instance;
                aryi.f = (aryg) ((anxl) aryf.build());
                aryi.a |= 8;
                aryi aryi2 = (aryi) ((anxl) aryh.build());
                foq foq = this.o;
                foq.b = aryi2;
                Object obj2 = foq.c;
                anxl anxl3;
                axaj axaj;
                if (obj2 instanceof aqto) {
                    aqtr aqtr = (aqtr) ((anxo) ((aqto) obj2).toBuilder());
                    aqto aqto = (aqto) foq.c;
                    if (aqto.b == 22) {
                        anxl3 = (axak) aqto.c;
                    } else {
                        anxl3 = axak.a;
                    }
                    axaj = (axaj) ((anxo) anxl3.toBuilder());
                    axaj.a(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, foq.b);
                    aqtr.copyOnWrite();
                    aqto aqto2 = (aqto) aqtr.instance;
                    aqto2.c = (anxl) axaj.build();
                    aqto2.b = 22;
                    foq.c = (anxl) aqtr.build();
                } else if (obj2 instanceof jtk) {
                    awpl awpl = (awpl) ((anxo) ((jtk) obj2).a().toBuilder());
                    anxl3 = ((jtk) foq.c).a().b;
                    if (anxl3 == null) {
                        anxl3 = axak.a;
                    }
                    axaj = (axaj) ((anxo) anxl3.toBuilder());
                    axaj.a(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, foq.b);
                    awpl.copyOnWrite();
                    awpi awpi = (awpi) awpl.instance;
                    awpi.b = (axak) ((anxl) axaj.build());
                    awpi.a |= 1;
                    ((jtk) foq.c).d = (awpi) ((anxl) awpl.build());
                } else if (obj2 instanceof jtn) {
                    awpt awpt = (awpt) ((anxo) ((jtn) obj2).a().toBuilder());
                    anxl3 = ((jtn) foq.c).a().b;
                    if (anxl3 == null) {
                        anxl3 = axak.a;
                    }
                    axaj = (axaj) ((anxo) anxl3.toBuilder());
                    axaj.a(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, foq.b);
                    awpt.copyOnWrite();
                    awpq awpq = (awpq) awpt.instance;
                    awpq.b = (axak) ((anxl) axaj.build());
                    awpq.a |= 1;
                    ((jtn) foq.c).d = (awpq) ((anxl) awpt.build());
                }
            }
        } else if (i == 3) {
            if (((adqk) obj).a != null) {
                z = true;
            }
            jxq jxq = this.l;
            if (a(jxq)) {
                jxq.a(z, this.j);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
