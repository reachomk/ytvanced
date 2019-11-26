package defpackage;

import android.content.Context;
import android.os.Vibrator;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zvv */
public class zvv implements xcp {
    public final zvs a;
    public final zwj b;
    public final zwh c;
    public zuf d;
    public boolean e;
    public boolean f;
    private final bcud g;
    private final vvh h;
    private airc i;
    private boolean j;
    private final aiac k;

    public zvv(Context context, zvs zvs, bcud bcud, zwj zwj, zwh zwh, vvh vvh, aiac aiac) {
        amqw.a((Object) context);
        this.a = (zvs) amqw.a((Object) zvs);
        this.g = bcud;
        this.b = (zwj) amqw.a((Object) zwj);
        this.c = (zwh) amqw.a((Object) zwh);
        this.h = vvh;
        this.k = aiac;
        zvx zvx = new zvx(this);
        zvs.b = zvx;
        zwa zwa = zvs.i;
        if (zwa != null) {
            zwa.m = zvx;
        }
        zvs.o = new zvy(this);
    }

    public final void a() {
        this.d = null;
        this.j = false;
        this.a.d();
        b();
    }

    public void a(zud zud, long j, long j2) {
        if (!(this.e || this.j)) {
            this.e = true;
            b();
            arxr a = zud.a();
            zwa zwa = this.a.i;
            if (!(zwa == null || zwa.f)) {
                zwa.n = abe.g(zwa.b) == 1;
                ViewGroup viewGroup = (ViewGroup) zwa.d.getParent();
                if (viewGroup.getParent() != null) {
                    int left;
                    if (zwa.n) {
                        left = viewGroup.getLeft();
                    } else {
                        left = ((ViewGroup) viewGroup.getParent()).getWidth() - viewGroup.getRight();
                    }
                    zwa.o.set((float) left, (float) ((LayoutParams) viewGroup.getLayoutParams()).topMargin);
                    TextView textView = zwa.c;
                    arml arml = a.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    textView.setText(ajqy.a(arml));
                    zwa.h.setFloatValues(new float[]{zwa.l, 580.0f});
                    zwa.h.start();
                    zwa.i.removeCallbacks(zwa.j);
                    zwa.i.postDelayed(zwa.j, j);
                    if (j2 > 0) {
                        zwd zwd = zwa.e;
                        j += j2;
                        if (zwd.c) {
                            zwd.e = true;
                            zwd.a();
                            zwd.b.removeCallbacks(zwd.f);
                            zwd.b.postDelayed(zwd.f, j);
                        }
                    }
                    if (xrn.c(zwa.getContext())) {
                        if (zwa.q == null) {
                            zwa.q = (Vibrator) zwa.getContext().getSystemService("vibrator");
                        }
                        if (zwa.q.hasVibrator()) {
                            zwa.q.vibrate((long) zwa.a.getInteger(R.integer.info_card_accessibility_teaser_vibrate_duration_ms));
                        }
                    }
                    zwa.f();
                }
            }
            zwj zwj = this.b;
            if (zwj.a(zud)) {
                arxr a2 = zud.a();
                zwj.e = zwj.c.a().indexOf(zud);
                zwj.b.a(a2.c);
                zwj.a(a2.g.d());
                zwj.a(zud.j());
            } else {
                xtl.d("Teaser expanded for a card that is not in the current InfoCardCollection.");
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        if (this.e) {
            this.e = false;
            zwa zwa = this.a.i;
            if (zwa != null) {
                zwa.b(z);
            }
            b();
        }
    }

    public final void b() {
        bcud bcud = this.g;
        boolean z = true;
        if (!(this.j || this.e)) {
            z = false;
        }
        bcud.e_(aiui.a(z));
    }

    public final void c() {
        this.f = false;
        d();
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final boolean d() {
        zvs zvs = this.a;
        boolean z = this.f;
        zwa zwa = zvs.i;
        if (zwa != null) {
            zwa.a(z);
        }
        boolean z2 = this.f && this.i == airc.FULLSCREEN;
        if (z2 != this.j) {
            this.j = z2;
            if (z2) {
                b();
                a(true);
                zvs = this.a;
                zvs.c();
                zvs.d.setVisibility(0);
                zvs.d.startAnimation(zvs.m);
                zvs.e();
            } else {
                zvs = this.a;
                airc airc = this.i;
                airc airc2 = airc.FULLSCREEN;
                zvs.c();
                if (zvs.d.getVisibility() == 0) {
                    if (airc == airc2 && zvs.isShown()) {
                        zvs.d.startAnimation(zvs.n);
                    } else {
                        zvs.d.setVisibility(8);
                    }
                }
            }
            vvh vvh = this.h;
            if (vvh != null) {
                z = this.j;
                vxf vxf = vvh.d;
                vvh.e.get();
                vyg b = vvh.d.b();
                if (b.d() != 2) {
                    b = b.q().a(z).a();
                }
                vxf.a(b);
                vvh.h();
                vvh = this.h;
                z = this.j;
                vxf = vvh.d;
                vyc e = vxf.e();
                vxf.a(vyc.d().a(e.a()).b(e.b()).a(e.c()).a(z).a());
                vvh.h();
            }
        }
        aiac aiac = this.k;
        if (aiac != null) {
            aiac.t = this.j;
            aiac.e();
        }
        return this.j;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjn.class, ahkk.class, ahkn.class};
        } else if (i == 0) {
            this.i = ((ahjn) obj).b;
            d();
        } else if (i == 1) {
            ahkk ahkk = (ahkk) obj;
            zvs zvs = this.a;
            boolean z = ahkk.a ^ 1;
            if (z == zvs.c) {
                i = z ^ 1;
                zvs.c = i;
                if (i != 0 && zvs.getVisibility() == 0) {
                    zvs.startAnimation(zvs.l);
                } else if (!zvs.c && zvs.e()) {
                    zvs.startAnimation(zvs.k);
                }
            }
            zvs = this.a;
            boolean z2 = ahkk.a;
            zwa zwa = zvs.i;
            if (zwa != null) {
                if (!z2) {
                    zwa.d();
                } else if (!zwa.f) {
                    if (zwa.k <= 0.99999f) {
                        zwa.g.setFloatValues(new float[]{r7, 1.0f});
                        zwa.g.start();
                        zwa.f();
                        return null;
                    }
                }
            }
        } else if (i != 2) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((ahkn) obj).a == airi.NEW) {
            a(false);
            return null;
        }
        return clsArr;
    }
}
