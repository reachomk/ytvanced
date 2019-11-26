package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;

/* renamed from: akn */
public final class akn extends anp {
    @ExportedProperty
    public boolean a;
    @ExportedProperty
    public int b;
    @ExportedProperty
    public int c;
    @ExportedProperty
    public boolean d;
    @ExportedProperty
    public boolean e;
    public boolean f;

    public akn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public akn(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public akn(akn akn) {
        super((LayoutParams) akn);
        this.a = akn.a;
    }

    public akn() {
        super(-2);
        this.a = false;
    }
}
