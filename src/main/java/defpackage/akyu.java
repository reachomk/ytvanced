package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: akyu */
public class akyu implements OnClickListener {
    public final View a;
    public aphg b;
    public akyw c;
    public akyx d;
    private final aaas e;
    private final akpi f;
    private Map g;

    public akyu(aaas aaas, akpi akpi, View view) {
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = akpi;
        this.a = (View) amqw.a((Object) view);
        view.setOnClickListener(this);
    }

    public final void a(aphg aphg, acvx acvx) {
        a(aphg, acvx, null);
    }

    public void a(aphg aphg, acvx acvx, Map map) {
        this.g = map != null ? amur.a(map) : null;
        this.b = aphg;
        if (this.b == null) {
            this.a.setVisibility(8);
            return;
        }
        CharSequence charSequence;
        this.a.setVisibility(0);
        this.a.setEnabled(this.b.f ^ 1);
        this.a.setClickable(this.b.f ^ 1);
        aphg aphg2 = this.b;
        if ((aphg2.a & 16384) != 0) {
            aodv aodv = aphg2.p;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            this.a.setContentDescription(charSequence);
        }
        if (acvx != null) {
            aphg2 = this.b;
            if ((aphg2.a & 262144) != 0) {
                acvx.a(aphg2.r.d(), null);
            }
        }
        if (aphg.o.size() != 0) {
            this.e.a(aphg.o, a(a(), false));
        }
        akpi akpi = this.f;
        if (akpi != null) {
            akpi.a(aphg, this.a);
        }
    }

    public final void onClick(View view) {
        aphg aphg = this.b;
        if (!(aphg == null || aphg.f)) {
            if (this.c != null) {
                aphf aphf = (aphf) ((anxo) aphg.toBuilder());
                this.c.a(aphf);
                this.b = (aphg) ((anxl) aphf.build());
            }
            aphg = this.b;
            int i = aphg.a;
            if ((i & 2048) != 0 || (i & 4096) != 0 || (i & 8192) != 0) {
                aaas aaas;
                amur a = a();
                int i2 = aphg.a;
                if ((i2 & 2048) != 0) {
                    boolean z = ((i2 & 4096) != 0 ? 1 : 0) ^ 1;
                    aaas aaas2 = this.e;
                    apxu apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas2.a(apxu, a(a, z));
                }
                if ((aphg.a & 4096) != 0) {
                    aaas = this.e;
                    apxu apxu2 = aphg.m;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    aaas.a(apxu2, a(a, false));
                }
                if ((aphg.a & 8192) != 0) {
                    aaas = this.e;
                    apxu apxu3 = aphg.n;
                    if (apxu3 == null) {
                        apxu3 = apxu.d;
                    }
                    aaas.a(apxu3, a(a, false));
                }
            }
        }
    }

    private final amur a() {
        akyx akyx = this.d;
        Map a = akyx != null ? akyx.a() : null;
        if (a != null) {
            return amur.a(a);
        }
        return amwm.a;
    }

    private final Map a(amur amur, boolean z) {
        Map a = acwi.a(this.b, z);
        Map map = this.g;
        if (map != null) {
            a.putAll(map);
        }
        a.putAll(amur);
        return a;
    }
}
