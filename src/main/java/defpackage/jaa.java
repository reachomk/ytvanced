package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: jaa */
public final class jaa extends Preference {
    private final jec a;
    private final axgk b;
    private final acwa c;
    private jdv d;

    public jaa(Context context, jec jec, acwa acwa, axgk axgk) {
        super(context);
        this.a = jec;
        this.c = acwa;
        this.b = axgk;
        setKey("daily_digest_notification_preference");
    }

    /* Access modifiers changed, original: protected|final */
    public final View onCreateView(ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        this.d = this.a.a(viewGroup);
        return this.d.K_();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        super.onBindView(view);
        this.d.a_(new akor(), (jes) jeq.a(this.b));
        this.c.t().b(new acvs(this.b.o));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPrepareForRemoval() {
        super.onPrepareForRemoval();
        jdv jdv = this.d;
        if (jdv != null) {
            jdv.a(null);
            this.d = null;
        }
    }
}
