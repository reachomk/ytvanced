package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: almd */
public final class almd implements akot, allj {
    public final allh a;
    public aatd b;
    private final View c;
    private final float d = this.c.getAlpha();
    private final float e;
    private final acvx f;

    public almd(Context context, ViewGroup viewGroup, alme alme, allh allh, acvx acvx) {
        this.a = (allh) amqw.a((Object) allh);
        this.f = (acvx) amqw.a((Object) acvx);
        this.c = LayoutInflater.from(context).inflate(R.layout.connection_section_overflow_button, viewGroup, false);
        amqw.a((Object) alme);
        this.c.findViewById(R.id.more_contacts).setOnClickListener(new almc(this, alme));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.e = typedValue.getFloat();
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.b = null;
        this.a.b((allj) this);
    }

    public final void a(allh allh) {
        this.c.setAlpha(allh.c() ? this.e : this.d);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aatd aatd = (aatd) obj;
        this.b = aatd;
        this.a.a((allj) this);
        this.f.a(aatd.a.c, null);
    }
}
