package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: afuw */
final /* synthetic */ class afuw implements akyw {
    private final afuu a;
    private final View b;
    private final ViewGroup c;
    private final boolean d;
    private final zn e;
    private final axxf f;

    afuw(afuu afuu, View view, ViewGroup viewGroup, boolean z, zn znVar, axxf axxf) {
        this.a = afuu;
        this.b = view;
        this.c = viewGroup;
        this.d = z;
        this.e = znVar;
        this.f = axxf;
    }

    public final void a(aphf aphf) {
        afuu afuu = this.a;
        View view = this.b;
        ViewGroup viewGroup = this.c;
        boolean z = this.d;
        zn znVar = this.e;
        axxf axxf = this.f;
        if (!afuu.a) {
            afuu.a = true;
            int intValue = ((Integer) view.getTag()).intValue();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                afuu.a(childAt, ((Integer) childAt.getTag()).intValue() == intValue);
            }
            viewGroup.postDelayed(new afuv(afuu, z, znVar, axxf), 500);
        }
    }
}
