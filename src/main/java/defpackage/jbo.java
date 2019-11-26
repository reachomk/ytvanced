package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: jbo */
public final class jbo extends Preference {
    private final jen a;
    private final axgk b;
    private final acwa c;
    private jed d;

    public jbo(Context context, jen jen, acwa acwa, axgk axgk) {
        super(context);
        this.a = jen;
        this.c = acwa;
        this.b = axgk;
        setKey("quiet_hours_notification_preference");
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
        this.d.a_(new akor(), (jer) jeq.a(this.b));
        this.c.t().b(new acvs(this.b.o));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPrepareForRemoval() {
        super.onPrepareForRemoval();
        jed jed = this.d;
        if (jed != null) {
            jed.a(null);
            this.d = null;
        }
    }
}
