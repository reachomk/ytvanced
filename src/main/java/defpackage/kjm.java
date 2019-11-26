package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: kjm */
public final class kjm extends akpl {
    public final View a;
    public aktq b;
    public lsv c;
    private final RecyclerView d = ((RecyclerView) this.a.findViewById(R.id.related_chip_cloud));
    private final akpk e;
    private final akod f;
    private final lfx g;

    public kjm(Context context, akvz akvz, akpe akpe, zyw zyw) {
        this.a = LayoutInflater.from(context).inflate(R.layout.related_chip_cloud, null);
        if (foh.E(zyw)) {
            this.a.findViewById(R.id.separator).setVisibility(0);
        }
        apn ans = new ans();
        ans.b(0);
        this.d.a(ans);
        apa a = akpe.a((akpb) akvz.get(), new LayoutParams(-2, -2));
        this.g = new lfx();
        this.f = new akod();
        akoq akoq = this.f;
        akoq.a = this.g;
        a.a(akoq);
        a.a(new kjp(this));
        this.e = new akpk();
        a.a(this.e);
        this.d.a(a);
        this.d.a(new kjr(this, context.getResources().getDimensionPixelSize(R.dimen.watch_next_chip_left_margin)));
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.e.clear();
        this.c = null;
        this.b = null;
    }

    public final void a(int i) {
        this.d.c(i);
        int i2 = 0;
        while (i2 < this.e.size()) {
            boolean z = i2 == i;
            Object obj = this.e.get(i2);
            if (obj instanceof aptl) {
                this.e.a(i2, kjm.a((aptl) obj, z));
            }
            i2++;
        }
        this.c.c = i;
    }

    private static aptl a(aptl aptl, boolean z) {
        if (aptl.g == z) {
            return aptl;
        }
        aptk aptk = (aptk) ((anxo) aptl.toBuilder());
        aptk.a(z);
        return (aptl) ((anxl) aptk.build());
    }
}
