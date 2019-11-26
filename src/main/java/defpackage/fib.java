package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: fib */
final class fib {
    public static final int[] a = new int[]{R.string.accessibility_like_video, R.string.accessibility_undo_like_video, R.plurals.accessibility_like_video_plural, R.plurals.accessibility_undo_like_video_plural};
    public final boolean b = false;
    public final View c;

    public fib(View view) {
        this.c = view;
    }

    public final void a(int i) {
        this.c.setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(auac auac, atzq atzq) {
        if (atzq != null) {
            if (!(atzq.a(atzp.b) && ((Boolean) atzq.b(atzp.b)).booleanValue())) {
                atzq.a(atzp.b, Boolean.valueOf(true));
            }
            atzq.a(atzp.c, auac);
        }
        int ordinal = auac.ordinal();
        if (ordinal == 0) {
            this.c.setSelected(true);
        } else if (ordinal != 1) {
            this.c.setSelected(false);
        } else {
            this.c.setSelected(false);
        }
    }

    public final void a(CharSequence charSequence) {
        this.c.setContentDescription(charSequence);
    }

    public static boolean a(auac auac) {
        return auac == auac.LIKE;
    }
}
