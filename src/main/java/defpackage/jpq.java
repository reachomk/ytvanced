package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jpq */
public final class jpq extends fai implements OnClickListener, ezx, fak {
    private final fmx a;
    private final LayoutInflater b;
    private final Resources c;
    private final acvx d;
    private final aphg e;
    private final aaas f;
    private final akvp g;
    private final int h;
    private final zyw i;
    private ImageView j;
    private String k;
    private int l;

    public jpq(aaas aaas, akvp akvp, fmx fmx, zyw zyw, Context context, acvx acvx, aphg aphg, int i) {
        this.a = fmx;
        this.b = LayoutInflater.from(context);
        this.c = context.getResources();
        this.f = aaas;
        this.g = akvp;
        this.d = acvx;
        this.e = aphg;
        this.h = i;
        this.i = zyw;
    }

    public final boolean b() {
        return true;
    }

    public final boolean b(MenuItem menuItem) {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final ezx d() {
        return this;
    }

    public final void onClick(View view) {
        aphg aphg = this.e;
        if ((aphg.a & 262144) != 0) {
            this.d.a(3, new acvs(aphg.r), null);
        }
        Map hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.k);
        hashMap.put("parent_ve_type", Integer.valueOf(this.l));
        aaas aaas = this.f;
        apxu apxu = this.e.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
    }

    public final void a(MenuItem menuItem) {
        ImageView imageView;
        if (this.j == null) {
            this.j = (ImageView) this.b.inflate(R.layout.mobile_topbar_button_item, null, false);
            apxn a = this.i.a();
            int i = -1;
            if (!(a == null || (a.a & 16) == 0)) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                i = aulu.T;
            }
            if (i > 0) {
                int a2 = xss.a(this.c.getDisplayMetrics(), i);
                imageView = this.j;
                imageView.setPaddingRelative(a2, imageView.getPaddingTop(), a2, this.j.getPaddingBottom());
            }
        }
        menuItem.setShowAsAction(2);
        akvp akvp = this.g;
        arwf arwf = this.e.e;
        if (arwf == null) {
            arwf = arwf.c;
        }
        arwh a3 = arwh.a(arwf.b);
        if (a3 == null) {
            a3 = arwh.UNKNOWN;
        }
        this.j.setImageDrawable(this.c.getDrawable(akvp.a(a3)));
        this.j.setContentDescription(e());
        this.j.setOnClickListener(this);
        menuItem.setActionView(this.j);
        aphg aphg = this.e;
        if ((aphg.a & 1024) != 0) {
            arup arup = aphg.k;
            if (arup == null) {
                arup = arup.c;
            }
            if (arup.a == 102716411) {
                aruh aruh;
                fmx fmx = this.a;
                arup arup2 = this.e.k;
                if (arup2 == null) {
                    arup2 = arup.c;
                }
                if (arup2.a == 102716411) {
                    aruh = (aruh) arup2.b;
                } else {
                    aruh = aruh.j;
                }
                imageView = this.j;
                Object obj = this.e.k;
                if (obj == null) {
                    obj = arup.c;
                }
                fmx.a(aruh, imageView, obj, this.d);
            }
        }
    }

    public final void a(xoe xoe, int i) {
        ImageView imageView = this.j;
        imageView.setImageDrawable(xoe.a(imageView.getDrawable(), i));
    }

    public final CharSequence e() {
        aodx aodx = this.e.q;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        if ((aodv.a & 2) == 0) {
            aodv = this.e.p;
            if (aodv == null) {
                aodv = aodv.c;
            }
            if ((aodv.a & 2) == 0) {
                return null;
            }
            aodv = this.e.p;
            if (aodv == null) {
                aodv = aodv.c;
            }
            return aodv.b;
        }
        aodx = this.e.q;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        return aodv.b;
    }

    public final int a() {
        return this.h;
    }

    public final int f() {
        return this.h + 1000;
    }

    public final void b(String str) {
        this.k = str;
    }

    public final void a(int i) {
        this.l = i;
    }
}
