package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: adwh */
public final class adwh extends ada {
    private final /* synthetic */ DpadView f;

    public adwh(DpadView dpadView, View view) {
        this.f = dpadView;
        super(view);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(int i, int i2) {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(float f, float f2) {
        adwg a = this.f.a(f, f2);
        if (a != null) {
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                return R.id.dpadUpKey;
            }
            if (ordinal == 1) {
                return R.id.dpadDownKey;
            }
            if (ordinal == 2) {
                return R.id.dpadLeftKey;
            }
            if (ordinal == 3) {
                return R.id.dpadRightKey;
            }
            if (ordinal == 4) {
                return R.id.dpadEnterKey;
            }
        }
        return aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List list) {
        list.add(Integer.valueOf(R.id.dpadLeftKey));
        list.add(Integer.valueOf(R.id.dpadRightKey));
        list.add(Integer.valueOf(R.id.dpadUpKey));
        list.add(Integer.valueOf(R.id.dpadDownKey));
        list.add(Integer.valueOf(R.id.dpadEnterKey));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, aca aca) {
        adwg adwg;
        CharSequence string;
        if (i == R.id.dpadLeftKey) {
            adwg = adwg.LEFT;
        } else if (i == R.id.dpadRightKey) {
            adwg = adwg.RIGHT;
        } else if (i == R.id.dpadUpKey) {
            adwg = adwg.UP;
        } else if (i == R.id.dpadDownKey) {
            adwg = adwg.DOWN;
        } else if (i == R.id.dpadEnterKey) {
            adwg = adwg.ENTER;
        } else {
            adwg = null;
        }
        Context context = this.f.getContext();
        if (adwg != null) {
            Resources resources = context.getResources();
            int ordinal = adwg.ordinal();
            if (ordinal == 0) {
                string = resources.getString(R.string.mdx_dpad_up_contentDesc);
            } else if (ordinal == 1) {
                string = resources.getString(R.string.mdx_dpad_down_contentDesc);
            } else if (ordinal == 2) {
                string = resources.getString(R.string.mdx_dpad_left_contentDesc);
            } else if (ordinal == 3) {
                string = resources.getString(R.string.mdx_dpad_right_contentDesc);
            } else if (ordinal == 4) {
                string = resources.getString(R.string.mdx_dpad_enter_contentDesc);
            }
            aca.d(string);
            aca.b((Rect) this.f.c.get(adwg));
            aca.d(true);
            aca.c(true);
            aca.f(true);
            aca.a(16);
        }
        string = "";
        aca.d(string);
        aca.b((Rect) this.f.c.get(adwg));
        aca.d(true);
        aca.c(true);
        aca.f(true);
        aca.a(16);
    }
}
