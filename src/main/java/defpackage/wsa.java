package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: wsa */
public class wsa {
    private static final String a = wsa.class.getCanonicalName();
    private final Activity b;
    private final wsf c = new wsf();
    public final akpk d = new akpk();
    public bapu e;
    public final RecyclerView f;
    private ViewGroup g;

    public wsa(Activity activity, akpe akpe, akpb akpb) {
        this.b = activity;
        this.f = new RecyclerView(activity);
        this.f.setLayoutParams(new LayoutParams(-1, -1));
        this.f.a(new ans());
        this.d.a(this.c);
        apa a = akpe.a(akpb);
        a.a(this.d);
        this.f.a(a);
    }

    public final void a(Object obj) {
        a(obj, null);
    }

    public void a(Object obj, Pair pair) {
        if (obj != null) {
            if (this.g == null) {
                this.g = xro.a(this.b);
            }
            if (c()) {
                Log.e(a, "There is already an overlay being displayed, force the overlay to dismiss.");
                a();
            }
            if (pair == null) {
                pair = Pair.create("overlay_controller_param", null);
            }
            this.c.a = pair;
            if (this.g.indexOfChild(this.f) < 0) {
                this.g.addView(this.f);
            }
            if (obj instanceof arbs) {
                bapu bapu = this.e;
                if (bapu != null) {
                    akpk akpk = this.d;
                    arbs arbs = (arbs) obj;
                    akdk akdk = (akdk) bapu.get();
                    akdk.getClass();
                    akpk.add(akda.a(arbs, new wsd(akdk)));
                    b();
                    this.g.setVisibility(0);
                }
            }
            this.d.add(obj);
            b();
            this.g.setVisibility(0);
        }
    }

    public void a() {
        if (c()) {
            this.d.clear();
            this.g.removeView(this.f);
            this.g.setVisibility(8);
            this.c.a = null;
            return;
        }
        Log.e(a, "No overlay to dismiss.");
    }

    public final void b() {
        this.d.a();
    }

    public final boolean c() {
        ViewGroup viewGroup = this.g;
        return viewGroup != null && viewGroup.indexOfChild(this.f) >= 0;
    }
}
