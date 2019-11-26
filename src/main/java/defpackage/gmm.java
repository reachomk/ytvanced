package defpackage;

import android.view.ViewGroup;

/* renamed from: gmm */
public final class gmm extends aqj {
    public final gpa p;
    public gmj q;

    public gmm(gpj gpj, ViewGroup viewGroup) {
        super(viewGroup);
        this.p = gpj.f();
        gpa gpa = this.p;
        gpa.setLayoutParams(gpa.b());
        viewGroup.addView(gpa);
    }

    public final ViewGroup u() {
        return (ViewGroup) this.a;
    }
}
