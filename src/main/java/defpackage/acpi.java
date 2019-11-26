package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: acpi */
final /* synthetic */ class acpi implements xsd {
    private final acpe a;

    acpi(acpe acpe) {
        this.a = acpe;
    }

    public final void a(Object obj) {
        acpe acpe = this.a;
        View view = (View) obj;
        if (acpe.am == null) {
            acjy acjy = acpe.aA;
            acpe.am = new acjp((acey) acjy.a((acey) acjy.a.get(), 1), (Executor) acjy.a((Executor) acjy.b.get(), 2), (View) acjy.a(view, 3), (acjs) acjy.a(new acpl(acpe), 4));
        }
        acjp acjp = acpe.am;
        acjp.e.e();
        acjp.e.aa_();
        acjp.b.setText(null);
        acjp.b.requestFocus();
        xpr.b(acjp.b);
    }
}
