package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: abg */
final class abg extends abk {
    abg(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
