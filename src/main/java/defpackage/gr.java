package defpackage;

import android.support.design.internal.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: gr */
public final class gr extends aaj {
    private final /* synthetic */ CheckableImageButton b;

    public gr(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        aca.a(true);
        aca.b(this.b.a);
    }
}
