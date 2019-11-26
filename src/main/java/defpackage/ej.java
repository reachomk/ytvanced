package defpackage;

import android.view.View;
import java.util.Objects;

/* renamed from: ej */
final class ej implements aba {
    private final /* synthetic */ eh a;

    ej(eh ehVar) {
        this.a = ehVar;
    }

    public final abx a(View view, abx abx) {
        eh ehVar = this.a;
        Object obj = !abe.v(ehVar) ? null : abx;
        if (!Objects.equals(ehVar.e, obj)) {
            ehVar.e = obj;
            ehVar.requestLayout();
        }
        return abx.f();
    }
}
