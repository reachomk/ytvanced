package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: jtg */
public final class jtg implements vdc {
    public final jtd a;
    private final akpb b = new aknw();
    private axyk c;
    private boolean d;
    private View e;
    private ViewGroup f;
    private ViewGroup g;

    public jtg(jtd jtd, jtl jtl, jth jth, jta jta) {
        this.a = jtd;
        this.b.a(axyo.class, (akox) jtl);
        this.b.a(axyj.class, (akox) jth);
        this.b.a(aqgn.class, (akox) jta);
    }

    public final int a(vow vow, boolean z) {
        return 2;
    }

    public final void a(View view, akor akor) {
        axak axak;
        View a;
        this.e = xpr.a(view, (int) R.id.suggested_videos_companion_card_stub, (int) R.id.suggested_videos_companion_card);
        this.f = (ViewGroup) this.e.findViewById(R.id.header);
        this.g = (ViewGroup) this.e.findViewById(R.id.videos);
        b(view);
        axyk axyk = this.c;
        apxu apxu = null;
        if ((axyk.a & 1) != 0) {
            axak = axyk.b;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        axyo axyo = (axyo) ajzv.a(ajzv.a(axak), axyo.class);
        if (axyo != null) {
            apxu apxu2;
            a = a(axyo, akor, this.f);
            this.f.addView(a);
            jtd jtd = this.a;
            byte[] d = axyo.h.d();
            if ((axyo.a & 16) != 0) {
                apxu2 = axyo.f;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
            } else {
                apxu2 = null;
            }
            jtd.a(axyo, a, d, apxu2);
        }
        akor akor2 = new akor();
        int i = 0;
        while (i < this.c.c.size()) {
            View a2;
            jtd jtd2;
            byte[] d2;
            apxu apxu3;
            akor2.a(akor);
            akor2.a("isLastVideo", Boolean.valueOf(i == this.c.c.size() + -1));
            axyj axyj = (axyj) ajzv.a(ajzv.a((axak) this.c.c.get(i)), axyj.class);
            if (axyj != null) {
                a2 = a(axyj, akor2, this.g);
                this.g.addView(a2);
                jtd2 = this.a;
                d2 = axyj.j.d();
                if ((axyj.a & 64) != 0) {
                    apxu3 = axyj.h;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                } else {
                    apxu3 = null;
                }
                jtd2.a(axyj, a2, d2, apxu3);
            }
            aqgn aqgn = (aqgn) ajzv.a(ajzv.a((axak) this.c.c.get(i)), aqgn.class);
            if (aqgn != null) {
                a2 = a(aqgn, akor2, this.g);
                this.g.addView(a2);
                jtd2 = this.a;
                d2 = aqgn.i.d();
                if ((aqgn.a & 32) != 0) {
                    apxu3 = aqgn.g;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                } else {
                    apxu3 = null;
                }
                jtd2.a(aqgn, a2, d2, apxu3);
            }
            i++;
        }
        jtd jtd3 = this.a;
        axyk axyk2 = this.c;
        a = this.e;
        byte[] d3 = axyk2.e.d();
        axyk axyk3 = this.c;
        if ((axyk3.a & 2) != 0) {
            apxu = axyk3.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        jtd3.a(axyk2, a, d3, apxu);
    }

    public final void a() {
        this.d = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        jtd jtd = this.a;
        jtd.a.clear();
        jtd.b.clear();
        this.c = null;
        this.d = false;
        b(view);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final boolean a(aaga aaga, akcb akcb) {
        ajtb ajtb = akcb.f;
        this.c = ajtb != null ? ajtb.h : null;
        return this.c != null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.suggested_videos_companion_card_stub, (int) R.id.suggested_videos_companion_card).setVisibility(8);
        }
        c();
        a(this.f);
        a(this.g);
    }

    private final void c() {
        View view = this.e;
        if (view != null) {
            xpr.a(view, this.d);
        }
    }

    private final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    viewGroup.removeView(childAt);
                    this.b.a(childAt);
                } else {
                    return;
                }
            }
        }
    }

    private final View a(Object obj, akor akor, ViewGroup viewGroup) {
        akot a = akoz.a(this.b, obj, viewGroup);
        if (a == null) {
            return null;
        }
        View K_ = a.K_();
        akoz.a(K_, a, this.b.a(obj));
        a.a_(akor, obj);
        return K_;
    }
}
