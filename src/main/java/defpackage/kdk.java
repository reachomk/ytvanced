package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kdk */
public final class kdk implements akot {
    public apxu a;
    private final akpk b;
    private final ViewGroup c;
    private final View d;
    private final RecyclerView e;
    private final akpd f;
    private kdm g;

    public kdk(Context context, akvz akvz, aaas aaas, akpe akpe, ViewGroup viewGroup) {
        if (viewGroup == null) {
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.horizontal_drawer_list, null);
        }
        this.c = viewGroup;
        this.e = (RecyclerView) viewGroup.findViewById(R.id.drawer_results);
        this.e.a(new ans(0, false));
        this.f = akpe.a((akpb) akvz.get());
        this.e.a(this.f);
        this.b = new akpk();
        this.f.a(this.b);
        this.d = viewGroup.findViewById(R.id.all_channels);
        this.d.setOnClickListener(new kdn(this, aaas));
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.a = null;
        this.b.clear();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        obj = (axeg) obj;
        amqw.a(obj);
        if ((obj.a & 32) != 0) {
            apxu = obj.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.a = apxu;
        xpr.a(this.d, this.a != null);
        if (this.g == null) {
            this.g = new kdm(akor);
            this.f.a(this.g);
        }
        this.b.clear();
        for (axek axek : obj.e) {
            if (axek.a == 105604662) {
                axec axec = (axec) axek.b;
                if (!axec.n) {
                    this.b.add(axec);
                }
            }
        }
        this.b.a();
        akor.a.a(obj.f.d(), null);
    }
}
