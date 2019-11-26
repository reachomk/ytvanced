package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;

/* renamed from: aat */
public final class aat implements Factory2 {
    private final aas a;

    public aat(aas aas) {
        this.a = aas;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.a.a(str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.a(str, context, attributeSet);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("{");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
