package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ufi */
public class ufi extends uff {
    public ufi(Context context) {
        super(context);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getItemViewType(int i) {
        return (getItem(i) instanceof ufk) ^ 1;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, Object obj) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof ufk) {
            ufk ufk = (ufk) ufg;
            ufh ufh = (ufh) obj;
            ufh.a.setText(ufk.b);
            TextView textView = ufh.a;
            ColorStateList colorStateList = ufk.c;
            if (colorStateList == null) {
                colorStateList = getContext().getResources().getColorStateList(R.color.quantum_black_text);
            }
            textView.setTextColor(colorStateList);
            Drawable drawable = ufk.d;
            if (drawable != null) {
                ufh.b.setImageDrawable(drawable);
                ufh.b.setVisibility(0);
            } else {
                ufh.b.setVisibility(8);
            }
            Drawable drawable2 = ufk.e;
            if (drawable2 != null) {
                ufh.c.setImageDrawable(drawable2);
                ufh.c.setVisibility(0);
                return;
            }
            ufh.c.setVisibility(8);
        } else if (!(ufg instanceof ufj)) {
            String simpleName = ufg.getClass().getSimpleName();
            String str = "Unsupported item: ";
            throw new IllegalStateException(simpleName.length() == 0 ? new String(str) : str.concat(simpleName));
        }
    }

    /* Access modifiers changed, original: protected */
    public Object a(int i, View view) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof ufk) {
            return new ufh(view);
        }
        if (ufg instanceof ufj) {
            return null;
        }
        String simpleName = ufg.getClass().getSimpleName();
        String str = "Unsupported item: ";
        throw new IllegalStateException(simpleName.length() == 0 ? new String(str) : str.concat(simpleName));
    }
}
