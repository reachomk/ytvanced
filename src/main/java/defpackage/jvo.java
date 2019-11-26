package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import java.util.Collections;

/* renamed from: jvo */
public final class jvo implements jwc {
    private final xhv A;
    private final long B;
    private final juh C = new jvr(this);
    public final Context a;
    public final jud b;
    public final jvu c;
    public final xsc d;
    public final jwe e;
    public final ovh f;
    public final ofr g;
    public final ous h;
    public final jvv i;
    public final ayxo j;
    public final ObjectAnimator k;
    public final ImageView l;
    public final TextureView m;
    public final oww n;
    public final jvs o = new jvs(this);
    public final DisplayMetrics p;
    public oas q;
    public Surface r;
    public boolean s;
    public jvx t;
    public int u;
    public boolean v;
    public int w;
    private final akkq x;
    private final jue y;
    private final acum z;

    public jvo(Context context, akkq akkq, jvu jvu, amro amro, acum acum, xhv xhv, xsc xsc, TextureView textureView, ImageView imageView, ayxo ayxo, jwe jwe, jud jud, jue jue) {
        this.a = context;
        this.x = akkq;
        this.c = jvu;
        this.z = acum;
        this.A = xhv;
        this.d = xsc;
        this.l = imageView;
        this.m = textureView;
        this.e = jwe;
        this.b = jud;
        this.y = jue;
        this.p = this.a.getResources().getDisplayMetrics();
        long integer = (long) context.getResources().getInteger(17694722);
        this.B = integer + integer;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this.l, new PropertyValuesHolder[]{ofFloat}).setDuration(this.B);
        duration.addListener(new jvq(this));
        this.k = duration;
        Context context2 = this.a;
        aygk aygk = null;
        if (ayxo != null) {
            aygn aygn;
            aygn aygn2;
            if ((ayxo.a & 2) != 0) {
                aygo aygo = ayxo.c;
                if (aygo == null) {
                    aygo = aygo.c;
                }
                aygn = aygo.b;
                if (aygn == null) {
                    aygn = aygn.d;
                }
            } else {
                aygn = null;
            }
            if ((ayxo.a & 4) != 0) {
                aygo aygo2 = ayxo.d;
                if (aygo2 == null) {
                    aygo2 = aygo.c;
                }
                aygn2 = aygo2.b;
                if (aygn2 == null) {
                    aygn2 = aygn.d;
                }
            }
            if (aygn == null || r6 == null) {
                aygk = ayxo.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                if (!xss.b(context2)) {
                    aygn2 = aygn;
                }
                if (fka.a(context2.getResources().getConfiguration().orientation)) {
                    aygk = aygn2.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                } else {
                    aygk = aygn2.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                }
            }
        }
        this.x.a(this.l, aygk);
        xpr.a(this.l, true);
        this.l.setContentDescription(ezh.a(aygk));
        this.j = ayxo;
        this.i = new jvv(this);
        this.h = new oua(new ovo());
        ovh ovs = new ovs(context, ozp.a(context, "VideoMPEG"), this.i);
        this.n = (oww) amro.get();
        oww oww = this.n;
        if (oww != null) {
            ovs = new oxe(oww, ovs);
        }
        this.f = ovs;
        this.g = new ofk();
        this.m.setSurfaceTextureListener(this.i);
        this.u = 0;
        jue jue2 = this.y;
        if (jue2 != null) {
            jue2.a(this.C);
            this.w = jue.a();
            return;
        }
        this.w = 0;
    }

    public final void a() {
        if (this.r == null && this.m.getSurfaceTexture() != null) {
            this.r = new Surface(this.m.getSurfaceTexture());
        }
        this.s = true;
        g();
    }

    public final void b() {
        this.s = false;
        e();
        this.o.obtainMessage(3).sendToTarget();
    }

    public final void c() {
        this.s = false;
        e();
        this.o.obtainMessage(3).sendToTarget();
        this.m.setSurfaceTextureListener(null);
        jue jue = this.y;
        if (jue != null) {
            jue.b(this.C);
        }
    }

    public final boolean d() {
        int i = this.u;
        return i > 1 && i < 6;
    }

    public final void e() {
        this.o.removeMessages(0);
        this.o.removeMessages(1);
        this.o.removeMessages(4);
    }

    public final boolean f() {
        return this.w == 0;
    }

    public final void g() {
        if (f()) {
            jvs jvs;
            if (this.q == null) {
                jvs = this.o;
                jvs.sendMessageDelayed(jvs.obtainMessage(0), 1000);
                return;
            }
            jvs = this.o;
            jvs.sendMessageDelayed(jvs.obtainMessage(1), 1000);
        }
    }

    public final synchronized void a(int i, Throwable th) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            this.l.setVisibility(0);
        }
        oas oas = this.q;
        if (oas != null) {
            oas.j();
            oas = this.q;
            oas.s();
            oas.l.a();
            nyz nyz = oas.c;
            String toHexString = Integer.toHexString(System.identityHashCode(nyz));
            String str = ozp.e;
            String a = nzt.a();
            String.valueOf(toHexString).length();
            String.valueOf(str).length();
            String.valueOf(a).length();
            nyz.c.a();
            nyz.b.removeCallbacksAndMessages(null);
            nyz.i = nyz.a(false, false, 1);
            Surface surface = oas.o;
            if (surface != null) {
                if (oas.p) {
                    surface.release();
                }
                oas.o = null;
            }
            ool ool = oas.u;
            if (ool != null) {
                ool.a(oas.k);
                oas.u = null;
            }
            oas.j.a(oas.k);
            oas.v = Collections.emptyList();
            b(i, th);
        }
        this.u = 0;
        this.r = null;
        this.q = null;
    }

    public final void b(int i, Throwable th) {
        if (this.t != null) {
            ayxz ayxz = (ayxz) ayxw.f.createBuilder();
            ayxx ayxx = (ayxx) ayxu.e.createBuilder();
            ayxx.a(this.t.a);
            ayxx.a(this.t.b);
            ayxx.b(this.t.c);
            ayxz.copyOnWrite();
            ayxw ayxw = (ayxw) ayxz.instance;
            ayxw.b = (ayxu) ((anxl) ayxx.build());
            boolean z = true;
            ayxw.a |= 1;
            ayxz.copyOnWrite();
            ayxw ayxw2 = (ayxw) ayxz.instance;
            ayxw2.a |= 2;
            i--;
            ayxw2.c = i;
            int m = this.A.m();
            ayxz.copyOnWrite();
            ayxw = (ayxw) ayxz.instance;
            if (m != 0) {
                ayxw.a |= 8;
                ayxw.e = m - 1;
                if (i == 1) {
                    if (this.i.a != 0) {
                        z = false;
                    }
                    ayxz.copyOnWrite();
                    ayxw ayxw3 = (ayxw) ayxz.instance;
                    ayxw3.a |= 4;
                    ayxw3.d = z;
                } else if (i == 5 && th != null) {
                    afpc.a(2, afpf.media, "youtubeVideoAsThumbnailPlayerParse::playbackError", th);
                }
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                asmw.c = (anxl) ayxz.build();
                asmw.b = 109;
                this.z.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
    }

    public final void a(int i, Throwable th, String str, int i2, int i3) {
        if (!TextUtils.isEmpty(str)) {
            ayxv ayxv = (ayxv) ayxs.g.createBuilder();
            ayxx ayxx = (ayxx) ayxu.e.createBuilder();
            ayxx.a(str);
            ayxx.a(i2);
            ayxx.b(i3);
            ayxv.copyOnWrite();
            ayxs ayxs = (ayxs) ayxv.instance;
            ayxs.b = (ayxu) ((anxl) ayxx.build());
            ayxs.a |= 1;
            ayxv.copyOnWrite();
            ayxs = (ayxs) ayxv.instance;
            ayxs.a |= 2;
            i--;
            ayxs.c = i;
            int m = this.A.m();
            ayxv.copyOnWrite();
            ayxs ayxs2 = (ayxs) ayxv.instance;
            if (m != 0) {
                ayxs2.a |= 4;
                ayxs2.d = m - 1;
                if (i == 2) {
                    long j = this.i.a;
                    ayxv.copyOnWrite();
                    ayxs = (ayxs) ayxv.instance;
                    ayxs.a |= 16;
                    ayxs.f = j;
                    j = this.i.b;
                    ayxv.copyOnWrite();
                    ayxs = (ayxs) ayxv.instance;
                    ayxs.a |= 8;
                    ayxs.e = j;
                } else if ((i == 3 || i == 4) && th != null) {
                    afpc.a(2, afpf.media, "youtubeVideoAsThumbnailPlayerParse::downloadError", th);
                }
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                asmw.c = (anxl) ayxv.build();
                asmw.b = 108;
                this.z.a((asmw) ((anxl) asmz.build()));
                return;
            }
            throw new NullPointerException();
        }
    }
}
