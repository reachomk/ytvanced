package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.Set;

/* renamed from: fja */
public class fja extends nf implements acwa {
    public bapu Z;
    public aej a;
    public zzf aa;
    public fag ab;
    public fiz ac;
    public fjg ad;
    public Set b;
    public ezz c;

    public final void D() {
    }

    public final boolean E() {
        return false;
    }

    public CharSequence Y() {
        return null;
    }

    public String Z() {
        return null;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
    }

    public void a(Object obj) {
    }

    public boolean ab() {
        return false;
    }

    public boolean ac() {
        return false;
    }

    public int ad() {
        return Integer.MAX_VALUE;
    }

    public void ah() {
    }

    public Object ai() {
        return null;
    }

    public void aj() {
    }

    public final void a(Activity activity) {
        super.a(activity);
        this.a = (aej) activity;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        fja fja = (fja) this.y;
        if (fja != null) {
            amqp b = fja.b(fiw.a(this));
            if (b.a()) {
                a(b.b());
            }
        }
    }

    public void B() {
        super.B();
        if (!this.aa.r()) {
            this.ad.a(this);
        }
    }

    public void W_() {
        super.W_();
        if (this.aa.r()) {
            this.ad.a(this);
        }
    }

    public void X_() {
        super.X_();
        Set<xsu> set = this.b;
        if (set != null) {
            for (xsu c : set) {
                c.c();
            }
            this.b = null;
        }
    }

    public void i() {
        super.i();
        t().a();
    }

    public ezz W() {
        if (this.c == null) {
            if (Y() == null) {
                this.c = X();
            } else {
                faf i = X().i();
                i.a = Y();
                this.c = i.a();
            }
        }
        return this.c;
    }

    public fag X() {
        return this.ab;
    }

    public final apxu aa() {
        return fiw.a(this).a();
    }

    public final boolean ae() {
        return this.y != null;
    }

    public final boolean af() {
        fja fja = (fja) this.y;
        return fja != null && fja.ac();
    }

    public final String ag() {
        if (fiw.a(this) != null) {
            apxu a = fiw.a(this).a();
            if (a != null) {
                anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                a.a(access$000);
                if (a.h.a(access$000.d)) {
                    anxr access$0002 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                    a.a(access$0002);
                    Object b = a.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    return ((axcv) b).e;
                }
            }
        }
        return null;
    }

    public acvx t() {
        bapu bapu = this.Z;
        return bapu != null ? (acvx) bapu.get() : null;
    }

    public amqp b(fiw fiw) {
        return ampo.a;
    }
}
