package defpackage;

import android.text.Editable;
import android.text.style.ImageSpan;
import java.util.Comparator;

/* renamed from: abrh */
final /* synthetic */ class abrh implements Comparator {
    private final Editable a;

    abrh(Editable editable) {
        this.a = editable;
    }

    public final int compare(Object obj, Object obj2) {
        Editable editable = this.a;
        return editable.getSpanStart((ImageSpan) obj) - editable.getSpanStart((ImageSpan) obj2);
    }
}
