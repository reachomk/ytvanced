package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: akxn */
public class akxn extends akvt {
    private final FrameLayout e;
    private final Context f;

    public akxn(Context context, aaas aaas, akvz akvz, akoe akoe) {
        this(context, aaas, akvz, akoe, null, null, null);
    }

    public akxn(Context context, aaas aaas, akvz akvz, akoe akoe, aafa aafa, aafd aafd, akwo akwo) {
        super(context, aaas, akvz, akoe, aafa, aafd, akwo);
        this.f = context;
        this.e = new FrameLayout(context);
    }

    public void a(auvn auvn, View view, Object obj, acvx acvx) {
        akpk akpk = this.b;
        aoa c = c();
        akpk.clear();
        akpk.addAll(a(auvn, obj));
        this.c = obj;
        this.d = acvx;
        int a = xpr.a(this.f, this.a, this.e);
        c.f = (int) xpr.a(this.f, (float) a, this.f.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp));
        c.j = 8388661;
        c.m = view;
        c.f_();
    }
}
