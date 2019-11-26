package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: abi */
final class abi extends abk {
    abi(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }
}
