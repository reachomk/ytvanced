package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: eus */
public final class eus implements ejn {
    public final View a;
    public etb b;
    public euu c;
    public eux d;
    private final ejo e;
    private final etd f;
    private final eut g;
    private final evc h;
    private int i = 0;

    eus(ejo ejo, etd etd, eut eut, evc evc, View view) {
        this.e = ejo;
        this.f = etd;
        this.g = eut;
        this.h = evc;
        this.a = view;
    }

    public static aphv a(axwa axwa) {
        if (axwa != null) {
            aphj aphj = axwa.r;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 2) != 0) {
                aphj aphj2 = axwa.r;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphv aphv = aphj2.c;
                if (aphv == null) {
                    aphv = aphv.s;
                }
                return aphv;
            }
        }
        return null;
    }

    public static axxl b(axwa axwa) {
        if (axwa != null) {
            axvw axvw = axwa.s;
            if (axvw == null) {
                axvw = axvw.c;
            }
            if (axvw.a == 119226798) {
                axxl axxl;
                axvw axvw2 = axwa.s;
                if (axvw2 == null) {
                    axvw2 = axvw.c;
                }
                if (axvw2.a == 119226798) {
                    axxl = (axxl) axvw2.b;
                } else {
                    axxl = axxl.k;
                }
                return axxl;
            }
        }
        return null;
    }

    public static axxd c(axwa axwa) {
        if (axwa != null) {
            axvw axvw = axwa.s;
            if (axvw == null) {
                axvw = axvw.c;
            }
            if (axvw.a == 136076983) {
                axxd axxd;
                axvw axvw2 = axwa.s;
                if (axvw2 == null) {
                    axvw2 = axvw.c;
                }
                if (axvw2.a == 136076983) {
                    axxd = (axxd) axvw2.b;
                } else {
                    axxd = axxd.h;
                }
                return axxd;
            }
        }
        return null;
    }

    public final void a() {
        etb etb = this.b;
        if (etb != null) {
            etb.a();
        }
        euu euu = this.c;
        if (euu != null) {
            euu.a();
        }
        eux eux = this.d;
        if (eux != null) {
            eux.c();
        }
        this.a.setVisibility(8);
    }

    public final void a(axwa axwa, acvx acvx) {
        acvx acvx2 = acvx;
        if (axwa != null) {
            aphv a = eus.a(axwa);
            int i = 0;
            if (a == null) {
                etb etb = this.b;
                if (etb != null) {
                    etb.a(null);
                }
            } else {
                if (this.b == null) {
                    this.b = this.f.a(((ViewStub) this.a.findViewById(R.id.toggle_button_view_stub)).inflate());
                }
                this.b.a(a);
                if (acvx2 != null) {
                    acvx2.a(a.r.d(), null);
                }
                this.i = 1;
                i = 1;
            }
            axxl b = eus.b(axwa);
            if (b == null) {
                euu euu = this.c;
                if (euu != null) {
                    euu.a(null, acvx2);
                }
            } else {
                if (this.c == null) {
                    this.c = this.g.a((ImageView) ((ViewStub) this.a.findViewById(R.id.notification_options_view_stub)).inflate());
                }
                this.c.a(b, acvx2);
                this.i = 2;
                i++;
            }
            axxd c = eus.c(axwa);
            if (c == null) {
                eux eux = this.d;
                if (eux != null) {
                    eux.a(null, acvx2);
                }
            } else {
                if (this.d == null) {
                    TextView textView = (TextView) ((ViewStub) this.a.findViewById(R.id.notification_toggle_view_stub)).inflate();
                    evc evc = this.h;
                    eux eux2 = r9;
                    eux eux3 = new eux((Context) evc.a((Context) evc.a.get(), 1), (fna) evc.a((fna) evc.b.get(), 2), (fmx) evc.a((fmx) evc.c.get(), 3), (xhv) evc.a((xhv) evc.d.get(), 4), (akpi) evc.a((akpi) evc.e.get(), 5), (afve) evc.a((afve) evc.f.get(), 6), (afuu) evc.a((afuu) evc.g.get(), 7), (TextView) evc.a(textView, 8));
                    this.d = eux2;
                }
                this.d.a(c, acvx2);
                this.i = 3;
                i++;
            }
            if (i <= 1) {
                this.e.a.add(this);
                return;
            }
            xtl.c("More than 1 notification renderers were given");
            c();
            return;
        }
        c();
    }

    private final void c() {
        etb etb = this.b;
        if (etb != null) {
            etb.a(null);
        }
        euu euu = this.c;
        if (euu != null) {
            euu.a(null, null);
        }
        eux eux = this.d;
        if (eux != null) {
            eux.a(null, null);
        }
        this.e.a.remove(this);
        this.i = 0;
    }

    public final View b() {
        int i = this.i;
        if (i == 1) {
            return this.b.a;
        }
        if (i == 2) {
            return this.c.a;
        }
        if (i != 3) {
            return null;
        }
        return this.d.b;
    }

    public final void a(afvg afvg) {
        if (this.i == 3) {
            this.d.a(afvg);
        }
    }
}
