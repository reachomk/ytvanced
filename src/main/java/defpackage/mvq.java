package defpackage;

import com.google.android.youtube.R;

/* renamed from: mvq */
public enum mvq {
    VALID(0),
    STACK_UNCLEAN(0),
    OVERLAPPING(R.string.player_hidden_warning),
    OBSCURED(R.string.touch_when_view_obscured);
    
    public final int e;

    private mvq(int i) {
        this.e = i;
    }

    public final boolean a() {
        return equals(VALID);
    }
}
