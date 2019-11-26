package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: kfo */
public final class kfo implements akot {
    public final aos a;
    public final SparseArray b;
    private final ViewGroup c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final View e = this.c.findViewById(R.id.contextual_menu_anchor);
    private final MenuInflater f;
    private final Collection g;

    public kfo(Activity activity, Context context, ezs ezs, SharedPreferences sharedPreferences) {
        this.c = (ViewGroup) View.inflate(context, R.layout.nested_header, null);
        this.f = activity.getMenuInflater();
        this.a = new aos(context, this.e);
        this.a.c = new kfq(this);
        this.e.setOnClickListener(new kfr(this));
        this.g = new ArrayList();
        this.g.add(new hdn(activity, sharedPreferences));
        this.g.add(ezs.a());
        this.b = new SparseArray();
        akoz.a(this.c, (akot) this);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        fah fah = (fah) obj;
        this.d.setText(fah.a);
        this.b.clear();
        for (ezu ezu : fah.b) {
            this.b.put(ezu.a(), ezu);
        }
        for (ezu ezu2 : this.g) {
            this.b.put(ezu2.a(), ezu2);
        }
        this.a.a.clear();
        ezw.a(this.a.a, this.f, null, this.b, 0);
    }
}
